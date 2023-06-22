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

public class SymptomSignObservationContainment extends Containment {
  public SelectAqlField<SymptomSignObservation> SYMPTOM_SIGN_OBSERVATION = new AqlFieldImp<SymptomSignObservation>(SymptomSignObservation.class, "", "SymptomSignObservation", SymptomSignObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(SymptomSignObservation.class, "/data[at0190]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(SymptomSignObservation.class, "/protocol[at0193]/items[at0194]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(SymptomSignObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SymptomSignObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SymptomSignObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<SymptomSignAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<SymptomSignAnyEventChoice>(SymptomSignObservation.class, "/data[at0190]/events[at0191]", "anyEvent", SymptomSignAnyEventChoice.class, this);

  private SymptomSignObservationContainment() {
    super("openEHR-EHR-OBSERVATION.symptom_sign.v0");
  }

  public static SymptomSignObservationContainment getInstance() {
    return new SymptomSignObservationContainment();
  }
}
