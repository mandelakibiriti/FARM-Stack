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

public class RespirationObservationContainment extends Containment {
  public SelectAqlField<RespirationObservation> RESPIRATION_OBSERVATION = new AqlFieldImp<RespirationObservation>(RespirationObservation.class, "", "RespirationObservation", RespirationObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(RespirationObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(RespirationObservation.class, "/protocol[at0057]/items[at0058]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(RespirationObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(RespirationObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(RespirationObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<RespirationAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<RespirationAnyEventChoice>(RespirationObservation.class, "/data[at0001]/events[at0002]", "anyEvent", RespirationAnyEventChoice.class, this);

  private RespirationObservationContainment() {
    super("openEHR-EHR-OBSERVATION.respiration.v2");
  }

  public static RespirationObservationContainment getInstance() {
    return new RespirationObservationContainment();
  }
}
