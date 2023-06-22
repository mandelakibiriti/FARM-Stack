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
    date = "2023-06-19T20:52:30.763507284+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class AdverseReactionRiskStatusDvText implements RMEntity, AdverseReactionRiskStatusChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Status/Status
   * Description: Assertion about the certainty of the propensity, or potential future risk, of the identified 'Substance' to cause a reaction.
   * Comment: Decision support would typically raise alerts for 'Suspected', 'Likely', 'Confirmed', and ignore a 'Refuted' reaction. Clinical systems may choose not to display Adverse reaction entries with a 
   *
   *
   * 'Refuted' status in the Adverse Reaction List. 
   *
   * However, 'Refuted' may be useful for reconciliation of the adverse reaction list or when communicating between systems
   *
   * . Some implementations may choose to make this field mandatory.
   *  'Resolved' may be used variably across systems, depending on clinical use and context - there appears to be differing opinion whether this should still be used to raise potential alerts or to display in an Adverse Reaction List. The free text data type will allow for local variation by enabling other value sets to be applied to this data element in a template - in this situation it is recommended that values should be coded using a terminology.
   */
  @Path("|value")
  private String statusValue;

  public void setStatusValue(String statusValue) {
     this.statusValue = statusValue;
  }

  public String getStatusValue() {
     return this.statusValue ;
  }
}
