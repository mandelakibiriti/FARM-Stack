package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
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
    date = "2023-06-19T20:52:30.835430065+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class SocialContextScreeningQuestionnaireAnyEventIntervalEvent implements IntervalEventEntity, SocialContextScreeningQuestionnaireAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Screening purpose
   * Description: The context or reason for screening.
   * Comment: This data element is intended to provide collection context for the question/answer groups when queried at a later date. It is not expected that this data element will be exposed to the individual, but only stored in data. For example: pre-admission screening or the name of the actual questionnaire.
   */
  @Path("/data[at0003]/items[at0034]/value|value")
  private String screeningPurposeValue;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Tree/Screening purpose/null_flavour
   */
  @Path("/data[at0003]/items[at0034]/null_flavour|defining_code")
  private NullFlavour screeningPurposeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Specific social context
   * Description: Details about a specified social context or issue, or a grouping of these, relevant for the screening purpose.
   */
  @Path("/data[at0003]/items[at0022]")
  private List<SocialContextScreeningQuestionnaireSpecificSocialContextCluster> specificSocialContext;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/Additional details
   * Description: Additional structured details or questions about screening for social context items.
   */
  @Path("/data[at0003]/items[at0044]")
  private List<Cluster> additionalDetails;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

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

  public void setSpecificSocialContext(
      List<SocialContextScreeningQuestionnaireSpecificSocialContextCluster> specificSocialContext) {
     this.specificSocialContext = specificSocialContext;
  }

  public List<SocialContextScreeningQuestionnaireSpecificSocialContextCluster> getSpecificSocialContext(
      ) {
     return this.specificSocialContext ;
  }

  public void setAdditionalDetails(List<Cluster> additionalDetails) {
     this.additionalDetails = additionalDetails;
  }

  public List<Cluster> getAdditionalDetails() {
     return this.additionalDetails ;
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
