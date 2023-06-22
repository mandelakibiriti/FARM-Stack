package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class ProblemDiagnosisQualifierCluster2Containment extends Containment {
  public SelectAqlField<ProblemDiagnosisQualifierCluster2> PROBLEM_DIAGNOSIS_QUALIFIER_CLUSTER2 = new AqlFieldImp<ProblemDiagnosisQualifierCluster2>(ProblemDiagnosisQualifierCluster2.class, "", "ProblemDiagnosisQualifierCluster2", ProblemDiagnosisQualifierCluster2.class, this);

  public SelectAqlField<NullFlavour> DIAGNOSTIC_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0004]/null_flavour|defining_code", "diagnosticStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<CurrentPastDefiningCode> CURRENT_PAST_DEFINING_CODE = new AqlFieldImp<CurrentPastDefiningCode>(ProblemDiagnosisQualifierCluster2.class, "/items[at0060]/value|defining_code", "currentPastDefiningCode", CurrentPastDefiningCode.class, this);

  public SelectAqlField<NullFlavour> CURRENT_PAST_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0060]/null_flavour|defining_code", "currentPastNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<ActiveInactiveDefiningCode> ACTIVE_INACTIVE_DEFINING_CODE = new AqlFieldImp<ActiveInactiveDefiningCode>(ProblemDiagnosisQualifierCluster2.class, "/items[at0003]/value|defining_code", "activeInactiveDefiningCode", ActiveInactiveDefiningCode.class, this);

  public SelectAqlField<NullFlavour> ACTIVE_INACTIVE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0003]/null_flavour|defining_code", "activeInactiveNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> LEVEL_OF_CONTROL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0098]/null_flavour|defining_code", "levelOfControlNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> PROGRESSION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0102]/null_flavour|defining_code", "progressionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> RESOLUTION_PHASE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0083]/null_flavour|defining_code", "resolutionPhaseNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> REMISSION_STATUS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0089]/null_flavour|defining_code", "remissionStatusNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> EPISODICITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0001]/null_flavour|defining_code", "episodicityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement> REASON_FOR_AN_ONGOING_EPISODE = new ListAqlFieldImp<ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement>(ProblemDiagnosisQualifierCluster2.class, "/items[at0107]", "reasonForAnOngoingEpisode", ProblemDiagnosisQualifierReasonForAnOngoingEpisodeElement.class, this);

  public SelectAqlField<NullFlavour> OCCURRENCE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0071]/null_flavour|defining_code", "occurrenceNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<NullFlavour> COURSE_LABEL_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0077]/null_flavour|defining_code", "courseLabelNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<ProblemDiagnosisQualifierDiagnosticCategoryElement> DIAGNOSTIC_CATEGORY = new ListAqlFieldImp<ProblemDiagnosisQualifierDiagnosticCategoryElement>(ProblemDiagnosisQualifierCluster2.class, "/items[at0063]", "diagnosticCategory", ProblemDiagnosisQualifierDiagnosticCategoryElement.class, this);

  public SelectAqlField<NullFlavour> ADMISSION_DIAGNOSIS_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0073]/null_flavour|defining_code", "admissionDiagnosisNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(ProblemDiagnosisQualifierCluster2.class, "/items[at0110]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(ProblemDiagnosisQualifierCluster2.class, "/items[at0110]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(ProblemDiagnosisQualifierCluster2.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierAdmissionDiagnosisChoice> ADMISSION_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisQualifierAdmissionDiagnosisChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0073]/value", "admissionDiagnosis", ProblemDiagnosisQualifierAdmissionDiagnosisChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierProgressionChoice> PROGRESSION = new AqlFieldImp<ProblemDiagnosisQualifierProgressionChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0102]/value", "progression", ProblemDiagnosisQualifierProgressionChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierDiagnosticStatusChoice> DIAGNOSTIC_STATUS = new AqlFieldImp<ProblemDiagnosisQualifierDiagnosticStatusChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0004]/value", "diagnosticStatus", ProblemDiagnosisQualifierDiagnosticStatusChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierOccurrenceChoice> OCCURRENCE = new AqlFieldImp<ProblemDiagnosisQualifierOccurrenceChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0071]/value", "occurrence", ProblemDiagnosisQualifierOccurrenceChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierLevelOfControlChoice> LEVEL_OF_CONTROL = new AqlFieldImp<ProblemDiagnosisQualifierLevelOfControlChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0098]/value", "levelOfControl", ProblemDiagnosisQualifierLevelOfControlChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierCourseLabelChoice> COURSE_LABEL = new AqlFieldImp<ProblemDiagnosisQualifierCourseLabelChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0077]/value", "courseLabel", ProblemDiagnosisQualifierCourseLabelChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierEpisodicityChoice> EPISODICITY = new AqlFieldImp<ProblemDiagnosisQualifierEpisodicityChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0001]/value", "episodicity", ProblemDiagnosisQualifierEpisodicityChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierRemissionStatusChoice> REMISSION_STATUS = new AqlFieldImp<ProblemDiagnosisQualifierRemissionStatusChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0089]/value", "remissionStatus", ProblemDiagnosisQualifierRemissionStatusChoice.class, this);

  public SelectAqlField<ProblemDiagnosisQualifierResolutionPhaseChoice> RESOLUTION_PHASE = new AqlFieldImp<ProblemDiagnosisQualifierResolutionPhaseChoice>(ProblemDiagnosisQualifierCluster2.class, "/items[at0083]/value", "resolutionPhase", ProblemDiagnosisQualifierResolutionPhaseChoice.class, this);

  private ProblemDiagnosisQualifierCluster2Containment() {
    super("openEHR-EHR-CLUSTER.problem_qualifier.v2");
  }

  public static ProblemDiagnosisQualifierCluster2Containment getInstance() {
    return new ProblemDiagnosisQualifierCluster2Containment();
  }
}
