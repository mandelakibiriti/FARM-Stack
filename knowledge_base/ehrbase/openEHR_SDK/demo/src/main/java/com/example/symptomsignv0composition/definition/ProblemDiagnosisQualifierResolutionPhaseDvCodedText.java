package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.707953884+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierResolutionPhaseDvCodedText implements RMEntity, ProblemDiagnosisQualifierResolutionPhaseChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Resolution phase/Resolution phase
   * Description: Phase of healing for an acute problem or diagnosis.
   * Comment: For example: tracking the progress of resolution of a middle ear infection.
   */
  @Path("|defining_code")
  private ResolutionPhaseDefiningCode resolutionPhaseDefiningCode;

  public void setResolutionPhaseDefiningCode(
      ResolutionPhaseDefiningCode resolutionPhaseDefiningCode) {
     this.resolutionPhaseDefiningCode = resolutionPhaseDefiningCode;
  }

  public ResolutionPhaseDefiningCode getResolutionPhaseDefiningCode() {
     return this.resolutionPhaseDefiningCode ;
  }
}
