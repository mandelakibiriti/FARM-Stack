package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PhaseDefiningCode implements EnumValueSet {
  DURING_EXERTION("During exertion", "The person is exerting themselves at the time.", "local", "at0007"),

  AT_REST("At rest", "The person is at rest, prior to undertaking exercise.", "local", "at0006"),

  POST_EXERTION("Post-exertion", "Measurement is taken after exertion has ceased.", "local", "at0008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PhaseDefiningCode(String value, String description, String terminologyId, String code) {
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
