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
    date = "2023-06-19T20:52:30.860606352+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProcedureScreeningQuestionnairePastProcedureDvText implements RMEntity, ProcedureScreeningQuestionnairePastProcedureChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Past procedure?/Past procedure?
   * Description: Is there a history of the identified procedure?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("|value")
  private String pastProcedureValue;

  public void setPastProcedureValue(String pastProcedureValue) {
     this.pastProcedureValue = pastProcedureValue;
  }

  public String getPastProcedureValue() {
     return this.pastProcedureValue ;
  }
}
