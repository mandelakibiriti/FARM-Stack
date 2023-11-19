package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CertaintyDefiningCode implements EnumValueSet {
  LIKELY("Likely", "A reasonable level of clinical certainty that the reaction was caused by the identified 'Specific substance'.", "local", "at0023"),

  CONFIRMED("Confirmed", "A high level of clinical certainty that the reaction was due to the identified 'Substance', which may include clinical evidence by testing or re-challenge.", "local", "at0118"),

  SUSPECTED("Suspected", "A low level of clinical certainty that the reaction was caused by the identified 'Specific substance'.", "local", "at0095");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CertaintyDefiningCode(String value, String description, String terminologyId, String code) {
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
