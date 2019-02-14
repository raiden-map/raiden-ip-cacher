import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.raidenmap.event.Endpoint.AddressRegistered;
import io.raidenmap.producerKey.ProducerKey;
import org.apache.kafka.streams.*;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Printed;
import org.json.JSONObject;
import io.raidenmap.IPCacher.*;
import java.util.Properties;

public class IpCacherKStream {

    public static IPcacher ipCacherBuilder(String endpointAddress, String ethAddress) {

        JSONObject responseBody = new JSONObject();
        try {
            HttpResponse<JsonNode> response = Unirest.
                    get("https://ipinfo.io/{endpointAddress}/geo")
                    .routeParam("endpointAddress", endpointAddress)
                    .asJson();
            responseBody = response.getBody().getObject();
        }catch( Exception e){        }

        return new IPcacher( endpointAddress, ethAddress, responseBody.getString("country"), Float.parseFloat(responseBody.getString("loc").split(",")[0]), Float.parseFloat(responseBody.getString("loc").split(",")[1])  );
    }

    public static void  main( final String[] args) {
        final Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "IpCacherKStream");
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "raiden-kafka-headless.kafka.svc.cluster.local:9092");
        props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://raiden-sr-schema-registry.kafka.svc.cluster.local:8081");
        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        props.put(StreamsConfig.DEFAULT_TIMESTAMP_EXTRACTOR_CLASS_CONFIG, "org.apache.kafka.streams.processor.WallclockTimestampExtractor");


        final StreamsBuilder builder = new StreamsBuilder();
        KStream<ProducerKey, AddressRegistered> source = builder.stream("tracking.raidenEvent.AddressRegistered");
        KStream<ProducerKey,IPcacher> dest = source.map((key, value) -> new KeyValue<>(new ProducerKey(key.getTxHash()), ipCacherBuilder(value.getEndpointAddress().toString(), value.getEthAddress().toString())));

        dest.to("tracking.raidenEvent.IPCacher");

        source.print(Printed.toSysOut());
        dest.print(Printed.toSysOut());


        final Topology topology = builder.build();
        final KafkaStreams streams = new KafkaStreams(topology, props);
        System.out.println(topology.describe());
        streams.cleanUp();
        streams.start();
        //streams.close();
    }
}
