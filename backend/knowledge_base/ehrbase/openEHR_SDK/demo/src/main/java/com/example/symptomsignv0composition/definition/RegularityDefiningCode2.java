package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RegularityDefiningCode2 implements EnumValueSet {
  IRREGULAR("Irregular", "The breathing pattern is not regular.", "local", "at0007"),

  REGULAR("Regular", "The breathing pattern is regular.", "local", "at0006");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RegularityDefiningCode2(String value, String description, String terminologyId, String code) {
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
