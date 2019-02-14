FROM java:8

WORKDIR /app

COPY /target/IpCacher-1.0-SNAPSHOT-jar-with-dependencies.jar /app/IPcacher-1.0-SNAPSHOT-jar-with-dependencies.jar


CMD ["java","-jar","/app/IPcacher-1.0-SNAPSHOT-jar-with-dependencies.jar"]