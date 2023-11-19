package com.example.symptomsignv0composition.definition;

import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.875174548+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_DATE_TIME")
public class ExposureScreeningQuestionnaireTimingDvDateTime implements RMEntity, ExposureScreeningQuestionnaireTimingChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Timing/Timing
   * Description: The date/s when the individual was exposed to the agent.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("|value")
  private TemporalAccessor timingValue;

  public void setTimingValue(TemporalAccessor timingValue) {
     this.timingValue = timingValue;
  }

  public TemporalAccessor getTimingValue() {
     return this.timingValue ;
  }
}
