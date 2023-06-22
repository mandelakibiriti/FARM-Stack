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
    date = "2023-06-19T20:52:30.858492508+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProcedureScreeningQuestionnaireTimingElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Specific procedure/Timing/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing
   * Description: Timing of the procedure.
   * Comment: "The 'Timing' data element has deliberately been loosely modelled to support the myriad of ways that it can be used in questionnaires to capture when a procedure was performed. The specific and intended semantics can be further clarified in a template.
   * For example: 
   * Date/time for when the procedure was performed. Interval of date/time for a period of time eg. between 1940 and 1942. Text for descriptions like 'Immediately after the operation', or 'Up to one week ago', 'Up to two weeks ago', 'Three weeks ago'. Duration for the individual's age at the onset. Interval of Duration for the approximate age of the individual at the time of onset.
   */
  @Path("/value")
  @Choice
  private ProcedureScreeningQuestionnaireTimingChoice value2;

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

  public void setValue2(ProcedureScreeningQuestionnaireTimingChoice value2) {
     this.value2 = value2;
  }

  public ProcedureScreeningQuestionnaireTimingChoice getValue2() {
     return this.value2 ;
  }
}
