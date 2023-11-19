package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum MethodDefiningCode implements EnumValueSet {
  MACHINE("Machine", "Method of measuring blood pressure externally, using a blood pressure machine.", "local", "at1039"),

  INVASIVE("Invasive", "Method of measuring blood pressure internally ie involving penetration of the skin and measuring inside blood vessels.", "local", "at1040"),

  PALPATION("Palpation", "Method of measuring blood pressure externally, using palpation (usually of the brachial or radial arteries).", "local", "at1037"),

  AUSCULTATION("Auscultation", "Method of measuring blood pressure externally, using a stethoscope and Korotkoff sounds.", "local", "at1036");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  MethodDefiningCode(String value, String description, String terminologyId, String code) {
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
