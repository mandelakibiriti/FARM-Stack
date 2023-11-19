package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AnyPresenceDefiningCode implements EnumValueSet {
  UNKNOWN("Unknown", "It is not known whether any problems are present or absent.", "local", "at0008"),

  YES("Yes", "Problems are present.", "local", "at0006"),

  NO("No", "Problems are not present.", "local", "at0007");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AnyPresenceDefiningCode(String value, String description, String terminologyId, String code) {
    this.value = value;
    this.description = description;
    this.terminologyId = terminologyId;
    this.code = code;
  }

  public String getValue() {
     return this.value ;
  }

  public String getDescription() {
     return this.description ;
  }

  public String getTerminologyId() {
     return this.terminologyId ;
  }

  public String getCode() {
     return this.code ;
  }
}
