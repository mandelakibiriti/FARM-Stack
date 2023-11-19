package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SeverityOfReactionDefiningCode implements EnumValueSet {
  MILD("Mild", "Causes mild physiological effects.", "local", "at0093"),

  SEVERE("Severe", "Causes severe physiological effects.", "local", "at0090"),

  MODERATE("Moderate", "Causes moderate physiological effects.", "local", "at0092");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SeverityOfReactionDefiningCode(String value, String description, String terminologyId,
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
