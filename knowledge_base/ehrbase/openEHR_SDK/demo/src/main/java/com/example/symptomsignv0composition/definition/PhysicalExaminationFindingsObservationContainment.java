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

public class PhysicalExaminationFindingsObservationContainment extends Containment {
  public SelectAqlField<PhysicalExaminationFindingsObservation> PHYSICAL_EXAMINATION_FINDINGS_OBSERVATION = new AqlFieldImp<PhysicalExaminationFindingsObservation>(PhysicalExaminationFindingsObservation.class, "", "PhysicalExaminationFindingsObservation", PhysicalExaminationFindingsObservation.class, this);

  public SelectAqlField<TemporalAccessor> ORIGIN_VALUE = new AqlFieldImp<TemporalAccessor>(PhysicalExaminationFindingsObservation.class, "/data[at0001]/origin|value", "originValue", TemporalAccessor.class, this);

  public SelectAqlField<MedicalDeviceCluster> MEDICAL_DEVICE = new AqlFieldImp<MedicalDeviceCluster>(PhysicalExaminationFindingsObservation.class, "/protocol[at0007]/items[openEHR-EHR-CLUSTER.device.v1]", "medicalDevice", MedicalDeviceCluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(PhysicalExaminationFindingsObservation.class, "/protocol[at0007]/items[at0012]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(PhysicalExaminationFindingsObservation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(PhysicalExaminationFindingsObservation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PhysicalExaminationFindingsObservation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public ListSelectAqlField<PhysicalExaminationFindingsAnyEventChoice> ANY_EVENT = new ListAqlFieldImp<PhysicalExaminationFindingsAnyEventChoice>(PhysicalExaminationFindingsObservation.class, "/data[at0001]/events[at0002]", "anyEvent", PhysicalExaminationFindingsAnyEventChoice.class, this);

  private PhysicalExaminationFindingsObservationContainment() {
    super("openEHR-EHR-OBSERVATION.exam.v1");
  }

  public static PhysicalExaminationFindingsObservationContainment getInstance() {
    return new PhysicalExaminationFindingsObservationContainment();
  }
}
