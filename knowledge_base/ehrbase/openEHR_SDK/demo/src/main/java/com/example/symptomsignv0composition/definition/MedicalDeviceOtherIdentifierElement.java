package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.775335318+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class MedicalDeviceOtherIdentifierElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Other identifier
   * Description: Unspecified identifier, which can be further specified in a template or at run time.
   * Comment: Coding of the name of the identifier with a coding system is desirable, if available.
   */
  @Path("/value")
  private DvIdentifier value;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Other identifier/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(DvIdentifier value) {
     this.value = value;
  }

  public DvIdentifier getValue() {
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
