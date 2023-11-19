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

public class SocialContextScreeningQuestionnaireObservationContainment extends Containment {
  public SelectAqlField<SocialContextScreeningQuestionnaireObservation> SOCIAL_CONTEXT_SCREENING_QUESTIONNAIRE_OBSERVATION = new AqlFieldImp<SocialContextScreeningQuestionnaireObservation>(SocialContextScreeningQuestionnaireObservation.class, "", "SocialContextScreeningQuestionnaireObservation", SocialContextScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(SocialContextScreeningQuestionnaireObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(SocialContextScreeningQuestionnaireObservation.class, "/protocol[at0007]/items[at0021]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(SocialContextScreeningQuestionnaireObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SocialContextScreeningQuestionnaireObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SocialContextScreeningQuestionnaireObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<SocialContextScreeningQuestionnaireAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<SocialContextScreeningQuestionnaireAnyEventChoice>(SocialContextScreeningQuestionnaireObservation.class, "/data[at0001]/events[at0002]", "anyEvent", SocialContextScreeningQuestionnaireAnyEventChoice.class, this);

  private SocialContextScreeningQuestionnaireObservationContainment() {
    super("openEHR-EHR-OBSERVATION.social_context_screening.v1");
  }

  public static SocialContextScreeningQuestionnaireObservationContainment getInstance() {
    return new SocialContextScreeningQuestionnaireObservationContainment();
  }
}
