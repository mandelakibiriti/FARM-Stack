package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
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
@Archetype("openEHR-EHR-EVALUATION.exposure.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.752314602+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExposureEvaluation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Agent
   * Description: Identification of the chemical, physical or biological agent to which the subject was exposed.
   * Comment: For example: passive smoking or industrial noise.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String agentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Agent/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour agentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Overall Description
   * Description: Overall description of the exposure to the identified substance.
   */
  @Path("/data[at0001]/items[at0003]/value|value")
  private String overallDescriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Overall Description/null_flavour
   */
  @Path("/data[at0001]/items[at0003]/null_flavour|defining_code")
  private NullFlavour overallDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Category
   * Description: Type of exposure.
   */
  @Path("/data[at0001]/items[at0005]/value|defining_code")
  private CategoryDefiningCode categoryDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Category/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour categoryNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Ongoing Exposure
   * Description: Does the subject remain exposed to the substance to a degree that could be regarded as a potential risk to health?
   */
  @Path("/data[at0001]/items[at0004]/value|value")
  private Boolean ongoingExposureValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Ongoing Exposure/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour ongoingExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Exposure Details
   * Description: Detailed information about an episode of exposure to the agent.
   */
  @Path("/data[at0001]/items[at0010]")
  private List<ExposureExposureDetailsCluster> exposureDetails;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Date Updated
   * Description: The date this exposure summary was last updated.
   */
  @Path("/protocol[at0008]/items[at0009]/value|value")
  private TemporalAccessor dateUpdatedValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Date Updated/null_flavour
   */
  @Path("/protocol[at0008]/items[at0009]/null_flavour|defining_code")
  private NullFlavour dateUpdatedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setAgentValue(String agentValue) {
     this.agentValue = agentValue;
  }

  public String getAgentValue() {
     return this.agentValue ;
  }

  public void setAgentNullFlavourDefiningCode(NullFlavour agentNullFlavourDefiningCode) {
     this.agentNullFlavourDefiningCode = agentNullFlavourDefiningCode;
  }

  public NullFlavour getAgentNullFlavourDefiningCode() {
     return this.agentNullFlavourDefiningCode ;
  }

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

  public void setCategoryDefiningCode(CategoryDefiningCode categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public CategoryDefiningCode getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setCategoryNullFlavourDefiningCode(NullFlavour categoryNullFlavourDefiningCode) {
     this.categoryNullFlavourDefiningCode = categoryNullFlavourDefiningCode;
  }

  public NullFlavour getCategoryNullFlavourDefiningCode() {
     return this.categoryNullFlavourDefiningCode ;
  }

  public void setOngoingExposureValue(Boolean ongoingExposureValue) {
     this.ongoingExposureValue = ongoingExposureValue;
  }

  public Boolean isOngoingExposureValue() {
     return this.ongoingExposureValue ;
  }

  public void setOngoingExposureNullFlavourDefiningCode(
      NullFlavour ongoingExposureNullFlavourDefiningCode) {
     this.ongoingExposureNullFlavourDefiningCode = ongoingExposureNullFlavourDefiningCode;
  }

  public NullFlavour getOngoingExposureNullFlavourDefiningCode() {
     return this.ongoingExposureNullFlavourDefiningCode ;
  }

  public void setExposureDetails(List<ExposureExposureDetailsCluster> exposureDetails) {
     this.exposureDetails = exposureDetails;
  }

  public List<ExposureExposureDetailsCluster> getExposureDetails() {
     return this.exposureDetails ;
  }

  public void setDateUpdatedValue(TemporalAccessor dateUpdatedValue) {
     this.dateUpdatedValue = dateUpdatedValue;
  }

  public TemporalAccessor getDateUpdatedValue() {
     return this.dateUpdatedValue ;
  }

  public void setDateUpdatedNullFlavourDefiningCode(
      NullFlavour dateUpdatedNullFlavourDefiningCode) {
     this.dateUpdatedNullFlavourDefiningCode = dateUpdatedNullFlavourDefiningCode;
  }

  public NullFlavour getDateUpdatedNullFlavourDefiningCode() {
     return this.dateUpdatedNullFlavourDefiningCode ;
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
