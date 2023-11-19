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
    date = "2023-06-19T20:52:30.848484334+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class MedicationScreeningQuestionnaireSpecificMedicationCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Medication name
   * Description: Name of medication or grouping of medication.
   * Comment: For example: 'alendronic acid', 'anti osteoporosis medications' or 'bisphosphonates'.
   * Coding of the 'Medication name' with a terminology is preferred, where possible.
   */
  @Path("/items[at0021]/value|value")
  private String medicationNameValue;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Tree/Specific medication/Medication name/null_flavour
   */
  @Path("/items[at0021]/null_flavour|defining_code")
  private NullFlavour medicationNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Tree/Specific medication/Specific medication used?/null_flavour
   */
  @Path("/items[at0024]/null_flavour|defining_code")
  private NullFlavour specificMedicationUsedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Tree/Specific medication/Latest dose/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour latestDoseNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Timing
   * Description: The onset, cessation or duration of use of the medication or grouping of medications.
   * Comment: The 'Timing' data element has deliberately been loosely modelled to support the myriad of ways that it can be used in questionnaires to capture when a medication was used. The specific and intended semantics can be further clarified in a template. For example: 
   * Clone and rename the element in a template to 'Start' and 'Stopped' to record the Date/time when the individual started using a medication. Interval of date/time for a period of time eg. between 1940 and 1942. Text for descriptions like 'Immediately after the operation', or 'Up to one week ago', 'Up to two weeks ago', 'Three weeks ago'. Duration for the individual's age at the onset of duration OR the length of time during which the individual has been using the medication. Interval of Duration for the approximate age of the individual at the time of onset.
   */
  @Path("/items[at0002]")
  private List<MedicationScreeningQuestionnaireTimingElement> timing;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Additional details
   * Description: Structured details or questions about the specific medication or grouping of medications.
   */
  @Path("/items[at0041]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Comment
   * Description: Additional narrative about the specific medication question, not captured in other fields.
   */
  @Path("/items[at0025]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Tree/Specific medication/Comment/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Latest dose
   * Description: The date and/or time of administation of the most recent dose of the medication or group of medications.
   * Comment: Can be a partial date, for example, only a year.
   */
  @Path("/items[at0003]/value")
  @Choice
  private MedicationScreeningQuestionnaireLatestDoseChoice latestDose;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Specific medication used?
   * Description: Is there a history of use of a specific medication or group of medications.
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case. 
   * For example an alternative valueset using the DV_TEXT datatype can be: 
   * Currently using [The individual currently uses the specific medication either on a regular basis or as required.]
   * Never used [The individual has never used the specific medication.]
   * Used in the past [The individual has used the specific medication in the past, but isn't currently using it.]
   * Unknown [It is not known whether the individual uses or has used the specific medication.]
   */
  @Path("/items[at0024]/value")
  @Choice
  private MedicationScreeningQuestionnaireSpecificMedicationUsedChoice specificMedicationUsed;

  public void setMedicationNameValue(String medicationNameValue) {
     this.medicationNameValue = medicationNameValue;
  }

  public String getMedicationNameValue() {
     return this.medicationNameValue ;
  }

  public void setMedicationNameNullFlavourDefiningCode(
      NullFlavour medicationNameNullFlavourDefiningCode) {
     this.medicationNameNullFlavourDefiningCode = medicationNameNullFlavourDefiningCode;
  }

  public NullFlavour getMedicationNameNullFlavourDefiningCode() {
     return this.medicationNameNullFlavourDefiningCode ;
  }

  public void setSpecificMedicationUsedNullFlavourDefiningCode(
      NullFlavour specificMedicationUsedNullFlavourDefiningCode) {
     this.specificMedicationUsedNullFlavourDefiningCode = specificMedicationUsedNullFlavourDefiningCode;
  }

  public NullFlavour getSpecificMedicationUsedNullFlavourDefiningCode() {
     return this.specificMedicationUsedNullFlavourDefiningCode ;
  }

  public void setLatestDoseNullFlavourDefiningCode(NullFlavour latestDoseNullFlavourDefiningCode) {
     this.latestDoseNullFlavourDefiningCode = latestDoseNullFlavourDefiningCode;
  }

  public NullFlavour getLatestDoseNullFlavourDefiningCode() {
     return this.latestDoseNullFlavourDefiningCode ;
  }

  public void setTiming(List<MedicationScreeningQuestionnaireTimingElement> timing) {
     this.timing = timing;
  }

  public List<MedicationScreeningQuestionnaireTimingElement> getTiming() {
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

  public void setLatestDose(MedicationScreeningQuestionnaireLatestDoseChoice latestDose) {
     this.latestDose = latestDose;
  }

  public MedicationScreeningQuestionnaireLatestDoseChoice getLatestDose() {
     return this.latestDose ;
  }

  public void setSpecificMedicationUsed(
      MedicationScreeningQuestionnaireSpecificMedicationUsedChoice specificMedicationUsed) {
     this.specificMedicationUsed = specificMedicationUsed;
  }

  public MedicationScreeningQuestionnaireSpecificMedicationUsedChoice getSpecificMedicationUsed() {
     return this.specificMedicationUsed ;
  }
}
