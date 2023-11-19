package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DiagnosticCertaintyDefiningCode implements EnumValueSet {
  PROBABLE("Probable", "The diagnosis has been identified with a high level of certainty.", "local", "at0075"),

  CONFIRMED("Confirmed", "The diagnosis has been confirmed against recognised criteria.", "local", "at0076"),

  SUSPECTED("Suspected", "The diagnosis has been identified with a low level of certainty.", "local", "at0074");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DiagnosticCertaintyDefiningCode(String value, String description, String terminologyId,
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
