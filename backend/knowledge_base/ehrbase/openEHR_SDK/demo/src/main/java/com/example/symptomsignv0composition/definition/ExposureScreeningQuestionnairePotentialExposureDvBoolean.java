package com.example.symptomsignv0composition.definition;

import java.lang.Boolean;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.876891198+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_BOOLEAN")
public class ExposureScreeningQuestionnairePotentialExposureDvBoolean implements RMEntity, ExposureScreeningQuestionnairePotentialExposureChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Potential exposure?/Potential exposure?
   * Description: Presence of the exposure situation.
   */
  @Path("|value")
  private Boolean potentialExposureValue;

  public void setPotentialExposureValue(Boolean potentialExposureValue) {
     this.potentialExposureValue = potentialExposureValue;
  }

  public Boolean isPotentialExposureValue() {
     return this.potentialExposureValue ;
  }
}
