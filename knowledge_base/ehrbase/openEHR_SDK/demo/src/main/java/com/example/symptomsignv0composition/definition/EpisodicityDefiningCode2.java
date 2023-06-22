package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum EpisodicityDefiningCode2 implements EnumValueSet {
  ONGOING("Ongoing", "This symptom or sign is ongoing, effectively a single, continuous episode.", "local", "at0178"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if this occurrence of the symptom or sign is new or ongoing.", "local", "at0177"),

  NEW("New", "A new episode of the symptom or sign - either the first ever occurrence or a reoccurrence where the previous episode had completely resolved.", "local", "at0176");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  EpisodicityDefiningCode2(String value, String description, String terminologyId, String code) {
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
