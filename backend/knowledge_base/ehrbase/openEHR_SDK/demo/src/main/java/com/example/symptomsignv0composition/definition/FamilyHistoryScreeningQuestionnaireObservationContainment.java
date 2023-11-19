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

public class FamilyHistoryScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<FamilyHistoryScreeningQuestionnaireObservation> FAMILY_HISTORY_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<FamilyHistoryScreeningQuestionnaireObservation>(FamilyHistoryScreeningQuestionnaireObservation.class, "", "FamilyHistoryScreeningQuestionnaireObservation", FamilyHistoryScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(FamilyHistoryScreeningQuestionnaireObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(FamilyHistoryScreeningQuestionnaireObservation.class, "/protocol[at0021]/items[at0029]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(FamilyHistoryScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(FamilyHistoryScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(FamilyHistoryScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<FamilyHistoryScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<FamilyHistoryScreeningQuestionnaireAnyEventChoice>(FamilyHistoryScreeningQuestionnaireObservation.class, "/data[at0001]/events[at0002]", "anyEvent", FamilyHistoryScreeningQuestionnaireAnyEventChoice.class, this);

  private FamilyHistoryScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.family_history_screening_questionnaire.v0");
  }

  public static FamilyHistoryScreeningQuestionnaireObservationContainment getInstance() {
    return new FamilyHistoryScreeningQuestionnaireObservationContainment();
  }
}
