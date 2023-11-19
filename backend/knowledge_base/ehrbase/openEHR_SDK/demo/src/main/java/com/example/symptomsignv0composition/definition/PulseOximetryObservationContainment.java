package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PulseOximetryObservationContainment extends Containment {
  public SelectAqlField<PulseOximetryObservation> PULSE_OXIMETRY_OBSERVATION = new AqlFieldImp<PulseOximetryObservation>(PulseOximetryObservation.class, "", "PulseOximetryObservation", PulseOximetryObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(PulseOximetryObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<String> SENSOR_SITE_VALUE = new AqlFieldImp<String>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0009]/value|value", "sensorSiteValue", String.class, this);

  public SelectAqlField<NullFlavour> SENSOR_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0009]/null_flavour|defining_code", "sensorSiteNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PrePostDuctalDefiningCode> PRE_POST_DUCTAL_DEFINING_CODE = new AqlFieldImp<PrePostDuctalDefiningCode>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0061]/value|defining_code", "prePostDuctalDefiningCode", PrePostDuctalDefiningCode.class, this);

  public SelectAqlField<NullFlavour> PRE_POST_DUCTAL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0061]/null_flavour|defining_code", "prePostDuctalNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> OXIMETRY_DEVICE = new AqlFieldImp<Cluster>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0018]", "oximetryDevice", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PulseOximetryObservation.class, "/protocol[at0007]/items[at0059]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PulseOximetryObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PulseOximetryObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PulseOximetryObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<PulseOximetryAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<PulseOximetryAnyEventChoice>(PulseOximetryObservation.class, "/data[at0001]/events[at0002]", "anyEvent", PulseOximetryAnyEventChoice.class, this);

  private PulseOximetryObservationContainment() {
    super("openEHR-EHR-OBSERVATION.pulse_oximetry.v1");
  }

  public static PulseOximetryObservationContainment getInstance() {
    return new PulseOximetryObservationContainment();
  }
}
