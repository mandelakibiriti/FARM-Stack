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
    date = "2023-06-19T20:52:30.851115594+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class MedicationScreeningQuestionnaireLatestDoseDvText implements RMEntity, MedicationScreeningQuestionnaireLatestDoseChoice {
  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Latest dose/Latest dose
   * Description: The date and/or time of administation of the most recent dose of the medication or group of medications.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("|value")
  private String latestDoseValue;

  public void setLatestDoseValue(String latestDoseValue) {
     this.latestDoseValue = latestDoseValue;
  }

  public String getLatestDoseValue() {
     return this.latestDoseValue ;
  }
}
