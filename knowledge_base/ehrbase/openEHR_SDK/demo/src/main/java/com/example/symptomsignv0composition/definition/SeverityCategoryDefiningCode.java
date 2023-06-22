package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SeverityCategoryDefiningCode implements EnumValueSet {
  SEVERE("Severe", "The intensity of the symptom or sign causes prevents normal activity.", "local", "at0025"),

  MODERATE("Moderate", "The intensity of the symptom or sign causes interference with normal activity.", "local", "at0024"),

  MILD("Mild", "The intensity of the symptom or sign does not cause interference with normal activity.", "local", "at0023");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SeverityCategoryDefiningCode(String value, String description, String terminologyId,
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
