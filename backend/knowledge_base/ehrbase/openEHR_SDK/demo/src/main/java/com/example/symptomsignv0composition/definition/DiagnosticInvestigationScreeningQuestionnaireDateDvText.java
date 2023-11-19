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
    date = "2023-06-19T20:52:30.869065976+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class DiagnosticInvestigationScreeningQuestionnaireDateDvText implements RMEntity, DiagnosticInvestigationScreeningQuestionnaireDateChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Date/Date
   * Description: The date and/or time of the most recent test.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("|value")
  private String dateValue;

  public void setDateValue(String dateValue) {
     this.dateValue = dateValue;
  }

  public String getDateValue() {
     return this.dateValue ;
  }
}
