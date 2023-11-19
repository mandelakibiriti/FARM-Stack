package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.condition_progress.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.730851593+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ConditionProgressCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Condition progress/Phase
   * Description: Name of the stage or phase of an identified condition.
   */
  @Path("/items[at0001]/value|value")
  private String phaseValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Condition progress/Phase/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour phaseNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Condition progress/Phase recognised
   * Description: Date when the phase or stage was clinically recognised.
   */
  @Path("/items[at0006]/value|value")
  private TemporalAccessor phaseRecognisedValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Condition progress/Phase recognised/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour phaseRecognisedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Condition progress/Comment
   * Description: Additional narrative about the progress of the identified condition, not captured in other fields.
   */
  @Path("/items[at0007]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Condition progress/Comment/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Condition progress/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setPhaseValue(String phaseValue) {
     this.phaseValue = phaseValue;
  }

  public String getPhaseValue() {
     return this.phaseValue ;
  }

  public void setPhaseNullFlavourDefiningCode(NullFlavour phaseNullFlavourDefiningCode) {
     this.phaseNullFlavourDefiningCode = phaseNullFlavourDefiningCode;
  }

  public NullFlavour getPhaseNullFlavourDefiningCode() {
     return this.phaseNullFlavourDefiningCode ;
  }

  public void setPhaseRecognisedValue(TemporalAccessor phaseRecognisedValue) {
     this.phaseRecognisedValue = phaseRecognisedValue;
  }

  public TemporalAccessor getPhaseRecognisedValue() {
     return this.phaseRecognisedValue ;
  }

  public void setPhaseRecognisedNullFlavourDefiningCode(
      NullFlavour phaseRecognisedNullFlavourDefiningCode) {
     this.phaseRecognisedNullFlavourDefiningCode = phaseRecognisedNullFlavourDefiningCode;
  }

  public NullFlavour getPhaseRecognisedNullFlavourDefiningCode() {
     return this.phaseRecognisedNullFlavourDefiningCode ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
