package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.837360891+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class SocialContextScreeningQuestionnaireContextDvCodedText implements RMEntity, SocialContextScreeningQuestionnaireContextChoice {
  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/Context/Context
   * Description: Identification of a specific social circumstance, issue or concern relevant for the questionnaire or grouping of such, by name.
   * Comment: This element offers a choice between free and coded text. It is anticipated that the list of coded values will grow as requirements are identified. Coding of the 'Context' with a terminology is preferred, where possible - for example, relevant terms within the Social context finding hierarchy in SNOMED CT (SCTID: 108329005). Alternatively as free text, for example 'Social isolation', 'Discrimination', 'Minority stress'.
   */
  @Path("|defining_code")
  private ContextDefiningCode contextDefiningCode;

  public void setContextDefiningCode(ContextDefiningCode contextDefiningCode) {
     this.contextDefiningCode = contextDefiningCode;
  }

  public ContextDefiningCode getContextDefiningCode() {
     return this.contextDefiningCode ;
  }
}
