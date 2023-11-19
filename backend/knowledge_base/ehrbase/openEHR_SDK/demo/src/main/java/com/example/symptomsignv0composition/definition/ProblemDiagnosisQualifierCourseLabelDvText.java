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
    date = "2023-06-19T20:52:30.704772789+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierCourseLabelDvText implements RMEntity, ProblemDiagnosisQualifierCourseLabelChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Course label/Course label
   * Description: Category reflecting the speed of onset and/or duration and persistence of the problem or diagnosis.
   * Comment: Definitions of acute vs chronic will differ for each diagnosis.
   */
  @Path("|value")
  private String courseLabelValue;

  public void setCourseLabelValue(String courseLabelValue) {
     this.courseLabelValue = courseLabelValue;
  }

  public String getCourseLabelValue() {
     return this.courseLabelValue ;
  }
}
