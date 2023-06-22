package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ActiveInactiveDefiningCode implements EnumValueSet {
  ACTIVE("Active", "The problem or diagnosis is currently active and clinically relevant.", "local", "at0026"),

  INACTIVE("Inactive", "The problem or diagnosis is not completely resolved but is inactive or felt less relevant to the current clinical context.", "local", "at0027");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ActiveInactiveDefiningCode(String value, String description, String terminologyId, String code) {
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
