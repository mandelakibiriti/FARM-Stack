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
    date = "2023-06-19T20:52:30.718263103+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class SymptomSignBodySiteElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Body site
   * Description: Simple body site where the symptom or sign was reported.
   * Comment: Occurrences of this data element are set to 0..* to allow multiple body sites to be separated out in a template if desired. This allows for representation of clinical scenarios where a symptom or sign needs to be recorded in multiple locations or identifying both the originating and distal site in pain radiation, but where all of the other attributes such as impact and duration are identical. If the requirements for recording the body site are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the Detailed anatomical location' SLOT in this archetype. 
   * If the anatomical location is included in the Symptom name via precoordinated codes, this data element becomes redundant. If the anatomical location is recorded using the 'Structured body site' SLOT, then use of this data element is not allowed - record only the simple 'Body site' OR 'Structured body site', but not both.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Body site/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/feeder_audit
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
