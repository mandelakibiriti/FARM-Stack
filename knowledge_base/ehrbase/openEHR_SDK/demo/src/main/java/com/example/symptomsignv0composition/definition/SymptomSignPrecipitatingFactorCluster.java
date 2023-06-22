package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.726537365+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class SymptomSignPrecipitatingFactorCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor/Factor
   * Description: Name of the health event, symptom, reported sign or other factor.
   * Comment: For example: onset of another symptom; onset of menstruation; or fall off bicycle.
   */
  @Path("/items[at0170]/value|value")
  private String factorValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Precipitating factor/Factor/null_flavour
   */
  @Path("/items[at0170]/null_flavour|defining_code")
  private NullFlavour factorNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor/Factor detail
   * Description: Structured detail about the factor associated with the identified symptom or sign.
   */
  @Path("/items[at0154]")
  private List<Cluster> factorDetail;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor/Time interval
   * Description: The interval of time between the occurrence or onset of the factor and onset/resolution of the symptom or sign.
   */
  @Path("/items[at0171]/value|value")
  private TemporalAmount timeIntervalValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Precipitating factor/Time interval/null_flavour
   */
  @Path("/items[at0171]/null_flavour|defining_code")
  private NullFlavour timeIntervalNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor/Description
   * Description: Narrative description about the effect of the factor on the identified symptom or sign.
   */
  @Path("/items[at0185]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Precipitating factor/Description/null_flavour
   */
  @Path("/items[at0185]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setFactorValue(String factorValue) {
     this.factorValue = factorValue;
  }

  public String getFactorValue() {
     return this.factorValue ;
  }

  public void setFactorNullFlavourDefiningCode(NullFlavour factorNullFlavourDefiningCode) {
     this.factorNullFlavourDefiningCode = factorNullFlavourDefiningCode;
  }

  public NullFlavour getFactorNullFlavourDefiningCode() {
     return this.factorNullFlavourDefiningCode ;
  }

  public void setFactorDetail(List<Cluster> factorDetail) {
     this.factorDetail = factorDetail;
  }

  public List<Cluster> getFactorDetail() {
     return this.factorDetail ;
  }

  public void setTimeIntervalValue(TemporalAmount timeIntervalValue) {
     this.timeIntervalValue = timeIntervalValue;
  }

  public TemporalAmount getTimeIntervalValue() {
     return this.timeIntervalValue ;
  }

  public void setTimeIntervalNullFlavourDefiningCode(
      NullFlavour timeIntervalNullFlavourDefiningCode) {
     this.timeIntervalNullFlavourDefiningCode = timeIntervalNullFlavourDefiningCode;
  }

  public NullFlavour getTimeIntervalNullFlavourDefiningCode() {
     return this.timeIntervalNullFlavourDefiningCode ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
