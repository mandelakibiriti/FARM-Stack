package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum DiagnosticCategoryDefiningCode implements EnumValueSet {
  COMPLICATION("Complication", "An unfavorable evolution of a problem or diagnosis.", "local", "at0076"),

  PRINCIPAL_DIAGNOSIS("Principal diagnosis", "The diagnosis determined to be the primary reason for an episode of admitted patient care, an episode of residential care or an attendance at the health care establishment.", "local", "at0064"),

  SECONDARY_DIAGNOSIS("Secondary diagnosis", "A problem or diagnosis that occurs at the same time as the primary problem or diagnosis. May also be known as a comorbid condition.", "local", "at0066");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  DiagnosticCategoryDefiningCode(String value, String description, String terminologyId,
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
