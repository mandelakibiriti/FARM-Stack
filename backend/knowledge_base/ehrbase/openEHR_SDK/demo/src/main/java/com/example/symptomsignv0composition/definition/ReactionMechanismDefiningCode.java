package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum ReactionMechanismDefiningCode implements EnumValueSet {
  NON_IMMUNE_MEDIATED("Non-immune mediated", "A non-immune mediated reaction, which can include pseudo-allergic reactions, side effects, intolerances, drug toxicities (for example, to Gentamicin).", "local", "at0060"),

  IMMUNE_MEDIATED("Immune mediated", "Immune mediated reaction, including allergic reactions and hypersensitivities.", "local", "at0059"),

  INDETERMINATE("Indeterminate", "The physiological mechanism could not be determined.", "local", "at0126");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  ReactionMechanismDefiningCode(String value, String description, String terminologyId,
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
