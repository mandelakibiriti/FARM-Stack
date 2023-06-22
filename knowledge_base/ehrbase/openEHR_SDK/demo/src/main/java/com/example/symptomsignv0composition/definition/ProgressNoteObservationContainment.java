package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class ProgressNoteObservationContainment extends Containment {
  public SelectAqlField<ProgressNoteObservation> PROGRESS_NOTE_OBSERVATION = new AqlFieldImp<ProgressNoteObservation>(ProgressNoteObservation.class, "", "ProgressNoteObservation", ProgressNoteObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ProgressNoteObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierCluster2> PROBLEM_DIAGNOSIS_QUALIFIER = new AqlFieldImp<ProblemDiagnosisQualifierCluster2>(ProgressNoteObservation.class, "/protocol[at0005]/items[openEHR-EHR-CLUSTER.problem_qualifier.v2]", "problemDiagnosisQualifier", ProblemDiagnosisQualifierCluster2.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProgressNoteObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProgressNoteObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProgressNoteObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<ProgressNoteAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<ProgressNoteAnyEventChoice>(ProgressNoteObservation.class, "/data[at0001]/events[at0002]", "anyEvent", ProgressNoteAnyEventChoice.class, this);

  private ProgressNoteObservationContainment() {
    super("openEHR-EHR-OBSERVATION.progress_note.v1");
  }

  public static ProgressNoteObservationContainment getInstance() {
    return new ProgressNoteObservationContainment();
  }
}
