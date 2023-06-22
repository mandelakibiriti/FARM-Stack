package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.762566216+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AdverseReactionRiskReactionMechanismDvCodedText implements RMEntity, AdverseReactionRiskReactionMechanismChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction mechanism/Reaction mechanism
   * Description: Identification of the underlying physiological mechanism for the adverse reaction.
   * Comment: Immune-mediated responses have been traditionally regarded as an indicator for escalation of significant future risk. Contemporary knowledge suggests that some reactions previously thought to be immune are actually non-immune and still carry life threatening risk. 
   *
   * Immunological testing may provide supporting evidence for the mechanism and causative substance , but no tests are 100% sensitive or specific for a sensitivity. 
   *
   * It is acknowledged that most clinicians will NOT be able to distinguish the mechanism of any specific reaction. However this data element is included because many legacy systems have captured this attribute.
   */
  @Path("|defining_code")
  private ReactionMechanismDefiningCode reactionMechanismDefiningCode;

  public void setReactionMechanismDefiningCode(
      ReactionMechanismDefiningCode reactionMechanismDefiningCode) {
     this.reactionMechanismDefiningCode = reactionMechanismDefiningCode;
  }

  public ReactionMechanismDefiningCode getReactionMechanismDefiningCode() {
     return this.reactionMechanismDefiningCode ;
  }
}
