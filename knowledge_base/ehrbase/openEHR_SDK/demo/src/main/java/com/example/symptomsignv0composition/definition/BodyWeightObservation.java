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

@Entity
@Archetype("openEHR-EHR-OBSERVATION.body_weight.v2")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.765748954+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class BodyWeightObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Birth
   * Description: Usually the first weight, measured soon after birth. This event will only be used once per health record
   * .
   */
  @Path("/data[at0002]/events[at0026]")
  private BodyWeightBirthPointEvent birth;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/origin
   */
  @Path("/data[at0002]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Device
   * Description: Details about the weighing device.
   */
  @Path("/protocol[at0015]/items[at0020]")
  private Cluster device;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0015]/items[at0027]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0002]/events[at0003]")
  @Choice
  private List<BodyWeightAnyEventChoice> anyEvent;

  public void setBirth(BodyWeightBirthPointEvent birth) {
     this.birth = birth;
  }

  public BodyWeightBirthPointEvent getBirth() {
     return this.birth ;
  }

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
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

  public void setAnyEvent(List<BodyWeightAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<BodyWeightAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
