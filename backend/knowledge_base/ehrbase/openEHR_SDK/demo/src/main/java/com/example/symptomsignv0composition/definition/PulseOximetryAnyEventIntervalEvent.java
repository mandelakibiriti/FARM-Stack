package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.818267999+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class PulseOximetryAnyEventIntervalEvent implements IntervalEventEntity, PulseOximetryAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/SpO₂
   * Description: The saturation of oxygen in the peripheral blood, measured via pulse oximetry.
   * Comment: SpO₂ is defined as the percentage of oxyhaemoglobin (HbO₂) to the total concentration of haemoglobin (HbO₂ + deoxyhaemoglobin) in peripheral blood.
   */
  @Path("/data[at0003]/items[at0006]/value")
  private DvProportion spo;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/SpO₂/null_flavour
   */
  @Path("/data[at0003]/items[at0006]/null_flavour|defining_code")
  private NullFlavour spoNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Waveform
   * Description: A waveform reading associated with the oximetry measurement.
   */
  @Path("/data[at0003]/items[at0054]")
  private List<Cluster> waveform;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Multimedia image
   * Description: Details of a series of oximetry readings, other than waveforms, expressed as a multimedia image or series of images. Waveforms should be recorded using the Waveform slot and associated cluster archetype.
   */
  @Path("/data[at0003]/items[at0060]")
  private List<Cluster> multimediaImage;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Interpretation
   * Description: Single word, phrase or brief description which represents the clinical meaning and significance of the measurements.
   * Comment: Coding with a terminology is preferred, if possible. For example, normal oxygen saturation or hypoxaemia.
   */
  @Path("/data[at0003]/items[at0058]")
  private List<PulseOximetryInterpretationElement> interpretation;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Comment
   * Description: A text comment about the pulse oximetry result.
   */
  @Path("/data[at0003]/items[at0036]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/Comment/null_flavour
   */
  @Path("/data[at0003]/items[at0036]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion
   * Description: Record information about level of exertion.
   */
  @Path("/state[at0014]/items[openEHR-EHR-CLUSTER.level_of_exertion.v0]")
  private LevelOfExertionCluster levelOfExertion;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Inspired oxygen
   * Description: Details of the amount of oxygen available to the subject at the time of observation.
   * Comment: Assumed values of 21% oxygen concentration, Fi0₂ of 0.21 and oxygen flow rate of 0 l/min or 0 ml/min.
   */
  @Path("/state[at0014]/items[at0015]")
  private Cluster inspiredOxygen;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Confounding factors
   * Description: Comment on and record other incidental factors that may be affect interpretation of the observation.
   * Comment: For example, motion, pain, poor perfusion, infant feeding, peripheral hypothermia, sedation.
   */
  @Path("/state[at0014]/items[at0016]")
  private List<PulseOximetryConfoundingFactorsElement> confoundingFactors;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setSpo(DvProportion spo) {
     this.spo = spo;
  }

  public DvProportion getSpo() {
     return this.spo ;
  }

  public void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode) {
     this.spoNullFlavourDefiningCode = spoNullFlavourDefiningCode;
  }

  public NullFlavour getSpoNullFlavourDefiningCode() {
     return this.spoNullFlavourDefiningCode ;
  }

  public void setWaveform(List<Cluster> waveform) {
     this.waveform = waveform;
  }

  public List<Cluster> getWaveform() {
     return this.waveform ;
  }

  public void setMultimediaImage(List<Cluster> multimediaImage) {
     this.multimediaImage = multimediaImage;
  }

  public List<Cluster> getMultimediaImage() {
     return this.multimediaImage ;
  }

  public void setInterpretation(List<PulseOximetryInterpretationElement> interpretation) {
     this.interpretation = interpretation;
  }

  public List<PulseOximetryInterpretationElement> getInterpretation() {
     return this.interpretation ;
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

  public void setLevelOfExertion(LevelOfExertionCluster levelOfExertion) {
     this.levelOfExertion = levelOfExertion;
  }

  public LevelOfExertionCluster getLevelOfExertion() {
     return this.levelOfExertion ;
  }

  public void setInspiredOxygen(Cluster inspiredOxygen) {
     this.inspiredOxygen = inspiredOxygen;
  }

  public Cluster getInspiredOxygen() {
     return this.inspiredOxygen ;
  }

  public void setConfoundingFactors(
      List<PulseOximetryConfoundingFactorsElement> confoundingFactors) {
     this.confoundingFactors = confoundingFactors;
  }

  public List<PulseOximetryConfoundingFactorsElement> getConfoundingFactors() {
     return this.confoundingFactors ;
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

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
