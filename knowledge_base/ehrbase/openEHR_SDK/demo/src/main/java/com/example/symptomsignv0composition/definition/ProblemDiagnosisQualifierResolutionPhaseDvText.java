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
    date = "2023-06-19T20:52:30.708526231+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierResolutionPhaseDvText implements RMEntity, ProblemDiagnosisQualifierResolutionPhaseChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Resolution phase/Resolution phase
   * Description: Phase of healing for an acute problem or diagnosis.
   * Comment: For example: tracking the progress of resolution of a middle ear infection.
   */
  @Path("|value")
  private String resolutionPhaseValue;

  public void setResolutionPhaseValue(String resolutionPhaseValue) {
     this.resolutionPhaseValue = resolutionPhaseValue;
  }

  public String getResolutionPhaseValue() {
     return this.resolutionPhaseValue ;
  }
}
