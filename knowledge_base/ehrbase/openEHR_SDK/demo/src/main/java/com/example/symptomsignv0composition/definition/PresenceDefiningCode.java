package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode implements EnumValueSet {
  PRESENT("Present", "A pulse or heart beat can be detected.", "local", "at1024"),

  NOT_DETECTED("Not detected", "A pulse or heart beat cannot be detected.", "local", "at1025");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode(String value, String description, String terminologyId, String code) {
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
