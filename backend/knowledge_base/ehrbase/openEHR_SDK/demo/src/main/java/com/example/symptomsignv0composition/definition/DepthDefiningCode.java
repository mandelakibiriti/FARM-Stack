package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DepthDefiningCode implements EnumValueSet {
  NORMAL("Normal", "Normal depth of breathing.", "local", "at0017"),

  DEEP("Deep", "Deep breathing.", "local", "at0019"),

  SHALLOW("Shallow", "Shallow depth of breathing.", "local", "at0018"),

  VARIABLE("Variable", "Variable depth of breathing.", "local", "at0025");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DepthDefiningCode(String value, String description, String terminologyId, String code) {
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
