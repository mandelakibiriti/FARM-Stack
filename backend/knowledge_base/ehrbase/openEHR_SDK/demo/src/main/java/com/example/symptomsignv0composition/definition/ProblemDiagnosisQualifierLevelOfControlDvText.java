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
    date = "2023-06-19T20:52:30.704060854+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierLevelOfControlDvText implements RMEntity, ProblemDiagnosisQualifierLevelOfControlChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Level of control/Level of control
   * Description: Category of the level of control of the problem or diagnosis by the current management.
   */
  @Path("|value")
  private String levelOfControlValue;

  public void setLevelOfControlValue(String levelOfControlValue) {
     this.levelOfControlValue = levelOfControlValue;
  }

  public String getLevelOfControlValue() {
     return this.levelOfControlValue ;
  }
}
