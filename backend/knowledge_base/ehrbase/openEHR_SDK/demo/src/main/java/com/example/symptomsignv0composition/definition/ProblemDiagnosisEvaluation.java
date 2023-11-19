package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
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
@Archetype("openEHR-EHR-EVALUATION.problem_diagnosis.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.668248704+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProblemDiagnosisEvaluation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis name
   * Description: Identification of the problem or diagnosis, by name.
   * Comment: Coding of the name of the problem or diagnosis with a terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0002]/value|value")
  private String problemDiagnosisNameValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Problem/Diagnosis name/null_flavour
   */
  @Path("/data[at0001]/items[at0002]/null_flavour|defining_code")
  private NullFlavour problemDiagnosisNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Clinical description
   * Description: Narrative description about the problem or diagnosis.
   * Comment: Use to provide background and context, including evolution, episodes or exacerbations, progress and any other relevant details, about the problem or diagnosis.
   */
  @Path("/data[at0001]/items[at0009]/value|value")
  private String clinicalDescriptionValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Clinical description/null_flavour
   */
  @Path("/data[at0001]/items[at0009]/null_flavour|defining_code")
  private NullFlavour clinicalDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Body site
   * Description: Identification of a simple body site for the location of the problem or diagnosis.
   * Comment: Coding of the name of the anatomical location with a terminology is preferred, where possible.
   * Use this data element to record precoordinated anatomical locations. If the requirements for recording the anatomical location are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the 'Structured anatomical location' SLOT in this archetype. Occurrences for this data element are unbounded to allow for clinical scenarios such as describing a rash in multiple locations but where all of the other attributes are identical. If the anatomical location is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant.
   */
  @Path("/data[at0001]/items[at0012]")
  private List<ProblemDiagnosisBodySiteElement> bodySite;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Anatomical location
   * Description: A physical site on or within the human body.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.anatomical_location.v1]")
  private AnatomicalLocationCluster anatomicalLocation;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Cause
   * Description: A cause, set of causes, or manner of causation of the problem or diagnosis.
   * Comment: Also known as 'aetiology' or 'etiology'. Coding with an external terminology is preferred, where possible.
   */
  @Path("/data[at0001]/items[at0078]")
  private List<ProblemDiagnosisCauseElement> cause;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Date/time of onset
   * Description: Estimated or actual date/time that signs or symptoms of the problem/diagnosis were first observed.
   * Comment: Data captured/imported as "Age at onset" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0077]/value|value")
  private TemporalAccessor dateTimeOfOnsetValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Date/time of onset/null_flavour
   */
  @Path("/data[at0001]/items[at0077]/null_flavour|defining_code")
  private NullFlavour dateTimeOfOnsetNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Date/time clinically recognised
   * Description: Estimated or actual date/time the diagnosis or problem was recognised by a healthcare professional.
   * Comment: Partial dates are acceptable. If the subject of care is under the age of one year, then the complete date or a minimum of the month and year is necessary to enable accurate age calculations - for example, if used to drive decision support. Data captured/imported as "Age at time of clinical recognition" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0003]/value|value")
  private TemporalAccessor dateTimeClinicallyRecognisedValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Date/time clinically recognised/null_flavour
   */
  @Path("/data[at0001]/items[at0003]/null_flavour|defining_code")
  private NullFlavour dateTimeClinicallyRecognisedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Severity/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour severityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Specific details
   * Description: Details that are additionally required to record as unique attributes of this problem or diagnosis.
   * Comment: May include structured detail about the grading or staging of the diagnosis; diagnostic criteria, classification criteria or formal severity assessments such as Common Terminology Criteria for Adverse Events.
   */
  @Path("/data[at0001]/items[at0043]")
  private List<Cluster> specificDetails;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Course description
   * Description: Narrative description about the course of the problem or diagnosis since onset.
   */
  @Path("/data[at0001]/items[at0072]/value|value")
  private String courseDescriptionValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Course description/null_flavour
   */
  @Path("/data[at0001]/items[at0072]/null_flavour|defining_code")
  private NullFlavour courseDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Date/time of resolution
   * Description: Estimated or actual date/time of resolution or remission for this problem or diagnosis, as determined by a healthcare professional.
   * Comment: Partial dates are acceptable. If the subject of care is under the age of one year, then the complete date or a minimum of the month and year is necessary to enable accurate age calculations - for example, if used to drive decision support. Data captured/imported as "Age at time of resolution" should be converted to a date using the subject's date of birth.
   */
  @Path("/data[at0001]/items[at0030]/value|value")
  private TemporalAccessor dateTimeOfResolutionValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Date/time of resolution/null_flavour
   */
  @Path("/data[at0001]/items[at0030]/null_flavour|defining_code")
  private NullFlavour dateTimeOfResolutionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier
   * Description: Contextual or temporal qualifier for a specified problem or diagnosis.
   */
  @Path("/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v2]")
  private ProblemDiagnosisQualifierCluster problemDiagnosisQualifier;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Diagnostic certainty/null_flavour
   */
  @Path("/data[at0001]/items[at0073]/null_flavour|defining_code")
  private NullFlavour diagnosticCertaintyNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Comment
   * Description: Additional narrative about the problem or diagnosis not captured in other fields.
   */
  @Path("/data[at0001]/items[at0069]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/structure/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0069]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Last updated
   * Description: The date this problem or diagnosis was last updated.
   */
  @Path("/protocol[at0032]/items[at0070]/value|value")
  private TemporalAccessor lastUpdatedValue;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Tree/Last updated/null_flavour
   */
  @Path("/protocol[at0032]/items[at0070]/null_flavour|defining_code")
  private NullFlavour lastUpdatedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0032]/items[at0071]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Diagnostic certainty
   * Description: The level of confidence in the identification of the diagnosis.
   * Comment: If an alternative valueset is required, these values can be added to the DV_TEXT data type in a template.
   */
  @Path("/data[at0001]/items[at0073]/value")
  @Choice
  private ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   * Comment: If severity is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant. Note: more specific grading of severity can be recorded using the Specific details SLOT.
   */
  @Path("/data[at0001]/items[at0005]/value")
  @Choice
  private ProblemDiagnosisSeverityChoice severity;

  public void setProblemDiagnosisNameValue(String problemDiagnosisNameValue) {
     this.problemDiagnosisNameValue = problemDiagnosisNameValue;
  }

  public String getProblemDiagnosisNameValue() {
     return this.problemDiagnosisNameValue ;
  }

  public void setProblemDiagnosisNameNullFlavourDefiningCode(
      NullFlavour problemDiagnosisNameNullFlavourDefiningCode) {
     this.problemDiagnosisNameNullFlavourDefiningCode = problemDiagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getProblemDiagnosisNameNullFlavourDefiningCode() {
     return this.problemDiagnosisNameNullFlavourDefiningCode ;
  }

  public void setClinicalDescriptionValue(String clinicalDescriptionValue) {
     this.clinicalDescriptionValue = clinicalDescriptionValue;
  }

  public String getClinicalDescriptionValue() {
     return this.clinicalDescriptionValue ;
  }

  public void setClinicalDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalDescriptionNullFlavourDefiningCode) {
     this.clinicalDescriptionNullFlavourDefiningCode = clinicalDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getClinicalDescriptionNullFlavourDefiningCode() {
     return this.clinicalDescriptionNullFlavourDefiningCode ;
  }

  public void setBodySite(List<ProblemDiagnosisBodySiteElement> bodySite) {
     this.bodySite = bodySite;
  }

  public List<ProblemDiagnosisBodySiteElement> getBodySite() {
     return this.bodySite ;
  }

  public void setAnatomicalLocation(AnatomicalLocationCluster anatomicalLocation) {
     this.anatomicalLocation = anatomicalLocation;
  }

  public AnatomicalLocationCluster getAnatomicalLocation() {
     return this.anatomicalLocation ;
  }

  public void setCause(List<ProblemDiagnosisCauseElement> cause) {
     this.cause = cause;
  }

  public List<ProblemDiagnosisCauseElement> getCause() {
     return this.cause ;
  }

  public void setDateTimeOfOnsetValue(TemporalAccessor dateTimeOfOnsetValue) {
     this.dateTimeOfOnsetValue = dateTimeOfOnsetValue;
  }

  public TemporalAccessor getDateTimeOfOnsetValue() {
     return this.dateTimeOfOnsetValue ;
  }

  public void setDateTimeOfOnsetNullFlavourDefiningCode(
      NullFlavour dateTimeOfOnsetNullFlavourDefiningCode) {
     this.dateTimeOfOnsetNullFlavourDefiningCode = dateTimeOfOnsetNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeOfOnsetNullFlavourDefiningCode() {
     return this.dateTimeOfOnsetNullFlavourDefiningCode ;
  }

  public void setDateTimeClinicallyRecognisedValue(
      TemporalAccessor dateTimeClinicallyRecognisedValue) {
     this.dateTimeClinicallyRecognisedValue = dateTimeClinicallyRecognisedValue;
  }

  public TemporalAccessor getDateTimeClinicallyRecognisedValue() {
     return this.dateTimeClinicallyRecognisedValue ;
  }

  public void setDateTimeClinicallyRecognisedNullFlavourDefiningCode(
      NullFlavour dateTimeClinicallyRecognisedNullFlavourDefiningCode) {
     this.dateTimeClinicallyRecognisedNullFlavourDefiningCode = dateTimeClinicallyRecognisedNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeClinicallyRecognisedNullFlavourDefiningCode() {
     return this.dateTimeClinicallyRecognisedNullFlavourDefiningCode ;
  }

  public void setSeverityNullFlavourDefiningCode(NullFlavour severityNullFlavourDefiningCode) {
     this.severityNullFlavourDefiningCode = severityNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityNullFlavourDefiningCode() {
     return this.severityNullFlavourDefiningCode ;
  }

  public void setSpecificDetails(List<Cluster> specificDetails) {
     this.specificDetails = specificDetails;
  }

  public List<Cluster> getSpecificDetails() {
     return this.specificDetails ;
  }

  public void setCourseDescriptionValue(String courseDescriptionValue) {
     this.courseDescriptionValue = courseDescriptionValue;
  }

  public String getCourseDescriptionValue() {
     return this.courseDescriptionValue ;
  }

  public void setCourseDescriptionNullFlavourDefiningCode(
      NullFlavour courseDescriptionNullFlavourDefiningCode) {
     this.courseDescriptionNullFlavourDefiningCode = courseDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getCourseDescriptionNullFlavourDefiningCode() {
     return this.courseDescriptionNullFlavourDefiningCode ;
  }

  public void setDateTimeOfResolutionValue(TemporalAccessor dateTimeOfResolutionValue) {
     this.dateTimeOfResolutionValue = dateTimeOfResolutionValue;
  }

  public TemporalAccessor getDateTimeOfResolutionValue() {
     return this.dateTimeOfResolutionValue ;
  }

  public void setDateTimeOfResolutionNullFlavourDefiningCode(
      NullFlavour dateTimeOfResolutionNullFlavourDefiningCode) {
     this.dateTimeOfResolutionNullFlavourDefiningCode = dateTimeOfResolutionNullFlavourDefiningCode;
  }

  public NullFlavour getDateTimeOfResolutionNullFlavourDefiningCode() {
     return this.dateTimeOfResolutionNullFlavourDefiningCode ;
  }

  public void setProblemDiagnosisQualifier(
      ProblemDiagnosisQualifierCluster problemDiagnosisQualifier) {
     this.problemDiagnosisQualifier = problemDiagnosisQualifier;
  }

  public ProblemDiagnosisQualifierCluster getProblemDiagnosisQualifier() {
     return this.problemDiagnosisQualifier ;
  }

  public void setDiagnosticCertaintyNullFlavourDefiningCode(
      NullFlavour diagnosticCertaintyNullFlavourDefiningCode) {
     this.diagnosticCertaintyNullFlavourDefiningCode = diagnosticCertaintyNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosticCertaintyNullFlavourDefiningCode() {
     return this.diagnosticCertaintyNullFlavourDefiningCode ;
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

  public void setDiagnosticCertainty(
      ProblemDiagnosisDiagnosticCertaintyChoice diagnosticCertainty) {
     this.diagnosticCertainty = diagnosticCertainty;
  }

  public ProblemDiagnosisDiagnosticCertaintyChoice getDiagnosticCertainty() {
     return this.diagnosticCertainty ;
  }

  public void setSeverity(ProblemDiagnosisSeverityChoice severity) {
     this.severity = severity;
  }

  public ProblemDiagnosisSeverityChoice getSeverity() {
     return this.severity ;
  }
}
