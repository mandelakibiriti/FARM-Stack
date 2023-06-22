package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
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
@Archetype("openEHR-EHR-OBSERVATION.pulse_oximetry.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.817341628+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class PulseOximetryObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Sensor site
   * Description: The site of the measurement sensor.
   * Comment: For example: Right index finger, left earlobe. Coding with a terminology is preferred, if possible.
   */
  @Path("/protocol[at0007]/items[at0009]/value|value")
  private String sensorSiteValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/List/Sensor site/null_flavour
   */
  @Path("/protocol[at0007]/items[at0009]/null_flavour|defining_code")
  private NullFlavour sensorSiteNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Pre/post-ductal
   * Description: Sensor site relative to the ductus arteriosus in neonates, to determine whether the blood supply to limb of the sensor site is pre- or post-ductal in cases of patent ductus arteriosus.
   */
  @Path("/protocol[at0007]/items[at0061]/value|defining_code")
  private PrePostDuctalDefiningCode prePostDuctalDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/List/Pre/post-ductal/null_flavour
   */
  @Path("/protocol[at0007]/items[at0061]/null_flavour|defining_code")
  private NullFlavour prePostDuctalNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Oximetry device
   * Description: Details of the non-invasive oximetry device used.
   */
  @Path("/protocol[at0007]/items[at0018]")
  private Cluster oximetryDevice;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with HL7 or CDISC equivalents.
   */
  @Path("/protocol[at0007]/items[at0059]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<PulseOximetryAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setSensorSiteValue(String sensorSiteValue) {
     this.sensorSiteValue = sensorSiteValue;
  }

  public String getSensorSiteValue() {
     return this.sensorSiteValue ;
  }

  public void setSensorSiteNullFlavourDefiningCode(NullFlavour sensorSiteNullFlavourDefiningCode) {
     this.sensorSiteNullFlavourDefiningCode = sensorSiteNullFlavourDefiningCode;
  }

  public NullFlavour getSensorSiteNullFlavourDefiningCode() {
     return this.sensorSiteNullFlavourDefiningCode ;
  }

  public void setPrePostDuctalDefiningCode(PrePostDuctalDefiningCode prePostDuctalDefiningCode) {
     this.prePostDuctalDefiningCode = prePostDuctalDefiningCode;
  }

  public PrePostDuctalDefiningCode getPrePostDuctalDefiningCode() {
     return this.prePostDuctalDefiningCode ;
  }

  public void setPrePostDuctalNullFlavourDefiningCode(
      NullFlavour prePostDuctalNullFlavourDefiningCode) {
     this.prePostDuctalNullFlavourDefiningCode = prePostDuctalNullFlavourDefiningCode;
  }

  public NullFlavour getPrePostDuctalNullFlavourDefiningCode() {
     return this.prePostDuctalNullFlavourDefiningCode ;
  }

  public void setOximetryDevice(Cluster oximetryDevice) {
     this.oximetryDevice = oximetryDevice;
  }

  public Cluster getOximetryDevice() {
     return this.oximetryDevice ;
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

  public void setAnyEvent(List<PulseOximetryAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<PulseOximetryAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
