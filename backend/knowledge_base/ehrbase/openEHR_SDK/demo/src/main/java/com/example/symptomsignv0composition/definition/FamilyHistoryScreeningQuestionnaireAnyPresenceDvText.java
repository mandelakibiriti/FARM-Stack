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
    date = "2023-06-19T20:52:30.843723472+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class FamilyHistoryScreeningQuestionnaireAnyPresenceDvText implements RMEntity, FamilyHistoryScreeningQuestionnaireAnyPresenceChoice {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Any presence?/Any presence?
   * Description: Presence of any relevant problems in the family.
   */
  @Path("|value")
  private String anyPresenceValue;

  public void setAnyPresenceValue(String anyPresenceValue) {
     this.anyPresenceValue = anyPresenceValue;
  }

  public String getAnyPresenceValue() {
     return this.anyPresenceValue ;
  }
}
