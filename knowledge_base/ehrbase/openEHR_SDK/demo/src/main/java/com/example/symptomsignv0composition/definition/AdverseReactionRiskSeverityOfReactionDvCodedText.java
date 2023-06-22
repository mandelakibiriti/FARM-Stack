package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.759434622+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AdverseReactionRiskSeverityOfReactionDvCodedText implements RMEntity, AdverseReactionRiskSeverityOfReactionChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Severity of reaction/Severity of reaction
   * Description: Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
   * Comment: It is acknowledged that this assessment is very subjective. There may be some some specific practice domains where objective scales have been applied.
   *  Objective scales can be included in this model using the 'Reaction details' Cluster.
   */
  @Path("|defining_code")
  private SeverityOfReactionDefiningCode severityOfReactionDefiningCode;

  public void setSeverityOfReactionDefiningCode(
      SeverityOfReactionDefiningCode severityOfReactionDefiningCode) {
     this.severityOfReactionDefiningCode = severityOfReactionDefiningCode;
  }

  public SeverityOfReactionDefiningCode getSeverityOfReactionDefiningCode() {
     return this.severityOfReactionDefiningCode ;
  }
}
