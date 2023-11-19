package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-EVALUATION.differential_diagnoses.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.827275455+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class DifferentialDiagnosesEvaluation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Differential diagnoses/Overall description
   * Description: Narrative overview about all of the differential diagnoses identified.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String overallDescriptionValue;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Overall description/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour overallDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential
   * Description: Details about a single differential diagnosis.
   */
  @Path("/data[at0001]/items[at0003]")
  private List<DifferentialDiagnosesPerDifferentialCluster> perDifferential;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0013]/items[at0014]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Last updated
   * Description: The date/time the differential diagnoses were last updated.
   */
  @Path("/protocol[at0013]/items[at0015]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Item tree/Last updated/null_flavour
   */
  @Path("/protocol[at0013]/items[at0015]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setOverallDescriptionValue(String overallDescriptionValue) {
     this.overallDescriptionValue = overallDescriptionValue;
  }

  public String getOverallDescriptionValue() {
     return this.overallDescriptionValue ;
  }

  public void setOverallDescriptionNullFlavourDefiningCode(
      NullFlavour overallDescriptionNullFlavourDefiningCode) {
     this.overallDescriptionNullFlavourDefiningCode = overallDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getOverallDescriptionNullFlavourDefiningCode() {
     return this.overallDescriptionNullFlavourDefiningCode ;
  }

  public void setPerDifferential(
      List<DifferentialDiagnosesPerDifferentialCluster> perDifferential) {
     this.perDifferential = perDifferential;
  }

  public List<DifferentialDiagnosesPerDifferentialCluster> getPerDifferential() {
     return this.perDifferential ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setLastUpdatedValue(TemporalAccessor lastUpdatedValue) {
     this.lastUpdatedValue = lastUpdatedValue;
  }

  public TemporalAccessor getLastUpdatedValue() {
     return this.lastUpdatedValue ;
  }

  public void setLastUpdatedNullFlavourDefiningCode(
      NullFlavour lastUpdatedNullFlavourDefiningCode) {
     this.lastUpdatedNullFlavourDefiningCode = lastUpdatedNullFlavourDefiningCode;
  }

  public NullFlavour getLastUpdatedNullFlavourDefiningCode() {
     return this.lastUpdatedNullFlavourDefiningCode ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
