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
    date = "2023-06-19T20:52:30.867868264+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class DiagnosticInvestigationScreeningQuestionnaireResultDvText implements RMEntity, DiagnosticInvestigationScreeningQuestionnaireResultChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("|value")
  private String resultValue;

  public void setResultValue(String resultValue) {
     this.resultValue = resultValue;
  }

  public String getResultValue() {
     return this.resultValue ;
  }
}
