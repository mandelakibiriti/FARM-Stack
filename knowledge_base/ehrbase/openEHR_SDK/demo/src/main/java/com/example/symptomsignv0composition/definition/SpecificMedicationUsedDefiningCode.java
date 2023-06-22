package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum SpecificMedicationUsedDefiningCode implements EnumValueSet {
  YES("Yes", "", "local", "at0036"),

  UNKNOWN("Unknown", "", "local", "at0039"),

  NO("No", "", "local", "at0037");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  SpecificMedicationUsedDefiningCode(String value, String description, String terminologyId,
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
