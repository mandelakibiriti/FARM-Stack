package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StatusDefiningCode2 implements EnumValueSet {
  POSSIBLE("Possible", "Under investigation; neither accepted as a formal diagnosis, nor excluded.", "local", "at0006"),

  ACCEPTED("Accepted", "Accepted as a formal diagnosis.", "local", "at0007"),

  EXCLUDED("Excluded", "Ruled out as a formal diagnosis.", "local", "at0008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StatusDefiningCode2(String value, String description, String terminologyId, String code) {
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
