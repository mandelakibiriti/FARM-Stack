package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.876561579+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ExposureScreeningQuestionnairePotentialExposureDvCodedText implements RMEntity, ExposureScreeningQuestionnairePotentialExposureChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Potential exposure?/Potential exposure?
   * Description: Presence of the exposure situation.
   */
  @Path("|defining_code")
  private PotentialExposureDefiningCode potentialExposureDefiningCode;

  public void setPotentialExposureDefiningCode(
      PotentialExposureDefiningCode potentialExposureDefiningCode) {
     this.potentialExposureDefiningCode = potentialExposureDefiningCode;
  }

  public PotentialExposureDefiningCode getPotentialExposureDefiningCode() {
     return this.potentialExposureDefiningCode ;
  }
}
