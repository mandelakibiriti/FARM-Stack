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

public class BodyWeightObservationContainment extends Containment {
  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT_OBSERVATION = new AqlFieldImp<BodyWeightObservation>(BodyWeightObservation.class, "", "BodyWeightObservation", BodyWeightObservation.class, this);

  public SelectAqlField<BodyWeightBirthPointEvent> BIRTH = new AqlFieldImp<BodyWeightBirthPointEvent>(BodyWeightObservation.class, "/data[at0002]/events[at0026]", "birth", BodyWeightBirthPointEvent.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(BodyWeightObservation.class, "/data[at0002]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(BodyWeightObservation.class, "/protocol[at0015]/items[at0020]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(BodyWeightObservation.class, "/protocol[at0015]/items[at0027]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(BodyWeightObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(BodyWeightObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(BodyWeightObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<BodyWeightAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<BodyWeightAnyEventChoice>(BodyWeightObservation.class, "/data[at0002]/events[at0003]", "anyEvent", BodyWeightAnyEventChoice.class, this);

  private BodyWeightObservationContainment() {
    super("openEHR-EHR-OBSERVATION.body_weight.v2");
  }

  public static BodyWeightObservationContainment getInstance() {
    return new BodyWeightObservationContainment();
  }
}
