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
    date = "2023-06-19T20:52:30.835743474+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class SocialContextScreeningQuestionnaireSpecificSocialContextCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Tree/Specific social context/Context/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour contextNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Tree/Specific social context/Presence?/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/Additional details
   * Description: Additional details or questions about the specific social context.
   */
  @Path("/items[at0026]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/Comment
   * Description: Additional narrative about the specific social context, not captured in other fields.
   */
  @Path("/items[at0025]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Tree/Specific social context/Comment/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/Presence?
   * Description: Has there been experience of the specified 'Context'?
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case.
   */
  @Path("/items[at0005]/value")
  @Choice
  private SocialContextScreeningQuestionnairePresenceChoice presence;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context/Context
   * Description: Identification of a specific social circumstance, issue or concern relevant for the questionnaire or grouping of such, by name.
   * Comment: This element offers a choice between free and coded text. It is anticipated that the list of coded values will grow as requirements are identified. Coding of the 'Context' with a terminology is preferred, where possible - for example, relevant terms within the Social context finding hierarchy in SNOMED CT (SCTID: 108329005). Alternatively as free text, for example 'Social isolation', 'Discrimination', 'Minority stress'.
   */
  @Path("/items[at0004]/value")
  @Choice
  private SocialContextScreeningQuestionnaireContextChoice context;

  public void setContextNullFlavourDefiningCode(NullFlavour contextNullFlavourDefiningCode) {
     this.contextNullFlavourDefiningCode = contextNullFlavourDefiningCode;
  }

  public NullFlavour getContextNullFlavourDefiningCode() {
     return this.contextNullFlavourDefiningCode ;
  }

  public void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode) {
     this.presenceNullFlavourDefiningCode = presenceNullFlavourDefiningCode;
  }

  public NullFlavour getPresenceNullFlavourDefiningCode() {
     return this.presenceNullFlavourDefiningCode ;
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

  public void setPresence(SocialContextScreeningQuestionnairePresenceChoice presence) {
     this.presence = presence;
  }

  public SocialContextScreeningQuestionnairePresenceChoice getPresence() {
     return this.presence ;
  }

  public void setContext(SocialContextScreeningQuestionnaireContextChoice context) {
     this.context = context;
  }

  public SocialContextScreeningQuestionnaireContextChoice getContext() {
     return this.context ;
  }
}
