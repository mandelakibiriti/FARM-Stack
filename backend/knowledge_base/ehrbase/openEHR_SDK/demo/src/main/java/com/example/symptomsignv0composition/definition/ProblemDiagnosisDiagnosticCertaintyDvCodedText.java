package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.712311652+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisDiagnosticCertaintyDvCodedText implements RMEntity, ProblemDiagnosisDiagnosticCertaintyChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Diagnostic certainty/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   * Comment: If an alternative valueset is required, these values can be added to the DV_TEXT data type in a template.
   */
  @Path("|defining_code")
  private DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode;

  public void setDiagnosticCertaintyDefiningCode(
      DiagnosticCertaintyDefiningCode diagnosticCertaintyDefiningCode) {
     this.diagnosticCertaintyDefiningCode = diagnosticCertaintyDefiningCode;
  }

  public DiagnosticCertaintyDefiningCode getDiagnosticCertaintyDefiningCode() {
     return this.diagnosticCertaintyDefiningCode ;
  }
}
