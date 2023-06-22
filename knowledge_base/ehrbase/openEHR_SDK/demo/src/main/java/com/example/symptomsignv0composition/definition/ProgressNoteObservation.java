package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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
@Archetype("openEHR-EHR-OBSERVATION.progress_note.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.829860158+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ProgressNoteObservation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/origin
   */
  @Path("/data[at0001]/origin|value")
  private TemporalAccessor originValue;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Problem/Diagnosis qualifier
   * Description: Contextual or temporal qualifier for a specified problem or diagnosis.
   */
  @Path("/protocol[at0005]/items[openEHR-EHR-CLUSTER.problem_qualifier.v2]")
  private ProblemDiagnosisQualifierCluster2 problemDiagnosisQualifier;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note/Any event
   * Description: Default, unspecified point in time or interval event which may be explicitly defined in a template or at run-time.
   */
  @Path("/data[at0001]/events[at0002]")
  @Choice
  private List<ProgressNoteAnyEventChoice> anyEvent;

  public void setOriginValue(TemporalAccessor originValue) {
     this.originValue = originValue;
  }

  public TemporalAccessor getOriginValue() {
     return this.originValue ;
  }

  public void setProblemDiagnosisQualifier(
      ProblemDiagnosisQualifierCluster2 problemDiagnosisQualifier) {
     this.problemDiagnosisQualifier = problemDiagnosisQualifier;
  }

  public ProblemDiagnosisQualifierCluster2 getProblemDiagnosisQualifier() {
     return this.problemDiagnosisQualifier ;
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

  public void setAnyEvent(List<ProgressNoteAnyEventChoice> anyEvent) {
     this.anyEvent = anyEvent;
  }

  public List<ProgressNoteAnyEventChoice> getAnyEvent() {
     return this.anyEvent ;
  }
}
