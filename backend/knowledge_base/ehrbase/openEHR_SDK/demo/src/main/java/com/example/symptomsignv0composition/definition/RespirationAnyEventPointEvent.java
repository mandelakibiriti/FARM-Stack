package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
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
    date = "2023-06-19T20:52:30.813502388+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class RespirationAnyEventPointEvent implements PointEventEntity, RespirationAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Presence
   * Description: Observation of spontaneous respiration.
   * Comment: This data element may be useful in extreme situations where a formal measurement of respiration rate is not possible. For example: a subject is unconscious and distant to the observer, such as trapped in a car or has fallen down a cliff. Presence of respiration can be implied if the 'Rate' >0 breaths/min.
   */
  @Path("/data[at0003]/items[at0062]/value|defining_code")
  private PresenceDefiningCode2 presenceDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Presence/null_flavour
   */
  @Path("/data[at0003]/items[at0062]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double rateMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Rate
   * Description: The frequency of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String rateUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Rate/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour rateNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Regularity
   * Description: The regularity of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0005]/value|defining_code")
  private RegularityDefiningCode2 regularityDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Regularity/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour regularityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Depth
   * Description: The depth of spontaneous breathing.
   */
  @Path("/data[at0003]/items[at0016]/value|defining_code")
  private DepthDefiningCode depthDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Depth/null_flavour
   */
  @Path("/data[at0003]/items[at0016]/null_flavour|defining_code")
  private NullFlavour depthNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Clinical description
   * Description: A narrative description about the spontaneous breathing of the individual.
   * Comment: For example: noting respiratory distress, use of accessory muscles or intermittent apnoea; noting characteristics such as stridor, sighing, grunting, groaning, gasping. 
   * Conducting a full respiratory examination, then some of these findings might be more appropriately recorded as part of examination findings.
   */
  @Path("/data[at0003]/items[at0024]/value|value")
  private String clinicalDescriptionValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Clinical description/null_flavour
   */
  @Path("/data[at0003]/items[at0024]/null_flavour|defining_code")
  private NullFlavour clinicalDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Clinical interpretation
   * Description: Single word, phrase or brief description which represents the clinical meaning and significance of the respiration findings.
   * Comment: Coding with a terminology is preferred, where possible. For example: Normal breathing; Evidence of respiratory distress; Kussmaul's respiration; Cheyne-Stokes respiration; or Apnoeic episodes. Multiple statements are allowed. 
   */
  @Path("/data[at0003]/items[at0009]")
  private List<RespirationClinicalInterpretationElement> clinicalInterpretation;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Comment
   * Description: Additional narrative about the respirations, not captured in other fields.
   */
  @Path("/data[at0003]/items[at0070]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/List/Comment/null_flavour
   */
  @Path("/data[at0003]/items[at0070]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen being delivered to the individual at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi02 of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0022]/items[at0055]")
  private Cluster inspiredOxygen;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/Exertion
   * Description: Details about physical exertion being undertaken during the examination.
   * Comment: The individual's level of exertion during, or just prior to, the observation.
   */
  @Path("/state[at0022]/items[at0037]")
  private Cluster exertion;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setPresenceDefiningCode(PresenceDefiningCode2 presenceDefiningCode) {
     this.presenceDefiningCode = presenceDefiningCode;
  }

  public PresenceDefiningCode2 getPresenceDefiningCode() {
     return this.presenceDefiningCode ;
  }

  public void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode) {
     this.presenceNullFlavourDefiningCode = presenceNullFlavourDefiningCode;
  }

  public NullFlavour getPresenceNullFlavourDefiningCode() {
     return this.presenceNullFlavourDefiningCode ;
  }

  public void setRateMagnitude(Double rateMagnitude) {
     this.rateMagnitude = rateMagnitude;
  }

  public Double getRateMagnitude() {
     return this.rateMagnitude ;
  }

  public void setRateUnits(String rateUnits) {
     this.rateUnits = rateUnits;
  }

  public String getRateUnits() {
     return this.rateUnits ;
  }

  public void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode) {
     this.rateNullFlavourDefiningCode = rateNullFlavourDefiningCode;
  }

  public NullFlavour getRateNullFlavourDefiningCode() {
     return this.rateNullFlavourDefiningCode ;
  }

  public void setRegularityDefiningCode(RegularityDefiningCode2 regularityDefiningCode) {
     this.regularityDefiningCode = regularityDefiningCode;
  }

  public RegularityDefiningCode2 getRegularityDefiningCode() {
     return this.regularityDefiningCode ;
  }

  public void setRegularityNullFlavourDefiningCode(NullFlavour regularityNullFlavourDefiningCode) {
     this.regularityNullFlavourDefiningCode = regularityNullFlavourDefiningCode;
  }

  public NullFlavour getRegularityNullFlavourDefiningCode() {
     return this.regularityNullFlavourDefiningCode ;
  }

  public void setDepthDefiningCode(DepthDefiningCode depthDefiningCode) {
     this.depthDefiningCode = depthDefiningCode;
  }

  public DepthDefiningCode getDepthDefiningCode() {
     return this.depthDefiningCode ;
  }

  public void setDepthNullFlavourDefiningCode(NullFlavour depthNullFlavourDefiningCode) {
     this.depthNullFlavourDefiningCode = depthNullFlavourDefiningCode;
  }

  public NullFlavour getDepthNullFlavourDefiningCode() {
     return this.depthNullFlavourDefiningCode ;
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

  public void setClinicalInterpretation(
      List<RespirationClinicalInterpretationElement> clinicalInterpretation) {
     this.clinicalInterpretation = clinicalInterpretation;
  }

  public List<RespirationClinicalInterpretationElement> getClinicalInterpretation() {
     return this.clinicalInterpretation ;
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

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
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
