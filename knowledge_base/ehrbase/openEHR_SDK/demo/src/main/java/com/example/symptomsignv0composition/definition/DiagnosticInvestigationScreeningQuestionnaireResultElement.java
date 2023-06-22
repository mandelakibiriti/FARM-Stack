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
    date = "2023-06-19T20:52:30.867061304+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class DiagnosticInvestigationScreeningQuestionnaireResultElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Specific investigation/Result/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("/value")
  @Choice
  private DiagnosticInvestigationScreeningQuestionnaireResultChoice value2;

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

  public void setValue2(DiagnosticInvestigationScreeningQuestionnaireResultChoice value2) {
     this.value2 = value2;
  }

  public DiagnosticInvestigationScreeningQuestionnaireResultChoice getValue2() {
     return this.value2 ;
  }
}
