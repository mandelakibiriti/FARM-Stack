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
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PulseHeartBeatObservationContainment extends Containment {
  public SelectAqlField<PulseHeartBeatObservation> PULSE_HEART_BEAT_OBSERVATION = new AqlFieldImp<PulseHeartBeatObservation>(PulseHeartBeatObservation.class, "", "PulseHeartBeatObservation", PulseHeartBeatObservation.class, this);

  public SelectAqlField<PulseHeartBeatMaximumIntervalEvent> MAXIMUM = new AqlFieldImp<PulseHeartBeatMaximumIntervalEvent>(PulseHeartBeatObservation.class, "/data[at0002]/events[at1036]", "maximum", PulseHeartBeatMaximumIntervalEvent.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(PulseHeartBeatObservation.class, "/data[at0002]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<MethodDefiningCode2> METHOD_DEFINING_CODE = new AqlFieldImp<MethodDefiningCode2>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1019]/value|defining_code", "methodDefiningCode", MethodDefiningCode2.class, this);

  public SelectAqlField<NullFlavour> METHOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1019]/null_flavour|defining_code", "methodNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> BODY_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1037]/null_flavour|defining_code", "bodySiteNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1013]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1056]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PulseHeartBeatObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PulseHeartBeatObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PulseHeartBeatObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<PulseHeartBeatBodySiteChoice> BODY_SITE = new AqlFieldImp<PulseHeartBeatBodySiteChoice>(PulseHeartBeatObservation.class, "/protocol[at0010]/items[at1037]/value", "bodySite", PulseHeartBeatBodySiteChoice.class, this);

  public ListSelectAqlField<PulseHeartBeatAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<PulseHeartBeatAnyEventChoice>(PulseHeartBeatObservation.class, "/data[at0002]/events[at0003]", "anyEvent", PulseHeartBeatAnyEventChoice.class, this);

  private PulseHeartBeatObservationContainment() {
    super("openEHR-EHR-OBSERVATION.pulse.v2");
  }

  public static PulseHeartBeatObservationContainment getInstance() {
    return new PulseHeartBeatObservationContainment();
  }
}
