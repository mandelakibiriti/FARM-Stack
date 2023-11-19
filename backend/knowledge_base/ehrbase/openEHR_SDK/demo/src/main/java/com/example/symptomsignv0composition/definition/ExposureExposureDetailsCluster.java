package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.753396319+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExposureExposureDetailsCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Exposure Details/Date of Onset
   * Description: Date of onset of exposure to the agent.
   */
  @Path("/items[at0011]/value|value")
  private TemporalAccessor dateOfOnsetValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Exposure Details/Date of Onset/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour dateOfOnsetNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Exposure Details/Description
   * Description: Detailed description of an episode of exposure to the identified substance.
   */
  @Path("/items[at0013]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Exposure Details/Description/null_flavour
   */
  @Path("/items[at0013]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Exposure Details/Date Ceased
   * Description: Date of cessation of exposure to the agent.
   */
  @Path("/items[at0012]/value|value")
  private TemporalAccessor dateCeasedValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Tree/Exposure Details/Date Ceased/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour dateCeasedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure/Exposure Details/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDateOfOnsetValue(TemporalAccessor dateOfOnsetValue) {
     this.dateOfOnsetValue = dateOfOnsetValue;
  }

  public TemporalAccessor getDateOfOnsetValue() {
     return this.dateOfOnsetValue ;
  }

  public void setDateOfOnsetNullFlavourDefiningCode(
      NullFlavour dateOfOnsetNullFlavourDefiningCode) {
     this.dateOfOnsetNullFlavourDefiningCode = dateOfOnsetNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfOnsetNullFlavourDefiningCode() {
     return this.dateOfOnsetNullFlavourDefiningCode ;
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

  public void setDateCeasedValue(TemporalAccessor dateCeasedValue) {
     this.dateCeasedValue = dateCeasedValue;
  }

  public TemporalAccessor getDateCeasedValue() {
     return this.dateCeasedValue ;
  }

  public void setDateCeasedNullFlavourDefiningCode(NullFlavour dateCeasedNullFlavourDefiningCode) {
     this.dateCeasedNullFlavourDefiningCode = dateCeasedNullFlavourDefiningCode;
  }

  public NullFlavour getDateCeasedNullFlavourDefiningCode() {
     return this.dateCeasedNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
