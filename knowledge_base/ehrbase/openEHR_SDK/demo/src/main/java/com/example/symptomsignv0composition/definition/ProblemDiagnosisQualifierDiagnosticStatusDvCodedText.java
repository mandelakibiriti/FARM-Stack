package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.706881323+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierDiagnosticStatusDvCodedText implements RMEntity, ProblemDiagnosisQualifierDiagnosticStatusChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Diagnostic status/Diagnostic status
   * Description: Stage or phase of diagnostic process.
   * Comment: The status is usually determined by a combination of the timing of diagnosis plus level of clinical certainty resulting from diagnostic tests and clinical evidence available. This data element and 'Diagnostic certainty' in EVALUATION.problem_diagnosis are two important axes of the diagnostic process, and valid combinations will need to be presented by software that exposes both data elements, so it is not possible for users to select conflicting combinations. 
   * Preliminary or working diagnoses are intended to represent the single most likely choice out of all differential diagnosis options.
   */
  @Path("|defining_code")
  private DiagnosticStatusDefiningCode diagnosticStatusDefiningCode;

  public void setDiagnosticStatusDefiningCode(
      DiagnosticStatusDefiningCode diagnosticStatusDefiningCode) {
     this.diagnosticStatusDefiningCode = diagnosticStatusDefiningCode;
  }

  public DiagnosticStatusDefiningCode getDiagnosticStatusDefiningCode() {
     return this.diagnosticStatusDefiningCode ;
  }
}
