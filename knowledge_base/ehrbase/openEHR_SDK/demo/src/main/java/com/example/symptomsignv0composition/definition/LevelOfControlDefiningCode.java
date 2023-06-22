package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum LevelOfControlDefiningCode implements EnumValueSet {
  CONTROLLED("Controlled", "The problem or diagnosis is controlled by current management.", "local", "at0099"),

  NOT_CONTROLLED("Not controlled", "The problem or diagnosis is not controlled by current management.", "local", "at0101"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if the problem or diagnosis is controlled by current management.", "local", "at0100");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  LevelOfControlDefiningCode(String value, String description, String terminologyId, String code) {
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
