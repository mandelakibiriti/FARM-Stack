package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum CourseLabelDefiningCode implements EnumValueSet {
  ACUTE("Acute", "A problem or diagnosis with a rapid onset, a short course, or both.", "local", "at0081"),

  CHRONIC("Chronic", "A problem or diagnosis with persistent or long-lasting effects, or that evolves over time.", "local", "at0079"),

  ACUTE_ON_CHRONIC("Acute-on-chronic", "A problem or diagnosis with an acute exacerbation of a chronic condition.", "local", "at0094");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  CourseLabelDefiningCode(String value, String description, String terminologyId, String code) {
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
