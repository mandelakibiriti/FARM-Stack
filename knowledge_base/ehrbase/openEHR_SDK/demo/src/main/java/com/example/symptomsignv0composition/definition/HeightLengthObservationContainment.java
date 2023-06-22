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

public class HeightLengthObservationContainment extends Containment {
  public SelectAqlField<HeightLengthObservation> HEIGHT_LENGTH_OBSERVATION = new AqlFieldImp<HeightLengthObservation>(HeightLengthObservation.class, "", "HeightLengthObservation", HeightLengthObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(HeightLengthObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(HeightLengthObservation.class, "/protocol[at0007]/items[at0011]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(HeightLengthObservation.class, "/protocol[at0007]/items[at0022]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(HeightLengthObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(HeightLengthObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(HeightLengthObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<HeightLengthAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<HeightLengthAnyEventChoice>(HeightLengthObservation.class, "/data[at0001]/events[at0002]", "anyEvent", HeightLengthAnyEventChoice.class, this);

  private HeightLengthObservationContainment() {
    super("openEHR-EHR-OBSERVATION.height.v2");
  }

  public static HeightLengthObservationContainment getInstance() {
    return new HeightLengthObservationContainment();
  }
}
