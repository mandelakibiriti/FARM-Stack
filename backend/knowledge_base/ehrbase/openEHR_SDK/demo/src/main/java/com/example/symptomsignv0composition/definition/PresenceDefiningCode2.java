package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PresenceDefiningCode2 implements EnumValueSet {
  NOT_DETECTED("Not detected", "Respiratory movements are not detected on observation.", "local", "at0064"),

  PRESENT("Present", "Respiratory movements are observed.", "local", "at0063");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PresenceDefiningCode2(String value, String description, String terminologyId, String code) {
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
