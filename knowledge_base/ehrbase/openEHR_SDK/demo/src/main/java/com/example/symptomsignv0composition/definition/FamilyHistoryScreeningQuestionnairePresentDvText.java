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
    date = "2023-06-19T20:52:30.842746177+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class FamilyHistoryScreeningQuestionnairePresentDvText implements RMEntity, FamilyHistoryScreeningQuestionnairePresentChoice {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Present?/Present?
   * Description: Presence of any relevant specific problem.
   */
  @Path("|value")
  private String presentValue;

  public void setPresentValue(String presentValue) {
     this.presentValue = presentValue;
  }

  public String getPresentValue() {
     return this.presentValue ;
  }
}
