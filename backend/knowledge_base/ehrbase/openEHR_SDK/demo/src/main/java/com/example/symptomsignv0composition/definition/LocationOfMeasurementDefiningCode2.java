package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum LocationOfMeasurementDefiningCode2 implements EnumValueSet {
  MOUTH("Mouth", "Temperature is measured within the mouth.", "local", "at0022"),

  AXILLA("Axilla", "Temperature is measured from the skin of the axilla with the arm positioned down by the side.", "local", "at0024"),

  FOREHEAD("Forehead", "Temperature is measured on the forehead.", "local", "at0061"),

  SKIN("Skin", "Temperature is measured from exposed skin.", "local", "at0043");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  LocationOfMeasurementDefiningCode2(String value, String description, String terminologyId,
      String code) {
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
