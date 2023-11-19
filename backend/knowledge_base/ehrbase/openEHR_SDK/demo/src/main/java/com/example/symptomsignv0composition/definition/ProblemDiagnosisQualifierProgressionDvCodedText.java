package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.701447166+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierProgressionDvCodedText implements RMEntity, ProblemDiagnosisQualifierProgressionChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Progression/Progression
   * Description: Category of the progression through the course of a chronic problem or diagnosis.
   */
  @Path("|defining_code")
  private ProgressionDefiningCode progressionDefiningCode;

  public void setProgressionDefiningCode(ProgressionDefiningCode progressionDefiningCode) {
     this.progressionDefiningCode = progressionDefiningCode;
  }

  public ProgressionDefiningCode getProgressionDefiningCode() {
     return this.progressionDefiningCode ;
  }
}
