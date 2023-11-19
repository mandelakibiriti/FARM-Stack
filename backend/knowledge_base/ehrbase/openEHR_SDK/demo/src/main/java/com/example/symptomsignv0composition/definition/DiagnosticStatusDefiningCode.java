package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DiagnosticStatusDefiningCode implements EnumValueSet {
  WORKING("Working", "Interim diagnosis, based on a reasonable amount of clinical certainty but pending further test results or clinical advice. It may still change as test results or advice become available.", "local", "at0017"),

  PRELIMINARY("Preliminary", "The initial diagnosis made, usually associated with a low level of clinical certainty. It may change as test results or advice become available.", "local", "at0016"),

  REFUTED("Refuted", "The previously recorded diagnosis has been clinically reassessed or disproved with a high level of clinical certainty. This status is used to correct an error in the health record.", "local", "at0088"),

  ESTABLISHED("Established", "Final substantiated diagnosis, based on a high level of clinical certainty, which may include clinical evidence from test results. It is not expected to change.", "local", "at0018");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DiagnosticStatusDefiningCode(String value, String description, String terminologyId,
      String code) {
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
