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
    date = "2023-06-19T20:52:30.709748398+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierRemissionStatusDvText implements RMEntity, ProblemDiagnosisQualifierRemissionStatusChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Remission status/Remission status
   * Description: Status of the remission of an incurable diagnosis.
   * Comment: For example: the status of a cancer or haematological diagnosis.
   */
  @Path("|value")
  private String remissionStatusValue;

  public void setRemissionStatusValue(String remissionStatusValue) {
     this.remissionStatusValue = remissionStatusValue;
  }

  public String getRemissionStatusValue() {
     return this.remissionStatusValue ;
  }
}
