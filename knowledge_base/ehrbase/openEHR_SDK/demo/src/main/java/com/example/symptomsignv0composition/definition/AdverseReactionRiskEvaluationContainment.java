package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.Boolean;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class AdverseReactionRiskEvaluationContainment extends Containment {
  public SelectAqlField<AdverseReactionRiskEvaluation> ADVERSE_REACTION_RISK_EVALUATION = new AqlFieldImp<AdverseReactionRiskEvaluation>(AdverseReactionRiskEvaluation.class, "", "AdverseReactionRiskEvaluation", AdverseReactionRiskEvaluation.class, this);

  public SelectAqlField<String> SUBSTANCE_VALUE = new AqlFieldImp<String>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0002]/value|value", "substanceValue", String.class, this);

  public SelectAqlField<NullFlavour> SUBSTANCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "substanceNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0063]/null_flavour|defining_code", "statusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<CriticalityDefiningCode> CRITICALITY_DEFINING_CODE = new AqlFieldImp<CriticalityDefiningCode>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0101]/value|defining_code", "criticalityDefiningCode", CriticalityDefiningCode.class, this);

  public SelectAqlField<NullFlavour> CRITICALITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0101]/null_flavour|defining_code", "criticalityNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> CATEGORY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0120]/null_flavour|defining_code", "categoryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> ONSET_OF_LAST_REACTION_VALUE = new AqlFieldImp<TemporalAccessor>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0117]/value|value", "onsetOfLastReactionValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> ONSET_OF_LAST_REACTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0117]/null_flavour|defining_code", "onsetOfLastReactionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> REACTION_MECHANISM_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0058]/null_flavour|defining_code", "reactionMechanismNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0006]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0006]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AdverseReactionRiskReactionEventCluster> REACTION_EVENT = new ListAqlFieldImp<AdverseReactionRiskReactionEventCluster>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0009]", "reactionEvent", AdverseReactionRiskReactionEventCluster.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0062]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0062]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0128]", "extension", Cluster.class, this);

  public ListSelectAqlField<AdverseReactionRiskSupportingClinicalRecordInformationElement> SUPPORTING_CLINICAL_RECORD_INFORMATION = new ListAqlFieldImp<AdverseReactionRiskSupportingClinicalRecordInformationElement>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0047]", "supportingClinicalRecordInformation", AdverseReactionRiskSupportingClinicalRecordInformationElement.class, this);

  public SelectAqlField<Boolean> REACTION_REPORTED_VALUE = new AqlFieldImp<Boolean>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0044]/value|value", "reactionReportedValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> REACTION_REPORTED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0044]/null_flavour|defining_code", "reactionReportedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AdverseReactionRiskReportSummaryCluster> REPORT_SUMMARY = new ListAqlFieldImp<AdverseReactionRiskReportSummaryCluster>(AdverseReactionRiskEvaluation.class, "/protocol[at0042]/items[at0099]", "reportSummary", AdverseReactionRiskReportSummaryCluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(AdverseReactionRiskEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(AdverseReactionRiskEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AdverseReactionRiskEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AdverseReactionRiskCategoryChoice> CATEGORY = new AqlFieldImp<AdverseReactionRiskCategoryChoice>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0120]/value", "category", AdverseReactionRiskCategoryChoice.class, this);

  public SelectAqlField<AdverseReactionRiskReactionMechanismChoice> REACTION_MECHANISM = new AqlFieldImp<AdverseReactionRiskReactionMechanismChoice>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0058]/value", "reactionMechanism", AdverseReactionRiskReactionMechanismChoice.class, this);

  public SelectAqlField<AdverseReactionRiskStatusChoice> STATUS = new AqlFieldImp<AdverseReactionRiskStatusChoice>(AdverseReactionRiskEvaluation.class, "/data[at0001]/items[at0063]/value", "status", AdverseReactionRiskStatusChoice.class, this);

  private AdverseReactionRiskEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.adverse_reaction_risk.v1");
  }

  public static AdverseReactionRiskEvaluationContainment getInstance() {
    return new AdverseReactionRiskEvaluationContainment();
  }
}
