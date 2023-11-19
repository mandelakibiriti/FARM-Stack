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
    date = "2023-06-19T20:52:30.877769581+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ExposureScreeningQuestionnaireAnyExposureDvText implements RMEntity, ExposureScreeningQuestionnaireAnyExposureChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Any exposure?/Any exposure?
   * Description: Presence of any relevant exposure.
   */
  @Path("|value")
  private String anyExposureValue;

  public void setAnyExposureValue(String anyExposureValue) {
     this.anyExposureValue = anyExposureValue;
  }

  public String getAnyExposureValue() {
     return this.anyExposureValue ;
  }
}
