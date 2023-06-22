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
    date = "2023-06-19T20:52:30.876786224+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ExposureScreeningQuestionnairePotentialExposureDvText implements RMEntity, ExposureScreeningQuestionnairePotentialExposureChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Potential exposure?/Potential exposure?
   * Description: Presence of the exposure situation.
   */
  @Path("|value")
  private String potentialExposureValue;

  public void setPotentialExposureValue(String potentialExposureValue) {
     this.potentialExposureValue = potentialExposureValue;
  }

  public String getPotentialExposureValue() {
     return this.potentialExposureValue ;
  }
}
