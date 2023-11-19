package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ExclusionOfASymptomOrSignClusterContainment extends Containment {
  public SelectAqlField<ExclusionOfASymptomOrSignCluster> EXCLUSION_OF_A_SYMPTOM_OR_SIGN_CLUSTER = new AqlFieldImp<ExclusionOfASymptomOrSignCluster>(ExclusionOfASymptomOrSignCluster.class, "", "ExclusionOfASymptomOrSignCluster", ExclusionOfASymptomOrSignCluster.class, this);

  public SelectAqlField<String> EXCLUSION_STATEMENT_VALUE = new AqlFieldImp<String>(ExclusionOfASymptomOrSignCluster.class, "/items[at0001]/value|value", "exclusionStatementValue", String.class, this);

  public SelectAqlField<NullFlavour> EXCLUSION_STATEMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionOfASymptomOrSignCluster.class, "/items[at0001]/null_flavour|defining_code", "exclusionStatementNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> EXCLUDED_SYMPTOM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionOfASymptomOrSignCluster.class, "/items[at0002]/null_flavour|defining_code", "excludedSymptomNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExclusionOfASymptomOrSignCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ExclusionOfASymptomOrSignExcludedSymptomChoice> EXCLUDED_SYMPTOM = new AqlFieldImp<ExclusionOfASymptomOrSignExcludedSymptomChoice>(ExclusionOfASymptomOrSignCluster.class, "/items[at0002]/value", "excludedSymptom", ExclusionOfASymptomOrSignExcludedSymptomChoice.class, this);

  private ExclusionOfASymptomOrSignClusterContainment() {
    super("openEHR-EHR-CLUSTER.exclusion_symptom_sign.v0");
  }

  public static ExclusionOfASymptomOrSignClusterContainment getInstance() {
    return new ExclusionOfASymptomOrSignClusterContainment();
  }
}
