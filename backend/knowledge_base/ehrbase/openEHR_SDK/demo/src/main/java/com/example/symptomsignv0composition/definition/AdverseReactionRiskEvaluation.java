package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-EVALUATION.adverse_reaction_risk.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.755108472+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AdverseReactionRiskEvaluation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Substance
   * Description: Identification of a substance, or substance class, that is considered to put the individual at risk of an adverse reaction event.
   * Comment: Both an individual substance and a substance class are valid entries in 'Substance'. A substance may be a compound of simpler substances, for example a medicinal product. If the value in 'Substance' is an individual substance, it may be duplicated in 'Specific substance'. It is strongly recommended that both 'Substance' and 'Specific substance' be coded with a terminology capable of triggering decision support, where possible. For example: Snomed CT, DM+D, RxNorm, NDFRT, ATC, New Zealand Universal List of Medicines and Australian Medicines Terminology. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String substanceValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Substance/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour substanceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Status/null_flavour
   */
  @Path("/data[at0001]/items[at0063]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Criticality
   * Description: An indication of the potential for critical system organ damage or life threatening consequence.
   * Comment: This can be regarded as a predictive judgement of a 'worst case scenario'.
   *  In most contexts 'Low' would be regarded as the default value.
   */
  @Path("/data[at0001]/items[at0101]/value|defining_code")
  private CriticalityDefiningCode criticalityDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Criticality/null_flavour
   */
  @Path("/data[at0001]/items[at0101]/null_flavour|defining_code")
  private NullFlavour criticalityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Category/null_flavour
   */
  @Path("/data[at0001]/items[at0120]/null_flavour|defining_code")
  private NullFlavour categoryNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Onset of last reaction
   * Description: The date and/or time of the onset of the last known occurrence of a reaction event.
   * Comment: This date may be be a duplicate of the most recent 'Onset of reaction' date.
   *  Where a textual representation of the date of last occurrence is required e.g 'In Childhood, '10 years ago' the Comment element should be used.
   */
  @Path("/data[at0001]/items[at0117]/value|value")
  private TemporalAccessor onsetOfLastReactionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Onset of last reaction/null_flavour
   */
  @Path("/data[at0001]/items[at0117]/null_flavour|defining_code")
  private NullFlavour onsetOfLastReactionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction mechanism/null_flavour
   */
  @Path("/data[at0001]/items[at0058]/null_flavour|defining_code")
  private NullFlavour reactionMechanismNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Comment
   * Description: Additional narrative about the propensity for the adverse reaction, not captured in other fields.
   * Comment: For example: including reason for flagging a 'Criticality' of 'High risk'; and instructions related to future exposure or administration of the Substance, such as administration within an Intensive Care Unit or under corticosteroid cover.
   */
  @Path("/data[at0001]/items[at0006]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0006]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event
   * Description: Details about each adverse reaction event linked to exposure to the identified 'Substance'.
   */
  @Path("/data[at0001]/items[at0009]")
  private List<AdverseReactionRiskReactionEventCluster> reactionEvent;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Last updated
   * Description: Date when the propensity or the reaction event was updated.
   * Comment: Note: maps to recordedDate in FHIR.
   */
  @Path("/protocol[at0042]/items[at0062]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0042]/items[at0062]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0042]/items[at0128]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Supporting clinical record information
   * Description: Link to further information about the presentation and findings that exist elsewhere in the health record, including allergy test reports.
   * Comment: For example, presenting symptoms, examination findings, diagnosis etc.
   *  [Note: FHIR,DAM: Maps to Sensitivity Test.]
   */
  @Path("/protocol[at0042]/items[at0047]")
  private List<AdverseReactionRiskSupportingClinicalRecordInformationElement> supportingClinicalRecordInformation;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction reported?
   * Description: Has the adverse reaction ever been reported to a regulatory body?
   */
  @Path("/protocol[at0042]/items[at0044]/value|value")
  private Boolean reactionReportedValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction reported?/null_flavour
   */
  @Path("/protocol[at0042]/items[at0044]/null_flavour|defining_code")
  private NullFlavour reactionReportedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Report summary
   * Description: Structured details about reports that have been forwarded to regulatory bodies.
   */
  @Path("/protocol[at0042]/items[at0099]")
  private List<AdverseReactionRiskReportSummaryCluster> reportSummary;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Category
   * Description: Category of the identified 'Substance'.
   * Comment: This data element has been included because it is currently being captured in some clinical systems. This data can be derived from the Substance where coding systems are used, and is effectively redundant in that situation.
   */
  @Path("/data[at0001]/items[at0120]/value")
  @Choice
  private AdverseReactionRiskCategoryChoice category;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction mechanism
   * Description: Identification of the underlying physiological mechanism for the adverse reaction.
   * Comment: Immune-mediated responses have been traditionally regarded as an indicator for escalation of significant future risk. Contemporary knowledge suggests that some reactions previously thought to be immune are actually non-immune and still carry life threatening risk. 
   *
   * Immunological testing may provide supporting evidence for the mechanism and causative substance , but no tests are 100% sensitive or specific for a sensitivity. 
   *
   * It is acknowledged that most clinicians will NOT be able to distinguish the mechanism of any specific reaction. However this data element is included because many legacy systems have captured this attribute.
   */
  @Path("/data[at0001]/items[at0058]/value")
  @Choice
  private AdverseReactionRiskReactionMechanismChoice reactionMechanism;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Status
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
  @Path("/data[at0001]/items[at0063]/value")
  @Choice
  private AdverseReactionRiskStatusChoice status;

  public void setSubstanceValue(String substanceValue) {
     this.substanceValue = substanceValue;
  }

  public String getSubstanceValue() {
     return this.substanceValue ;
  }

  public void setSubstanceNullFlavourDefiningCode(NullFlavour substanceNullFlavourDefiningCode) {
     this.substanceNullFlavourDefiningCode = substanceNullFlavourDefiningCode;
  }

  public NullFlavour getSubstanceNullFlavourDefiningCode() {
     return this.substanceNullFlavourDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
  }

  public void setCriticalityDefiningCode(CriticalityDefiningCode criticalityDefiningCode) {
     this.criticalityDefiningCode = criticalityDefiningCode;
  }

  public CriticalityDefiningCode getCriticalityDefiningCode() {
     return this.criticalityDefiningCode ;
  }

  public void setCriticalityNullFlavourDefiningCode(
      NullFlavour criticalityNullFlavourDefiningCode) {
     this.criticalityNullFlavourDefiningCode = criticalityNullFlavourDefiningCode;
  }

  public NullFlavour getCriticalityNullFlavourDefiningCode() {
     return this.criticalityNullFlavourDefiningCode ;
  }

  public void setCategoryNullFlavourDefiningCode(NullFlavour categoryNullFlavourDefiningCode) {
     this.categoryNullFlavourDefiningCode = categoryNullFlavourDefiningCode;
  }

  public NullFlavour getCategoryNullFlavourDefiningCode() {
     return this.categoryNullFlavourDefiningCode ;
  }

  public void setOnsetOfLastReactionValue(TemporalAccessor onsetOfLastReactionValue) {
     this.onsetOfLastReactionValue = onsetOfLastReactionValue;
  }

  public TemporalAccessor getOnsetOfLastReactionValue() {
     return this.onsetOfLastReactionValue ;
  }

  public void setOnsetOfLastReactionNullFlavourDefiningCode(
      NullFlavour onsetOfLastReactionNullFlavourDefiningCode) {
     this.onsetOfLastReactionNullFlavourDefiningCode = onsetOfLastReactionNullFlavourDefiningCode;
  }

  public NullFlavour getOnsetOfLastReactionNullFlavourDefiningCode() {
     return this.onsetOfLastReactionNullFlavourDefiningCode ;
  }

  public void setReactionMechanismNullFlavourDefiningCode(
      NullFlavour reactionMechanismNullFlavourDefiningCode) {
     this.reactionMechanismNullFlavourDefiningCode = reactionMechanismNullFlavourDefiningCode;
  }

  public NullFlavour getReactionMechanismNullFlavourDefiningCode() {
     return this.reactionMechanismNullFlavourDefiningCode ;
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

  public void setReactionEvent(List<AdverseReactionRiskReactionEventCluster> reactionEvent) {
     this.reactionEvent = reactionEvent;
  }

  public List<AdverseReactionRiskReactionEventCluster> getReactionEvent() {
     return this.reactionEvent ;
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

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSupportingClinicalRecordInformation(
      List<AdverseReactionRiskSupportingClinicalRecordInformationElement> supportingClinicalRecordInformation) {
     this.supportingClinicalRecordInformation = supportingClinicalRecordInformation;
  }

  public List<AdverseReactionRiskSupportingClinicalRecordInformationElement> getSupportingClinicalRecordInformation(
      ) {
     return this.supportingClinicalRecordInformation ;
  }

  public void setReactionReportedValue(Boolean reactionReportedValue) {
     this.reactionReportedValue = reactionReportedValue;
  }

  public Boolean isReactionReportedValue() {
     return this.reactionReportedValue ;
  }

  public void setReactionReportedNullFlavourDefiningCode(
      NullFlavour reactionReportedNullFlavourDefiningCode) {
     this.reactionReportedNullFlavourDefiningCode = reactionReportedNullFlavourDefiningCode;
  }

  public NullFlavour getReactionReportedNullFlavourDefiningCode() {
     return this.reactionReportedNullFlavourDefiningCode ;
  }

  public void setReportSummary(List<AdverseReactionRiskReportSummaryCluster> reportSummary) {
     this.reportSummary = reportSummary;
  }

  public List<AdverseReactionRiskReportSummaryCluster> getReportSummary() {
     return this.reportSummary ;
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

  public void setCategory(AdverseReactionRiskCategoryChoice category) {
     this.category = category;
  }

  public AdverseReactionRiskCategoryChoice getCategory() {
     return this.category ;
  }

  public void setReactionMechanism(AdverseReactionRiskReactionMechanismChoice reactionMechanism) {
     this.reactionMechanism = reactionMechanism;
  }

  public AdverseReactionRiskReactionMechanismChoice getReactionMechanism() {
     return this.reactionMechanism ;
  }

  public void setStatus(AdverseReactionRiskStatusChoice status) {
     this.status = status;
  }

  public AdverseReactionRiskStatusChoice getStatus() {
     return this.status ;
  }
}
