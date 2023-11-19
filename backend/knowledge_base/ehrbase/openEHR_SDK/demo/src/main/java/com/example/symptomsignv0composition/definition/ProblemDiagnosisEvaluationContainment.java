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

public class ProblemDiagnosisEvaluationContainment extends Containment {
  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS_EVALUATION = new AqlFieldImp<ProblemDiagnosisEvaluation>(ProblemDiagnosisEvaluation.class, "", "ProblemDiagnosisEvaluation", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<String> PROBLEM_DIAGNOSIS_NAME_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/value|value", "problemDiagnosisNameValue", String.class, this);

  public SelectAqlField<NullFlavour> PROBLEM_DIAGNOSIS_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0002]/null_flavour|defining_code", "problemDiagnosisNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> CLINICAL_DESCRIPTION_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0009]/value|value", "clinicalDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> CLINICAL_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0009]/null_flavour|defining_code", "clinicalDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ProblemDiagnosisBodySiteElement> BODY_SITE = new ListAqlFieldImp<ProblemDiagnosisBodySiteElement>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0012]", "bodySite", ProblemDiagnosisBodySiteElement.class, this);

  public SelectAqlField<AnatomicalLocationCluster> ANATOMICAL_LOCATION = new AqlFieldImp<AnatomicalLocationCluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.anatomical_location.v1]", "anatomicalLocation", AnatomicalLocationCluster.class, this);

  public ListSelectAqlField<ProblemDiagnosisCauseElement> CAUSE = new ListAqlFieldImp<ProblemDiagnosisCauseElement>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0078]", "cause", ProblemDiagnosisCauseElement.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_OF_ONSET_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0077]/value|value", "dateTimeOfOnsetValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_OF_ONSET_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0077]/null_flavour|defining_code", "dateTimeOfOnsetNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_CLINICALLY_RECOGNISED_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0003]/value|value", "dateTimeClinicallyRecognisedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_CLINICALLY_RECOGNISED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0003]/null_flavour|defining_code", "dateTimeClinicallyRecognisedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> SEVERITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0005]/null_flavour|defining_code", "severityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> SPECIFIC_DETAILS = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0043]", "specificDetails", Cluster.class, this);

  public SelectAqlField<String> COURSE_DESCRIPTION_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0072]/value|value", "courseDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> COURSE_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0072]/null_flavour|defining_code", "courseDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> DATE_TIME_OF_RESOLUTION_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0030]/value|value", "dateTimeOfResolutionValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_TIME_OF_RESOLUTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0030]/null_flavour|defining_code", "dateTimeOfResolutionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierCluster> PROBLEM_DIAGNOSIS_QUALIFIER = new AqlFieldImp<ProblemDiagnosisQualifierCluster>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[openEHR-EHR-CLUSTER.problem_qualifier.v2]", "problemDiagnosisQualifier", ProblemDiagnosisQualifierCluster.class, this);

  public SelectAqlField<NullFlavour> DIAGNOSTIC_CERTAINTY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0073]/null_flavour|defining_code", "diagnosticCertaintyNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0069]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0069]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> LAST_UPDATED_VALUE = new AqlFieldImp<TemporalAccessor>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0070]/value|value", "lastUpdatedValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> LAST_UPDATED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0070]/null_flavour|defining_code", "lastUpdatedNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(ProblemDiagnosisEvaluation.class, "/protocol[at0032]/items[at0071]", "extension", Cluster.class, this);

  public SelectAqlField<PartyProxy> SUBJECT = new AqlFieldImp<PartyProxy>(ProblemDiagnosisEvaluation.class, "/subject", "subject", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(ProblemDiagnosisEvaluation.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisEvaluation.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ProblemDiagnosisDiagnosticCertaintyChoice> DIAGNOSTIC_CERTAINTY = new AqlFieldImp<ProblemDiagnosisDiagnosticCertaintyChoice>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0073]/value", "diagnosticCertainty", ProblemDiagnosisDiagnosticCertaintyChoice.class, this);

  public SelectAqlField<ProblemDiagnosisSeverityChoice> SEVERITY = new AqlFieldImp<ProblemDiagnosisSeverityChoice>(ProblemDiagnosisEvaluation.class, "/data[at0001]/items[at0005]/value", "severity", ProblemDiagnosisSeverityChoice.class, this);

  private ProblemDiagnosisEvaluationContainment() {
    super("openEHR-EHR-EVALUATION.problem_diagnosis.v1");
  }

  public static ProblemDiagnosisEvaluationContainment getInstance() {
    return new ProblemDiagnosisEvaluationContainment();
  }
}
