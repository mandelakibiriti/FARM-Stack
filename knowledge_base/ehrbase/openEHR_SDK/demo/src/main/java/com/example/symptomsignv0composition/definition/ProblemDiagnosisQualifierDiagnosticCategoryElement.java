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
    date = "2023-06-19T20:52:30.697713060+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProblemDiagnosisQualifierDiagnosticCategoryElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Diagnostic category/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Diagnostic category
   * Description: Category of the problem or diagnosis within a specified episode of care and/or local care context.
   * Comment: This data element contains a value set commonly used in diagnostic categorisation. In episodic care contexts (commonly secondary care) it is common to categorise/organise diagnoses according to their relationship to the principal diagnosis being addressed during that episode of care. These categories may also be used for clinical coding, reporting and billing purposes. In some countries the diagnostic category may be known as a DRG.
   *  In addition, the free text choice permits use of other local value sets, as required.
   */
  @Path("/value")
  @Choice
  private ProblemDiagnosisQualifierDiagnosticCategoryChoice value2;

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

  public void setValue2(ProblemDiagnosisQualifierDiagnosticCategoryChoice value2) {
     this.value2 = value2;
  }

  public ProblemDiagnosisQualifierDiagnosticCategoryChoice getValue2() {
     return this.value2 ;
  }
}
