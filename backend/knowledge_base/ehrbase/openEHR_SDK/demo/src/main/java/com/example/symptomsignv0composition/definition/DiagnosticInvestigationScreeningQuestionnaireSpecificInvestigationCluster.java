package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
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
    date = "2023-06-19T20:52:30.866613086+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Test name
   * Description: Name of the imaging examination or laboratory test or grouping.
   * Comment: For example: 'Urea and electrolytes', or 'HIV screening panel'.
   * Coding of the 'Investigation name' with a terminology is preferred, where possible.
   */
  @Path("/items[at0021]/value|value")
  private String testNameValue;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Specific investigation/Test name/null_flavour
   */
  @Path("/items[at0021]/null_flavour|defining_code")
  private NullFlavour testNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Specific investigation/Carried out?/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour carriedOutNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Specific investigation/Date/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour dateNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Result
   * Description: The test result or findings of the screening investigation.
   * Comment: For example: positive/negative.
   */
  @Path("/items[at0002]")
  private List<DiagnosticInvestigationScreeningQuestionnaireResultElement> result;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Additional details
   * Description: Structured details or questions about the specific investigation or grouping of investigations.
   */
  @Path("/items[at0041]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Comment
   */
  @Path("/items[at0025]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Tree/Specific investigation/Comment/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Date
   * Description: The date and/or time of the most recent test.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("/items[at0003]/value")
  @Choice
  private DiagnosticInvestigationScreeningQuestionnaireDateChoice date;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event/Specific investigation/Carried out?
   * Description: Is there a history of the investigation being carried out?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("/items[at0024]/value")
  @Choice
  private DiagnosticInvestigationScreeningQuestionnaireCarriedOutChoice carriedOut;

  public void setTestNameValue(String testNameValue) {
     this.testNameValue = testNameValue;
  }

  public String getTestNameValue() {
     return this.testNameValue ;
  }

  public void setTestNameNullFlavourDefiningCode(NullFlavour testNameNullFlavourDefiningCode) {
     this.testNameNullFlavourDefiningCode = testNameNullFlavourDefiningCode;
  }

  public NullFlavour getTestNameNullFlavourDefiningCode() {
     return this.testNameNullFlavourDefiningCode ;
  }

  public void setCarriedOutNullFlavourDefiningCode(NullFlavour carriedOutNullFlavourDefiningCode) {
     this.carriedOutNullFlavourDefiningCode = carriedOutNullFlavourDefiningCode;
  }

  public NullFlavour getCarriedOutNullFlavourDefiningCode() {
     return this.carriedOutNullFlavourDefiningCode ;
  }

  public void setDateNullFlavourDefiningCode(NullFlavour dateNullFlavourDefiningCode) {
     this.dateNullFlavourDefiningCode = dateNullFlavourDefiningCode;
  }

  public NullFlavour getDateNullFlavourDefiningCode() {
     return this.dateNullFlavourDefiningCode ;
  }

  public void setResult(List<DiagnosticInvestigationScreeningQuestionnaireResultElement> result) {
     this.result = result;
  }

  public List<DiagnosticInvestigationScreeningQuestionnaireResultElement> getResult() {
     return this.result ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
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

  public void setDate(DiagnosticInvestigationScreeningQuestionnaireDateChoice date) {
     this.date = date;
  }

  public DiagnosticInvestigationScreeningQuestionnaireDateChoice getDate() {
     return this.date ;
  }

  public void setCarriedOut(
      DiagnosticInvestigationScreeningQuestionnaireCarriedOutChoice carriedOut) {
     this.carriedOut = carriedOut;
  }

  public DiagnosticInvestigationScreeningQuestionnaireCarriedOutChoice getCarriedOut() {
     return this.carriedOut ;
  }
}
