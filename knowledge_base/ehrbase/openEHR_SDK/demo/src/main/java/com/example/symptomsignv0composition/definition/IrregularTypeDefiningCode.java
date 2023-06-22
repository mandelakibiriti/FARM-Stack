package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum IrregularTypeDefiningCode implements EnumValueSet {
  REGULARLY_IRREGULAR("Regularly Irregular", "The pattern is irregular in a regular pattern,. For example, a dropped beat once every 'n' beats.", "local", "at0007"),

  IRREGULARLY_IRREGULAR("Irregularly Irregular", "The pattern is irregular in a chaotic and unpredictable manner. For example, atrial fibrillation.", "local", "at0008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  IrregularTypeDefiningCode(String value, String description, String terminologyId, String code) {
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
