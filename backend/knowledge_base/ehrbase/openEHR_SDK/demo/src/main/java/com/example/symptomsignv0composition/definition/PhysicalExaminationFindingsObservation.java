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
@Archetype("openEHR-EHR-OBSERVATION.exam.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.773478790+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class PhysicalExaminationFindingsObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device
   * Description: An instrument, apparatus, implant, material or similar, used in the provision of healthcare. In this context, a medical device includes a broad range of devices which act through a variety of physical, mechanical, thermal or similar means but specifically excludes devices which act through medicinal means such as pharmacological, metabolic or immunological methods.  The scope is inclusive of disposable devices as well as durable or persisting devices that require tracking, maintenance activities or regular calibration, recognising that each type of device has specific data recording requirements.
   */
  @Path("/protocol[at0007]/items[openEHR-EHR-CLUSTER.device.v1]")
  private MedicalDeviceCluster medicalDevice;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: e.g. Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0007]/items[at0012]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<PhysicalExaminationFindingsAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setMedicalDevice(MedicalDeviceCluster medicalDevice) {
     this.medicalDevice = medicalDevice;
  }

  public MedicalDeviceCluster getMedicalDevice() {
     return this.medicalDevice ;
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

  public void setAnyEvent(List<PhysicalExaminationFindingsAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<PhysicalExaminationFindingsAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
