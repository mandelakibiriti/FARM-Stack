package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RegularityDefiningCode implements EnumValueSet {
  REGULAR("Regular", "The pattern is regular.", "local", "at0006"),

  IRREGULAR("Irregular", "The pattern is irregular.", "local", "at1028");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RegularityDefiningCode(String value, String description, String terminologyId, String code) {
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
