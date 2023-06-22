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

public class BloodPressureObservationContainment extends Containment {
  public SelectAqlField<BloodPressureObservation> BLOOD_PRESSURE_OBSERVATION = new AqlFieldImp<BloodPressureObservation>(BloodPressureObservation.class, "", "BloodPressureObservation", BloodPressureObservation.class, this);

  public SelectAqlField<BloodPressure24HourAverageIntervalEvent> N24_HOUR_AVERAGE = new AqlFieldImp<BloodPressure24HourAverageIntervalEvent>(BloodPressureObservation.class, "/data[at0001]/events[at1042]", "N24HourAverage", BloodPressure24HourAverageIntervalEvent.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(BloodPressureObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<CuffSizeDefiningCode> CUFF_SIZE_DEFINING_CODE = new AqlFieldImp<CuffSizeDefiningCode>(BloodPressureObservation.class, "/protocol[at0011]/items[at0013]/value|defining_code", "cuffSizeDefiningCode", CuffSizeDefiningCode.class, this);

  public SelectAqlField<NullFlavour> CUFF_SIZE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(BloodPressureObservation.class, "/protocol[at0011]/items[at0013]/null_flavour|defining_code", "cuffSizeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> LOCATION_OF_MEASUREMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(BloodPressureObservation.class, "/protocol[at0011]/items[at0014]/null_flavour|defining_code", "locationOfMeasurementNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_MEASUREMENT_LOCATION = new ListAqlFieldImp<Cluster>(BloodPressureObservation.class, "/protocol[at0011]/items[at1057]", "structuredMeasurementLocation", Cluster.class, this);

  public SelectAqlField<MethodDefiningCode> METHOD_DEFINING_CODE = new AqlFieldImp<MethodDefiningCode>(BloodPressureObservation.class, "/protocol[at0011]/items[at1035]/value|defining_code", "methodDefiningCode", MethodDefiningCode.class, this);

  public SelectAqlField<NullFlavour> METHOD_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(BloodPressureObservation.class, "/protocol[at0011]/items[at1035]/null_flavour|defining_code", "methodNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Cluster> DEVICE = new AqlFieldImp<Cluster>(BloodPressureObservation.class, "/protocol[at0011]/items[at1025]", "device", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(BloodPressureObservation.class, "/protocol[at0011]/items[at1058]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(BloodPressureObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(BloodPressureObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(BloodPressureObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<BloodPressureLocationOfMeasurementChoice> LOCATION_OF_MEASUREMENT = new AqlFieldImp<BloodPressureLocationOfMeasurementChoice>(BloodPressureObservation.class, "/protocol[at0011]/items[at0014]/value", "locationOfMeasurement", BloodPressureLocationOfMeasurementChoice.class, this);

  public ListSelectAqlField<BloodPressureAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<BloodPressureAnyEventChoice>(BloodPressureObservation.class, "/data[at0001]/events[at0006]", "anyEvent", BloodPressureAnyEventChoice.class, this);

  private BloodPressureObservationContainment() {
    super("openEHR-EHR-OBSERVATION.blood_pressure.v2");
  }

  public static BloodPressureObservationContainment getInstance() {
    return new BloodPressureObservationContainment();
  }
}
