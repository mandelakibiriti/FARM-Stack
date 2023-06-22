package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;

public class DiagnosticInvestigationScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<DiagnosticInvestigationScreeningQuestionnaireObservation> DIAGNOSTIC_INVESTIGATION_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<DiagnosticInvestigationScreeningQuestionnaireObservation>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "", "DiagnosticInvestigationScreeningQuestionnaireObservation", DiagnosticInvestigationScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/data[at0022]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/protocol[at0005]/items[at0019]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice>(DiagnosticInvestigationScreeningQuestionnaireObservation.class, "/data[at0022]/events[at0023]", "anyEvent", DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice.class, this);

  private DiagnosticInvestigationScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.investigation_screening.v0");
  }

  public static DiagnosticInvestigationScreeningQuestionnaireObservationContainment getInstance() {
    return new DiagnosticInvestigationScreeningQuestionnaireObservationContainment();
  }
}
