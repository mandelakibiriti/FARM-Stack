package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AnyExposureDefiningCode implements EnumValueSet {
  UNKNOWN("Unknown", "It is not known whether the individual has been exposed to the harmful agent.", "local", "at0008"),

  YES("Yes", "The individual has been exposed to the harmful agent.", "local", "at0006"),

  NO("No", "The individual has not been exposed to the harmful agent.", "local", "at0007");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AnyExposureDefiningCode(String value, String description, String terminologyId, String code) {
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
