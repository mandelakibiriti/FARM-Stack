package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum EffectDefiningCode implements EnumValueSet {
  NO_EFFECT("No effect", "The factor has no impact on the symptom or sign.", "local", "at0156"),

  RELIEVES("Relieves", "The factor decreases the severity or impact of the symptom or sign, but does not fully resolve it.", "local", "at0159"),

  WORSENS("Worsens", "The factor increases the severity or impact of the symptom or sign.", "local", "at0158");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  EffectDefiningCode(String value, String description, String terminologyId, String code) {
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
