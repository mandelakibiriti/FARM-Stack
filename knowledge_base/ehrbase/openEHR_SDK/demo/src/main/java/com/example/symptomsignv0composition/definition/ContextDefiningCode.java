package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ContextDefiningCode implements EnumValueSet {
  HOMELESS("Homeless", "The individual does not have a stable place to live.", "local", "at0048"),

  INTERPRETER_NEEDED("Interpreter needed", "The individual needs assistance with language translation.", "local", "at0049");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ContextDefiningCode(String value, String description, String terminologyId, String code) {
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
