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
    date = "2023-06-19T20:52:30.671423998+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProblemDiagnosisBodySiteElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Body site
   * Description: Identification of a simple body site for the location of the problem or diagnosis.
   * Comment: Coding of the name of the anatomical location with a terminology is preferred, where possible.
   * Use this data element to record precoordinated anatomical locations. If the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the 'Structured anatomical location' SLOT in this archetype. Occurrences for this data element are unbounded to allow for clinical scenarios such as describing a rash in multiple locations but where all of the other attributes are identical. If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant.
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Body site/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/feeder_audit
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
