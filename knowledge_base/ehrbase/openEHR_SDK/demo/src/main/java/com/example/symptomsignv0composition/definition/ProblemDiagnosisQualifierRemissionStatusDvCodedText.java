package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.709310329+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierRemissionStatusDvCodedText implements RMEntity, ProblemDiagnosisQualifierRemissionStatusChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Remission status/Remission status
   * Description: Status of the remission of an incurable diagnosis.
   * Comment: For example: the status of a cancer or haematological diagnosis.
   */
  @Path("|defining_code")
  private RemissionStatusDefiningCode remissionStatusDefiningCode;

  public void setRemissionStatusDefiningCode(
      RemissionStatusDefiningCode remissionStatusDefiningCode) {
     this.remissionStatusDefiningCode = remissionStatusDefiningCode;
  }

  public RemissionStatusDefiningCode getRemissionStatusDefiningCode() {
     return this.remissionStatusDefiningCode ;
  }
}
