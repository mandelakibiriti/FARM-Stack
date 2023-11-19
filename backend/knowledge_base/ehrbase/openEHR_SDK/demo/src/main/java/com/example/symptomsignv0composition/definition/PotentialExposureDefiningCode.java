package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum PotentialExposureDefiningCode implements EnumValueSet {
  UNKNOWN("Unknown", "It is not known whether the the individual has been exposed or not.", "local", "at0014"),

  YES("Yes", "The individual has been or may have been, exposed.", "local", "at0012"),

  NO("No", "The individual has not been exposed.", "local", "at0013");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  PotentialExposureDefiningCode(String value, String description, String terminologyId,
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
