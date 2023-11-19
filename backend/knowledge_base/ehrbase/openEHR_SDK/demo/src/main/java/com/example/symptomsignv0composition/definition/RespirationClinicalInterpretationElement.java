package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.812778611+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class RespirationClinicalInterpretationElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Clinical interpretation
   * Description: Single word, phrase or brief description which represents the clinical meaning and significance of the respiration findings.
   * Comment: Coding with a terminology is preferred, where possible. For example: Normal breathing; Evidence of respiratory distress; Kussmaul's respiration; Cheyne-Stokes respiration; or Apnoeic episodes. Multiple statements are allowed. 
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Clinical interpretation/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
