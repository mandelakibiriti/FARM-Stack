package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum RemissionStatusDefiningCode implements EnumValueSet {
  NOT_IN_REMISSION("Not in remission", "No diminution of the signs or symptoms of the disease have been identified.", "local", "at0092"),

  IN_REMISSION("In remission", "No ongoing signs or symptoms of the disease have been identified.", "local", "at0090"),

  INDETERMINATE("Indeterminate", "It is not possible to determine if there have been diminution of the signs or symptoms of the disease have been identified.", "local", "at0093");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  RemissionStatusDefiningCode(String value, String description, String terminologyId, String code) {
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
