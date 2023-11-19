package com.example.symptomsignv0composition.definition;

import java.lang.Long;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.868091687+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_COUNT")
public class DiagnosticInvestigationScreeningQuestionnaireResultDvCount implements RMEntity, DiagnosticInvestigationScreeningQuestionnaireResultChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("|magnitude")
  private Long resultMagnitude;

  public void setResultMagnitude(Long resultMagnitude) {
     this.resultMagnitude = resultMagnitude;
  }

  public Long getResultMagnitude() {
     return this.resultMagnitude ;
  }
}
