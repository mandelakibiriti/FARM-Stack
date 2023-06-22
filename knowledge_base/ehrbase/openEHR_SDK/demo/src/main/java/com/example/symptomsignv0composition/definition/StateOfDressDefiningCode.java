package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum StateOfDressDefiningCode implements EnumValueSet {
  NAKED("Naked", "Without any clothes.", "local", "at0013"),

  NAPPY_DIAPER("Nappy/diaper", "Wearing only a nappy - which may add significantly to weight.", "local", "at0017"),

  FULLY_CLOTHED_WITHOUT_SHOES("Fully clothed, without shoes", "Clothing which may add significantly to weight.", "local", "at0028"),

  FULLY_CLOTHED_INCLUDING_SHOES("Fully clothed, including shoes", "Clothing which may add significantly to weight, including shoes.", "local", "at0010"),

  LIGHTLY_CLOTHED_UNDERWEAR("Lightly clothed/underwear", "Clothing which will not add to weight significantly.", "local", "at0011");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  StateOfDressDefiningCode(String value, String description, String terminologyId, String code) {
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
