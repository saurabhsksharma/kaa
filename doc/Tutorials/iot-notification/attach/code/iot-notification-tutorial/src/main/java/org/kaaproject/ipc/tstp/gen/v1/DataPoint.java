/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.kaaproject.ipc.tstp.gen.v1;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DataPoint extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2490093133269843494L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataPoint\",\"namespace\":\"org.kaaproject.ipc.tstp.gen.v1\",\"fields\":[{\"name\":\"timestamp\",\"type\":\"long\",\"doc\":\"Data point UNIX timestamp in milliseconds\"},{\"name\":\"values\",\"type\":{\"type\":\"map\",\"values\":[\"boolean\",\"int\",\"long\",\"float\",\"double\",{\"type\":\"string\",\"avro.java.string\":\"String\"},\"bytes\",\"null\"],\"avro.java.string\":\"String\"},\"doc\":\"Map of data point values with value names represented as map keys.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataPoint> ENCODER =
      new BinaryMessageEncoder<DataPoint>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataPoint> DECODER =
      new BinaryMessageDecoder<DataPoint>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DataPoint> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DataPoint> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DataPoint> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataPoint>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DataPoint to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DataPoint from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DataPoint instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DataPoint fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Data point UNIX timestamp in milliseconds */
   private long timestamp;
  /** Map of data point values with value names represented as map keys. */
   private java.util.Map<java.lang.String,java.lang.Object> values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataPoint() {}

  /**
   * All-args constructor.
   * @param timestamp Data point UNIX timestamp in milliseconds
   * @param values Map of data point values with value names represented as map keys.
   */
  public DataPoint(java.lang.Long timestamp, java.util.Map<java.lang.String,java.lang.Object> values) {
    this.timestamp = timestamp;
    this.values = values;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return timestamp;
    case 1: return values;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: timestamp = (java.lang.Long)value$; break;
    case 1: values = (java.util.Map<java.lang.String,java.lang.Object>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return Data point UNIX timestamp in milliseconds
   */
  public long getTimestamp() {
    return timestamp;
  }


  /**
   * Sets the value of the 'timestamp' field.
   * Data point UNIX timestamp in milliseconds
   * @param value the value to set.
   */
  public void setTimestamp(long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'values' field.
   * @return Map of data point values with value names represented as map keys.
   */
  public java.util.Map<java.lang.String,java.lang.Object> getValues() {
    return values;
  }


  /**
   * Sets the value of the 'values' field.
   * Map of data point values with value names represented as map keys.
   * @param value the value to set.
   */
  public void setValues(java.util.Map<java.lang.String,java.lang.Object> value) {
    this.values = value;
  }

  /**
   * Creates a new DataPoint RecordBuilder.
   * @return A new DataPoint RecordBuilder
   */
  public static org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder newBuilder() {
    return new org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder();
  }

  /**
   * Creates a new DataPoint RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataPoint RecordBuilder
   */
  public static org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder newBuilder(org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder other) {
    if (other == null) {
      return new org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder();
    } else {
      return new org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder(other);
    }
  }

  /**
   * Creates a new DataPoint RecordBuilder by copying an existing DataPoint instance.
   * @param other The existing instance to copy.
   * @return A new DataPoint RecordBuilder
   */
  public static org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder newBuilder(org.kaaproject.ipc.tstp.gen.v1.DataPoint other) {
    if (other == null) {
      return new org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder();
    } else {
      return new org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder(other);
    }
  }

  /**
   * RecordBuilder for DataPoint instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataPoint>
    implements org.apache.avro.data.RecordBuilder<DataPoint> {

    /** Data point UNIX timestamp in milliseconds */
    private long timestamp;
    /** Map of data point values with value names represented as map keys. */
    private java.util.Map<java.lang.String,java.lang.Object> values;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.values)) {
        this.values = data().deepCopy(fields()[1].schema(), other.values);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing DataPoint instance
     * @param other The existing instance to copy.
     */
    private Builder(org.kaaproject.ipc.tstp.gen.v1.DataPoint other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[0].schema(), other.timestamp);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.values)) {
        this.values = data().deepCopy(fields()[1].schema(), other.values);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'timestamp' field.
      * Data point UNIX timestamp in milliseconds
      * @return The value.
      */
    public long getTimestamp() {
      return timestamp;
    }


    /**
      * Sets the value of the 'timestamp' field.
      * Data point UNIX timestamp in milliseconds
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder setTimestamp(long value) {
      validate(fields()[0], value);
      this.timestamp = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * Data point UNIX timestamp in milliseconds
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * Data point UNIX timestamp in milliseconds
      * @return This builder.
      */
    public org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder clearTimestamp() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'values' field.
      * Map of data point values with value names represented as map keys.
      * @return The value.
      */
    public java.util.Map<java.lang.String,java.lang.Object> getValues() {
      return values;
    }


    /**
      * Sets the value of the 'values' field.
      * Map of data point values with value names represented as map keys.
      * @param value The value of 'values'.
      * @return This builder.
      */
    public org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder setValues(java.util.Map<java.lang.String,java.lang.Object> value) {
      validate(fields()[1], value);
      this.values = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'values' field has been set.
      * Map of data point values with value names represented as map keys.
      * @return True if the 'values' field has been set, false otherwise.
      */
    public boolean hasValues() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'values' field.
      * Map of data point values with value names represented as map keys.
      * @return This builder.
      */
    public org.kaaproject.ipc.tstp.gen.v1.DataPoint.Builder clearValues() {
      values = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataPoint build() {
      try {
        DataPoint record = new DataPoint();
        record.timestamp = fieldSetFlags()[0] ? this.timestamp : (java.lang.Long) defaultValue(fields()[0]);
        record.values = fieldSetFlags()[1] ? this.values : (java.util.Map<java.lang.String,java.lang.Object>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataPoint>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataPoint>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataPoint>
    READER$ = (org.apache.avro.io.DatumReader<DataPoint>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









