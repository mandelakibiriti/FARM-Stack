package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.796753575+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class BodyTemperatureBodyExposureDvCodedText implements RMEntity, BodyTemperatureBodyExposureChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Body exposure/Body exposure
   * Description: The degree of exposure of the individual at the time of measurement.
   */
  @Path("|defining_code")
  private BodyExposureDefiningCode bodyExposureDefiningCode;

  public void setBodyExposureDefiningCode(BodyExposureDefiningCode bodyExposureDefiningCode) {
     this.bodyExposureDefiningCode = bodyExposureDefiningCode;
  }

  public BodyExposureDefiningCode getBodyExposureDefiningCode() {
     return this.bodyExposureDefiningCode ;
  }
}
