package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PositionDefiningCode implements EnumValueSet {
  STANDING("Standing", "Height is measured standing on both feet with weight distributed evenly, heels together and both buttocks and heels in contact with a vertical back board.", "local", "at0016"),

  LYING("Lying", "Length is measured in a fully extended, recumbent position with the pelvis flat, legs extended and feet flexed.", "local", "at0020");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PositionDefiningCode(String value, String description, String terminologyId, String code) {
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
