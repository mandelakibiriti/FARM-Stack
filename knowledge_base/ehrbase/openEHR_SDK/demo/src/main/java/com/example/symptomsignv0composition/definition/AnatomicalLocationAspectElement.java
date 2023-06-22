package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.677247313+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AnatomicalLocationAspectElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Anatomical location/Aspect/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Anatomical location/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Anatomical location/Aspect
   * Description: Qualifying detail about the specific aspect of the identified body site.
   * Comment: Use to increase precision of identification of the body site, if required. Common aspects have been included as a value set, which can be extended over time, plus a free text option. Assumes that the body is being described while in the anatomical position. For example: proximal urethra; plantar aspect of the left thumb. Multiple aspects can also be described, if required, by allowing for 0..2 occurrences. For example: a lesion may be on the left anterior/lateral (ie anterolateral) chest wall. If the 'Body site name' data element uses pre-coordinated terms that include the aspect, then this data element is redundant.
   */
  @Path("/value")
  @Choice
  private AnatomicalLocationAspectChoice value2;

  public void setValue(NullFlavour value) {
     this.value = value;
  }

  public NullFlavour getValue() {
     return this.value ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setValue2(AnatomicalLocationAspectChoice value2) {
     this.value2 = value2;
  }

  public AnatomicalLocationAspectChoice getValue2() {
     return this.value2 ;
  }
}
