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

public class DifferentialDiagnosesEvaluationContainment extends Containment {
  public SelectAqlField<DifferentialDiagnosesEvaluation> DIFFERENTIAL_DIAGNOSES_EVALUATION = new AqlFieldImp<DifferentialDiagnosesEvaluation>(DifferentialDiagnosesEvaluation.class, "", "DifferentialDiagnosesEvaluation", DifferentialDiagnosesEvaluation.class, this);

  public SelectAqlField<String> OVERALL_DESCRIPTION_VALUE = new AqlFieldImp<String>(DifferentialDiagnosesEvaluation.class, "/data[at0001]/items[at0002]/value|value", "overallDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> OVERALL_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DifferentialDiagnosesEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "overallDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<DifferentialDiagnosesPerDifferentialCluster> PER_DIFFERENTIAL = new ListAqlFieldImp<DifferentialDiagnosesPerDifferentialCluster>(DifferentialDiagnosesEvaluation.class, "/data[at0001]/items[at0003]", "perDifferential", DifferentialDiagnosesPerDifferentialCluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(DifferentialDiagnosesEvaluation.class, "/protocol[at0013]/items[at0014]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(DifferentialDiagnosesEvaluation.class, "/protocol[at0013]/items[at0015]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(DifferentialDiagnosesEvaluation.class, "/protocol[at0013]/items[at0015]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(DifferentialDiagnosesEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(DifferentialDiagnosesEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(DifferentialDiagnosesEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private DifferentialDiagnosesEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.differential_diagnoses.v1");
  }

  public static DifferentialDiagnosesEvaluationContainment getInstance() {
    return new DifferentialDiagnosesEvaluationContainment();
  }
}
