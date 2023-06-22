package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.870846965+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class DiagnosticInvestigationScreeningQuestionnaireAnyEventPointEvent implements PointEventEntity, DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Screening purpose
   * Description: The context or reason for screening.
   * Comment: This data element is intended to provide collection context for the question/answer groups when queried at a later date. It is not expected that this data element will be exposed to the individual, but only stored in data. For example: pre-admission screening, the name of the actual questionnaire or screening for previous investigations.
   */
  @Path("/data[at0001]/items[at0040]/value|value")
  private String screeningPurposeValue;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Screening purpose/null_flavour
   */
  @Path("/data[at0001]/items[at0040]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Any tests?
   * Description: Is there a history of any investigations related to the screening purpose?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("/data[at0001]/items[at0027]")
  private List<DiagnosticInvestigationScreeningQuestionnaireAnyTestsElement> anyTests;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Description
   * Description: Narrative description about the history of administration of any investigations relevant for the screening purpose.
   */
  @Path("/data[at0001]/items[at0043]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Description/null_flavour
   */
  @Path("/data[at0001]/items[at0043]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation
   * Description: Details about a specified investigation or grouping of investigations relevant for the screening purpose.
   * Comment: Use separate instances of this CLUSTER to differentiate between specific investigations or groupings of investigations.
   */
  @Path("/data[at0001]/items[at0026]")
  private List<DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster> specificInvestigation;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Additional details
   * Description: Structured details or questions about investigation screening.
   */
  @Path("/data[at0001]/items[at0042]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setScreeningPurposeValue(String screeningPurposeValue) {
     this.screeningPurposeValue = screeningPurposeValue;
  }

  public String getScreeningPurposeValue() {
     return this.screeningPurposeValue ;
  }

  public void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode) {
     this.screeningPurposeNullFlavourDefiningCode = screeningPurposeNullFlavourDefiningCode;
  }

  public NullFlavour getScreeningPurposeNullFlavourDefiningCode() {
     return this.screeningPurposeNullFlavourDefiningCode ;
  }

  public void setAnyTests(
      List<DiagnosticInvestigationScreeningQuestionnaireAnyTestsElement> anyTests) {
     this.anyTests = anyTests;
  }

  public List<DiagnosticInvestigationScreeningQuestionnaireAnyTestsElement> getAnyTests() {
     return this.anyTests ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setSpecificInvestigation(
      List<DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster> specificInvestigation) {
     this.specificInvestigation = specificInvestigation;
  }

  public List<DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster> getSpecificInvestigation(
      ) {
     return this.specificInvestigation ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }
}
