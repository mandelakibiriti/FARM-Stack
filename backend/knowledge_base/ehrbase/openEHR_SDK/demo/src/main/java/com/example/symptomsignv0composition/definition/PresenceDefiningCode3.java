package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode3 implements EnumValueSet {
  NO("No", "", "local", "at0024"),

  UNKNOWN("Unknown", "", "local", "at0027"),

  YES("Yes", "", "local", "at0023");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode3(String value, String description, String terminologyId, String code) {
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
