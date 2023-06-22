package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.771116006+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("POINT_EVENT")
public class HeightLengthAnyEventPointEvent implements PointEventEntity, HeightLengthAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Height/Length
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004]/value|magnitude")
  private Double heightLengthMagnitude;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Height/Length
   * Description: The length of the body from crown of head to sole of foot.
   */
  @Path("/data[at0003]/items[at0004]/value|units")
  private String heightLengthUnits;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Simple/Height/Length/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour heightLengthNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Comment
   * Description: Additional narrative about the measurement, not captured in other fields.
   */
  @Path("/data[at0003]/items[at0018]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Simple/Comment/null_flavour
   */
  @Path("/data[at0003]/items[at0018]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Position
   * Description: Position of individual when measured.
   */
  @Path("/state[at0013]/items[at0014]/value|defining_code")
  private PositionDefiningCode positionDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/Tree/Position/null_flavour
   */
  @Path("/state[at0013]/items[at0014]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setHeightLengthMagnitude(Double heightLengthMagnitude) {
     this.heightLengthMagnitude = heightLengthMagnitude;
  }

  public Double getHeightLengthMagnitude() {
     return this.heightLengthMagnitude ;
  }

  public void setHeightLengthUnits(String heightLengthUnits) {
     this.heightLengthUnits = heightLengthUnits;
  }

  public String getHeightLengthUnits() {
     return this.heightLengthUnits ;
  }

  public void setHeightLengthNullFlavourDefiningCode(
      NullFlavour heightLengthNullFlavourDefiningCode) {
     this.heightLengthNullFlavourDefiningCode = heightLengthNullFlavourDefiningCode;
  }

  public NullFlavour getHeightLengthNullFlavourDefiningCode() {
     return this.heightLengthNullFlavourDefiningCode ;
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

  public void setPositionDefiningCode(PositionDefiningCode positionDefiningCode) {
     this.positionDefiningCode = positionDefiningCode;
  }

  public PositionDefiningCode getPositionDefiningCode() {
     return this.positionDefiningCode ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
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
