/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-12-01")
public class SlaveStream implements org.apache.thrift.TBase<SlaveStream, SlaveStream._Fields>, java.io.Serializable, Cloneable, Comparable<SlaveStream> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SlaveStream");

  private static final org.apache.thrift.protocol.TField BUILD_SLAVE_RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildSlaveRunId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STREAM_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("streamType", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SlaveStreamStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SlaveStreamTupleSchemeFactory());
  }

  public BuildSlaveRunId buildSlaveRunId; // optional
  /**
   * 
   * @see LogStreamType
   */
  public LogStreamType streamType; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUILD_SLAVE_RUN_ID((short)1, "buildSlaveRunId"),
    /**
     * 
     * @see LogStreamType
     */
    STREAM_TYPE((short)2, "streamType");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUILD_SLAVE_RUN_ID
          return BUILD_SLAVE_RUN_ID;
        case 2: // STREAM_TYPE
          return STREAM_TYPE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.BUILD_SLAVE_RUN_ID,_Fields.STREAM_TYPE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUILD_SLAVE_RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("buildSlaveRunId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildSlaveRunId.class)));
    tmpMap.put(_Fields.STREAM_TYPE, new org.apache.thrift.meta_data.FieldMetaData("streamType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, LogStreamType.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SlaveStream.class, metaDataMap);
  }

  public SlaveStream() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SlaveStream(SlaveStream other) {
    if (other.isSetBuildSlaveRunId()) {
      this.buildSlaveRunId = new BuildSlaveRunId(other.buildSlaveRunId);
    }
    if (other.isSetStreamType()) {
      this.streamType = other.streamType;
    }
  }

  public SlaveStream deepCopy() {
    return new SlaveStream(this);
  }

  @Override
  public void clear() {
    this.buildSlaveRunId = null;
    this.streamType = null;
  }

  public BuildSlaveRunId getBuildSlaveRunId() {
    return this.buildSlaveRunId;
  }

  public SlaveStream setBuildSlaveRunId(BuildSlaveRunId buildSlaveRunId) {
    this.buildSlaveRunId = buildSlaveRunId;
    return this;
  }

  public void unsetBuildSlaveRunId() {
    this.buildSlaveRunId = null;
  }

  /** Returns true if field buildSlaveRunId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildSlaveRunId() {
    return this.buildSlaveRunId != null;
  }

  public void setBuildSlaveRunIdIsSet(boolean value) {
    if (!value) {
      this.buildSlaveRunId = null;
    }
  }

  /**
   * 
   * @see LogStreamType
   */
  public LogStreamType getStreamType() {
    return this.streamType;
  }

  /**
   * 
   * @see LogStreamType
   */
  public SlaveStream setStreamType(LogStreamType streamType) {
    this.streamType = streamType;
    return this;
  }

  public void unsetStreamType() {
    this.streamType = null;
  }

  /** Returns true if field streamType is set (has been assigned a value) and false otherwise */
  public boolean isSetStreamType() {
    return this.streamType != null;
  }

  public void setStreamTypeIsSet(boolean value) {
    if (!value) {
      this.streamType = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      if (value == null) {
        unsetBuildSlaveRunId();
      } else {
        setBuildSlaveRunId((BuildSlaveRunId)value);
      }
      break;

    case STREAM_TYPE:
      if (value == null) {
        unsetStreamType();
      } else {
        setStreamType((LogStreamType)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      return getBuildSlaveRunId();

    case STREAM_TYPE:
      return getStreamType();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUILD_SLAVE_RUN_ID:
      return isSetBuildSlaveRunId();
    case STREAM_TYPE:
      return isSetStreamType();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SlaveStream)
      return this.equals((SlaveStream)that);
    return false;
  }

  public boolean equals(SlaveStream that) {
    if (that == null)
      return false;

    boolean this_present_buildSlaveRunId = true && this.isSetBuildSlaveRunId();
    boolean that_present_buildSlaveRunId = true && that.isSetBuildSlaveRunId();
    if (this_present_buildSlaveRunId || that_present_buildSlaveRunId) {
      if (!(this_present_buildSlaveRunId && that_present_buildSlaveRunId))
        return false;
      if (!this.buildSlaveRunId.equals(that.buildSlaveRunId))
        return false;
    }

    boolean this_present_streamType = true && this.isSetStreamType();
    boolean that_present_streamType = true && that.isSetStreamType();
    if (this_present_streamType || that_present_streamType) {
      if (!(this_present_streamType && that_present_streamType))
        return false;
      if (!this.streamType.equals(that.streamType))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_buildSlaveRunId = true && (isSetBuildSlaveRunId());
    list.add(present_buildSlaveRunId);
    if (present_buildSlaveRunId)
      list.add(buildSlaveRunId);

    boolean present_streamType = true && (isSetStreamType());
    list.add(present_streamType);
    if (present_streamType)
      list.add(streamType.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(SlaveStream other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBuildSlaveRunId()).compareTo(other.isSetBuildSlaveRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildSlaveRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildSlaveRunId, other.buildSlaveRunId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStreamType()).compareTo(other.isSetStreamType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStreamType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.streamType, other.streamType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("SlaveStream(");
    boolean first = true;

    if (isSetBuildSlaveRunId()) {
      sb.append("buildSlaveRunId:");
      if (this.buildSlaveRunId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildSlaveRunId);
      }
      first = false;
    }
    if (isSetStreamType()) {
      if (!first) sb.append(", ");
      sb.append("streamType:");
      if (this.streamType == null) {
        sb.append("null");
      } else {
        sb.append(this.streamType);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildSlaveRunId != null) {
      buildSlaveRunId.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SlaveStreamStandardSchemeFactory implements SchemeFactory {
    public SlaveStreamStandardScheme getScheme() {
      return new SlaveStreamStandardScheme();
    }
  }

  private static class SlaveStreamStandardScheme extends StandardScheme<SlaveStream> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SlaveStream struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUILD_SLAVE_RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildSlaveRunId = new BuildSlaveRunId();
              struct.buildSlaveRunId.read(iprot);
              struct.setBuildSlaveRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STREAM_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.streamType = com.facebook.buck.distributed.thrift.LogStreamType.findByValue(iprot.readI32());
              struct.setStreamTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, SlaveStream struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buildSlaveRunId != null) {
        if (struct.isSetBuildSlaveRunId()) {
          oprot.writeFieldBegin(BUILD_SLAVE_RUN_ID_FIELD_DESC);
          struct.buildSlaveRunId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.streamType != null) {
        if (struct.isSetStreamType()) {
          oprot.writeFieldBegin(STREAM_TYPE_FIELD_DESC);
          oprot.writeI32(struct.streamType.getValue());
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SlaveStreamTupleSchemeFactory implements SchemeFactory {
    public SlaveStreamTupleScheme getScheme() {
      return new SlaveStreamTupleScheme();
    }
  }

  private static class SlaveStreamTupleScheme extends TupleScheme<SlaveStream> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SlaveStream struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBuildSlaveRunId()) {
        optionals.set(0);
      }
      if (struct.isSetStreamType()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetBuildSlaveRunId()) {
        struct.buildSlaveRunId.write(oprot);
      }
      if (struct.isSetStreamType()) {
        oprot.writeI32(struct.streamType.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SlaveStream struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.buildSlaveRunId = new BuildSlaveRunId();
        struct.buildSlaveRunId.read(iprot);
        struct.setBuildSlaveRunIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.streamType = com.facebook.buck.distributed.thrift.LogStreamType.findByValue(iprot.readI32());
        struct.setStreamTypeIsSet(true);
      }
    }
  }

}

