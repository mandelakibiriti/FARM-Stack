package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
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
    date = "2023-06-19T20:52:30.833043247+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class ProgressNoteAnyEventIntervalEvent implements IntervalEventEntity, ProgressNoteAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/Progress Note
   * Description: Narrative description of health-related events, health status, findings, opinions at a specific point-in-time.
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String progressNoteValue;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/Tree/Progress Note/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour progressNoteNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setProgressNoteValue(String progressNoteValue) {
     this.progressNoteValue = progressNoteValue;
  }

  public String getProgressNoteValue() {
     return this.progressNoteValue ;
  }

  public void setProgressNoteNullFlavourDefiningCode(
      NullFlavour progressNoteNullFlavourDefiningCode) {
     this.progressNoteNullFlavourDefiningCode = progressNoteNullFlavourDefiningCode;
  }

  public NullFlavour getProgressNoteNullFlavourDefiningCode() {
     return this.progressNoteNullFlavourDefiningCode ;
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
