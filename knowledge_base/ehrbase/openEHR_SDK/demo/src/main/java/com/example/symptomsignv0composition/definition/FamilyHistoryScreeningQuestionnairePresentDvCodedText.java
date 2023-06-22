package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.842466791+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class FamilyHistoryScreeningQuestionnairePresentDvCodedText implements RMEntity, FamilyHistoryScreeningQuestionnairePresentChoice {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Present?/Present?
   * Description: Presence of any relevant specific problem.
   */
  @Path("|defining_code")
  private PresentDefiningCode presentDefiningCode;

  public void setPresentDefiningCode(PresentDefiningCode presentDefiningCode) {
     this.presentDefiningCode = presentDefiningCode;
  }

  public PresentDefiningCode getPresentDefiningCode() {
     return this.presentDefiningCode ;
  }
}
