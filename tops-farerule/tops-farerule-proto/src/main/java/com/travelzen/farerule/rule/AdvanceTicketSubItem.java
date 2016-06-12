/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.travelzen.farerule.rule;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdvanceTicketSubItem implements org.apache.thrift.TBase<AdvanceTicketSubItem, AdvanceTicketSubItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AdvanceTicketSubItem");

  private static final org.apache.thrift.protocol.TField RESERVATION_TIME_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("reservationTimeType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RESERVATION_TIME_NUM_FIELD_DESC = new org.apache.thrift.protocol.TField("reservationTimeNum", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TIME_TYPE_AFTER_RESERVATION_FIELD_DESC = new org.apache.thrift.protocol.TField("timeTypeAfterReservation", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_NUM_AFTER_RESERVATION_FIELD_DESC = new org.apache.thrift.protocol.TField("timeNumAfterReservation", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TIME_TYPE_BEFORE_DEPARTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeTypeBeforeDeparture", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField TIME_NUM_BEFORE_DEPARTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("timeNumBeforeDeparture", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AdvanceTicketSubItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AdvanceTicketSubItemTupleSchemeFactory());
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum reservationTimeType; // optional
  public int reservationTimeNum; // optional
  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum timeTypeAfterReservation; // optional
  public int timeNumAfterReservation; // optional
  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum timeTypeBeforeDeparture; // optional
  public int timeNumBeforeDeparture; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TimeTypeEnum
     */
    RESERVATION_TIME_TYPE((short)1, "reservationTimeType"),
    RESERVATION_TIME_NUM((short)2, "reservationTimeNum"),
    /**
     * 
     * @see TimeTypeEnum
     */
    TIME_TYPE_AFTER_RESERVATION((short)3, "timeTypeAfterReservation"),
    TIME_NUM_AFTER_RESERVATION((short)4, "timeNumAfterReservation"),
    /**
     * 
     * @see TimeTypeEnum
     */
    TIME_TYPE_BEFORE_DEPARTURE((short)5, "timeTypeBeforeDeparture"),
    TIME_NUM_BEFORE_DEPARTURE((short)6, "timeNumBeforeDeparture");

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
        case 1: // RESERVATION_TIME_TYPE
          return RESERVATION_TIME_TYPE;
        case 2: // RESERVATION_TIME_NUM
          return RESERVATION_TIME_NUM;
        case 3: // TIME_TYPE_AFTER_RESERVATION
          return TIME_TYPE_AFTER_RESERVATION;
        case 4: // TIME_NUM_AFTER_RESERVATION
          return TIME_NUM_AFTER_RESERVATION;
        case 5: // TIME_TYPE_BEFORE_DEPARTURE
          return TIME_TYPE_BEFORE_DEPARTURE;
        case 6: // TIME_NUM_BEFORE_DEPARTURE
          return TIME_NUM_BEFORE_DEPARTURE;
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
  private static final int __RESERVATIONTIMENUM_ISSET_ID = 0;
  private static final int __TIMENUMAFTERRESERVATION_ISSET_ID = 1;
  private static final int __TIMENUMBEFOREDEPARTURE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.RESERVATION_TIME_TYPE,_Fields.RESERVATION_TIME_NUM,_Fields.TIME_TYPE_AFTER_RESERVATION,_Fields.TIME_NUM_AFTER_RESERVATION,_Fields.TIME_TYPE_BEFORE_DEPARTURE,_Fields.TIME_NUM_BEFORE_DEPARTURE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RESERVATION_TIME_TYPE, new org.apache.thrift.meta_data.FieldMetaData("reservationTimeType", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TimeTypeEnum.class)));
    tmpMap.put(_Fields.RESERVATION_TIME_NUM, new org.apache.thrift.meta_data.FieldMetaData("reservationTimeNum", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIME_TYPE_AFTER_RESERVATION, new org.apache.thrift.meta_data.FieldMetaData("timeTypeAfterReservation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TimeTypeEnum.class)));
    tmpMap.put(_Fields.TIME_NUM_AFTER_RESERVATION, new org.apache.thrift.meta_data.FieldMetaData("timeNumAfterReservation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIME_TYPE_BEFORE_DEPARTURE, new org.apache.thrift.meta_data.FieldMetaData("timeTypeBeforeDeparture", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TimeTypeEnum.class)));
    tmpMap.put(_Fields.TIME_NUM_BEFORE_DEPARTURE, new org.apache.thrift.meta_data.FieldMetaData("timeNumBeforeDeparture", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AdvanceTicketSubItem.class, metaDataMap);
  }

  public AdvanceTicketSubItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AdvanceTicketSubItem(AdvanceTicketSubItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetReservationTimeType()) {
      this.reservationTimeType = other.reservationTimeType;
    }
    this.reservationTimeNum = other.reservationTimeNum;
    if (other.isSetTimeTypeAfterReservation()) {
      this.timeTypeAfterReservation = other.timeTypeAfterReservation;
    }
    this.timeNumAfterReservation = other.timeNumAfterReservation;
    if (other.isSetTimeTypeBeforeDeparture()) {
      this.timeTypeBeforeDeparture = other.timeTypeBeforeDeparture;
    }
    this.timeNumBeforeDeparture = other.timeNumBeforeDeparture;
  }

  public AdvanceTicketSubItem deepCopy() {
    return new AdvanceTicketSubItem(this);
  }

  @Override
  public void clear() {
    this.reservationTimeType = null;
    setReservationTimeNumIsSet(false);
    this.reservationTimeNum = 0;
    this.timeTypeAfterReservation = null;
    setTimeNumAfterReservationIsSet(false);
    this.timeNumAfterReservation = 0;
    this.timeTypeBeforeDeparture = null;
    setTimeNumBeforeDepartureIsSet(false);
    this.timeNumBeforeDeparture = 0;
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum getReservationTimeType() {
    return this.reservationTimeType;
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public AdvanceTicketSubItem setReservationTimeType(TimeTypeEnum reservationTimeType) {
    this.reservationTimeType = reservationTimeType;
    return this;
  }

  public void unsetReservationTimeType() {
    this.reservationTimeType = null;
  }

  /** Returns true if field reservationTimeType is set (has been assigned a value) and false otherwise */
  public boolean isSetReservationTimeType() {
    return this.reservationTimeType != null;
  }

  public void setReservationTimeTypeIsSet(boolean value) {
    if (!value) {
      this.reservationTimeType = null;
    }
  }

  public int getReservationTimeNum() {
    return this.reservationTimeNum;
  }

  public AdvanceTicketSubItem setReservationTimeNum(int reservationTimeNum) {
    this.reservationTimeNum = reservationTimeNum;
    setReservationTimeNumIsSet(true);
    return this;
  }

  public void unsetReservationTimeNum() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RESERVATIONTIMENUM_ISSET_ID);
  }

  /** Returns true if field reservationTimeNum is set (has been assigned a value) and false otherwise */
  public boolean isSetReservationTimeNum() {
    return EncodingUtils.testBit(__isset_bitfield, __RESERVATIONTIMENUM_ISSET_ID);
  }

  public void setReservationTimeNumIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RESERVATIONTIMENUM_ISSET_ID, value);
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum getTimeTypeAfterReservation() {
    return this.timeTypeAfterReservation;
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public AdvanceTicketSubItem setTimeTypeAfterReservation(TimeTypeEnum timeTypeAfterReservation) {
    this.timeTypeAfterReservation = timeTypeAfterReservation;
    return this;
  }

  public void unsetTimeTypeAfterReservation() {
    this.timeTypeAfterReservation = null;
  }

  /** Returns true if field timeTypeAfterReservation is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeTypeAfterReservation() {
    return this.timeTypeAfterReservation != null;
  }

  public void setTimeTypeAfterReservationIsSet(boolean value) {
    if (!value) {
      this.timeTypeAfterReservation = null;
    }
  }

  public int getTimeNumAfterReservation() {
    return this.timeNumAfterReservation;
  }

  public AdvanceTicketSubItem setTimeNumAfterReservation(int timeNumAfterReservation) {
    this.timeNumAfterReservation = timeNumAfterReservation;
    setTimeNumAfterReservationIsSet(true);
    return this;
  }

  public void unsetTimeNumAfterReservation() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMENUMAFTERRESERVATION_ISSET_ID);
  }

  /** Returns true if field timeNumAfterReservation is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeNumAfterReservation() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMENUMAFTERRESERVATION_ISSET_ID);
  }

  public void setTimeNumAfterReservationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMENUMAFTERRESERVATION_ISSET_ID, value);
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public TimeTypeEnum getTimeTypeBeforeDeparture() {
    return this.timeTypeBeforeDeparture;
  }

  /**
   * 
   * @see TimeTypeEnum
   */
  public AdvanceTicketSubItem setTimeTypeBeforeDeparture(TimeTypeEnum timeTypeBeforeDeparture) {
    this.timeTypeBeforeDeparture = timeTypeBeforeDeparture;
    return this;
  }

  public void unsetTimeTypeBeforeDeparture() {
    this.timeTypeBeforeDeparture = null;
  }

  /** Returns true if field timeTypeBeforeDeparture is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeTypeBeforeDeparture() {
    return this.timeTypeBeforeDeparture != null;
  }

  public void setTimeTypeBeforeDepartureIsSet(boolean value) {
    if (!value) {
      this.timeTypeBeforeDeparture = null;
    }
  }

  public int getTimeNumBeforeDeparture() {
    return this.timeNumBeforeDeparture;
  }

  public AdvanceTicketSubItem setTimeNumBeforeDeparture(int timeNumBeforeDeparture) {
    this.timeNumBeforeDeparture = timeNumBeforeDeparture;
    setTimeNumBeforeDepartureIsSet(true);
    return this;
  }

  public void unsetTimeNumBeforeDeparture() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMENUMBEFOREDEPARTURE_ISSET_ID);
  }

  /** Returns true if field timeNumBeforeDeparture is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeNumBeforeDeparture() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMENUMBEFOREDEPARTURE_ISSET_ID);
  }

  public void setTimeNumBeforeDepartureIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMENUMBEFOREDEPARTURE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESERVATION_TIME_TYPE:
      if (value == null) {
        unsetReservationTimeType();
      } else {
        setReservationTimeType((TimeTypeEnum)value);
      }
      break;

    case RESERVATION_TIME_NUM:
      if (value == null) {
        unsetReservationTimeNum();
      } else {
        setReservationTimeNum((Integer)value);
      }
      break;

    case TIME_TYPE_AFTER_RESERVATION:
      if (value == null) {
        unsetTimeTypeAfterReservation();
      } else {
        setTimeTypeAfterReservation((TimeTypeEnum)value);
      }
      break;

    case TIME_NUM_AFTER_RESERVATION:
      if (value == null) {
        unsetTimeNumAfterReservation();
      } else {
        setTimeNumAfterReservation((Integer)value);
      }
      break;

    case TIME_TYPE_BEFORE_DEPARTURE:
      if (value == null) {
        unsetTimeTypeBeforeDeparture();
      } else {
        setTimeTypeBeforeDeparture((TimeTypeEnum)value);
      }
      break;

    case TIME_NUM_BEFORE_DEPARTURE:
      if (value == null) {
        unsetTimeNumBeforeDeparture();
      } else {
        setTimeNumBeforeDeparture((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESERVATION_TIME_TYPE:
      return getReservationTimeType();

    case RESERVATION_TIME_NUM:
      return Integer.valueOf(getReservationTimeNum());

    case TIME_TYPE_AFTER_RESERVATION:
      return getTimeTypeAfterReservation();

    case TIME_NUM_AFTER_RESERVATION:
      return Integer.valueOf(getTimeNumAfterReservation());

    case TIME_TYPE_BEFORE_DEPARTURE:
      return getTimeTypeBeforeDeparture();

    case TIME_NUM_BEFORE_DEPARTURE:
      return Integer.valueOf(getTimeNumBeforeDeparture());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESERVATION_TIME_TYPE:
      return isSetReservationTimeType();
    case RESERVATION_TIME_NUM:
      return isSetReservationTimeNum();
    case TIME_TYPE_AFTER_RESERVATION:
      return isSetTimeTypeAfterReservation();
    case TIME_NUM_AFTER_RESERVATION:
      return isSetTimeNumAfterReservation();
    case TIME_TYPE_BEFORE_DEPARTURE:
      return isSetTimeTypeBeforeDeparture();
    case TIME_NUM_BEFORE_DEPARTURE:
      return isSetTimeNumBeforeDeparture();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AdvanceTicketSubItem)
      return this.equals((AdvanceTicketSubItem)that);
    return false;
  }

  public boolean equals(AdvanceTicketSubItem that) {
    if (that == null)
      return false;

    boolean this_present_reservationTimeType = true && this.isSetReservationTimeType();
    boolean that_present_reservationTimeType = true && that.isSetReservationTimeType();
    if (this_present_reservationTimeType || that_present_reservationTimeType) {
      if (!(this_present_reservationTimeType && that_present_reservationTimeType))
        return false;
      if (!this.reservationTimeType.equals(that.reservationTimeType))
        return false;
    }

    boolean this_present_reservationTimeNum = true && this.isSetReservationTimeNum();
    boolean that_present_reservationTimeNum = true && that.isSetReservationTimeNum();
    if (this_present_reservationTimeNum || that_present_reservationTimeNum) {
      if (!(this_present_reservationTimeNum && that_present_reservationTimeNum))
        return false;
      if (this.reservationTimeNum != that.reservationTimeNum)
        return false;
    }

    boolean this_present_timeTypeAfterReservation = true && this.isSetTimeTypeAfterReservation();
    boolean that_present_timeTypeAfterReservation = true && that.isSetTimeTypeAfterReservation();
    if (this_present_timeTypeAfterReservation || that_present_timeTypeAfterReservation) {
      if (!(this_present_timeTypeAfterReservation && that_present_timeTypeAfterReservation))
        return false;
      if (!this.timeTypeAfterReservation.equals(that.timeTypeAfterReservation))
        return false;
    }

    boolean this_present_timeNumAfterReservation = true && this.isSetTimeNumAfterReservation();
    boolean that_present_timeNumAfterReservation = true && that.isSetTimeNumAfterReservation();
    if (this_present_timeNumAfterReservation || that_present_timeNumAfterReservation) {
      if (!(this_present_timeNumAfterReservation && that_present_timeNumAfterReservation))
        return false;
      if (this.timeNumAfterReservation != that.timeNumAfterReservation)
        return false;
    }

    boolean this_present_timeTypeBeforeDeparture = true && this.isSetTimeTypeBeforeDeparture();
    boolean that_present_timeTypeBeforeDeparture = true && that.isSetTimeTypeBeforeDeparture();
    if (this_present_timeTypeBeforeDeparture || that_present_timeTypeBeforeDeparture) {
      if (!(this_present_timeTypeBeforeDeparture && that_present_timeTypeBeforeDeparture))
        return false;
      if (!this.timeTypeBeforeDeparture.equals(that.timeTypeBeforeDeparture))
        return false;
    }

    boolean this_present_timeNumBeforeDeparture = true && this.isSetTimeNumBeforeDeparture();
    boolean that_present_timeNumBeforeDeparture = true && that.isSetTimeNumBeforeDeparture();
    if (this_present_timeNumBeforeDeparture || that_present_timeNumBeforeDeparture) {
      if (!(this_present_timeNumBeforeDeparture && that_present_timeNumBeforeDeparture))
        return false;
      if (this.timeNumBeforeDeparture != that.timeNumBeforeDeparture)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AdvanceTicketSubItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AdvanceTicketSubItem typedOther = (AdvanceTicketSubItem)other;

    lastComparison = Boolean.valueOf(isSetReservationTimeType()).compareTo(typedOther.isSetReservationTimeType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReservationTimeType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reservationTimeType, typedOther.reservationTimeType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReservationTimeNum()).compareTo(typedOther.isSetReservationTimeNum());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReservationTimeNum()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reservationTimeNum, typedOther.reservationTimeNum);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeTypeAfterReservation()).compareTo(typedOther.isSetTimeTypeAfterReservation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeTypeAfterReservation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeTypeAfterReservation, typedOther.timeTypeAfterReservation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeNumAfterReservation()).compareTo(typedOther.isSetTimeNumAfterReservation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeNumAfterReservation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeNumAfterReservation, typedOther.timeNumAfterReservation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeTypeBeforeDeparture()).compareTo(typedOther.isSetTimeTypeBeforeDeparture());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeTypeBeforeDeparture()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeTypeBeforeDeparture, typedOther.timeTypeBeforeDeparture);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeNumBeforeDeparture()).compareTo(typedOther.isSetTimeNumBeforeDeparture());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeNumBeforeDeparture()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeNumBeforeDeparture, typedOther.timeNumBeforeDeparture);
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
    StringBuilder sb = new StringBuilder("AdvanceTicketSubItem(");
    boolean first = true;

    if (isSetReservationTimeType()) {
      sb.append("reservationTimeType:");
      if (this.reservationTimeType == null) {
        sb.append("null");
      } else {
        sb.append(this.reservationTimeType);
      }
      first = false;
    }
    if (isSetReservationTimeNum()) {
      if (!first) sb.append(", ");
      sb.append("reservationTimeNum:");
      sb.append(this.reservationTimeNum);
      first = false;
    }
    if (isSetTimeTypeAfterReservation()) {
      if (!first) sb.append(", ");
      sb.append("timeTypeAfterReservation:");
      if (this.timeTypeAfterReservation == null) {
        sb.append("null");
      } else {
        sb.append(this.timeTypeAfterReservation);
      }
      first = false;
    }
    if (isSetTimeNumAfterReservation()) {
      if (!first) sb.append(", ");
      sb.append("timeNumAfterReservation:");
      sb.append(this.timeNumAfterReservation);
      first = false;
    }
    if (isSetTimeTypeBeforeDeparture()) {
      if (!first) sb.append(", ");
      sb.append("timeTypeBeforeDeparture:");
      if (this.timeTypeBeforeDeparture == null) {
        sb.append("null");
      } else {
        sb.append(this.timeTypeBeforeDeparture);
      }
      first = false;
    }
    if (isSetTimeNumBeforeDeparture()) {
      if (!first) sb.append(", ");
      sb.append("timeNumBeforeDeparture:");
      sb.append(this.timeNumBeforeDeparture);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AdvanceTicketSubItemStandardSchemeFactory implements SchemeFactory {
    public AdvanceTicketSubItemStandardScheme getScheme() {
      return new AdvanceTicketSubItemStandardScheme();
    }
  }

  private static class AdvanceTicketSubItemStandardScheme extends StandardScheme<AdvanceTicketSubItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AdvanceTicketSubItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESERVATION_TIME_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reservationTimeType = TimeTypeEnum.findByValue(iprot.readI32());
              struct.setReservationTimeTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RESERVATION_TIME_NUM
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reservationTimeNum = iprot.readI32();
              struct.setReservationTimeNumIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TIME_TYPE_AFTER_RESERVATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeTypeAfterReservation = TimeTypeEnum.findByValue(iprot.readI32());
              struct.setTimeTypeAfterReservationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME_NUM_AFTER_RESERVATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeNumAfterReservation = iprot.readI32();
              struct.setTimeNumAfterReservationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIME_TYPE_BEFORE_DEPARTURE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeTypeBeforeDeparture = TimeTypeEnum.findByValue(iprot.readI32());
              struct.setTimeTypeBeforeDepartureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TIME_NUM_BEFORE_DEPARTURE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.timeNumBeforeDeparture = iprot.readI32();
              struct.setTimeNumBeforeDepartureIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AdvanceTicketSubItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.reservationTimeType != null) {
        if (struct.isSetReservationTimeType()) {
          oprot.writeFieldBegin(RESERVATION_TIME_TYPE_FIELD_DESC);
          oprot.writeI32(struct.reservationTimeType.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetReservationTimeNum()) {
        oprot.writeFieldBegin(RESERVATION_TIME_NUM_FIELD_DESC);
        oprot.writeI32(struct.reservationTimeNum);
        oprot.writeFieldEnd();
      }
      if (struct.timeTypeAfterReservation != null) {
        if (struct.isSetTimeTypeAfterReservation()) {
          oprot.writeFieldBegin(TIME_TYPE_AFTER_RESERVATION_FIELD_DESC);
          oprot.writeI32(struct.timeTypeAfterReservation.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimeNumAfterReservation()) {
        oprot.writeFieldBegin(TIME_NUM_AFTER_RESERVATION_FIELD_DESC);
        oprot.writeI32(struct.timeNumAfterReservation);
        oprot.writeFieldEnd();
      }
      if (struct.timeTypeBeforeDeparture != null) {
        if (struct.isSetTimeTypeBeforeDeparture()) {
          oprot.writeFieldBegin(TIME_TYPE_BEFORE_DEPARTURE_FIELD_DESC);
          oprot.writeI32(struct.timeTypeBeforeDeparture.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimeNumBeforeDeparture()) {
        oprot.writeFieldBegin(TIME_NUM_BEFORE_DEPARTURE_FIELD_DESC);
        oprot.writeI32(struct.timeNumBeforeDeparture);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AdvanceTicketSubItemTupleSchemeFactory implements SchemeFactory {
    public AdvanceTicketSubItemTupleScheme getScheme() {
      return new AdvanceTicketSubItemTupleScheme();
    }
  }

  private static class AdvanceTicketSubItemTupleScheme extends TupleScheme<AdvanceTicketSubItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AdvanceTicketSubItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetReservationTimeType()) {
        optionals.set(0);
      }
      if (struct.isSetReservationTimeNum()) {
        optionals.set(1);
      }
      if (struct.isSetTimeTypeAfterReservation()) {
        optionals.set(2);
      }
      if (struct.isSetTimeNumAfterReservation()) {
        optionals.set(3);
      }
      if (struct.isSetTimeTypeBeforeDeparture()) {
        optionals.set(4);
      }
      if (struct.isSetTimeNumBeforeDeparture()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetReservationTimeType()) {
        oprot.writeI32(struct.reservationTimeType.getValue());
      }
      if (struct.isSetReservationTimeNum()) {
        oprot.writeI32(struct.reservationTimeNum);
      }
      if (struct.isSetTimeTypeAfterReservation()) {
        oprot.writeI32(struct.timeTypeAfterReservation.getValue());
      }
      if (struct.isSetTimeNumAfterReservation()) {
        oprot.writeI32(struct.timeNumAfterReservation);
      }
      if (struct.isSetTimeTypeBeforeDeparture()) {
        oprot.writeI32(struct.timeTypeBeforeDeparture.getValue());
      }
      if (struct.isSetTimeNumBeforeDeparture()) {
        oprot.writeI32(struct.timeNumBeforeDeparture);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AdvanceTicketSubItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.reservationTimeType = TimeTypeEnum.findByValue(iprot.readI32());
        struct.setReservationTimeTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reservationTimeNum = iprot.readI32();
        struct.setReservationTimeNumIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeTypeAfterReservation = TimeTypeEnum.findByValue(iprot.readI32());
        struct.setTimeTypeAfterReservationIsSet(true);
      }
      if (incoming.get(3)) {
        struct.timeNumAfterReservation = iprot.readI32();
        struct.setTimeNumAfterReservationIsSet(true);
      }
      if (incoming.get(4)) {
        struct.timeTypeBeforeDeparture = TimeTypeEnum.findByValue(iprot.readI32());
        struct.setTimeTypeBeforeDepartureIsSet(true);
      }
      if (incoming.get(5)) {
        struct.timeNumBeforeDeparture = iprot.readI32();
        struct.setTimeNumBeforeDepartureIsSet(true);
      }
    }
  }

}
