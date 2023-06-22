package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PrePostDuctalDefiningCode implements EnumValueSet {
  PRE_DUCTAL("Pre-ductal", "The sensor site is pre-ductal.", "local", "at0062"),

  POST_DUCTAL("Post-ductal", "The sensor site is post-ductal.", "local", "at0063"),

  INDETERMINATE("Indeterminate", "Unable to assess whether the sensor site is pre- or post-ductal.", "local", "at0064");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PrePostDuctalDefiningCode(String value, String description, String terminologyId, String code) {
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
