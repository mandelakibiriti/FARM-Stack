package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.844084769+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class FamilyHistoryScreeningQuestionnaireAnyEventPointEvent implements PointEventEntity, FamilyHistoryScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Screening purpose
   * Description: The reason for overall screening.
   * Comment: For example: pre-operative screening.
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String screeningPurposeValue;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Screening purpose/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Any presence?/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour anyPresenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem
   * Description: Screening details about a specified health problem.
   * Comment: This grouping is currently  ordered to indicate relationships per problem, but in practice could also be used to capture problems per relationship as Problem/Diagnosis name and Relationship both allow multiple occurrences.
   */
  @Path("/data[at0003]/items[at0009]")
  private List<FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster> specificFamilyHealthProblem;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Any presence?
   * Description: Presence of any relevant problems in the family.
   */
  @Path("/data[at0003]/items[at0005]/value")
  @Choice
  private FamilyHistoryScreeningQuestionnaireAnyPresenceChoice anyPresence;

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

  public void setAnyPresenceNullFlavourDefiningCode(
      NullFlavour anyPresenceNullFlavourDefiningCode) {
     this.anyPresenceNullFlavourDefiningCode = anyPresenceNullFlavourDefiningCode;
  }

  public NullFlavour getAnyPresenceNullFlavourDefiningCode() {
     return this.anyPresenceNullFlavourDefiningCode ;
  }

  public void setSpecificFamilyHealthProblem(
      List<FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster> specificFamilyHealthProblem) {
     this.specificFamilyHealthProblem = specificFamilyHealthProblem;
  }

  public List<FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster> getSpecificFamilyHealthProblem(
      ) {
     return this.specificFamilyHealthProblem ;
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

  public void setAnyPresence(FamilyHistoryScreeningQuestionnaireAnyPresenceChoice anyPresence) {
     this.anyPresence = anyPresence;
  }

  public FamilyHistoryScreeningQuestionnaireAnyPresenceChoice getAnyPresence() {
     return this.anyPresence ;
  }
}
