package com.example.symptomsignv0composition.definition;

import java.lang.Boolean;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.865890952+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_BOOLEAN")
public class DiagnosticInvestigationScreeningQuestionnaireAnyTestsDvBoolean implements RMEntity, DiagnosticInvestigationScreeningQuestionnaireAnyTestsChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Any tests?/Any tests?
   * Description: Is there a history of any investigations related to the screening purpose?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("|value")
  private Boolean anyTestsValue;

  public void setAnyTestsValue(Boolean anyTestsValue) {
     this.anyTestsValue = anyTestsValue;
  }

  public Boolean isAnyTestsValue() {
     return this.anyTestsValue ;
  }
}
