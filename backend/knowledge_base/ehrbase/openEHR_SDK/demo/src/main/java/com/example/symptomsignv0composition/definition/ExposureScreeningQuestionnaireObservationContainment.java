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

public class ExposureScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<ExposureScreeningQuestionnaireObservation> EXPOSURE_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<ExposureScreeningQuestionnaireObservation>(ExposureScreeningQuestionnaireObservation.class, "", "ExposureScreeningQuestionnaireObservation", ExposureScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(ExposureScreeningQuestionnaireObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ExposureScreeningQuestionnaireObservation.class, "/protocol[at0018]/items[at0019]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExposureScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExposureScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExposureScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<ExposureScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<ExposureScreeningQuestionnaireAnyEventChoice>(ExposureScreeningQuestionnaireObservation.class, "/data[at0001]/events[at0002]", "anyEvent", ExposureScreeningQuestionnaireAnyEventChoice.class, this);

  private ExposureScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.exposure_screening.v0");
  }

  public static ExposureScreeningQuestionnaireObservationContainment getInstance() {
    return new ExposureScreeningQuestionnaireObservationContainment();
  }
}
