package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ConditionProgressClusterContainment extends Containment {
  public SelectAqlField<ConditionProgressCluster> CONDITION_PROGRESS_CLUSTER = new AqlFieldImp<ConditionProgressCluster>(ConditionProgressCluster.class, "", "ConditionProgressCluster", ConditionProgressCluster.class, this);

  public SelectAqlField<String> PHASE_VALUE = new AqlFieldImp<String>(ConditionProgressCluster.class, "/items[at0001]/value|value", "phaseValue", String.class, this);

  public SelectAqlField<NullFlavour> PHASE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ConditionProgressCluster.class, "/items[at0001]/null_flavour|defining_code", "phaseNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> PHASE_RECOGNISED_VALUE = new AqlFieldImp<TemporalAccessor>(ConditionProgressCluster.class, "/items[at0006]/value|value", "phaseRecognisedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> PHASE_RECOGNISED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ConditionProgressCluster.class, "/items[at0006]/null_flavour|defining_code", "phaseRecognisedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(ConditionProgressCluster.class, "/items[at0007]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ConditionProgressCluster.class, "/items[at0007]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ConditionProgressCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ConditionProgressClusterContainment() {
    super("openEHR-EHR-CLUSTER.condition_progress.v0");
  }

  public static ConditionProgressClusterContainment getInstance() {
    return new ConditionProgressClusterContainment();
  }
}
