package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.704937353+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierCourseLabelDvCodedText implements RMEntity, ProblemDiagnosisQualifierCourseLabelChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Course label/Course label
   * Description: Category reflecting the speed of onset and/or duration and persistence of the problem or diagnosis.
   * Comment: Definitions of acute vs chronic will differ for each diagnosis.
   */
  @Path("|defining_code")
  private CourseLabelDefiningCode courseLabelDefiningCode;

  public void setCourseLabelDefiningCode(CourseLabelDefiningCode courseLabelDefiningCode) {
     this.courseLabelDefiningCode = courseLabelDefiningCode;
  }

  public CourseLabelDefiningCode getCourseLabelDefiningCode() {
     return this.courseLabelDefiningCode ;
  }
}
