package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ProgressionDefiningCode implements EnumValueSet {
  WORSENING("Worsening", "The problem or diagnosis is worsening.", "local", "at0105"),

  STABLE("Stable", "The problem or diagnosis is unchanged.", "local", "at0104"),

  IMPROVING("Improving", "The problem or diagnosis is improving.", "local", "at0103"),

  INDETERMINATE("Indeterminate", "It is not possible to determine the progression of the problem or diagnosis.", "local", "at0106");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ProgressionDefiningCode(String value, String description, String terminologyId, String code) {
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
