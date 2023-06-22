package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CuffSizeDefiningCode implements EnumValueSet {
  PAEDIATRIC_CHILD("Paediatric/Child", "A cuff that is appropriate for a child or adult with a thin arm.", "local", "at1009"),

  INFANT("Infant", "A cuff used for infants.", "local", "at1018"),

  NEONATAL("Neonatal", "A cuff used for a neonate, assuming cuff is the appropriate size for maturity and birthweight of the neonate.", "local", "at1019"),

  ADULT_THIGH("Adult Thigh", "A cuff used for an adult thigh.", "local", "at0015"),

  ADULT("Adult", "A cuff that is standard for an adult.", "local", "at0017"),

  LARGE_ADULT("Large Adult", "A cuff for adults with larger arms.", "local", "at0016"),

  SMALL_ADULT("Small Adult", "A cuff used for a small adult.", "local", "at1008");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CuffSizeDefiningCode(String value, String description, String terminologyId, String code) {
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
