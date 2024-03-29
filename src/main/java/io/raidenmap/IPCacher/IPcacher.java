/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.raidenmap.IPCacher;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class IPcacher extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7699212562444446552L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"IPcacher\",\"namespace\":\"io.raidenmap.IPCacher\",\"fields\":[{\"name\":\"endpointAddress\",\"type\":\"string\"},{\"name\":\"ethAddress\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"locX\",\"type\":\"float\"},{\"name\":\"locY\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<IPcacher> ENCODER =
      new BinaryMessageEncoder<IPcacher>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<IPcacher> DECODER =
      new BinaryMessageDecoder<IPcacher>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<IPcacher> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<IPcacher> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<IPcacher>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this IPcacher to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a IPcacher from a ByteBuffer. */
  public static IPcacher fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence endpointAddress;
  @Deprecated public java.lang.CharSequence ethAddress;
  @Deprecated public java.lang.CharSequence state;
  @Deprecated public float locX;
  @Deprecated public float locY;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public IPcacher() {}

  /**
   * All-args constructor.
   * @param endpointAddress The new value for endpointAddress
   * @param ethAddress The new value for ethAddress
   * @param state The new value for state
   * @param locX The new value for locX
   * @param locY The new value for locY
   */
  public IPcacher(java.lang.CharSequence endpointAddress, java.lang.CharSequence ethAddress, java.lang.CharSequence state, java.lang.Float locX, java.lang.Float locY) {
    this.endpointAddress = endpointAddress;
    this.ethAddress = ethAddress;
    this.state = state;
    this.locX = locX;
    this.locY = locY;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return endpointAddress;
    case 1: return ethAddress;
    case 2: return state;
    case 3: return locX;
    case 4: return locY;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: endpointAddress = (java.lang.CharSequence)value$; break;
    case 1: ethAddress = (java.lang.CharSequence)value$; break;
    case 2: state = (java.lang.CharSequence)value$; break;
    case 3: locX = (java.lang.Float)value$; break;
    case 4: locY = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'endpointAddress' field.
   * @return The value of the 'endpointAddress' field.
   */
  public java.lang.CharSequence getEndpointAddress() {
    return endpointAddress;
  }

  /**
   * Sets the value of the 'endpointAddress' field.
   * @param value the value to set.
   */
  public void setEndpointAddress(java.lang.CharSequence value) {
    this.endpointAddress = value;
  }

  /**
   * Gets the value of the 'ethAddress' field.
   * @return The value of the 'ethAddress' field.
   */
  public java.lang.CharSequence getEthAddress() {
    return ethAddress;
  }

  /**
   * Sets the value of the 'ethAddress' field.
   * @param value the value to set.
   */
  public void setEthAddress(java.lang.CharSequence value) {
    this.ethAddress = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Gets the value of the 'locX' field.
   * @return The value of the 'locX' field.
   */
  public java.lang.Float getLocX() {
    return locX;
  }

  /**
   * Sets the value of the 'locX' field.
   * @param value the value to set.
   */
  public void setLocX(java.lang.Float value) {
    this.locX = value;
  }

  /**
   * Gets the value of the 'locY' field.
   * @return The value of the 'locY' field.
   */
  public java.lang.Float getLocY() {
    return locY;
  }

  /**
   * Sets the value of the 'locY' field.
   * @param value the value to set.
   */
  public void setLocY(java.lang.Float value) {
    this.locY = value;
  }

  /**
   * Creates a new IPcacher RecordBuilder.
   * @return A new IPcacher RecordBuilder
   */
  public static io.raidenmap.IPCacher.IPcacher.Builder newBuilder() {
    return new io.raidenmap.IPCacher.IPcacher.Builder();
  }

  /**
   * Creates a new IPcacher RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new IPcacher RecordBuilder
   */
  public static io.raidenmap.IPCacher.IPcacher.Builder newBuilder(io.raidenmap.IPCacher.IPcacher.Builder other) {
    return new io.raidenmap.IPCacher.IPcacher.Builder(other);
  }

  /**
   * Creates a new IPcacher RecordBuilder by copying an existing IPcacher instance.
   * @param other The existing instance to copy.
   * @return A new IPcacher RecordBuilder
   */
  public static io.raidenmap.IPCacher.IPcacher.Builder newBuilder(io.raidenmap.IPCacher.IPcacher other) {
    return new io.raidenmap.IPCacher.IPcacher.Builder(other);
  }

  /**
   * RecordBuilder for IPcacher instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<IPcacher>
    implements org.apache.avro.data.RecordBuilder<IPcacher> {

    private java.lang.CharSequence endpointAddress;
    private java.lang.CharSequence ethAddress;
    private java.lang.CharSequence state;
    private float locX;
    private float locY;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.raidenmap.IPCacher.IPcacher.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.endpointAddress)) {
        this.endpointAddress = data().deepCopy(fields()[0].schema(), other.endpointAddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ethAddress)) {
        this.ethAddress = data().deepCopy(fields()[1].schema(), other.ethAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.locX)) {
        this.locX = data().deepCopy(fields()[3].schema(), other.locX);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.locY)) {
        this.locY = data().deepCopy(fields()[4].schema(), other.locY);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing IPcacher instance
     * @param other The existing instance to copy.
     */
    private Builder(io.raidenmap.IPCacher.IPcacher other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.endpointAddress)) {
        this.endpointAddress = data().deepCopy(fields()[0].schema(), other.endpointAddress);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.ethAddress)) {
        this.ethAddress = data().deepCopy(fields()[1].schema(), other.ethAddress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.state)) {
        this.state = data().deepCopy(fields()[2].schema(), other.state);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.locX)) {
        this.locX = data().deepCopy(fields()[3].schema(), other.locX);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.locY)) {
        this.locY = data().deepCopy(fields()[4].schema(), other.locY);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'endpointAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getEndpointAddress() {
      return endpointAddress;
    }

    /**
      * Sets the value of the 'endpointAddress' field.
      * @param value The value of 'endpointAddress'.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder setEndpointAddress(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.endpointAddress = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'endpointAddress' field has been set.
      * @return True if the 'endpointAddress' field has been set, false otherwise.
      */
    public boolean hasEndpointAddress() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'endpointAddress' field.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder clearEndpointAddress() {
      endpointAddress = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'ethAddress' field.
      * @return The value.
      */
    public java.lang.CharSequence getEthAddress() {
      return ethAddress;
    }

    /**
      * Sets the value of the 'ethAddress' field.
      * @param value The value of 'ethAddress'.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder setEthAddress(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.ethAddress = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'ethAddress' field has been set.
      * @return True if the 'ethAddress' field has been set, false otherwise.
      */
    public boolean hasEthAddress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'ethAddress' field.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder clearEthAddress() {
      ethAddress = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder setState(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.state = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder clearState() {
      state = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'locX' field.
      * @return The value.
      */
    public java.lang.Float getLocX() {
      return locX;
    }

    /**
      * Sets the value of the 'locX' field.
      * @param value The value of 'locX'.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder setLocX(float value) {
      validate(fields()[3], value);
      this.locX = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'locX' field has been set.
      * @return True if the 'locX' field has been set, false otherwise.
      */
    public boolean hasLocX() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'locX' field.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder clearLocX() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'locY' field.
      * @return The value.
      */
    public java.lang.Float getLocY() {
      return locY;
    }

    /**
      * Sets the value of the 'locY' field.
      * @param value The value of 'locY'.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder setLocY(float value) {
      validate(fields()[4], value);
      this.locY = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'locY' field has been set.
      * @return True if the 'locY' field has been set, false otherwise.
      */
    public boolean hasLocY() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'locY' field.
      * @return This builder.
      */
    public io.raidenmap.IPCacher.IPcacher.Builder clearLocY() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public IPcacher build() {
      try {
        IPcacher record = new IPcacher();
        record.endpointAddress = fieldSetFlags()[0] ? this.endpointAddress : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.ethAddress = fieldSetFlags()[1] ? this.ethAddress : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.state = fieldSetFlags()[2] ? this.state : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.locX = fieldSetFlags()[3] ? this.locX : (java.lang.Float) defaultValue(fields()[3]);
        record.locY = fieldSetFlags()[4] ? this.locY : (java.lang.Float) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<IPcacher>
    WRITER$ = (org.apache.avro.io.DatumWriter<IPcacher>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<IPcacher>
    READER$ = (org.apache.avro.io.DatumReader<IPcacher>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
