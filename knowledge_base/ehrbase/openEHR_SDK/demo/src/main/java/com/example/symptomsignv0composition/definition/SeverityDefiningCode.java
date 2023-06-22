package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SeverityDefiningCode implements EnumValueSet {
  SEVERE("Severe", "The problem or diagnosis prevents normal activity or will seriously damage health if left untreated.", "local", "at0049"),

  MILD("Mild", "The problem or diagnosis does not interfere with normal activity or may cause damage to health if left untreated.", "local", "at0047"),

  MODERATE("Moderate", "The problem or diagnosis causes interference with normal activity or will damage health if left untreated.", "local", "at0048");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SeverityDefiningCode(String value, String description, String terminologyId, String code) {
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
