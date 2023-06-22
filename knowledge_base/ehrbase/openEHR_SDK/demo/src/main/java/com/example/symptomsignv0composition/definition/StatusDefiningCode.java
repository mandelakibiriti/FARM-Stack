package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StatusDefiningCode implements EnumValueSet {
  RESOLVED("Resolved", "The previously known reaction to the identified 'Substance' has been clinically reassessed and considered no longer to be an active risk.", "local", "at0067"),

  LIKELY("Likely", "A reasonable level of certainty about the propensity for a reaction to the identified 'Substance'.", "local", "at0064"),

  SUSPECTED("Suspected", "A low level of clinical certainty about the propensity of a reaction to the identified 'Substance'.", "local", "at0127"),

  REFUTED("Refuted", "The propensity for a reaction to the identified 'Substance' has been clinically reassessed or has been disproved with a high level of clinical certainty by re-exposure or deliberate challenge.", "local", "at0066"),

  CONFIRMED("Confirmed", "A high level of certainty about the propensity for a reaction to the identified 'Substance', which may include clinical evidence by testing or re-challenge.", "local", "at0065");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StatusDefiningCode(String value, String description, String terminologyId, String code) {
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
