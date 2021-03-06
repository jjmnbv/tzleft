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

public class PenaltiesItem implements org.apache.thrift.TBase<PenaltiesItem, PenaltiesItem._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PenaltiesItem");

  private static final org.apache.thrift.protocol.TField RULE_CONDITION_FIELD_DESC = new org.apache.thrift.protocol.TField("ruleCondition", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PENALTY_CANCEL_ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("PenaltyCancelItemList", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField PENALTY_CHANGE_ITEM_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("PenaltyChangeItemList", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField PENALTY_ADDITION_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("penaltyAdditionList", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PenaltiesItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PenaltiesItemTupleSchemeFactory());
  }

  public com.travelzen.farerule.condition.RuleCondition ruleCondition; // optional
  public List<PenaltyCancelItem> PenaltyCancelItemList; // optional
  public List<PenaltyChangeItem> PenaltyChangeItemList; // optional
  public List<PenaltyAdditionEnum> penaltyAdditionList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    RULE_CONDITION((short)1, "ruleCondition"),
    PENALTY_CANCEL_ITEM_LIST((short)2, "PenaltyCancelItemList"),
    PENALTY_CHANGE_ITEM_LIST((short)3, "PenaltyChangeItemList"),
    PENALTY_ADDITION_LIST((short)4, "penaltyAdditionList");

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
        case 1: // RULE_CONDITION
          return RULE_CONDITION;
        case 2: // PENALTY_CANCEL_ITEM_LIST
          return PENALTY_CANCEL_ITEM_LIST;
        case 3: // PENALTY_CHANGE_ITEM_LIST
          return PENALTY_CHANGE_ITEM_LIST;
        case 4: // PENALTY_ADDITION_LIST
          return PENALTY_ADDITION_LIST;
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
  private _Fields optionals[] = {_Fields.RULE_CONDITION,_Fields.PENALTY_CANCEL_ITEM_LIST,_Fields.PENALTY_CHANGE_ITEM_LIST,_Fields.PENALTY_ADDITION_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.RULE_CONDITION, new org.apache.thrift.meta_data.FieldMetaData("ruleCondition", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.travelzen.farerule.condition.RuleCondition.class)));
    tmpMap.put(_Fields.PENALTY_CANCEL_ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("PenaltyCancelItemList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PenaltyCancelItem.class))));
    tmpMap.put(_Fields.PENALTY_CHANGE_ITEM_LIST, new org.apache.thrift.meta_data.FieldMetaData("PenaltyChangeItemList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PenaltyChangeItem.class))));
    tmpMap.put(_Fields.PENALTY_ADDITION_LIST, new org.apache.thrift.meta_data.FieldMetaData("penaltyAdditionList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PenaltyAdditionEnum.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PenaltiesItem.class, metaDataMap);
  }

  public PenaltiesItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PenaltiesItem(PenaltiesItem other) {
    if (other.isSetRuleCondition()) {
      this.ruleCondition = new com.travelzen.farerule.condition.RuleCondition(other.ruleCondition);
    }
    if (other.isSetPenaltyCancelItemList()) {
      List<PenaltyCancelItem> __this__PenaltyCancelItemList = new ArrayList<PenaltyCancelItem>();
      for (PenaltyCancelItem other_element : other.PenaltyCancelItemList) {
        __this__PenaltyCancelItemList.add(new PenaltyCancelItem(other_element));
      }
      this.PenaltyCancelItemList = __this__PenaltyCancelItemList;
    }
    if (other.isSetPenaltyChangeItemList()) {
      List<PenaltyChangeItem> __this__PenaltyChangeItemList = new ArrayList<PenaltyChangeItem>();
      for (PenaltyChangeItem other_element : other.PenaltyChangeItemList) {
        __this__PenaltyChangeItemList.add(new PenaltyChangeItem(other_element));
      }
      this.PenaltyChangeItemList = __this__PenaltyChangeItemList;
    }
    if (other.isSetPenaltyAdditionList()) {
      List<PenaltyAdditionEnum> __this__penaltyAdditionList = new ArrayList<PenaltyAdditionEnum>();
      for (PenaltyAdditionEnum other_element : other.penaltyAdditionList) {
        __this__penaltyAdditionList.add(other_element);
      }
      this.penaltyAdditionList = __this__penaltyAdditionList;
    }
  }

  public PenaltiesItem deepCopy() {
    return new PenaltiesItem(this);
  }

  @Override
  public void clear() {
    this.ruleCondition = null;
    this.PenaltyCancelItemList = null;
    this.PenaltyChangeItemList = null;
    this.penaltyAdditionList = null;
  }

  public com.travelzen.farerule.condition.RuleCondition getRuleCondition() {
    return this.ruleCondition;
  }

  public PenaltiesItem setRuleCondition(com.travelzen.farerule.condition.RuleCondition ruleCondition) {
    this.ruleCondition = ruleCondition;
    return this;
  }

  public void unsetRuleCondition() {
    this.ruleCondition = null;
  }

  /** Returns true if field ruleCondition is set (has been assigned a value) and false otherwise */
  public boolean isSetRuleCondition() {
    return this.ruleCondition != null;
  }

  public void setRuleConditionIsSet(boolean value) {
    if (!value) {
      this.ruleCondition = null;
    }
  }

  public int getPenaltyCancelItemListSize() {
    return (this.PenaltyCancelItemList == null) ? 0 : this.PenaltyCancelItemList.size();
  }

  public java.util.Iterator<PenaltyCancelItem> getPenaltyCancelItemListIterator() {
    return (this.PenaltyCancelItemList == null) ? null : this.PenaltyCancelItemList.iterator();
  }

  public void addToPenaltyCancelItemList(PenaltyCancelItem elem) {
    if (this.PenaltyCancelItemList == null) {
      this.PenaltyCancelItemList = new ArrayList<PenaltyCancelItem>();
    }
    this.PenaltyCancelItemList.add(elem);
  }

  public List<PenaltyCancelItem> getPenaltyCancelItemList() {
    return this.PenaltyCancelItemList;
  }

  public PenaltiesItem setPenaltyCancelItemList(List<PenaltyCancelItem> PenaltyCancelItemList) {
    this.PenaltyCancelItemList = PenaltyCancelItemList;
    return this;
  }

  public void unsetPenaltyCancelItemList() {
    this.PenaltyCancelItemList = null;
  }

  /** Returns true if field PenaltyCancelItemList is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyCancelItemList() {
    return this.PenaltyCancelItemList != null;
  }

  public void setPenaltyCancelItemListIsSet(boolean value) {
    if (!value) {
      this.PenaltyCancelItemList = null;
    }
  }

  public int getPenaltyChangeItemListSize() {
    return (this.PenaltyChangeItemList == null) ? 0 : this.PenaltyChangeItemList.size();
  }

  public java.util.Iterator<PenaltyChangeItem> getPenaltyChangeItemListIterator() {
    return (this.PenaltyChangeItemList == null) ? null : this.PenaltyChangeItemList.iterator();
  }

  public void addToPenaltyChangeItemList(PenaltyChangeItem elem) {
    if (this.PenaltyChangeItemList == null) {
      this.PenaltyChangeItemList = new ArrayList<PenaltyChangeItem>();
    }
    this.PenaltyChangeItemList.add(elem);
  }

  public List<PenaltyChangeItem> getPenaltyChangeItemList() {
    return this.PenaltyChangeItemList;
  }

  public PenaltiesItem setPenaltyChangeItemList(List<PenaltyChangeItem> PenaltyChangeItemList) {
    this.PenaltyChangeItemList = PenaltyChangeItemList;
    return this;
  }

  public void unsetPenaltyChangeItemList() {
    this.PenaltyChangeItemList = null;
  }

  /** Returns true if field PenaltyChangeItemList is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyChangeItemList() {
    return this.PenaltyChangeItemList != null;
  }

  public void setPenaltyChangeItemListIsSet(boolean value) {
    if (!value) {
      this.PenaltyChangeItemList = null;
    }
  }

  public int getPenaltyAdditionListSize() {
    return (this.penaltyAdditionList == null) ? 0 : this.penaltyAdditionList.size();
  }

  public java.util.Iterator<PenaltyAdditionEnum> getPenaltyAdditionListIterator() {
    return (this.penaltyAdditionList == null) ? null : this.penaltyAdditionList.iterator();
  }

  public void addToPenaltyAdditionList(PenaltyAdditionEnum elem) {
    if (this.penaltyAdditionList == null) {
      this.penaltyAdditionList = new ArrayList<PenaltyAdditionEnum>();
    }
    this.penaltyAdditionList.add(elem);
  }

  public List<PenaltyAdditionEnum> getPenaltyAdditionList() {
    return this.penaltyAdditionList;
  }

  public PenaltiesItem setPenaltyAdditionList(List<PenaltyAdditionEnum> penaltyAdditionList) {
    this.penaltyAdditionList = penaltyAdditionList;
    return this;
  }

  public void unsetPenaltyAdditionList() {
    this.penaltyAdditionList = null;
  }

  /** Returns true if field penaltyAdditionList is set (has been assigned a value) and false otherwise */
  public boolean isSetPenaltyAdditionList() {
    return this.penaltyAdditionList != null;
  }

  public void setPenaltyAdditionListIsSet(boolean value) {
    if (!value) {
      this.penaltyAdditionList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RULE_CONDITION:
      if (value == null) {
        unsetRuleCondition();
      } else {
        setRuleCondition((com.travelzen.farerule.condition.RuleCondition)value);
      }
      break;

    case PENALTY_CANCEL_ITEM_LIST:
      if (value == null) {
        unsetPenaltyCancelItemList();
      } else {
        setPenaltyCancelItemList((List<PenaltyCancelItem>)value);
      }
      break;

    case PENALTY_CHANGE_ITEM_LIST:
      if (value == null) {
        unsetPenaltyChangeItemList();
      } else {
        setPenaltyChangeItemList((List<PenaltyChangeItem>)value);
      }
      break;

    case PENALTY_ADDITION_LIST:
      if (value == null) {
        unsetPenaltyAdditionList();
      } else {
        setPenaltyAdditionList((List<PenaltyAdditionEnum>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RULE_CONDITION:
      return getRuleCondition();

    case PENALTY_CANCEL_ITEM_LIST:
      return getPenaltyCancelItemList();

    case PENALTY_CHANGE_ITEM_LIST:
      return getPenaltyChangeItemList();

    case PENALTY_ADDITION_LIST:
      return getPenaltyAdditionList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RULE_CONDITION:
      return isSetRuleCondition();
    case PENALTY_CANCEL_ITEM_LIST:
      return isSetPenaltyCancelItemList();
    case PENALTY_CHANGE_ITEM_LIST:
      return isSetPenaltyChangeItemList();
    case PENALTY_ADDITION_LIST:
      return isSetPenaltyAdditionList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PenaltiesItem)
      return this.equals((PenaltiesItem)that);
    return false;
  }

  public boolean equals(PenaltiesItem that) {
    if (that == null)
      return false;

    boolean this_present_ruleCondition = true && this.isSetRuleCondition();
    boolean that_present_ruleCondition = true && that.isSetRuleCondition();
    if (this_present_ruleCondition || that_present_ruleCondition) {
      if (!(this_present_ruleCondition && that_present_ruleCondition))
        return false;
      if (!this.ruleCondition.equals(that.ruleCondition))
        return false;
    }

    boolean this_present_PenaltyCancelItemList = true && this.isSetPenaltyCancelItemList();
    boolean that_present_PenaltyCancelItemList = true && that.isSetPenaltyCancelItemList();
    if (this_present_PenaltyCancelItemList || that_present_PenaltyCancelItemList) {
      if (!(this_present_PenaltyCancelItemList && that_present_PenaltyCancelItemList))
        return false;
      if (!this.PenaltyCancelItemList.equals(that.PenaltyCancelItemList))
        return false;
    }

    boolean this_present_PenaltyChangeItemList = true && this.isSetPenaltyChangeItemList();
    boolean that_present_PenaltyChangeItemList = true && that.isSetPenaltyChangeItemList();
    if (this_present_PenaltyChangeItemList || that_present_PenaltyChangeItemList) {
      if (!(this_present_PenaltyChangeItemList && that_present_PenaltyChangeItemList))
        return false;
      if (!this.PenaltyChangeItemList.equals(that.PenaltyChangeItemList))
        return false;
    }

    boolean this_present_penaltyAdditionList = true && this.isSetPenaltyAdditionList();
    boolean that_present_penaltyAdditionList = true && that.isSetPenaltyAdditionList();
    if (this_present_penaltyAdditionList || that_present_penaltyAdditionList) {
      if (!(this_present_penaltyAdditionList && that_present_penaltyAdditionList))
        return false;
      if (!this.penaltyAdditionList.equals(that.penaltyAdditionList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(PenaltiesItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    PenaltiesItem typedOther = (PenaltiesItem)other;

    lastComparison = Boolean.valueOf(isSetRuleCondition()).compareTo(typedOther.isSetRuleCondition());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuleCondition()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ruleCondition, typedOther.ruleCondition);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPenaltyCancelItemList()).compareTo(typedOther.isSetPenaltyCancelItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyCancelItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.PenaltyCancelItemList, typedOther.PenaltyCancelItemList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPenaltyChangeItemList()).compareTo(typedOther.isSetPenaltyChangeItemList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyChangeItemList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.PenaltyChangeItemList, typedOther.PenaltyChangeItemList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPenaltyAdditionList()).compareTo(typedOther.isSetPenaltyAdditionList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPenaltyAdditionList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.penaltyAdditionList, typedOther.penaltyAdditionList);
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
    StringBuilder sb = new StringBuilder("PenaltiesItem(");
    boolean first = true;

    if (isSetRuleCondition()) {
      sb.append("ruleCondition:");
      if (this.ruleCondition == null) {
        sb.append("null");
      } else {
        sb.append(this.ruleCondition);
      }
      first = false;
    }
    if (isSetPenaltyCancelItemList()) {
      if (!first) sb.append(", ");
      sb.append("PenaltyCancelItemList:");
      if (this.PenaltyCancelItemList == null) {
        sb.append("null");
      } else {
        sb.append(this.PenaltyCancelItemList);
      }
      first = false;
    }
    if (isSetPenaltyChangeItemList()) {
      if (!first) sb.append(", ");
      sb.append("PenaltyChangeItemList:");
      if (this.PenaltyChangeItemList == null) {
        sb.append("null");
      } else {
        sb.append(this.PenaltyChangeItemList);
      }
      first = false;
    }
    if (isSetPenaltyAdditionList()) {
      if (!first) sb.append(", ");
      sb.append("penaltyAdditionList:");
      if (this.penaltyAdditionList == null) {
        sb.append("null");
      } else {
        sb.append(this.penaltyAdditionList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (ruleCondition != null) {
      ruleCondition.validate();
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

  private static class PenaltiesItemStandardSchemeFactory implements SchemeFactory {
    public PenaltiesItemStandardScheme getScheme() {
      return new PenaltiesItemStandardScheme();
    }
  }

  private static class PenaltiesItemStandardScheme extends StandardScheme<PenaltiesItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PenaltiesItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RULE_CONDITION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.ruleCondition = new com.travelzen.farerule.condition.RuleCondition();
              struct.ruleCondition.read(iprot);
              struct.setRuleConditionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PENALTY_CANCEL_ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.PenaltyCancelItemList = new ArrayList<PenaltyCancelItem>(_list8.size);
                for (int _i9 = 0; _i9 < _list8.size; ++_i9)
                {
                  PenaltyCancelItem _elem10; // required
                  _elem10 = new PenaltyCancelItem();
                  _elem10.read(iprot);
                  struct.PenaltyCancelItemList.add(_elem10);
                }
                iprot.readListEnd();
              }
              struct.setPenaltyCancelItemListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PENALTY_CHANGE_ITEM_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list11 = iprot.readListBegin();
                struct.PenaltyChangeItemList = new ArrayList<PenaltyChangeItem>(_list11.size);
                for (int _i12 = 0; _i12 < _list11.size; ++_i12)
                {
                  PenaltyChangeItem _elem13; // required
                  _elem13 = new PenaltyChangeItem();
                  _elem13.read(iprot);
                  struct.PenaltyChangeItemList.add(_elem13);
                }
                iprot.readListEnd();
              }
              struct.setPenaltyChangeItemListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PENALTY_ADDITION_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list14 = iprot.readListBegin();
                struct.penaltyAdditionList = new ArrayList<PenaltyAdditionEnum>(_list14.size);
                for (int _i15 = 0; _i15 < _list14.size; ++_i15)
                {
                  PenaltyAdditionEnum _elem16; // required
                  _elem16 = PenaltyAdditionEnum.findByValue(iprot.readI32());
                  struct.penaltyAdditionList.add(_elem16);
                }
                iprot.readListEnd();
              }
              struct.setPenaltyAdditionListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PenaltiesItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.ruleCondition != null) {
        if (struct.isSetRuleCondition()) {
          oprot.writeFieldBegin(RULE_CONDITION_FIELD_DESC);
          struct.ruleCondition.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.PenaltyCancelItemList != null) {
        if (struct.isSetPenaltyCancelItemList()) {
          oprot.writeFieldBegin(PENALTY_CANCEL_ITEM_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.PenaltyCancelItemList.size()));
            for (PenaltyCancelItem _iter17 : struct.PenaltyCancelItemList)
            {
              _iter17.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.PenaltyChangeItemList != null) {
        if (struct.isSetPenaltyChangeItemList()) {
          oprot.writeFieldBegin(PENALTY_CHANGE_ITEM_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.PenaltyChangeItemList.size()));
            for (PenaltyChangeItem _iter18 : struct.PenaltyChangeItemList)
            {
              _iter18.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.penaltyAdditionList != null) {
        if (struct.isSetPenaltyAdditionList()) {
          oprot.writeFieldBegin(PENALTY_ADDITION_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.penaltyAdditionList.size()));
            for (PenaltyAdditionEnum _iter19 : struct.penaltyAdditionList)
            {
              oprot.writeI32(_iter19.getValue());
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PenaltiesItemTupleSchemeFactory implements SchemeFactory {
    public PenaltiesItemTupleScheme getScheme() {
      return new PenaltiesItemTupleScheme();
    }
  }

  private static class PenaltiesItemTupleScheme extends TupleScheme<PenaltiesItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PenaltiesItem struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRuleCondition()) {
        optionals.set(0);
      }
      if (struct.isSetPenaltyCancelItemList()) {
        optionals.set(1);
      }
      if (struct.isSetPenaltyChangeItemList()) {
        optionals.set(2);
      }
      if (struct.isSetPenaltyAdditionList()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetRuleCondition()) {
        struct.ruleCondition.write(oprot);
      }
      if (struct.isSetPenaltyCancelItemList()) {
        {
          oprot.writeI32(struct.PenaltyCancelItemList.size());
          for (PenaltyCancelItem _iter20 : struct.PenaltyCancelItemList)
          {
            _iter20.write(oprot);
          }
        }
      }
      if (struct.isSetPenaltyChangeItemList()) {
        {
          oprot.writeI32(struct.PenaltyChangeItemList.size());
          for (PenaltyChangeItem _iter21 : struct.PenaltyChangeItemList)
          {
            _iter21.write(oprot);
          }
        }
      }
      if (struct.isSetPenaltyAdditionList()) {
        {
          oprot.writeI32(struct.penaltyAdditionList.size());
          for (PenaltyAdditionEnum _iter22 : struct.penaltyAdditionList)
          {
            oprot.writeI32(_iter22.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PenaltiesItem struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.ruleCondition = new com.travelzen.farerule.condition.RuleCondition();
        struct.ruleCondition.read(iprot);
        struct.setRuleConditionIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list23 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.PenaltyCancelItemList = new ArrayList<PenaltyCancelItem>(_list23.size);
          for (int _i24 = 0; _i24 < _list23.size; ++_i24)
          {
            PenaltyCancelItem _elem25; // required
            _elem25 = new PenaltyCancelItem();
            _elem25.read(iprot);
            struct.PenaltyCancelItemList.add(_elem25);
          }
        }
        struct.setPenaltyCancelItemListIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list26 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.PenaltyChangeItemList = new ArrayList<PenaltyChangeItem>(_list26.size);
          for (int _i27 = 0; _i27 < _list26.size; ++_i27)
          {
            PenaltyChangeItem _elem28; // required
            _elem28 = new PenaltyChangeItem();
            _elem28.read(iprot);
            struct.PenaltyChangeItemList.add(_elem28);
          }
        }
        struct.setPenaltyChangeItemListIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list29 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.penaltyAdditionList = new ArrayList<PenaltyAdditionEnum>(_list29.size);
          for (int _i30 = 0; _i30 < _list29.size; ++_i30)
          {
            PenaltyAdditionEnum _elem31; // required
            _elem31 = PenaltyAdditionEnum.findByValue(iprot.readI32());
            struct.penaltyAdditionList.add(_elem31);
          }
        }
        struct.setPenaltyAdditionListIsSet(true);
      }
    }
  }

}

