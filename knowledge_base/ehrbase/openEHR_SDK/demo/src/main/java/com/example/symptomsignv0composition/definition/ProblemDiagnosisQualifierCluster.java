package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.problem_qualifier.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.693186460+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProblemDiagnosisQualifierCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Diagnostic status/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour diagnosticStatusNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Current/Past?
   * Description: Category that supports division of problems and diagnoses into Current or Past problem lists.
   * Comment: The Current/Past and Active/Inactive data elements have similar clinical impact but represent slightly different semantics. Both are actively used in different clinical settings, but usually not together. If an Active/Inactive qualifier is recorded, then this data element is likely to be redundant. An exception where a condition can be current but inactive is asthma that is not causing acute symptoms.
   */
  @Path("/items[at0060]/value|defining_code")
  private CurrentPastDefiningCode currentPastDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Current/Past?/null_flavour
   */
  @Path("/items[at0060]/null_flavour|defining_code")
  private NullFlavour currentPastNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Active/Inactive?
   * Description: Category that supports division of problems and diagnoses into Active or Inactive problem lists.
   * Comment: The Active/Inactive and Current/Past data elements have similar clinical impact but represent slightly different semantics. Both are actively used in different clinical settings, but usually not together. If a Current/Past qualifier is recorded, then this data element is likely to be redundant. An exception where a condition can be current but inactive is asthma that is not causing acute symptoms.
   */
  @Path("/items[at0003]/value|defining_code")
  private ActiveInactiveDefiningCode activeInactiveDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Active/Inactive?/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour activeInactiveNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Level of control/null_flavour
   */
  @Path("/items[at0098]/null_flavour|defining_code")
  private NullFlavour levelOfControlNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Progression/null_flavour
   */
  @Path("/items[at0102]/null_flavour|defining_code")
  private NullFlavour progressionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Resolution phase/null_flavour
   */
  @Path("/items[at0083]/null_flavour|defining_code")
  private NullFlavour resolutionPhaseNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Remission status/null_flavour
   */
  @Path("/items[at0089]/null_flavour|defining_code")
  private NullFlavour remissionStatusNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Episodicity/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour episodicityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Reason for an ongoing episode
   * Description: Reason for a problem or diagnosis not resolving as expected.
   * Comment: For example: incomplete or failed treatment.
   */
  @Path("/items[at0107]")
  private List<ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement> reasonForAnOngoingEpisode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Occurrence/null_flavour
   */
  @Path("/items[at0071]/null_flavour|defining_code")
  private NullFlavour occurrenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Course label/null_flavour
   */
  @Path("/items[at0077]/null_flavour|defining_code")
  private NullFlavour courseLabelNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Diagnostic category
   * Description: Category of the problem or diagnosis within a specified episode of care and/or local care context.
   * Comment: This data element contains a value set commonly used in diagnostic categorisation. In episodic care contexts (commonly secondary care) it is common to categorise/organise diagnoses according to their relationship to the principal diagnosis being addressed during that episode of care. These categories may also be used for clinical coding, reporting and billing purposes. In some countries the diagnostic category may be known as a DRG.
   *  In addition, the free text choice permits use of other local value sets, as required.
   */
  @Path("/items[at0063]")
  private List<ProblemDiagnosisQualifierDiagnosticCategoryElement> diagnosticCategory;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Admission diagnosis?/null_flavour
   */
  @Path("/items[at0073]/null_flavour|defining_code")
  private NullFlavour admissionDiagnosisNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Comment
   * Description: Additional narrative about the Problem/Diagnosis qualifier values, not captured in other fields.
   */
  @Path("/items[at0110]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis qualifier/Comment/null_flavour
   */
  @Path("/items[at0110]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Admission diagnosis?
   * Description: Was the problem or diagnosis present at admission?
   * Comment: Record as True or 'Yes' if the problem or diagnosis was present on admission. This data element is a requirement from DRG reporting in some countries.
   */
  @Path("/items[at0073]/value")
  @Choice
  private ProblemDiagnosisQualifierAdmissionDiagnosisChoice admissionDiagnosis;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Progression
   * Description: Category of the progression through the course of a chronic problem or diagnosis.
   */
  @Path("/items[at0102]/value")
  @Choice
  private ProblemDiagnosisQualifierProgressionChoice progression;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Occurrence
   * Description: Category of the occurrence for this problem or diagnosis.
   * Comment: This data element can be an additional qualifier to the 'New' value in the 'Episodicity' value set, that is a condition such as asthma can have recurring new episodes that have periods of resolution in between. However it can be important to identify the first ever episode of asthma from all of the other episodes.
   */
  @Path("/items[at0071]/value")
  @Choice
  private ProblemDiagnosisQualifierOccurrenceChoice occurrence;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Level of control
   * Description: Category of the level of control of the problem or diagnosis by the current management.
   */
  @Path("/items[at0098]/value")
  @Choice
  private ProblemDiagnosisQualifierLevelOfControlChoice levelOfControl;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Course label
   * Description: Category reflecting the speed of onset and/or duration and persistence of the problem or diagnosis.
   * Comment: Definitions of acute vs chronic will differ for each diagnosis.
   */
  @Path("/items[at0077]/value")
  @Choice
  private ProblemDiagnosisQualifierCourseLabelChoice courseLabel;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Episodicity
   * Description: Category of this episode for the identified problem/diagnosis.
   * Comment: For example: 'New' will enable clinicians to distinguish a new, acute episode of otitis media that may have arisen soon after a previous diagnosis, to distinguish it from an unresolved or 'Ongoing' diagnosis of chronic otitis media. Treatment of recurring, new and acute, episodes of a condition may differ significantly from the same condition that is not resolving or responding to treatment. In many situations the clinician will not be able to tell, and so indeterminate may be appropriate.
   */
  @Path("/items[at0001]/value")
  @Choice
  private ProblemDiagnosisQualifierEpisodicityChoice episodicity;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Diagnostic status
   * Description: Stage or phase of diagnostic process.
   * Comment: The status is usually determined by a combination of the timing of diagnosis plus level of clinical certainty resulting from diagnostic tests and clinical evidence available. This data element and 'Diagnostic certainty' in EVALUATION.problem_diagnosis are two important axes of the diagnostic process, and valid combinations will need to be presented by software that exposes both data elements, so it is not possible for users to select conflicting combinations. 
   * Preliminary or working diagnoses are intended to represent the single most likely choice out of all differential diagnosis options.
   */
  @Path("/items[at0004]/value")
  @Choice
  private ProblemDiagnosisQualifierDiagnosticStatusChoice diagnosticStatus;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Resolution phase
   * Description: Phase of healing for an acute problem or diagnosis.
   * Comment: For example: tracking the progress of resolution of a middle ear infection.
   */
  @Path("/items[at0083]/value")
  @Choice
  private ProblemDiagnosisQualifierResolutionPhaseChoice resolutionPhase;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Remission status
   * Description: Status of the remission of an incurable diagnosis.
   * Comment: For example: the status of a cancer or haematological diagnosis.
   */
  @Path("/items[at0089]/value")
  @Choice
  private ProblemDiagnosisQualifierRemissionStatusChoice remissionStatus;

  public void setDiagnosticStatusNullFlavourDefiningCode(
      NullFlavour diagnosticStatusNullFlavourDefiningCode) {
     this.diagnosticStatusNullFlavourDefiningCode = diagnosticStatusNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticStatusNullFlavourDefiningCode() {
     return this.diagnosticStatusNullFlavourDefiningCode ;
  }

  public void setCurrentPastDefiningCode(CurrentPastDefiningCode currentPastDefiningCode) {
     this.currentPastDefiningCode = currentPastDefiningCode;
  }

  public CurrentPastDefiningCode getCurrentPastDefiningCode() {
     return this.currentPastDefiningCode ;
  }

  public void setCurrentPastNullFlavourDefiningCode(
      NullFlavour currentPastNullFlavourDefiningCode) {
     this.currentPastNullFlavourDefiningCode = currentPastNullFlavourDefiningCode;
  }

  public NullFlavour getCurrentPastNullFlavourDefiningCode() {
     return this.currentPastNullFlavourDefiningCode ;
  }

  public void setActiveInactiveDefiningCode(ActiveInactiveDefiningCode activeInactiveDefiningCode) {
     this.activeInactiveDefiningCode = activeInactiveDefiningCode;
  }

  public ActiveInactiveDefiningCode getActiveInactiveDefiningCode() {
     return this.activeInactiveDefiningCode ;
  }

  public void setActiveInactiveNullFlavourDefiningCode(
      NullFlavour activeInactiveNullFlavourDefiningCode) {
     this.activeInactiveNullFlavourDefiningCode = activeInactiveNullFlavourDefiningCode;
  }

  public NullFlavour getActiveInactiveNullFlavourDefiningCode() {
     return this.activeInactiveNullFlavourDefiningCode ;
  }

  public void setLevelOfControlNullFlavourDefiningCode(
      NullFlavour levelOfControlNullFlavourDefiningCode) {
     this.levelOfControlNullFlavourDefiningCode = levelOfControlNullFlavourDefiningCode;
  }

  public NullFlavour getLevelOfControlNullFlavourDefiningCode() {
     return this.levelOfControlNullFlavourDefiningCode ;
  }

  public void setProgressionNullFlavourDefiningCode(
      NullFlavour progressionNullFlavourDefiningCode) {
     this.progressionNullFlavourDefiningCode = progressionNullFlavourDefiningCode;
  }

  public NullFlavour getProgressionNullFlavourDefiningCode() {
     return this.progressionNullFlavourDefiningCode ;
  }

  public void setResolutionPhaseNullFlavourDefiningCode(
      NullFlavour resolutionPhaseNullFlavourDefiningCode) {
     this.resolutionPhaseNullFlavourDefiningCode = resolutionPhaseNullFlavourDefiningCode;
  }

  public NullFlavour getResolutionPhaseNullFlavourDefiningCode() {
     return this.resolutionPhaseNullFlavourDefiningCode ;
  }

  public void setRemissionStatusNullFlavourDefiningCode(
      NullFlavour remissionStatusNullFlavourDefiningCode) {
     this.remissionStatusNullFlavourDefiningCode = remissionStatusNullFlavourDefiningCode;
  }

  public NullFlavour getRemissionStatusNullFlavourDefiningCode() {
     return this.remissionStatusNullFlavourDefiningCode ;
  }

  public void setEpisodicityNullFlavourDefiningCode(
      NullFlavour episodicityNullFlavourDefiningCode) {
     this.episodicityNullFlavourDefiningCode = episodicityNullFlavourDefiningCode;
  }

  public NullFlavour getEpisodicityNullFlavourDefiningCode() {
     return this.episodicityNullFlavourDefiningCode ;
  }

  public void setReasonForAnOngoingEpisode(
      List<ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement> reasonForAnOngoingEpisode) {
     this.reasonForAnOngoingEpisode = reasonForAnOngoingEpisode;
  }

  public List<ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement> getReasonForAnOngoingEpisode(
      ) {
     return this.reasonForAnOngoingEpisode ;
  }

  public void setOccurrenceNullFlavourDefiningCode(NullFlavour occurrenceNullFlavourDefiningCode) {
     this.occurrenceNullFlavourDefiningCode = occurrenceNullFlavourDefiningCode;
  }

  public NullFlavour getOccurrenceNullFlavourDefiningCode() {
     return this.occurrenceNullFlavourDefiningCode ;
  }

  public void setCourseLabelNullFlavourDefiningCode(
      NullFlavour courseLabelNullFlavourDefiningCode) {
     this.courseLabelNullFlavourDefiningCode = courseLabelNullFlavourDefiningCode;
  }

  public NullFlavour getCourseLabelNullFlavourDefiningCode() {
     return this.courseLabelNullFlavourDefiningCode ;
  }

  public void setDiagnosticCategory(
      List<ProblemDiagnosisQualifierDiagnosticCategoryElement> diagnosticCategory) {
     this.diagnosticCategory = diagnosticCategory;
  }

  public List<ProblemDiagnosisQualifierDiagnosticCategoryElement> getDiagnosticCategory() {
     return this.diagnosticCategory ;
  }

  public void setAdmissionDiagnosisNullFlavourDefiningCode(
      NullFlavour admissionDiagnosisNullFlavourDefiningCode) {
     this.admissionDiagnosisNullFlavourDefiningCode = admissionDiagnosisNullFlavourDefiningCode;
  }

  public NullFlavour getAdmissionDiagnosisNullFlavourDefiningCode() {
     return this.admissionDiagnosisNullFlavourDefiningCode ;
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

  public void setAdmissionDiagnosis(
      ProblemDiagnosisQualifierAdmissionDiagnosisChoice admissionDiagnosis) {
     this.admissionDiagnosis = admissionDiagnosis;
  }

  public ProblemDiagnosisQualifierAdmissionDiagnosisChoice getAdmissionDiagnosis() {
     return this.admissionDiagnosis ;
  }

  public void setProgression(ProblemDiagnosisQualifierProgressionChoice progression) {
     this.progression = progression;
  }

  public ProblemDiagnosisQualifierProgressionChoice getProgression() {
     return this.progression ;
  }

  public void setOccurrence(ProblemDiagnosisQualifierOccurrenceChoice occurrence) {
     this.occurrence = occurrence;
  }

  public ProblemDiagnosisQualifierOccurrenceChoice getOccurrence() {
     return this.occurrence ;
  }

  public void setLevelOfControl(ProblemDiagnosisQualifierLevelOfControlChoice levelOfControl) {
     this.levelOfControl = levelOfControl;
  }

  public ProblemDiagnosisQualifierLevelOfControlChoice getLevelOfControl() {
     return this.levelOfControl ;
  }

  public void setCourseLabel(ProblemDiagnosisQualifierCourseLabelChoice courseLabel) {
     this.courseLabel = courseLabel;
  }

  public ProblemDiagnosisQualifierCourseLabelChoice getCourseLabel() {
     return this.courseLabel ;
  }

  public void setEpisodicity(ProblemDiagnosisQualifierEpisodicityChoice episodicity) {
     this.episodicity = episodicity;
  }

  public ProblemDiagnosisQualifierEpisodicityChoice getEpisodicity() {
     return this.episodicity ;
  }

  public void setDiagnosticStatus(
      ProblemDiagnosisQualifierDiagnosticStatusChoice diagnosticStatus) {
     this.diagnosticStatus = diagnosticStatus;
  }

  public ProblemDiagnosisQualifierDiagnosticStatusChoice getDiagnosticStatus() {
     return this.diagnosticStatus ;
  }

  public void setResolutionPhase(ProblemDiagnosisQualifierResolutionPhaseChoice resolutionPhase) {
     this.resolutionPhase = resolutionPhase;
  }

  public ProblemDiagnosisQualifierResolutionPhaseChoice getResolutionPhase() {
     return this.resolutionPhase ;
  }

  public void setRemissionStatus(ProblemDiagnosisQualifierRemissionStatusChoice remissionStatus) {
     this.remissionStatus = remissionStatus;
  }

  public ProblemDiagnosisQualifierRemissionStatusChoice getRemissionStatus() {
     return this.remissionStatus ;
  }
}
