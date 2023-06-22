package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
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
    date = "2023-06-19T20:52:30.841171278+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Problem/diagnosis name
   * Description: Identification of the significant problem or diagnosis in the identified family member.
   * Comment: Coding of the family member's problem or diagnosis with a terminology is preferred, where possible. 
   */
  @Path("/items[at0035]")
  private List<FamilyHistoryScreeningQuestionnaireProblemDiagnosisNameElement> problemDiagnosisName;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Specific family health problem/Present?/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour presentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Relationship
   * Description: The relationship of the family member to the individual.
   *
   * Comment: For example: mother, step-father, maternal grandmother, or paternal uncle. Coding of the relationship with a terminology is preferred, where possible and including specification of maternal and paternal as required.
   */
  @Path("/items[at0018]")
  private List<FamilyHistoryScreeningQuestionnaireRelationshipElement> relationship;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Age at diagnosis
   * Description: Age of the family member at diagnosis.
   */
  @Path("/items[at0037]/value|value")
  private TemporalAmount ageAtDiagnosisValue;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Specific family health problem/Age at diagnosis/null_flavour
   */
  @Path("/items[at0037]/null_flavour|defining_code")
  private NullFlavour ageAtDiagnosisNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Screening details
   * Description: Additional details or questions  about the specific problem or family member.
   */
  @Path("/items[at0036]")
  private List<Cluster> screeningDetails;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Comment
   * Description: Additional narrative about the specified problem or family member, not captured in other fields.
   */
  @Path("/items[at0028]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Specific family health problem/Comment/null_flavour
   */
  @Path("/items[at0028]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Present?
   * Description: Presence of any relevant specific problem.
   */
  @Path("/items[at0010]/value")
  @Choice
  private FamilyHistoryScreeningQuestionnairePresentChoice present;

  public void setProblemDiagnosisName(
      List<FamilyHistoryScreeningQuestionnaireProblemDiagnosisNameElement> problemDiagnosisName) {
     this.problemDiagnosisName = problemDiagnosisName;
  }

  public List<FamilyHistoryScreeningQuestionnaireProblemDiagnosisNameElement> getProblemDiagnosisName(
      ) {
     return this.problemDiagnosisName ;
  }

  public void setPresentNullFlavourDefiningCode(NullFlavour presentNullFlavourDefiningCode) {
     this.presentNullFlavourDefiningCode = presentNullFlavourDefiningCode;
  }

  public NullFlavour getPresentNullFlavourDefiningCode() {
     return this.presentNullFlavourDefiningCode ;
  }

  public void setRelationship(
      List<FamilyHistoryScreeningQuestionnaireRelationshipElement> relationship) {
     this.relationship = relationship;
  }

  public List<FamilyHistoryScreeningQuestionnaireRelationshipElement> getRelationship() {
     return this.relationship ;
  }

  public void setAgeAtDiagnosisValue(TemporalAmount ageAtDiagnosisValue) {
     this.ageAtDiagnosisValue = ageAtDiagnosisValue;
  }

  public TemporalAmount getAgeAtDiagnosisValue() {
     return this.ageAtDiagnosisValue ;
  }

  public void setAgeAtDiagnosisNullFlavourDefiningCode(
      NullFlavour ageAtDiagnosisNullFlavourDefiningCode) {
     this.ageAtDiagnosisNullFlavourDefiningCode = ageAtDiagnosisNullFlavourDefiningCode;
  }

  public NullFlavour getAgeAtDiagnosisNullFlavourDefiningCode() {
     return this.ageAtDiagnosisNullFlavourDefiningCode ;
  }

  public void setScreeningDetails(List<Cluster> screeningDetails) {
     this.screeningDetails = screeningDetails;
  }

  public List<Cluster> getScreeningDetails() {
     return this.screeningDetails ;
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

  public void setPresent(FamilyHistoryScreeningQuestionnairePresentChoice present) {
     this.present = present;
  }

  public FamilyHistoryScreeningQuestionnairePresentChoice getPresent() {
     return this.present ;
  }
}
