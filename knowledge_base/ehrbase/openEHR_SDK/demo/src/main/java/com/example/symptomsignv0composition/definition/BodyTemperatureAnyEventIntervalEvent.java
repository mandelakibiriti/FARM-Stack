package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.795849966+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class BodyTemperatureAnyEventIntervalEvent implements IntervalEventEntity, BodyTemperatureAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double temperatureMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Temperature
   * Description: The measured temperature.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String temperatureUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Tree/Temperature/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour temperatureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Comment
   * Description: Additional comment about the body temperature measurement not captured in other fields.
   */
  @Path("/data[at0001]/items[at0063]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0063]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/State/Body exposure/null_flavour
   */
  @Path("/state[at0029]/items[at0030]/null_flavour|defining_code")
  private NullFlavour bodyExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Day of menstrual cycle
   * Description: Current day of the menstrual cycle.
   * Comment: The first day of menstruation is considered to be Day 1 of each menstrual cycle.
   */
  @Path("/state[at0029]/items[at0065]/value|magnitude")
  private Long dayOfMenstrualCycleMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/State/Day of menstrual cycle/null_flavour
   */
  @Path("/state[at0029]/items[at0065]/null_flavour|defining_code")
  private NullFlavour dayOfMenstrualCycleNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Environmental conditions
   * Description: Details about the environmental conditions at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0056]")
  private List<Cluster> environmentalConditions;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Exertion
   * Description: Details about the exertion of the person at the time of temperature measurement.
   */
  @Path("/state[at0029]/items[at0057]")
  private Cluster exertion;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature/Any event/Body exposure
   * Description: The degree of exposure of the individual at the time of measurement.
   */
  @Path("/state[at0029]/items[at0030]/value")
  @Choice
  private BodyTemperatureBodyExposureChoice bodyExposure;

  public void setTemperatureMagnitude(Double temperatureMagnitude) {
     this.temperatureMagnitude = temperatureMagnitude;
  }

  public Double getTemperatureMagnitude() {
     return this.temperatureMagnitude ;
  }

  public void setTemperatureUnits(String temperatureUnits) {
     this.temperatureUnits = temperatureUnits;
  }

  public String getTemperatureUnits() {
     return this.temperatureUnits ;
  }

  public void setTemperatureNullFlavourDefiningCode(
      NullFlavour temperatureNullFlavourDefiningCode) {
     this.temperatureNullFlavourDefiningCode = temperatureNullFlavourDefiningCode;
  }

  public NullFlavour getTemperatureNullFlavourDefiningCode() {
     return this.temperatureNullFlavourDefiningCode ;
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

  public void setBodyExposureNullFlavourDefiningCode(
      NullFlavour bodyExposureNullFlavourDefiningCode) {
     this.bodyExposureNullFlavourDefiningCode = bodyExposureNullFlavourDefiningCode;
  }

  public NullFlavour getBodyExposureNullFlavourDefiningCode() {
     return this.bodyExposureNullFlavourDefiningCode ;
  }

  public void setDayOfMenstrualCycleMagnitude(Long dayOfMenstrualCycleMagnitude) {
     this.dayOfMenstrualCycleMagnitude = dayOfMenstrualCycleMagnitude;
  }

  public Long getDayOfMenstrualCycleMagnitude() {
     return this.dayOfMenstrualCycleMagnitude ;
  }

  public void setDayOfMenstrualCycleNullFlavourDefiningCode(
      NullFlavour dayOfMenstrualCycleNullFlavourDefiningCode) {
     this.dayOfMenstrualCycleNullFlavourDefiningCode = dayOfMenstrualCycleNullFlavourDefiningCode;
  }

  public NullFlavour getDayOfMenstrualCycleNullFlavourDefiningCode() {
     return this.dayOfMenstrualCycleNullFlavourDefiningCode ;
  }

  public void setEnvironmentalConditions(List<Cluster> environmentalConditions) {
     this.environmentalConditions = environmentalConditions;
  }

  public List<Cluster> getEnvironmentalConditions() {
     return this.environmentalConditions ;
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

  public void setBodyExposure(BodyTemperatureBodyExposureChoice bodyExposure) {
     this.bodyExposure = bodyExposure;
  }

  public BodyTemperatureBodyExposureChoice getBodyExposure() {
     return this.bodyExposure ;
  }
}
