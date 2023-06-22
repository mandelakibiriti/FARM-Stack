package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum OccurrenceDefiningCode2 implements EnumValueSet {
  RECURRENCE("Recurrence", "New occurrence of the same symptom or sign after a previous episode was resolved.", "local", "at0188"),

  FIRST_OCCURRENCE("First occurrence", "This is the first ever occurrence of this symptom or sign.", "local", "at0187");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  OccurrenceDefiningCode2(String value, String description, String terminologyId, String code) {
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
