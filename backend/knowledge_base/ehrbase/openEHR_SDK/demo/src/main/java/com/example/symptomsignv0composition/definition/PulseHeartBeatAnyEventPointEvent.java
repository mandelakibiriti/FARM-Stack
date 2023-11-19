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
    date = "2023-06-19T20:52:30.806121195+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class PulseHeartBeatAnyEventPointEvent implements PointEventEntity, PulseHeartBeatAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Presence
   * Description: Presence of a pulse or heart beat.
   * Comment: It can be implied that the pulse or heart beat is present if Rate >0 /min.
   */
  @Path("/data[at0001]/items[at1005]/value|defining_code")
  private PresenceDefiningCode presenceDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Presence/null_flavour
   */
  @Path("/data[at0001]/items[at1005]/null_flavour|defining_code")
  private NullFlavour presenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Rate
   * Description: The rate of the pulse or heart beat, measured in beats per minute.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double rateMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Rate
   * Description: The rate of the pulse or heart beat, measured in beats per minute.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String rateUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Rate/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour rateNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Regularity
   * Description: Regularity of the pulse or heart beat.
   */
  @Path("/data[at0001]/items[at0005]/value|defining_code")
  private RegularityDefiningCode regularityDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Regularity/null_flavour
   */
  @Path("/data[at0001]/items[at0005]/null_flavour|defining_code")
  private NullFlavour regularityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Irregular type
   * Description: More specific pattern of an irregular pulse or heart beat.
   * Comment: Selection of a value from this value set is only valid if 'Irregular' is selected from the 'Regularity' data element.
   */
  @Path("/data[at0001]/items[at1055]/value|defining_code")
  private IrregularTypeDefiningCode irregularTypeDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Irregular type/null_flavour
   */
  @Path("/data[at0001]/items[at1055]/null_flavour|defining_code")
  private NullFlavour irregularTypeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Character
   * Description: Description of the character of the pulse or heart beat.
   * Comment: Coding with a terminology is desired, where possible. For example: full, thready, bounding, slow rising, or collapsing. Multiple terms may be recorded.
   */
  @Path("/data[at0001]/items[at1030]")
  private List<PulseHeartBeatCharacterElement> character;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Clinical description
   * Description: Narrative description about the pulse or heart beat.
   */
  @Path("/data[at0001]/items[at1022]/value|value")
  private String clinicalDescriptionValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Clinical description/null_flavour
   */
  @Path("/data[at0001]/items[at1022]/null_flavour|defining_code")
  private NullFlavour clinicalDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Clinical interpretation
   * Description: Single word, phrase or brief description that represents the clinical meaning and significance of the pulse or heart beat findings, including the rhythm.
   * Comment: Coding with a terminology is preferred, where possible. For example: Bradycardia, Extrasystoles or Sinus rhythm. Multiple statements are allowed.
   */
  @Path("/data[at0001]/items[at1023 and name/value='Clinical interpretation']")
  private List<PulseHeartBeatClinicalInterpretationElement> clinicalInterpretation;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Rhythm
   * Description: Single word, phrase or brief description that represents the clinical meaning and significance of the pulse or heart beat findings, including the rhythm.
   * Comment: Coding with a terminology is preferred, where possible. For example: Bradycardia, Extrasystoles or Sinus rhythm. Multiple statements are allowed.
   */
  @Path("/data[at0001]/items[at1023 and name/value='Rhythm']")
  private List<PulseHeartBeatRhythmElement> rhythm;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Comment
   * Description: Additional narrative about the pulse or heart beat findings not captured in other fields.
   */
  @Path("/data[at0001]/items[at1059]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/structure/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at1059]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Position
   * Description: The body position of the subject during the observation.
   */
  @Path("/state[at0012]/items[at0013]/value|defining_code")
  private PositionDefiningCode3 positionDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/List/Position/null_flavour
   */
  @Path("/state[at0012]/items[at0013]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Confounding factors
   * Description: Narrative description about any incidental factors that may affect interpretation of the physical findings.
   * Comment: For example, presence of a pacemaker, level of anxiety; pain or fever etc.
   */
  @Path("/state[at0012]/items[at1018]")
  private List<PulseHeartBeatConfoundingFactorsElement> confoundingFactors;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/Exertion
   * Description: Details about physical exertion being undertaken during the examination.
   */
  @Path("/state[at0012]/items[at1017]")
  private List<Cluster> exertion;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setPresenceDefiningCode(PresenceDefiningCode presenceDefiningCode) {
     this.presenceDefiningCode = presenceDefiningCode;
  }

  public PresenceDefiningCode getPresenceDefiningCode() {
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

  public void setRegularityDefiningCode(RegularityDefiningCode regularityDefiningCode) {
     this.regularityDefiningCode = regularityDefiningCode;
  }

  public RegularityDefiningCode getRegularityDefiningCode() {
     return this.regularityDefiningCode ;
  }

  public void setRegularityNullFlavourDefiningCode(NullFlavour regularityNullFlavourDefiningCode) {
     this.regularityNullFlavourDefiningCode = regularityNullFlavourDefiningCode;
  }

  public NullFlavour getRegularityNullFlavourDefiningCode() {
     return this.regularityNullFlavourDefiningCode ;
  }

  public void setIrregularTypeDefiningCode(IrregularTypeDefiningCode irregularTypeDefiningCode) {
     this.irregularTypeDefiningCode = irregularTypeDefiningCode;
  }

  public IrregularTypeDefiningCode getIrregularTypeDefiningCode() {
     return this.irregularTypeDefiningCode ;
  }

  public void setIrregularTypeNullFlavourDefiningCode(
      NullFlavour irregularTypeNullFlavourDefiningCode) {
     this.irregularTypeNullFlavourDefiningCode = irregularTypeNullFlavourDefiningCode;
  }

  public NullFlavour getIrregularTypeNullFlavourDefiningCode() {
     return this.irregularTypeNullFlavourDefiningCode ;
  }

  public void setCharacter(List<PulseHeartBeatCharacterElement> character) {
     this.character = character;
  }

  public List<PulseHeartBeatCharacterElement> getCharacter() {
     return this.character ;
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
      List<PulseHeartBeatClinicalInterpretationElement> clinicalInterpretation) {
     this.clinicalInterpretation = clinicalInterpretation;
  }

  public List<PulseHeartBeatClinicalInterpretationElement> getClinicalInterpretation() {
     return this.clinicalInterpretation ;
  }

  public void setRhythm(List<PulseHeartBeatRhythmElement> rhythm) {
     this.rhythm = rhythm;
  }

  public List<PulseHeartBeatRhythmElement> getRhythm() {
     return this.rhythm ;
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

  public void setPositionDefiningCode(PositionDefiningCode3 positionDefiningCode) {
     this.positionDefiningCode = positionDefiningCode;
  }

  public PositionDefiningCode3 getPositionDefiningCode() {
     return this.positionDefiningCode ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
  }

  public void setConfoundingFactors(
      List<PulseHeartBeatConfoundingFactorsElement> confoundingFactors) {
     this.confoundingFactors = confoundingFactors;
  }

  public List<PulseHeartBeatConfoundingFactorsElement> getConfoundingFactors() {
     return this.confoundingFactors ;
  }

  public void setExertion(List<Cluster> exertion) {
     this.exertion = exertion;
  }

  public List<Cluster> getExertion() {
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
