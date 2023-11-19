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
    date = "2023-06-19T20:52:30.702025825+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierProgressionDvText implements RMEntity, ProblemDiagnosisQualifierProgressionChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Progression/Progression
   * Description: Category of the progression through the course of a chronic problem or diagnosis.
   */
  @Path("|value")
  private String progressionValue;

  public void setProgressionValue(String progressionValue) {
     this.progressionValue = progressionValue;
  }

  public String getProgressionValue() {
     return this.progressionValue ;
  }
}
