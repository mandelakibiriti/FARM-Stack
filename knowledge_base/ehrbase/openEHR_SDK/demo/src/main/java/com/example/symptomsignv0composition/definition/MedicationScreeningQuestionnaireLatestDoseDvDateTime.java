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
    date = "2023-06-19T20:52:30.850998037+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_DATE_TIME")
public class MedicationScreeningQuestionnaireLatestDoseDvDateTime implements RMEntity, MedicationScreeningQuestionnaireLatestDoseChoice {
  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Latest dose/Latest dose
   * Description: The date and/or time of administation of the most recent dose of the medication or group of medications.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("|value")
  private TemporalAccessor latestDoseValue;

  public void setLatestDoseValue(TemporalAccessor latestDoseValue) {
     this.latestDoseValue = latestDoseValue;
  }

  public TemporalAccessor getLatestDoseValue() {
     return this.latestDoseValue ;
  }
}
