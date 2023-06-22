package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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
    date = "2023-06-19T20:52:30.874188426+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class ExposureScreeningQuestionnaireAnyEventIntervalEvent implements IntervalEventEntity, ExposureScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Screening purpose
   * Description: The name of the chemical, physical or biological agent to which an individual may have been exposed.
   * Comment: Coding of 'Agent' with a terminology is preferred, where possible. Free text should be used only if there is no appropriate terminology available. For example: 2019-nCoV; or HIV.
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String screeningPurposeValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Screening purpose/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Name of agent
   * Description: Name of the chemical, physical or biological agent that has potential to cause harm to an individual on exposure.
   * Comment: For example: noise, cigarette smoke or a virus.
   */
  @Path("/data[at0003]/items[at0020]/value|value")
  private String nameOfAgentValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Name of agent/null_flavour
   */
  @Path("/data[at0003]/items[at0020]/null_flavour|defining_code")
  private NullFlavour nameOfAgentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Item tree/Any exposure?/null_flavour
   */
  @Path("/data[at0003]/items[at0005]/null_flavour|defining_code")
  private NullFlavour anyExposureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Specific exposure
   * Description: Details about each possible specific exposure circumstance.
   */
  @Path("/data[at0003]/items[at0009]")
  private List<ExposureScreeningQuestionnaireSpecificExposureCluster> specificExposure;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire/Any event/Any exposure?
   * Description: Presence of any relevant exposure.
   */
  @Path("/data[at0003]/items[at0005]/value")
  @Choice
  private ExposureScreeningQuestionnaireAnyExposureChoice anyExposure;

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

  public void setNameOfAgentValue(String nameOfAgentValue) {
     this.nameOfAgentValue = nameOfAgentValue;
  }

  public String getNameOfAgentValue() {
     return this.nameOfAgentValue ;
  }

  public void setNameOfAgentNullFlavourDefiningCode(
      NullFlavour nameOfAgentNullFlavourDefiningCode) {
     this.nameOfAgentNullFlavourDefiningCode = nameOfAgentNullFlavourDefiningCode;
  }

  public NullFlavour getNameOfAgentNullFlavourDefiningCode() {
     return this.nameOfAgentNullFlavourDefiningCode ;
  }

  public void setAnyExposureNullFlavourDefiningCode(
      NullFlavour anyExposureNullFlavourDefiningCode) {
     this.anyExposureNullFlavourDefiningCode = anyExposureNullFlavourDefiningCode;
  }

  public NullFlavour getAnyExposureNullFlavourDefiningCode() {
     return this.anyExposureNullFlavourDefiningCode ;
  }

  public void setSpecificExposure(
      List<ExposureScreeningQuestionnaireSpecificExposureCluster> specificExposure) {
     this.specificExposure = specificExposure;
  }

  public List<ExposureScreeningQuestionnaireSpecificExposureCluster> getSpecificExposure() {
     return this.specificExposure ;
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

  public void setAnyExposure(ExposureScreeningQuestionnaireAnyExposureChoice anyExposure) {
     this.anyExposure = anyExposure;
  }

  public ExposureScreeningQuestionnaireAnyExposureChoice getAnyExposure() {
     return this.anyExposure ;
  }
}
