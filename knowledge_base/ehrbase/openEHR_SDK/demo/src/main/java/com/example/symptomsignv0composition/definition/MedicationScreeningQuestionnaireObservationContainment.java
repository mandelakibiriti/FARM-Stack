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

public class MedicationScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<MedicationScreeningQuestionnaireObservation> MEDICATION_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<MedicationScreeningQuestionnaireObservation>(MedicationScreeningQuestionnaireObservation.class, "", "MedicationScreeningQuestionnaireObservation", MedicationScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(MedicationScreeningQuestionnaireObservation.class, "/data[at0022]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(MedicationScreeningQuestionnaireObservation.class, "/protocol[at0005]/items[at0019]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(MedicationScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(MedicationScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(MedicationScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<MedicationScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<MedicationScreeningQuestionnaireAnyEventChoice>(MedicationScreeningQuestionnaireObservation.class, "/data[at0022]/events[at0023]", "anyEvent", MedicationScreeningQuestionnaireAnyEventChoice.class, this);

  private MedicationScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.medication_screening.v1");
  }

  public static MedicationScreeningQuestionnaireObservationContainment getInstance() {
    return new MedicationScreeningQuestionnaireObservationContainment();
  }
}
