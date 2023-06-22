package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresentDefiningCode implements EnumValueSet {
  YES("Yes", "The specific problem is present.", "local", "at0011"),

  NO("No", "The specific problem is absent.", "local", "at0012"),

  UNKNOWN("Unknown", "It is not known whether any problems are present or absent.", "local", "at0013");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresentDefiningCode(String value, String description, String terminologyId, String code) {
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
