package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.757306081+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AdverseReactionRiskManifestationElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Manifestation
   * Description: Clinical symptoms and/or signs that are observed or associated with the adverse reaction.
   * Comment: Manifestation can be expressed as a single word, phrase or brief description. For example: nausea, rash.  'No reaction'may be appropriate where a previous reaction has been noted but the reaction did not re-occur after further exposure. It is preferable that 'Manifestation' should be coded with a terminology, where possible. The values entered here may be used to display on an application screen as part of a list of adverse reactions, as recommended in the UK NHS CUI guidelines.
   *
   *
   *
   * Terminologies commonly used include, but are not limited to, SNOMED-CT or ICD10.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Manifestation/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
