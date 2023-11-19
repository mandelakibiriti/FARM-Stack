package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum LateralityDefiningCode implements EnumValueSet {
  LEFT("Left", "Left side of the body.", "local", "at0003"),

  RIGHT("Right", "Right side of the body.", "local", "at0004");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  LateralityDefiningCode(String value, String description, String terminologyId, String code) {
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
