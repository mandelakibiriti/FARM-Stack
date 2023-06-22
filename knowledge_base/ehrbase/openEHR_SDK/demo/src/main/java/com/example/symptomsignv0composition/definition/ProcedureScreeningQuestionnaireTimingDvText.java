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
    date = "2023-06-19T20:52:30.858832857+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProcedureScreeningQuestionnaireTimingDvText implements RMEntity, ProcedureScreeningQuestionnaireTimingChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing/Timing
   * Description: Timing of the procedure.
   * Comment: "The 'Timing' data element has deliberately been loosely modelled to support the myriad of ways that it can be used in questionnaires to capture when a procedure was performed. The specific and intended semantics can be further clarified in a template.
   * For example: 
   * Date/time for when the procedure was performed. Interval of date/time for a period of time eg. between 1940 and 1942. Text for descriptions like 'Immediately after the operation', or 'Up to one week ago', 'Up to two weeks ago', 'Three weeks ago'. Duration for the individual's age at the onset. Interval of Duration for the approximate age of the individual at the time of onset.
   */
  @Path("|value")
  private String timingValue;

  public void setTimingValue(String timingValue) {
     this.timingValue = timingValue;
  }

  public String getTimingValue() {
     return this.timingValue ;
  }
}
