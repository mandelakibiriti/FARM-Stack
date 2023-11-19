package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.875502213+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ExposureScreeningQuestionnaireTimingDvCodedText implements RMEntity, ExposureScreeningQuestionnaireTimingChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Timing/Timing
   * Description: The date/s when the individual was exposed to the agent.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("")
  private DvCodedText timing;

  public void setTiming(DvCodedText timing) {
     this.timing = timing;
  }

  public DvCodedText getTiming() {
     return this.timing ;
  }
}
