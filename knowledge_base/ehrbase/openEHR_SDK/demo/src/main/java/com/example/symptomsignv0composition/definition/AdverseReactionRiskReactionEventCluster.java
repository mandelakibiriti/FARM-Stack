package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.756634270+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AdverseReactionRiskReactionEventCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Specific substance
   * Description: Identification of the substance considered to be responsible for the specific adverse reaction event.
   * Comment: For example: 'Amoxycillin'. Only an individual substance is a valid entry in 'Specific substance'. A substance may be a compound of simpler substances, for example a medicinal product. If the value in 'Substance' is an individual substance and not a substance class, then it may be duplicated in this data element. It is strongly recommended that 'Specific substance' be coded with a terminology capable of triggering decision support, where possible.  For example: RxNorm, Snomed CT, DM+D, NDFRT, ICD-9, ICD-10, UNI, ATC and CPT. Free text entry should only be used if there is no appropriate terminology available.
   */
  @Path("/items[at0010]/value|value")
  private String specificSubstanceValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Specific substance/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour specificSubstanceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Certainty
   * Description: Statement about the degree of clinical certainty that the identified 'Specific substance' was the cause of the 'Manifestation' in this reaction event.
   */
  @Path("/items[at0021]/value|defining_code")
  private CertaintyDefiningCode certaintyDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Certainty/null_flavour
   */
  @Path("/items[at0021]/null_flavour|defining_code")
  private NullFlavour certaintyNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Manifestation
   * Description: Clinical symptoms and/or signs that are observed or associated with the adverse reaction.
   * Comment: Manifestation can be expressed as a single word, phrase or brief description. For example: nausea, rash.  'No reaction'may be appropriate where a previous reaction has been noted but the reaction did not re-occur after further exposure. It is preferable that 'Manifestation' should be coded with a terminology, where possible. The values entered here may be used to display on an application screen as part of a list of adverse reactions, as recommended in the UK NHS CUI guidelines.
   *
   *
   *
   * Terminologies commonly used include, but are not limited to, SNOMED-CT or ICD10.
   */
  @Path("/items[at0011]")
  private List<AdverseReactionRiskManifestationElement> manifestation;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Reaction description
   * Description: Narrative description about the adverse reaction as a whole, including details of the manifestation if required.
   */
  @Path("/items[at0012]/value|value")
  private String reactionDescriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Reaction description/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour reactionDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Onset of reaction
   * Description: Record of the date and/or time of the onset of the reaction.
   */
  @Path("/items[at0027]/value|value")
  private TemporalAccessor onsetOfReactionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Onset of reaction/null_flavour
   */
  @Path("/items[at0027]/null_flavour|defining_code")
  private NullFlavour onsetOfReactionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Duration of reaction
   * Description: The total amount of time that the manifestation of the adverse reaction persisted.
   */
  @Path("/items[at0028]/value|value")
  private TemporalAmount durationOfReactionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Duration of reaction/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour durationOfReactionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Severity of reaction/null_flavour
   */
  @Path("/items[at0089]/null_flavour|defining_code")
  private NullFlavour severityOfReactionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Reaction details
   * Description: Additional details about the adverse reaction, including anatomical location and Common Toxicity Criteria, can be provided by inclusion of specific archetypes in this SLOT.
   * Comment: May include structured detail about symptoms; the anatomical location of the manifestation; grading, classification or formal severity assessments such as Common Terminology Criteria for Adverse Events; or the Multimedia CLUSTER archetype. [Note: FHIR - These would be extensions as specified in a profile.]
   */
  @Path("/items[at0029]")
  private List<Cluster> reactionDetails;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Initial exposure
   * Description: Record of the date and/or time of the first exposure to the Substance for this Reaction Event.
   * Comment: Exposure can be more complicated by more than one exposure events leading to a reaction. Further details about the nature of the exposure can be provided by use of additional archetypes in the 'Exposure details' SLOT or as text in the 'Exposure description'.
   */
  @Path("/items[at0020]/value|value")
  private TemporalAccessor initialExposureValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Initial exposure/null_flavour
   */
  @Path("/items[at0020]/null_flavour|defining_code")
  private NullFlavour initialExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Duration of exposure
   * Description: The total amount of time the individual was exposed to the identified 'Specific substance'.
   */
  @Path("/items[at0025]/value|value")
  private TemporalAmount durationOfExposureValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Duration of exposure/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour durationOfExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Route of exposure
   * Description: Identification of the route by which the subject was exposed to the identified 'Specific substance'.
   * Comment: Coding of the Route of Exposure with a terminology should be used wherever possible.
   */
  @Path("/items[at0106]/value|value")
  private String routeOfExposureValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Route of exposure/null_flavour
   */
  @Path("/items[at0106]/null_flavour|defining_code")
  private NullFlavour routeOfExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Exposure description
   * Description: Narrative description about exposure to the identified 'Specific substance'.
   */
  @Path("/items[at0018]/value|value")
  private String exposureDescriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Exposure description/null_flavour
   */
  @Path("/items[at0018]/null_flavour|defining_code")
  private NullFlavour exposureDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Exposure details
   * Description: Additional details about exposure to the 'Specific substance', especially in situations where there may have been multiple or cumulative exposures can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0096]")
  private List<Cluster> exposureDetails;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Clinical management description
   * Description: Narrative description about the clinical management provided.
   */
  @Path("/items[at0040]/value|value")
  private String clinicalManagementDescriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Clinical management description/null_flavour
   */
  @Path("/items[at0040]/null_flavour|defining_code")
  private NullFlavour clinicalManagementDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Clinical management details
   * Description: Additional structured details about clinical management for this reaction event can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0119]")
  private List<Cluster> clinicalManagementDetails;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Reporting details
   * Description: Additional structured details required for reporting to regulatory bodies can be provided by inclusion of specific archetypes in this SLOT.
   */
  @Path("/items[at0041]")
  private List<Cluster> reportingDetails;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Information source
   * Description: Details about the provenance of the information can be provided by inclusion of specific archetypes in this SLOT.
   * Comment: This SLOT is intended to provide details about the source of information for this particular 'Reaction event'. Details about the source of information for the entire 'Adverse reaction risk' should be recorded using the 'Information Provider' reference model attribute.
   */
  @Path("/items[at0116]")
  private List<Cluster> informationSource;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Reaction comment
   * Description: Additional narrative about the adverse reaction event not captured in other fields.
   */
  @Path("/items[at0032]/value|value")
  private String reactionCommentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Reaction event/Reaction comment/null_flavour
   */
  @Path("/items[at0032]/null_flavour|defining_code")
  private NullFlavour reactionCommentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Reaction event/Severity of reaction
   * Description: Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations.
   * Comment: It is acknowledged that this assessment is very subjective. There may be some some specific practice domains where objective scales have been applied.
   *  Objective scales can be included in this model using the 'Reaction details' Cluster.
   */
  @Path("/items[at0089]/value")
  @Choice
  private AdverseReactionRiskSeverityOfReactionChoice severityOfReaction;

  public void setSpecificSubstanceValue(String specificSubstanceValue) {
     this.specificSubstanceValue = specificSubstanceValue;
  }

  public String getSpecificSubstanceValue() {
     return this.specificSubstanceValue ;
  }

  public void setSpecificSubstanceNullFlavourDefiningCode(
      NullFlavour specificSubstanceNullFlavourDefiningCode) {
     this.specificSubstanceNullFlavourDefiningCode = specificSubstanceNullFlavourDefiningCode;
  }

  public NullFlavour getSpecificSubstanceNullFlavourDefiningCode() {
     return this.specificSubstanceNullFlavourDefiningCode ;
  }

  public void setCertaintyDefiningCode(CertaintyDefiningCode certaintyDefiningCode) {
     this.certaintyDefiningCode = certaintyDefiningCode;
  }

  public CertaintyDefiningCode getCertaintyDefiningCode() {
     return this.certaintyDefiningCode ;
  }

  public void setCertaintyNullFlavourDefiningCode(NullFlavour certaintyNullFlavourDefiningCode) {
     this.certaintyNullFlavourDefiningCode = certaintyNullFlavourDefiningCode;
  }

  public NullFlavour getCertaintyNullFlavourDefiningCode() {
     return this.certaintyNullFlavourDefiningCode ;
  }

  public void setManifestation(List<AdverseReactionRiskManifestationElement> manifestation) {
     this.manifestation = manifestation;
  }

  public List<AdverseReactionRiskManifestationElement> getManifestation() {
     return this.manifestation ;
  }

  public void setReactionDescriptionValue(String reactionDescriptionValue) {
     this.reactionDescriptionValue = reactionDescriptionValue;
  }

  public String getReactionDescriptionValue() {
     return this.reactionDescriptionValue ;
  }

  public void setReactionDescriptionNullFlavourDefiningCode(
      NullFlavour reactionDescriptionNullFlavourDefiningCode) {
     this.reactionDescriptionNullFlavourDefiningCode = reactionDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getReactionDescriptionNullFlavourDefiningCode() {
     return this.reactionDescriptionNullFlavourDefiningCode ;
  }

  public void setOnsetOfReactionValue(TemporalAccessor onsetOfReactionValue) {
     this.onsetOfReactionValue = onsetOfReactionValue;
  }

  public TemporalAccessor getOnsetOfReactionValue() {
     return this.onsetOfReactionValue ;
  }

  public void setOnsetOfReactionNullFlavourDefiningCode(
      NullFlavour onsetOfReactionNullFlavourDefiningCode) {
     this.onsetOfReactionNullFlavourDefiningCode = onsetOfReactionNullFlavourDefiningCode;
  }

  public NullFlavour getOnsetOfReactionNullFlavourDefiningCode() {
     return this.onsetOfReactionNullFlavourDefiningCode ;
  }

  public void setDurationOfReactionValue(TemporalAmount durationOfReactionValue) {
     this.durationOfReactionValue = durationOfReactionValue;
  }

  public TemporalAmount getDurationOfReactionValue() {
     return this.durationOfReactionValue ;
  }

  public void setDurationOfReactionNullFlavourDefiningCode(
      NullFlavour durationOfReactionNullFlavourDefiningCode) {
     this.durationOfReactionNullFlavourDefiningCode = durationOfReactionNullFlavourDefiningCode;
  }

  public NullFlavour getDurationOfReactionNullFlavourDefiningCode() {
     return this.durationOfReactionNullFlavourDefiningCode ;
  }

  public void setSeverityOfReactionNullFlavourDefiningCode(
      NullFlavour severityOfReactionNullFlavourDefiningCode) {
     this.severityOfReactionNullFlavourDefiningCode = severityOfReactionNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityOfReactionNullFlavourDefiningCode() {
     return this.severityOfReactionNullFlavourDefiningCode ;
  }

  public void setReactionDetails(List<Cluster> reactionDetails) {
     this.reactionDetails = reactionDetails;
  }

  public List<Cluster> getReactionDetails() {
     return this.reactionDetails ;
  }

  public void setInitialExposureValue(TemporalAccessor initialExposureValue) {
     this.initialExposureValue = initialExposureValue;
  }

  public TemporalAccessor getInitialExposureValue() {
     return this.initialExposureValue ;
  }

  public void setInitialExposureNullFlavourDefiningCode(
      NullFlavour initialExposureNullFlavourDefiningCode) {
     this.initialExposureNullFlavourDefiningCode = initialExposureNullFlavourDefiningCode;
  }

  public NullFlavour getInitialExposureNullFlavourDefiningCode() {
     return this.initialExposureNullFlavourDefiningCode ;
  }

  public void setDurationOfExposureValue(TemporalAmount durationOfExposureValue) {
     this.durationOfExposureValue = durationOfExposureValue;
  }

  public TemporalAmount getDurationOfExposureValue() {
     return this.durationOfExposureValue ;
  }

  public void setDurationOfExposureNullFlavourDefiningCode(
      NullFlavour durationOfExposureNullFlavourDefiningCode) {
     this.durationOfExposureNullFlavourDefiningCode = durationOfExposureNullFlavourDefiningCode;
  }

  public NullFlavour getDurationOfExposureNullFlavourDefiningCode() {
     return this.durationOfExposureNullFlavourDefiningCode ;
  }

  public void setRouteOfExposureValue(String routeOfExposureValue) {
     this.routeOfExposureValue = routeOfExposureValue;
  }

  public String getRouteOfExposureValue() {
     return this.routeOfExposureValue ;
  }

  public void setRouteOfExposureNullFlavourDefiningCode(
      NullFlavour routeOfExposureNullFlavourDefiningCode) {
     this.routeOfExposureNullFlavourDefiningCode = routeOfExposureNullFlavourDefiningCode;
  }

  public NullFlavour getRouteOfExposureNullFlavourDefiningCode() {
     return this.routeOfExposureNullFlavourDefiningCode ;
  }

  public void setExposureDescriptionValue(String exposureDescriptionValue) {
     this.exposureDescriptionValue = exposureDescriptionValue;
  }

  public String getExposureDescriptionValue() {
     return this.exposureDescriptionValue ;
  }

  public void setExposureDescriptionNullFlavourDefiningCode(
      NullFlavour exposureDescriptionNullFlavourDefiningCode) {
     this.exposureDescriptionNullFlavourDefiningCode = exposureDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getExposureDescriptionNullFlavourDefiningCode() {
     return this.exposureDescriptionNullFlavourDefiningCode ;
  }

  public void setExposureDetails(List<Cluster> exposureDetails) {
     this.exposureDetails = exposureDetails;
  }

  public List<Cluster> getExposureDetails() {
     return this.exposureDetails ;
  }

  public void setClinicalManagementDescriptionValue(String clinicalManagementDescriptionValue) {
     this.clinicalManagementDescriptionValue = clinicalManagementDescriptionValue;
  }

  public String getClinicalManagementDescriptionValue() {
     return this.clinicalManagementDescriptionValue ;
  }

  public void setClinicalManagementDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalManagementDescriptionNullFlavourDefiningCode) {
     this.clinicalManagementDescriptionNullFlavourDefiningCode = clinicalManagementDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getClinicalManagementDescriptionNullFlavourDefiningCode() {
     return this.clinicalManagementDescriptionNullFlavourDefiningCode ;
  }

  public void setClinicalManagementDetails(List<Cluster> clinicalManagementDetails) {
     this.clinicalManagementDetails = clinicalManagementDetails;
  }

  public List<Cluster> getClinicalManagementDetails() {
     return this.clinicalManagementDetails ;
  }

  public void setReportingDetails(List<Cluster> reportingDetails) {
     this.reportingDetails = reportingDetails;
  }

  public List<Cluster> getReportingDetails() {
     return this.reportingDetails ;
  }

  public void setInformationSource(List<Cluster> informationSource) {
     this.informationSource = informationSource;
  }

  public List<Cluster> getInformationSource() {
     return this.informationSource ;
  }

  public void setReactionCommentValue(String reactionCommentValue) {
     this.reactionCommentValue = reactionCommentValue;
  }

  public String getReactionCommentValue() {
     return this.reactionCommentValue ;
  }

  public void setReactionCommentNullFlavourDefiningCode(
      NullFlavour reactionCommentNullFlavourDefiningCode) {
     this.reactionCommentNullFlavourDefiningCode = reactionCommentNullFlavourDefiningCode;
  }

  public NullFlavour getReactionCommentNullFlavourDefiningCode() {
     return this.reactionCommentNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setSeverityOfReaction(
      AdverseReactionRiskSeverityOfReactionChoice severityOfReaction) {
     this.severityOfReaction = severityOfReaction;
  }

  public AdverseReactionRiskSeverityOfReactionChoice getSeverityOfReaction() {
     return this.severityOfReaction ;
  }
}
