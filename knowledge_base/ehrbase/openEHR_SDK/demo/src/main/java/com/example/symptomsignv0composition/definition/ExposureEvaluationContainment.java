package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
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

public class ExposureEvaluationContainment extends Containment {
  public SelectAqlField<ExposureEvaluation> EXPOSURE_EVALUATION = new AqlFieldImp<ExposureEvaluation>(ExposureEvaluation.class, "", "ExposureEvaluation", ExposureEvaluation.class, this);

  public SelectAqlField<String> AGENT_VALUE = new AqlFieldImp<String>(ExposureEvaluation.class, "/data[at0001]/items[at0002]/value|value", "agentValue", String.class, this);

  public SelectAqlField<NullFlavour> AGENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExposureEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "agentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> OVERALL_DESCRIPTION_VALUE = new AqlFieldImp<String>(ExposureEvaluation.class, "/data[at0001]/items[at0003]/value|value", "overallDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> OVERALL_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExposureEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "overallDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<CategoryDefiningCode> CATEGORY_DEFINING_CODE = new AqlFieldImp<CategoryDefiningCode>(ExposureEvaluation.class, "/data[at0001]/items[at0005]/value|defining_code", "categoryDefiningCode", CategoryDefiningCode.class, this);

  public SelectAqlField<NullFlavour> CATEGORY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExposureEvaluation.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "categoryNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Boolean> ONGOING_EXPOSURE_VALUE = new AqlFieldImp<Boolean>(ExposureEvaluation.class, "/data[at0001]/items[at0004]/value|value", "ongoingExposureValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> ONGOING_EXPOSURE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExposureEvaluation.class, "/data[at0001]/items[at0004]/null_flavour|defining_code", "ongoingExposureNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ExposureExposureDetailsCluster> EXPOSURE_DETAILS = new ListAqlFieldImp<ExposureExposureDetailsCluster>(ExposureEvaluation.class, "/data[at0001]/items[at0010]", "exposureDetails", ExposureExposureDetailsCluster.class, this);

  public SelectAqlField<TemporalAccessor> DATE_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(ExposureEvaluation.class, "/protocol[at0008]/items[at0009]/value|value", "dateUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ExposureEvaluation.class, "/protocol[at0008]/items[at0009]/null_flavour|defining_code", "dateUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ExposureEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ExposureEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ExposureEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private ExposureEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.exposure.v0");
  }

  public static ExposureEvaluationContainment getInstance() {
    return new ExposureEvaluationContainment();
  }
}
