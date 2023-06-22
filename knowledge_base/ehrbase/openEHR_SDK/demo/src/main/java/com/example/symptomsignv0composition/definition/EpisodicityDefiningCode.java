package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum EpisodicityDefiningCode implements EnumValueSet {
  ONGOING("Ongoing", "The issue, problem or diagnosis continues, without new, acute episodes occurring.", "local", "at0035"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if this occurrence of the problem or diagnosis is new or ongoing.", "local", "at0070"),

  NEW("New", "A new occurrence of either a new or existing problem or diagnosis. A flag for 'First occurrence' can be recorded separately to distinguish the first from other occurrences.", "local", "at0034");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  EpisodicityDefiningCode(String value, String description, String terminologyId, String code) {
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
