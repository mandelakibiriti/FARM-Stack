package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CategoryDefiningCode2 implements EnumValueSet {
  FOOD("Food", "Any substance consumed to provide nutritional support for the body, such as peanut or egg.", "local", "at0121"),

  OTHER("Other", "Any other substance encountered including venom, latex and other environmental substances.", "local", "at0123"),

  MEDICATION("Medication", "Any substance administered to achieve a physiological effect.", "local", "at0122");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CategoryDefiningCode2(String value, String description, String terminologyId, String code) {
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
