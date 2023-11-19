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
    date = "2023-06-19T20:52:30.849019292+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class MedicationScreeningQuestionnaireTimingElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Tree/Specific medication/Timing/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Timing
   * Description: The onset, cessation or duration of use of the medication or grouping of medications.
   * Comment: The 'Timing' data element has deliberately been loosely modelled to support the myriad of ways that it can be used in questionnaires to capture when a medication was used. The specific and intended semantics can be further clarified in a template. For example: 
   * Clone and rename the element in a template to 'Start' and 'Stopped' to record the Date/time when the individual started using a medication. Interval of date/time for a period of time eg. between 1940 and 1942. Text for descriptions like 'Immediately after the operation', or 'Up to one week ago', 'Up to two weeks ago', 'Three weeks ago'. Duration for the individual's age at the onset of duration OR the length of time during which the individual has been using the medication. Interval of Duration for the approximate age of the individual at the time of onset.
   */
  @Path("/value")
  @Choice
  private MedicationScreeningQuestionnaireTimingChoice value2;

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

  public void setValue2(MedicationScreeningQuestionnaireTimingChoice value2) {
     this.value2 = value2;
  }

  public MedicationScreeningQuestionnaireTimingChoice getValue2() {
     return this.value2 ;
  }
}
