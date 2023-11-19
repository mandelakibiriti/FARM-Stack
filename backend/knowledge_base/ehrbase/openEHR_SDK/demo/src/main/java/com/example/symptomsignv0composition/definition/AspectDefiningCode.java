package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AspectDefiningCode implements EnumValueSet {
  PALMAR("Palmar", "Towards the palm of the hand.", "local", "at0075"),

  ANAL("Anal", "Towards the anus. Usually used to describe locations within the digestive system.", "local", "at0079"),

  LATERAL("Lateral", "Towards the side, or edge, of the body site.", "local", "at0068"),

  DORSAL("Dorsal", "Towards the back of the hand or top of the foot. To be used as opposites of palmar or plantar, not as a synonym of posterior.", "local", "at0082"),

  POSTERIOR("Posterior", "Towards the back, or dorsal surface, of the body site.", "local", "at0072"),

  MEDIAL("Medial", "Towards the midline of the body site.", "local", "at0067"),

  PROXIMAL("Proximal", "More central or closer to the point of attachment, and usually describing part of a limb, digit or appendage.", "local", "at0073"),

  SUPERIOR("Superior", "Above the body site, often meaning towards the head.", "local", "at0069"),

  DEEP("Deep", "Away from the surface of the body site.", "local", "at0080"),

  MID("Mid", "In the middle of the body site.", "local", "at0077"),

  ANTERIOR("Anterior", "Towards the front, or ventral surface, of  the body site.", "local", "at0071"),

  SUPERFICIAL("Superficial", "Towards the surface of the body site.", "local", "at0081"),

  INFERIOR("Inferior", "Below the body site, often meaning towards the feet.", "local", "at0070"),

  PLANTAR("Plantar", "Towards the sole of the foot.", "local", "at0076"),

  DISTAL("Distal", "More peripheral, or further from the point of attachment, and usually describing part of a limb, digit or appendage.", "local", "at0074"),

  ORAL("Oral", "Towards the mouth. Usually used to describe locations within the digestive system.", "local", "at0078");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AspectDefiningCode(String value, String description, String terminologyId, String code) {
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
