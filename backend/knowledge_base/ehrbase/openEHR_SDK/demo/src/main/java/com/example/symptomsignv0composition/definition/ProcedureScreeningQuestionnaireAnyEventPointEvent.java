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
    date = "2023-06-19T20:52:30.861497568+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class ProcedureScreeningQuestionnaireAnyEventPointEvent implements PointEventEntity, ProcedureScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Screening purpose
   * Description: The context or reason for screening.
   * Comment: This data element is intended to provide collection context for the question/answer groups when queried at a later date. It is not expected that this data element will be exposed to the individual, but only stored in data. For example: pre-admission screening or the name of the actual questionnaire.
   */
  @Path("/data[at0003]/items[at0034]/value|value")
  private String screeningPurposeValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Screening purpose/null_flavour
   */
  @Path("/data[at0003]/items[at0034]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Any previous procedures?
   * Description: Is there a history of any past procedures relevant for the screening purpose?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("/data[at0003]/items[at0028]")
  private List<ProcedureScreeningQuestionnaireAnyPreviousProceduresElement> anyPreviousProcedures;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Description
   * Description: Narrative description about the history of any past procedures relevant for the screening purpose.
   */
  @Path("/data[at0003]/items[at0041]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Description/null_flavour
   */
  @Path("/data[at0003]/items[at0041]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure
   * Description: Details about a specific procedure or grouping of procedures relevant for the screening purpose.
   */
  @Path("/data[at0003]/items[at0022]")
  private List<ProcedureScreeningQuestionnaireSpecificProcedureCluster> specificProcedure;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Additional details
   * Description: Structured details or questions about screening for procedures.
   */
  @Path("/data[at0003]/items[at0040]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/time
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

  public void setAnyPreviousProcedures(
      List<ProcedureScreeningQuestionnaireAnyPreviousProceduresElement> anyPreviousProcedures) {
     this.anyPreviousProcedures = anyPreviousProcedures;
  }

  public List<ProcedureScreeningQuestionnaireAnyPreviousProceduresElement> getAnyPreviousProcedures(
      ) {
     return this.anyPreviousProcedures ;
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

  public void setSpecificProcedure(
      List<ProcedureScreeningQuestionnaireSpecificProcedureCluster> specificProcedure) {
     this.specificProcedure = specificProcedure;
  }

  public List<ProcedureScreeningQuestionnaireSpecificProcedureCluster> getSpecificProcedure() {
     return this.specificProcedure ;
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
