package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-OBSERVATION.blood_pressure.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.785525328+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class BloodPressureObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/24 hour average
   * Description: Estimate of the average blood pressure over a 24 hour period.
   */
  @Path("/data[at0001]/events[at1042]")
  private BloodPressure24HourAverageIntervalEvent N24HourAverage;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Cuff size
   * Description: The size of the cuff used for blood pressure measurement.
   * Comment: Perloff D, Grim C, Flack J, Frohlich ED, Hill M, McDonald M, Morgenstern BZ. Human blood pressure determination by sphygmomanometry. Circulation 1993;88;2460-2470. 
   */
  @Path("/protocol[at0011]/items[at0013]/value|defining_code")
  private CuffSizeDefiningCode cuffSizeDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Tree/Cuff size/null_flavour
   */
  @Path("/protocol[at0011]/items[at0013]/null_flavour|defining_code")
  private NullFlavour cuffSizeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Tree/Location of measurement/null_flavour
   */
  @Path("/protocol[at0011]/items[at0014]/null_flavour|defining_code")
  private NullFlavour locationOfMeasurementNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Structured measurement location
   * Description: Structured anatomical location of where the measurement was taken.
   */
  @Path("/protocol[at0011]/items[at1057]")
  private List<Cluster> structuredMeasurementLocation;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Method
   * Description: Method of measurement of blood pressure.
   */
  @Path("/protocol[at0011]/items[at1035]/value|defining_code")
  private MethodDefiningCode methodDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Tree/Method/null_flavour
   */
  @Path("/protocol[at0011]/items[at1035]/null_flavour|defining_code")
  private NullFlavour methodNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Device
   * Description: Details about sphygmomanometer or other device used to measure the blood pressure.
   */
  @Path("/protocol[at0011]/items[at1025]")
  private Cluster device;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: For example: Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0011]/items[at1058]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Location of measurement
   * Description: Simple body site where blood pressure was measured.
   */
  @Path("/protocol[at0011]/items[at0014]/value")
  @Choice
  private BloodPressureLocationOfMeasurementChoice locationOfMeasurement;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0006]")
  @Choice
  private List<BloodPressureAnyEventChoice> anyEvent;

  public void setN24HourAverage(BloodPressure24HourAverageIntervalEvent N24HourAverage) {
     this.N24HourAverage = N24HourAverage;
  }

  public BloodPressure24HourAverageIntervalEvent getN24HourAverage() {
     return this.N24HourAverage ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setCuffSizeDefiningCode(CuffSizeDefiningCode cuffSizeDefiningCode) {
     this.cuffSizeDefiningCode = cuffSizeDefiningCode;
  }

  public CuffSizeDefiningCode getCuffSizeDefiningCode() {
     return this.cuffSizeDefiningCode ;
  }

  public void setCuffSizeNullFlavourDefiningCode(NullFlavour cuffSizeNullFlavourDefiningCode) {
     this.cuffSizeNullFlavourDefiningCode = cuffSizeNullFlavourDefiningCode;
  }

  public NullFlavour getCuffSizeNullFlavourDefiningCode() {
     return this.cuffSizeNullFlavourDefiningCode ;
  }

  public void setLocationOfMeasurementNullFlavourDefiningCode(
      NullFlavour locationOfMeasurementNullFlavourDefiningCode) {
     this.locationOfMeasurementNullFlavourDefiningCode = locationOfMeasurementNullFlavourDefiningCode;
  }

  public NullFlavour getLocationOfMeasurementNullFlavourDefiningCode() {
     return this.locationOfMeasurementNullFlavourDefiningCode ;
  }

  public void setStructuredMeasurementLocation(List<Cluster> structuredMeasurementLocation) {
     this.structuredMeasurementLocation = structuredMeasurementLocation;
  }

  public List<Cluster> getStructuredMeasurementLocation() {
     return this.structuredMeasurementLocation ;
  }

  public void setMethodDefiningCode(MethodDefiningCode methodDefiningCode) {
     this.methodDefiningCode = methodDefiningCode;
  }

  public MethodDefiningCode getMethodDefiningCode() {
     return this.methodDefiningCode ;
  }

  public void setMethodNullFlavourDefiningCode(NullFlavour methodNullFlavourDefiningCode) {
     this.methodNullFlavourDefiningCode = methodNullFlavourDefiningCode;
  }

  public NullFlavour getMethodNullFlavourDefiningCode() {
     return this.methodNullFlavourDefiningCode ;
  }

  public void setDevice(Cluster device) {
     this.device = device;
  }

  public Cluster getDevice() {
     return this.device ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setLocationOfMeasurement(
      BloodPressureLocationOfMeasurementChoice locationOfMeasurement) {
     this.locationOfMeasurement = locationOfMeasurement;
  }

  public BloodPressureLocationOfMeasurementChoice getLocationOfMeasurement() {
     return this.locationOfMeasurement ;
  }

  public void setAnyEvent(List<BloodPressureAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<BloodPressureAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
