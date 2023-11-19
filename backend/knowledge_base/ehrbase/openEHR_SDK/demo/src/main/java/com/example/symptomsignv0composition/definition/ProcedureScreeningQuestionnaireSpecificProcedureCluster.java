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
    date = "2023-06-19T20:52:30.858100474+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProcedureScreeningQuestionnaireSpecificProcedureCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Procedure name
   * Description: Name of a procedure or grouping of procedures.
   * Comment: Coding of the 'Procedure name' with a terminology is preferred, where possible.
   */
  @Path("/items[at0004]/value|value")
  private String procedureNameValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Specific procedure/Procedure name/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour procedureNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Specific procedure/Past procedure?/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour pastProcedureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Timing
   * Description: Timing of the procedure.
   * Comment: "The 'Timing' data element has deliberately been loosely modelled to support the myriad of ways that it can be used in questionnaires to capture when a procedure was performed. The specific and intended semantics can be further clarified in a template.
   * For example: 
   * Date/time for when the procedure was performed. Interval of date/time for a period of time eg. between 1940 and 1942. Text for descriptions like 'Immediately after the operation', or 'Up to one week ago', 'Up to two weeks ago', 'Three weeks ago'. Duration for the individual's age at the onset. Interval of Duration for the approximate age of the individual at the time of onset.
   */
  @Path("/items[at0037]")
  private List<ProcedureScreeningQuestionnaireTimingElement> timing;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Additional details
   * Description: Structured details or questions about the specific procedure.
   * Comment: For example: hospital where treated.
   */
  @Path("/items[at0036]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Comment
   * Description: Additional narrative about the specific procedure question, not captured in other fields.
   */
  @Path("/items[at0025]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Tree/Specific procedure/Comment/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire/Any event/Specific procedure/Past procedure?
   * Description: Is there a history of the identified procedure?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("/items[at0005]/value")
  @Choice
  private ProcedureScreeningQuestionnairePastProcedureChoice pastProcedure;

  public void setProcedureNameValue(String procedureNameValue) {
     this.procedureNameValue = procedureNameValue;
  }

  public String getProcedureNameValue() {
     return this.procedureNameValue ;
  }

  public void setProcedureNameNullFlavourDefiningCode(
      NullFlavour procedureNameNullFlavourDefiningCode) {
     this.procedureNameNullFlavourDefiningCode = procedureNameNullFlavourDefiningCode;
  }

  public NullFlavour getProcedureNameNullFlavourDefiningCode() {
     return this.procedureNameNullFlavourDefiningCode ;
  }

  public void setPastProcedureNullFlavourDefiningCode(
      NullFlavour pastProcedureNullFlavourDefiningCode) {
     this.pastProcedureNullFlavourDefiningCode = pastProcedureNullFlavourDefiningCode;
  }

  public NullFlavour getPastProcedureNullFlavourDefiningCode() {
     return this.pastProcedureNullFlavourDefiningCode ;
  }

  public void setTiming(List<ProcedureScreeningQuestionnaireTimingElement> timing) {
     this.timing = timing;
  }

  public List<ProcedureScreeningQuestionnaireTimingElement> getTiming() {
     return this.timing ;
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

  public void setPastProcedure(ProcedureScreeningQuestionnairePastProcedureChoice pastProcedure) {
     this.pastProcedure = pastProcedure;
  }

  public ProcedureScreeningQuestionnairePastProcedureChoice getPastProcedure() {
     return this.pastProcedure ;
  }
}
