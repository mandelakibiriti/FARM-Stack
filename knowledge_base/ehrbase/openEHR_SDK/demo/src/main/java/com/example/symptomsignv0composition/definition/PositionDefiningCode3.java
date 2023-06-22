package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PositionDefiningCode3 implements EnumValueSet {
  SITTING("Sitting", "The subject was sitting (for example on bed or chair).", "local", "at1001"),

  LYING("Lying", "The subject was lying flat.", "local", "at1000"),

  STANDING_UPRIGHT("Standing/upright", "The subject was standing, walking or running.", "local", "at1003"),

  RECLINING("Reclining", "The subject was reclining at an approximate angle of 45 degrees, with the legs elevated to the level of the pelvis.", "local", "at1002");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PositionDefiningCode3(String value, String description, String terminologyId, String code) {
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
