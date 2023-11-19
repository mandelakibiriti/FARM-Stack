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
@Archetype("openEHR-EHR-OBSERVATION.investigation_screening.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.864518027+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class DiagnosticInvestigationScreeningQuestionnaireObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/origin
   */
  @Path("/data[at0022]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Extension
   * Description: Additional information required to extend the model with local content or to align with other reference models or formalisms.
   * Comment: For example: local information requirements; or additional metadata to align with FHIR.
   */
  @Path("/protocol[at0005]/items[at0019]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0022]/events[at0023]")
  @Choice
  private List<DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
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

  public void setAnyEvent(
      List<DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
