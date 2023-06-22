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
@Archetype("openEHR-EHR-OBSERVATION.pulse.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.800018365+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class PulseHeartBeatObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Maximum
   * Description: Maximum pulse rate or heart rate observed during a period of exertion.
   */
  @Path("/data[at0002]/events[at1036]")
  private PulseHeartBeatMaximumIntervalEvent maximum;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/origin
   */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Method
   * Description: Method used to observe the pulse or heart beat.
   * Comment: For example, auscultation or electronic monitoring.
   */
  @Path("/protocol[at0010]/items[at1019]/value|defining_code")
  private MethodDefiningCode2 methodDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/List/Method/null_flavour
   */
  @Path("/protocol[at0010]/items[at1019]/null_flavour|defining_code")
  private NullFlavour methodNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/List/Body site/null_flavour
   */
  @Path("/protocol[at0010]/items[at1037]/null_flavour|defining_code")
  private NullFlavour bodySiteNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Device
   * Description: Details about the device used to measure the pulse rate or heart rate.
   */
  @Path("/protocol[at0010]/items[at1013]")
  private Cluster device;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0010]/items[at1056]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Body site
   * Description: Body site where the pulse or heart beat were observed.
   */
  @Path("/protocol[at0010]/items[at1037]/value")
  @Choice
  private PulseHeartBeatBodySiteChoice bodySite;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0002]/events[at0003]")
  @Choice
  private List<PulseHeartBeatAnyEventChoice> anyEvent;

  public void setMaximum(PulseHeartBeatMaximumIntervalEvent maximum) {
     this.maximum = maximum;
  }

  public PulseHeartBeatMaximumIntervalEvent getMaximum() {
     return this.maximum ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setMethodDefiningCode(MethodDefiningCode2 methodDefiningCode) {
     this.methodDefiningCode = methodDefiningCode;
  }

  public MethodDefiningCode2 getMethodDefiningCode() {
     return this.methodDefiningCode ;
  }

  public void setMethodNullFlavourDefiningCode(NullFlavour methodNullFlavourDefiningCode) {
     this.methodNullFlavourDefiningCode = methodNullFlavourDefiningCode;
  }

  public NullFlavour getMethodNullFlavourDefiningCode() {
     return this.methodNullFlavourDefiningCode ;
  }

  public void setBodySiteNullFlavourDefiningCode(NullFlavour bodySiteNullFlavourDefiningCode) {
     this.bodySiteNullFlavourDefiningCode = bodySiteNullFlavourDefiningCode;
  }

  public NullFlavour getBodySiteNullFlavourDefiningCode() {
     return this.bodySiteNullFlavourDefiningCode ;
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

  public void setBodySite(PulseHeartBeatBodySiteChoice bodySite) {
     this.bodySite = bodySite;
  }

  public PulseHeartBeatBodySiteChoice getBodySite() {
     return this.bodySite ;
  }

  public void setAnyEvent(List<PulseHeartBeatAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<PulseHeartBeatAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
