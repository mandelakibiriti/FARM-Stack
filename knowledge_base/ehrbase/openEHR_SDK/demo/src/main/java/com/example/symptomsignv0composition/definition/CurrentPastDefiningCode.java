package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CurrentPastDefiningCode implements EnumValueSet {
  PAST("Past", "An issue which ocurred in the past.", "local", "at0061"),

  CURRENT("Current", "An issue occuring at present.", "local", "at0062");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CurrentPastDefiningCode(String value, String description, String terminologyId, String code) {
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
