package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum IntensityDefiningCode implements EnumValueSet {
  LOW_INTENSITY("Low Intensity", "Up to 80% Maximal Heart Rate.", "local", "at0012"),

  HIGH_INTENSITY("High Intensity", "85-90% Maximal Heart Rate.", "local", "at0014"),

  MEDIUM_INTENSITY("Medium Intensity", "80-85% of Maximal Heart Rate.", "local", "at0013"),

  FLAT_OUT("Flat Out", "90-100% Maximal Heart Rate.", "local", "at0015");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  IntensityDefiningCode(String value, String description, String terminologyId, String code) {
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
