package com.example.symptomsignv0composition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.712688859+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisDiagnosticCertaintyDvText implements RMEntity, ProblemDiagnosisDiagnosticCertaintyChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Diagnostic certainty/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   * Comment: If an alternative valueset is required, these values can be added to the DV_TEXT data type in a template.
   */
  @Path("|value")
  private String diagnosticCertaintyValue;

  public void setDiagnosticCertaintyValue(String diagnosticCertaintyValue) {
     this.diagnosticCertaintyValue = diagnosticCertaintyValue;
  }

  public String getDiagnosticCertaintyValue() {
     return this.diagnosticCertaintyValue ;
  }
}
