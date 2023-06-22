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
    date = "2023-06-19T20:52:30.759709039+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class AdverseReactionRiskSeverityOfReactionDvText implements RMEntity, AdverseReactionRiskSeverityOfReactionChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Severity of reaction/Severity of reaction
   * Description: Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
   * Comment: It is acknowledged that this assessment is very subjective. There may be some some specific practice domains where objective scales have been applied.
   *  Objective scales can be included in this model using the 'Reaction details' Cluster.
   */
  @Path("|value")
  private String severityOfReactionValue;

  public void setSeverityOfReactionValue(String severityOfReactionValue) {
     this.severityOfReactionValue = severityOfReactionValue;
  }

  public String getSeverityOfReactionValue() {
     return this.severityOfReactionValue ;
  }
}
