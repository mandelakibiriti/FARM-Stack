package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.856989222+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProcedureScreeningQuestionnaireAnyPreviousProceduresDvCodedText implements RMEntity, ProcedureScreeningQuestionnaireAnyPreviousProceduresChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Any previous procedures?/Any previous procedures?
   * Description: Is there a history of any past procedures relevant for the screening purpose?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("|defining_code")
  private AnyPreviousProceduresDefiningCode anyPreviousProceduresDefiningCode;

  public void setAnyPreviousProceduresDefiningCode(
      AnyPreviousProceduresDefiningCode anyPreviousProceduresDefiningCode) {
     this.anyPreviousProceduresDefiningCode = anyPreviousProceduresDefiningCode;
  }

  public AnyPreviousProceduresDefiningCode getAnyPreviousProceduresDefiningCode() {
     return this.anyPreviousProceduresDefiningCode ;
  }
}
