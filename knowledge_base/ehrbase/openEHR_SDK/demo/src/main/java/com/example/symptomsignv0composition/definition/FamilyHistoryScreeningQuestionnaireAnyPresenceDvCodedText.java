package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.843444366+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class FamilyHistoryScreeningQuestionnaireAnyPresenceDvCodedText implements RMEntity, FamilyHistoryScreeningQuestionnaireAnyPresenceChoice {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Any presence?/Any presence?
   * Description: Presence of any relevant problems in the family.
   */
  @Path("|defining_code")
  private AnyPresenceDefiningCode anyPresenceDefiningCode;

  public void setAnyPresenceDefiningCode(AnyPresenceDefiningCode anyPresenceDefiningCode) {
     this.anyPresenceDefiningCode = anyPresenceDefiningCode;
  }

  public AnyPresenceDefiningCode getAnyPresenceDefiningCode() {
     return this.anyPresenceDefiningCode ;
  }
}
