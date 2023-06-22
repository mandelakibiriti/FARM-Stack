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
    date = "2023-06-19T20:52:30.857295858+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProcedureScreeningQuestionnaireAnyPreviousProceduresDvText implements RMEntity, ProcedureScreeningQuestionnaireAnyPreviousProceduresChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Any previous procedures?/Any previous procedures?
   * Description: Is there a history of any past procedures relevant for the screening purpose?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("|value")
  private String anyPreviousProceduresValue;

  public void setAnyPreviousProceduresValue(String anyPreviousProceduresValue) {
     this.anyPreviousProceduresValue = anyPreviousProceduresValue;
  }

  public String getAnyPreviousProceduresValue() {
     return this.anyPreviousProceduresValue ;
  }
}
