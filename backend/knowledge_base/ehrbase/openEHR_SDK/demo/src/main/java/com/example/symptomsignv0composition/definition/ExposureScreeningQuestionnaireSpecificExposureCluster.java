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
    date = "2023-06-19T20:52:30.874697777+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExposureScreeningQuestionnaireSpecificExposureCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Event name
   * Description: The situation or activity where exposure may have occurred.
   * Comment: For example: Travel to an 'at risk' location; exposure to infected body fluids; or worked as a dental technician. Coding of 'Exposure situation' with a terminology is preferred, where possible.
   */
  @Path("/items[at0010]/value|value")
  private String eventNameValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Specific exposure/Event name/null_flavour
   */
  @Path("/items[at0010]/null_flavour|defining_code")
  private NullFlavour eventNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Specific exposure/Potential exposure?/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour potentialExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Timing
   * Description: The date/s when the individual was exposed to the agent.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("/items[at0015]")
  private List<ExposureScreeningQuestionnaireTimingElement> timing;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Additional details
   * Description: Additional details about the specific exposure event, location or associated contacts.
   */
  @Path("/items[at0016]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Comment
   * Description: Additional narrative about the specific exposure event, not captured in other fields.
   */
  @Path("/items[at0017]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Specific exposure/Comment/null_flavour
   */
  @Path("/items[at0017]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure/Potential exposure?
   * Description: Presence of the exposure situation.
   */
  @Path("/items[at0011]/value")
  @Choice
  private ExposureScreeningQuestionnairePotentialExposureChoice potentialExposure;

  public void setEventNameValue(String eventNameValue) {
     this.eventNameValue = eventNameValue;
  }

  public String getEventNameValue() {
     return this.eventNameValue ;
  }

  public void setEventNameNullFlavourDefiningCode(NullFlavour eventNameNullFlavourDefiningCode) {
     this.eventNameNullFlavourDefiningCode = eventNameNullFlavourDefiningCode;
  }

  public NullFlavour getEventNameNullFlavourDefiningCode() {
     return this.eventNameNullFlavourDefiningCode ;
  }

  public void setPotentialExposureNullFlavourDefiningCode(
      NullFlavour potentialExposureNullFlavourDefiningCode) {
     this.potentialExposureNullFlavourDefiningCode = potentialExposureNullFlavourDefiningCode;
  }

  public NullFlavour getPotentialExposureNullFlavourDefiningCode() {
     return this.potentialExposureNullFlavourDefiningCode ;
  }

  public void setTiming(List<ExposureScreeningQuestionnaireTimingElement> timing) {
     this.timing = timing;
  }

  public List<ExposureScreeningQuestionnaireTimingElement> getTiming() {
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

  public void setPotentialExposure(
      ExposureScreeningQuestionnairePotentialExposureChoice potentialExposure) {
     this.potentialExposure = potentialExposure;
  }

  public ExposureScreeningQuestionnairePotentialExposureChoice getPotentialExposure() {
     return this.potentialExposure ;
  }
}
