package com.example.symptomsignv0composition.definition;

import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.867594940+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_QUANTITY")
public class DiagnosticInvestigationScreeningQuestionnaireResultDvQuantity implements RMEntity, DiagnosticInvestigationScreeningQuestionnaireResultChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("|magnitude")
  private Double resultMagnitude;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("|units")
  private String resultUnits;

  public void setResultMagnitude(Double resultMagnitude) {
     this.resultMagnitude = resultMagnitude;
  }

  public Double getResultMagnitude() {
     return this.resultMagnitude ;
  }

  public void setResultUnits(String resultUnits) {
     this.resultUnits = resultUnits;
  }

  public String getResultUnits() {
     return this.resultUnits ;
  }
}
