package com.example.symptomsignv0composition.definition;

import java.lang.Boolean;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.859294109+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_INTERVAL<DV_DATE_TIME>")
public class ProcedureScreeningQuestionnaireTimingDvIntervalDvDateTime implements RMEntity, ProcedureScreeningQuestionnaireTimingChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing/lower
   */
  @Path("/lower|value")
  private TemporalAccessor lowerValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing/upper
   */
  @Path("/upper|value")
  private TemporalAccessor upperValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing/lower_included
   */
  @Path("/lower_included")
  private Boolean lowerIncluded;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing/upper_included
   */
  @Path("/upper_included")
  private Boolean upperIncluded;

  public void setLowerValue(TemporalAccessor lowerValue) {
     this.lowerValue = lowerValue;
  }

  public TemporalAccessor getLowerValue() {
     return this.lowerValue ;
  }

  public void setUpperValue(TemporalAccessor upperValue) {
     this.upperValue = upperValue;
  }

  public TemporalAccessor getUpperValue() {
     return this.upperValue ;
  }

  public void setLowerIncluded(Boolean lowerIncluded) {
     this.lowerIncluded = lowerIncluded;
  }

  public Boolean isLowerIncluded() {
     return this.lowerIncluded ;
  }

  public void setUpperIncluded(Boolean upperIncluded) {
     this.upperIncluded = upperIncluded;
  }

  public Boolean isUpperIncluded() {
     return this.upperIncluded ;
  }
}
