package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ExclusionGlobalEvaluationContainment extends Containment {
  public SelectAqlField<ExclusionGlobalEvaluation> EXCLUSION_GLOBAL_EVALUATION = new AqlFieldImp<ExclusionGlobalEvaluation>(ExclusionGlobalEvaluation.class, "", "ExclusionGlobalEvaluation", ExclusionGlobalEvaluation.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_PROBLEMS_DIAGNOSES_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfProblemsDiagnosesValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_PROBLEMS_DIAGNOSES_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_FAMILY_HISTORY_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfFamilyHistoryValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_FAMILY_HISTORY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfFamilyHistoryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_MEDICATION_USE_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfMedicationUseValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_MEDICATION_USE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfMedicationUseNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_PROCEDURES_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfProceduresValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_PROCEDURES_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfProceduresNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> GLOBAL_EXCLUSION_OF_ADVERSE_REACTIONS_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/value|value", "globalExclusionOfAdverseReactionsValue", String.class, this);

  public SelectAqlField<NullFlavour> GLOBAL_EXCLUSION_OF_ADVERSE_REACTIONS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "globalExclusionOfAdverseReactionsNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0011]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExclusionGlobalEvaluation.class, "/data[at0001]/items[at0011]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ExclusionGlobalEvaluation.class, "/protocol[at0008]/items[at0010]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExclusionGlobalEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExclusionGlobalEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExclusionGlobalEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ExclusionGlobalEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.exclusion_global.v1");
  }

  public static ExclusionGlobalEvaluationContainment getInstance() {
    return new ExclusionGlobalEvaluationContainment();
  }
}
