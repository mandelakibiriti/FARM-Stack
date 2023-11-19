package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ResolutionPhaseDefiningCode implements EnumValueSet {
  RELAPSED("Relapsed", "Problem or diagnosis has deteriorated after a period of temporary improvement.", "local", "at0097"),

  RESOLVING("Resolving", "Problem or diagnosis is progressing satisfactorily through the normal stages of restoration or healing towards resolution.", "local", "at0085"),

  INDETERMINATE("Indeterminate", "It is not possible to determine the resolution or healing status of the problem or diagnosis.", "local", "at0087"),

  RESOLVED("Resolved", "Problem or diagnosis has completed the normal phases of restoration or healing and can be considered resolved.", "local", "at0084"),

  NOT_RESOLVING("Not resolving", "Problem or diagnosis is not progressing satisfactorily through the normal stages of restoration or healing towards resolution.", "local", "at0086");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ResolutionPhaseDefiningCode(String value, String description, String terminologyId, String code) {
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
