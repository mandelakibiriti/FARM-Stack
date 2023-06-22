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

public class ProcedureScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<ProcedureScreeningQuestionnaireObservation> PROCEDURE_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<ProcedureScreeningQuestionnaireObservation>(ProcedureScreeningQuestionnaireObservation.class, "", "ProcedureScreeningQuestionnaireObservation", ProcedureScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ProcedureScreeningQuestionnaireObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProcedureScreeningQuestionnaireObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProcedureScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProcedureScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProcedureScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<ProcedureScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<ProcedureScreeningQuestionnaireAnyEventChoice>(ProcedureScreeningQuestionnaireObservation.class, "/data[at0001]/events[at0002]", "anyEvent", ProcedureScreeningQuestionnaireAnyEventChoice.class, this);

  private ProcedureScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.procedure_screening.v1");
  }

  public static ProcedureScreeningQuestionnaireObservationContainment getInstance() {
    return new ProcedureScreeningQuestionnaireObservationContainment();
  }
}
