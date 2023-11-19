package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SleepStatusDefiningCode implements EnumValueSet {
  SLEEPING("Sleeping", "The individual is in the natural state of bodily rest.", "local", "at1045"),

  AWAKE("Awake", "The individual is fully conscious.", "local", "at1044");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SleepStatusDefiningCode(String value, String description, String terminologyId, String code) {
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
