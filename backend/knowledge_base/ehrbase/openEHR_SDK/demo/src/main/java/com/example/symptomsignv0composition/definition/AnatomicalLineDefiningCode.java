package com.example.symptomsignv0composition.definition;

import java.lang.String;
import org.ehrbase.client.classgenerator.EnumValueSet;

public enum AnatomicalLineDefiningCode implements EnumValueSet {
  MID_SCAPULAR_LINE("Mid-scapular line", "Line running vertically down the posterior surface of the body, parallel to the midline and passing through the inferior point of the scapula.", "local", "at0063"),

  ANTERIOR_AXILLARY_LINE("Anterior axillary line", "Line running vertically down the surface of the body, passing through the anterior axillary skinfold.", "local", "at0057"),

  POSTERIOR_AXILLARY_LINE("Posterior axillary line", "Line running vertically down the surface of the body, passing through the posterior axillary skinfold.", "local", "at0058"),

  MID_CLAVICULAR_LINE("Mid-clavicular line", "Line running vertically down the surface of the body, parallel to the midline and passing through the midpoint of the clavicle.", "local", "at0059"),

  MID_PUPILLARY_LINE("Mid-pupillary line", "Line running vertically down the face through the midpoint of the pupil when looking directly forward.", "local", "at0060"),

  MIDAXILLARY_LINE("Midaxillary line", "Line running vertically down the surface of the body, passing through the apex of the axilla.", "local", "at0056"),

  MIDLINE("Midline", "Line running vertically which divides the body into left and right portions, passing through the head, spinal cord, and umbilicus. Alternatively it can refer to a line dividing a body part into two equal portions, for example a digit.", "local", "at0062");

  private String value;

  private String description;

  private String terminologyId;

  private String code;

  AnatomicalLineDefiningCode(String value, String description, String terminologyId, String code) {
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
