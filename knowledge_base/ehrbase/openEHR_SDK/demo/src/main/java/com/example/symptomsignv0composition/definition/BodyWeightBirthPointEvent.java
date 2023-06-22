package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.PointEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.765932192+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class BodyWeightBirthPointEvent implements PointEventEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|magnitude")
  private Double weightMagnitude;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/Weight
   * Description: The weight of the individual.
   */
  @Path("/data[at0001]/items[at0004]/value|units")
  private String weightUnits;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/history/Birth/Simple/Weight/null_flavour
   */
  @Path("/data[at0001]/items[at0004]/null_flavour|defining_code")
  private NullFlavour weightNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/Comment
   * Description: Additional narrative about the measurement of Body weight, not captured in other fields.
   */
  @Path("/data[at0001]/items[at0024]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/history/Birth/Simple/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0024]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/State of dress
   * Description: Description of the state of dress of the person at the time of weighing.
   */
  @Path("/state[at0008]/items[at0009]/value|defining_code")
  private StateOfDressDefiningCode stateOfDressDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/history/Birth/state structure/State of dress/null_flavour
   */
  @Path("/state[at0008]/items[at0009]/null_flavour|defining_code")
  private NullFlavour stateOfDressNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/Confounding factors
   * Description: Record any issues or factors that may impact on the measurement of body weight eg timing in menstrual cycle, timing of recent bowel motion or noting of amputation.
   */
  @Path("/state[at0008]/items[at0025]")
  private List<BodyWeightConfoundingFactorsElement> confoundingFactors;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  public void setWeightMagnitude(Double weightMagnitude) {
     this.weightMagnitude = weightMagnitude;
  }

  public Double getWeightMagnitude() {
     return this.weightMagnitude ;
  }

  public void setWeightUnits(String weightUnits) {
     this.weightUnits = weightUnits;
  }

  public String getWeightUnits() {
     return this.weightUnits ;
  }

  public void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode) {
     this.weightNullFlavourDefiningCode = weightNullFlavourDefiningCode;
  }

  public NullFlavour getWeightNullFlavourDefiningCode() {
     return this.weightNullFlavourDefiningCode ;
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

  public void setStateOfDressDefiningCode(StateOfDressDefiningCode stateOfDressDefiningCode) {
     this.stateOfDressDefiningCode = stateOfDressDefiningCode;
  }

  public StateOfDressDefiningCode getStateOfDressDefiningCode() {
     return this.stateOfDressDefiningCode ;
  }

  public void setStateOfDressNullFlavourDefiningCode(
      NullFlavour stateOfDressNullFlavourDefiningCode) {
     this.stateOfDressNullFlavourDefiningCode = stateOfDressNullFlavourDefiningCode;
  }

  public NullFlavour getStateOfDressNullFlavourDefiningCode() {
     return this.stateOfDressNullFlavourDefiningCode ;
  }

  public void setConfoundingFactors(List<BodyWeightConfoundingFactorsElement> confoundingFactors) {
     this.confoundingFactors = confoundingFactors;
  }

  public List<BodyWeightConfoundingFactorsElement> getConfoundingFactors() {
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
}
