package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.785891885+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class BloodPressure24HourAverageIntervalEvent implements IntervalEventEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Systolic
   * Description: Peak systemic arterial blood pressure  - measured in systolic or contraction phase of the heart cycle.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double systolicMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Systolic
   * Description: Peak systemic arterial blood pressure  - measured in systolic or contraction phase of the heart cycle.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String systolicUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Systolic/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour systolicNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Diastolic
   * Description: Minimum systemic arterial blood pressure - measured in the diastolic or relaxation phase of the heart cycle.
   */
  @Path("/data[at0003]/items[at0005]/value|magnitude")
  private Double diastolicMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Diastolic
   * Description: Minimum systemic arterial blood pressure - measured in the diastolic or relaxation phase of the heart cycle.
   */
  @Path("/data[at0003]/items[at0005]/value|units")
  private String diastolicUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Diastolic/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour diastolicNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Mean arterial pressure
   * Description: The average arterial pressure that occurs over the entire course of the heart contraction and relaxation cycle.
   */
  @Path("/data[at0003]/items[at1006]/value|magnitude")
  private Double meanArterialPressureMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Mean arterial pressure
   * Description: The average arterial pressure that occurs over the entire course of the heart contraction and relaxation cycle.
   */
  @Path("/data[at0003]/items[at1006]/value|units")
  private String meanArterialPressureUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Mean arterial pressure/null_flavour
   */
  @Path("/data[at0003]/items[at1006]/null_flavour|defining_code")
  private NullFlavour meanArterialPressureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Pulse pressure
   * Description: The difference between the systolic and diastolic pressure.
   */
  @Path("/data[at0003]/items[at1007]/value|magnitude")
  private Double pulsePressureMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Pulse pressure
   * Description: The difference between the systolic and diastolic pressure.
   */
  @Path("/data[at0003]/items[at1007]/value|units")
  private String pulsePressureUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Pulse pressure/null_flavour
   */
  @Path("/data[at0003]/items[at1007]/null_flavour|defining_code")
  private NullFlavour pulsePressureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Clinical interpretation
   * Description: Single word, phrase or brief description that represents the clinical meaning and significance of the blood pressure measurement.
   */
  @Path("/data[at0003]/items[at1059]/value|value")
  private String clinicalInterpretationValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Clinical interpretation/null_flavour
   */
  @Path("/data[at0003]/items[at1059]/null_flavour|defining_code")
  private NullFlavour clinicalInterpretationNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Comment
   * Description: Additional narrative about the measurement, not captured in other fields.
   */
  @Path("/data[at0003]/items[at0033]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/blood pressure/Comment/null_flavour
   */
  @Path("/data[at0003]/items[at0033]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Position
   * Description: The position of the individual at the time of measurement.
   */
  @Path("/state[at0007]/items[at0008]/value|defining_code")
  private PositionDefiningCode2 positionDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/state structure/Position/null_flavour
   */
  @Path("/state[at0007]/items[at0008]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Confounding factors
   * Description: Comment on and record other incidental factors that may be contributing to the blood pressure measurement.  For example, level of anxiety or 'white coat syndrome'; pain or fever; changes in atmospheric pressure etc.
   */
  @Path("/state[at0007]/items[at1052]/value|value")
  private String confoundingFactorsValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/state structure/Confounding factors/null_flavour
   */
  @Path("/state[at0007]/items[at1052]/null_flavour|defining_code")
  private NullFlavour confoundingFactorsNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Exertion
   * Description: Details about physical activity undertaken at the time of blood pressure measurement.
   */
  @Path("/state[at0007]/items[at1030]")
  private Cluster exertion;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Sleep status
   * Description: Sleep status - supports interpretation of 24 hour ambulatory blood pressure records.
   */
  @Path("/state[at0007]/items[at1043]/value|defining_code")
  private SleepStatusDefiningCode sleepStatusDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/state structure/Sleep status/null_flavour
   */
  @Path("/state[at0007]/items[at1043]/null_flavour|defining_code")
  private NullFlavour sleepStatusNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Tilt
   * Description: The craniocaudal tilt of the surface on which the person is lying at the time of measurement.
   */
  @Path("/state[at0007]/items[at1005]/value|magnitude")
  private Double tiltMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/Tilt
   * Description: The craniocaudal tilt of the surface on which the person is lying at the time of measurement.
   */
  @Path("/state[at0007]/items[at1005]/value|units")
  private String tiltUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/History/24 hour average/state structure/Tilt/null_flavour
   */
  @Path("/state[at0007]/items[at1005]/null_flavour|defining_code")
  private NullFlavour tiltNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setSystolicMagnitude(Double systolicMagnitude) {
     this.systolicMagnitude = systolicMagnitude;
  }

  public Double getSystolicMagnitude() {
     return this.systolicMagnitude ;
  }

  public void setSystolicUnits(String systolicUnits) {
     this.systolicUnits = systolicUnits;
  }

  public String getSystolicUnits() {
     return this.systolicUnits ;
  }

  public void setSystolicNullFlavourDefiningCode(NullFlavour systolicNullFlavourDefiningCode) {
     this.systolicNullFlavourDefiningCode = systolicNullFlavourDefiningCode;
  }

  public NullFlavour getSystolicNullFlavourDefiningCode() {
     return this.systolicNullFlavourDefiningCode ;
  }

  public void setDiastolicMagnitude(Double diastolicMagnitude) {
     this.diastolicMagnitude = diastolicMagnitude;
  }

  public Double getDiastolicMagnitude() {
     return this.diastolicMagnitude ;
  }

  public void setDiastolicUnits(String diastolicUnits) {
     this.diastolicUnits = diastolicUnits;
  }

  public String getDiastolicUnits() {
     return this.diastolicUnits ;
  }

  public void setDiastolicNullFlavourDefiningCode(NullFlavour diastolicNullFlavourDefiningCode) {
     this.diastolicNullFlavourDefiningCode = diastolicNullFlavourDefiningCode;
  }

  public NullFlavour getDiastolicNullFlavourDefiningCode() {
     return this.diastolicNullFlavourDefiningCode ;
  }

  public void setMeanArterialPressureMagnitude(Double meanArterialPressureMagnitude) {
     this.meanArterialPressureMagnitude = meanArterialPressureMagnitude;
  }

  public Double getMeanArterialPressureMagnitude() {
     return this.meanArterialPressureMagnitude ;
  }

  public void setMeanArterialPressureUnits(String meanArterialPressureUnits) {
     this.meanArterialPressureUnits = meanArterialPressureUnits;
  }

  public String getMeanArterialPressureUnits() {
     return this.meanArterialPressureUnits ;
  }

  public void setMeanArterialPressureNullFlavourDefiningCode(
      NullFlavour meanArterialPressureNullFlavourDefiningCode) {
     this.meanArterialPressureNullFlavourDefiningCode = meanArterialPressureNullFlavourDefiningCode;
  }

  public NullFlavour getMeanArterialPressureNullFlavourDefiningCode() {
     return this.meanArterialPressureNullFlavourDefiningCode ;
  }

  public void setPulsePressureMagnitude(Double pulsePressureMagnitude) {
     this.pulsePressureMagnitude = pulsePressureMagnitude;
  }

  public Double getPulsePressureMagnitude() {
     return this.pulsePressureMagnitude ;
  }

  public void setPulsePressureUnits(String pulsePressureUnits) {
     this.pulsePressureUnits = pulsePressureUnits;
  }

  public String getPulsePressureUnits() {
     return this.pulsePressureUnits ;
  }

  public void setPulsePressureNullFlavourDefiningCode(
      NullFlavour pulsePressureNullFlavourDefiningCode) {
     this.pulsePressureNullFlavourDefiningCode = pulsePressureNullFlavourDefiningCode;
  }

  public NullFlavour getPulsePressureNullFlavourDefiningCode() {
     return this.pulsePressureNullFlavourDefiningCode ;
  }

  public void setClinicalInterpretationValue(String clinicalInterpretationValue) {
     this.clinicalInterpretationValue = clinicalInterpretationValue;
  }

  public String getClinicalInterpretationValue() {
     return this.clinicalInterpretationValue ;
  }

  public void setClinicalInterpretationNullFlavourDefiningCode(
      NullFlavour clinicalInterpretationNullFlavourDefiningCode) {
     this.clinicalInterpretationNullFlavourDefiningCode = clinicalInterpretationNullFlavourDefiningCode;
  }

  public NullFlavour getClinicalInterpretationNullFlavourDefiningCode() {
     return this.clinicalInterpretationNullFlavourDefiningCode ;
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

  public void setPositionDefiningCode(PositionDefiningCode2 positionDefiningCode) {
     this.positionDefiningCode = positionDefiningCode;
  }

  public PositionDefiningCode2 getPositionDefiningCode() {
     return this.positionDefiningCode ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
  }

  public void setConfoundingFactorsValue(String confoundingFactorsValue) {
     this.confoundingFactorsValue = confoundingFactorsValue;
  }

  public String getConfoundingFactorsValue() {
     return this.confoundingFactorsValue ;
  }

  public void setConfoundingFactorsNullFlavourDefiningCode(
      NullFlavour confoundingFactorsNullFlavourDefiningCode) {
     this.confoundingFactorsNullFlavourDefiningCode = confoundingFactorsNullFlavourDefiningCode;
  }

  public NullFlavour getConfoundingFactorsNullFlavourDefiningCode() {
     return this.confoundingFactorsNullFlavourDefiningCode ;
  }

  public void setExertion(Cluster exertion) {
     this.exertion = exertion;
  }

  public Cluster getExertion() {
     return this.exertion ;
  }

  public void setSleepStatusDefiningCode(SleepStatusDefiningCode sleepStatusDefiningCode) {
     this.sleepStatusDefiningCode = sleepStatusDefiningCode;
  }

  public SleepStatusDefiningCode getSleepStatusDefiningCode() {
     return this.sleepStatusDefiningCode ;
  }

  public void setSleepStatusNullFlavourDefiningCode(
      NullFlavour sleepStatusNullFlavourDefiningCode) {
     this.sleepStatusNullFlavourDefiningCode = sleepStatusNullFlavourDefiningCode;
  }

  public NullFlavour getSleepStatusNullFlavourDefiningCode() {
     return this.sleepStatusNullFlavourDefiningCode ;
  }

  public void setTiltMagnitude(Double tiltMagnitude) {
     this.tiltMagnitude = tiltMagnitude;
  }

  public Double getTiltMagnitude() {
     return this.tiltMagnitude ;
  }

  public void setTiltUnits(String tiltUnits) {
     this.tiltUnits = tiltUnits;
  }

  public String getTiltUnits() {
     return this.tiltUnits ;
  }

  public void setTiltNullFlavourDefiningCode(NullFlavour tiltNullFlavourDefiningCode) {
     this.tiltNullFlavourDefiningCode = tiltNullFlavourDefiningCode;
  }

  public NullFlavour getTiltNullFlavourDefiningCode() {
     return this.tiltNullFlavourDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
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
