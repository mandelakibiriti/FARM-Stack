package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.698105896+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierDiagnosticCategoryDvCodedText implements RMEntity, ProblemDiagnosisQualifierDiagnosticCategoryChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Diagnostic category/Diagnostic category
   * Description: Category of the problem or diagnosis within a specified episode of care and/or local care context.
   * Comment: This data element contains a value set commonly used in diagnostic categorisation. In episodic care contexts (commonly secondary care) it is common to categorise/organise diagnoses according to their relationship to the principal diagnosis being addressed during that episode of care. These categories may also be used for clinical coding, reporting and billing purposes. In some countries the diagnostic category may be known as a DRG.
   *  In addition, the free text choice permits use of other local value sets, as required.
   */
  @Path("|defining_code")
  private DiagnosticCategoryDefiningCode diagnosticCategoryDefiningCode;

  public void setDiagnosticCategoryDefiningCode(
      DiagnosticCategoryDefiningCode diagnosticCategoryDefiningCode) {
     this.diagnosticCategoryDefiningCode = diagnosticCategoryDefiningCode;
  }

  public DiagnosticCategoryDefiningCode getDiagnosticCategoryDefiningCode() {
     return this.diagnosticCategoryDefiningCode ;
  }
}
