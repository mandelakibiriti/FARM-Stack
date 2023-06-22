package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.875016786+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExposureScreeningQuestionnaireTimingElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Specific exposure/Timing/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Timing
   * Description: The date/s when the individual was exposed to the agent.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("/value")
  @Choice
  private ExposureScreeningQuestionnaireTimingChoice value2;

  public void setValue(NullFlavour value) {
     this.value = value;
  }

  public NullFlavour getValue() {
     return this.value ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setValue2(ExposureScreeningQuestionnaireTimingChoice value2) {
     this.value2 = value2;
  }

  public ExposureScreeningQuestionnaireTimingChoice getValue2() {
     return this.value2 ;
  }
}
