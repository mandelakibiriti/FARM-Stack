package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.703588301+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierLevelOfControlDvCodedText implements RMEntity, ProblemDiagnosisQualifierLevelOfControlChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Level of control/Level of control
   * Description: Category of the level of control of the problem or diagnosis by the current management.
   */
  @Path("|defining_code")
  private LevelOfControlDefiningCode levelOfControlDefiningCode;

  public void setLevelOfControlDefiningCode(LevelOfControlDefiningCode levelOfControlDefiningCode) {
     this.levelOfControlDefiningCode = levelOfControlDefiningCode;
  }

  public LevelOfControlDefiningCode getLevelOfControlDefiningCode() {
     return this.levelOfControlDefiningCode ;
  }
}
