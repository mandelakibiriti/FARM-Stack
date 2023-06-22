package com.example.symptomsignv0composition;

import com.example.symptomsignv0composition.definition.AdverseReactionRiskEvaluation;
import com.example.symptomsignv0composition.definition.BloodPressureObservation;
import com.example.symptomsignv0composition.definition.BodyTemperatureObservation;
import com.example.symptomsignv0composition.definition.BodyWeightObservation;
import com.example.symptomsignv0composition.definition.DiagnosticInvestigationScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.DifferentialDiagnosesEvaluation;
import com.example.symptomsignv0composition.definition.ExclusionGlobalEvaluation;
import com.example.symptomsignv0composition.definition.ExposureEvaluation;
import com.example.symptomsignv0composition.definition.ExposureScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.FamilyHistoryScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.HeightLengthObservation;
import com.example.symptomsignv0composition.definition.MedicationScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.PhysicalExaminationFindingsObservation;
import com.example.symptomsignv0composition.definition.ProblemDiagnosisEvaluation;
import com.example.symptomsignv0composition.definition.ProcedureScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.ProgressNoteObservation;
import com.example.symptomsignv0composition.definition.PulseHeartBeatObservation;
import com.example.symptomsignv0composition.definition.PulseOximetryObservation;
import com.example.symptomsignv0composition.definition.RespirationObservation;
import com.example.symptomsignv0composition.definition.SocialContextScreeningQuestionnaireObservation;
import com.example.symptomsignv0composition.definition.SymptomSignObservation;
import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.composition.Evaluation;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.Participation;
import com.nedap.archie.rm.generic.PartyIdentified;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;

public class SymptomSignV0CompositionContainment extends Containment {
  public SelectAqlField<SymptomSignV0Composition> SYMPTOM_SIGN_V0_COMPOSITION = new AqlFieldImp<SymptomSignV0Composition>(SymptomSignV0Composition.class, "", "SymptomSignV0Composition", SymptomSignV0Composition.class, this);

  public SelectAqlField<Category> CATEGORY_DEFINING_CODE = new AqlFieldImp<Category>(SymptomSignV0Composition.class, "/category|defining_code", "categoryDefiningCode", Category.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(SymptomSignV0Composition.class, "/context/other_context[at0001]/items[at0002]", "extension", Cluster.class, this);

  public SelectAqlField<TemporalAccessor> START_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(SymptomSignV0Composition.class, "/context/start_time|value", "startTimeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Participation> PARTICIPATIONS = new ListAqlFieldImp<Participation>(SymptomSignV0Composition.class, "/context/participations", "participations", Participation.class, this);

  public SelectAqlField<TemporalAccessor> END_TIME_VALUE = new AqlFieldImp<TemporalAccessor>(SymptomSignV0Composition.class, "/context/end_time|value", "endTimeValue", TemporalAccessor.class, this);

  public SelectAqlField<String> LOCATION = new AqlFieldImp<String>(SymptomSignV0Composition.class, "/context/location", "location", String.class, this);

  public SelectAqlField<PartyIdentified> HEALTH_CARE_FACILITY = new AqlFieldImp<PartyIdentified>(SymptomSignV0Composition.class, "/context/health_care_facility", "healthCareFacility", PartyIdentified.class, this);

  public SelectAqlField<Setting> SETTING_DEFINING_CODE = new AqlFieldImp<Setting>(SymptomSignV0Composition.class, "/context/setting|defining_code", "settingDefiningCode", Setting.class, this);

  public SelectAqlField<ProblemDiagnosisEvaluation> PROBLEM_DIAGNOSIS = new AqlFieldImp<ProblemDiagnosisEvaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]", "problemDiagnosis", ProblemDiagnosisEvaluation.class, this);

  public SelectAqlField<SymptomSignObservation> SYMPTOM_SIGN = new AqlFieldImp<SymptomSignObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.symptom_sign.v0]", "symptomSign", SymptomSignObservation.class, this);

  public SelectAqlField<ExposureEvaluation> EXPOSURE = new AqlFieldImp<ExposureEvaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-EVALUATION.exposure.v0]", "exposure", ExposureEvaluation.class, this);

  public SelectAqlField<AdverseReactionRiskEvaluation> ADVERSE_REACTION_RISK = new AqlFieldImp<AdverseReactionRiskEvaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[openEHR-EHR-EVALUATION.adverse_reaction_risk.v1]", "adverseReactionRisk", AdverseReactionRiskEvaluation.class, this);

  public SelectAqlField<ExclusionGlobalEvaluation> EXCLUSION_GLOBAL = new AqlFieldImp<ExclusionGlobalEvaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]", "exclusionGlobal", ExclusionGlobalEvaluation.class, this);

  public ListSelectAqlField<Evaluation> ABSENCE_STATEMENT = new ListAqlFieldImp<Evaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[at0003]", "absenceStatement", Evaluation.class, this);

  public SelectAqlField<BodyWeightObservation> BODY_WEIGHT = new AqlFieldImp<BodyWeightObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.body_weight.v2]", "bodyWeight", BodyWeightObservation.class, this);

  public SelectAqlField<HeightLengthObservation> HEIGHT_LENGTH = new AqlFieldImp<HeightLengthObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.height.v2]", "heightLength", HeightLengthObservation.class, this);

  public SelectAqlField<PhysicalExaminationFindingsObservation> PHYSICAL_EXAMINATION_FINDINGS = new AqlFieldImp<PhysicalExaminationFindingsObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.exam.v1]", "physicalExaminationFindings", PhysicalExaminationFindingsObservation.class, this);

  public SelectAqlField<BloodPressureObservation> BLOOD_PRESSURE = new AqlFieldImp<BloodPressureObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.blood_pressure.v2]", "bloodPressure", BloodPressureObservation.class, this);

  public SelectAqlField<BodyTemperatureObservation> BODY_TEMPERATURE = new AqlFieldImp<BodyTemperatureObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.body_temperature.v2]", "bodyTemperature", BodyTemperatureObservation.class, this);

  public SelectAqlField<PulseHeartBeatObservation> PULSE_HEART_BEAT = new AqlFieldImp<PulseHeartBeatObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.pulse.v2]", "pulseHeartBeat", PulseHeartBeatObservation.class, this);

  public SelectAqlField<RespirationObservation> RESPIRATION = new AqlFieldImp<RespirationObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.respiration.v2]", "respiration", RespirationObservation.class, this);

  public SelectAqlField<PulseOximetryObservation> PULSE_OXIMETRY = new AqlFieldImp<PulseOximetryObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]", "pulseOximetry", PulseOximetryObservation.class, this);

  public SelectAqlField<DifferentialDiagnosesEvaluation> DIFFERENTIAL_DIAGNOSES = new AqlFieldImp<DifferentialDiagnosesEvaluation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-EVALUATION.differential_diagnoses.v1]", "differentialDiagnoses", DifferentialDiagnosesEvaluation.class, this);

  public SelectAqlField<ProgressNoteObservation> PROGRESS_NOTE = new AqlFieldImp<ProgressNoteObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.progress_note.v1]", "progressNote", ProgressNoteObservation.class, this);

  public SelectAqlField<SocialContextScreeningQuestionnaireObservation> SOCIAL_CONTEXT_SCREENING_QUESTIONNAIRE = new AqlFieldImp<SocialContextScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.social_context_screening.v1]", "socialContextScreeningQuestionnaire", SocialContextScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<FamilyHistoryScreeningQuestionnaireObservation> FAMILY_HISTORY_SCREENING_QUESTIONNAIRE = new AqlFieldImp<FamilyHistoryScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.family_history_screening_questionnaire.v0]", "familyHistoryScreeningQuestionnaire", FamilyHistoryScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<MedicationScreeningQuestionnaireObservation> MEDICATION_SCREENING_QUESTIONNAIRE = new AqlFieldImp<MedicationScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.medication_screening.v1]", "medicationScreeningQuestionnaire", MedicationScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<ProcedureScreeningQuestionnaireObservation> PROCEDURE_SCREENING_QUESTIONNAIRE = new AqlFieldImp<ProcedureScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.procedure_screening.v1]", "procedureScreeningQuestionnaire", ProcedureScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<DiagnosticInvestigationScreeningQuestionnaireObservation> DIAGNOSTIC_INVESTIGATION_SCREENING_QUESTIONNAIRE = new AqlFieldImp<DiagnosticInvestigationScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.investigation_screening.v0]", "diagnosticInvestigationScreeningQuestionnaire", DiagnosticInvestigationScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<ExposureScreeningQuestionnaireObservation> EXPOSURE_SCREENING_QUESTIONNAIRE = new AqlFieldImp<ExposureScreeningQuestionnaireObservation>(SymptomSignV0Composition.class, "/content[openEHR-EHR-SECTION.adhoc.v1]/items[openEHR-EHR-OBSERVATION.exposure_screening.v0]", "exposureScreeningQuestionnaire", ExposureScreeningQuestionnaireObservation.class, this);

  public SelectAqlField<PartyProxy> COMPOSER = new AqlFieldImp<PartyProxy>(SymptomSignV0Composition.class, "/composer", "composer", PartyProxy.class, this);

  public SelectAqlField<Language> LANGUAGE = new AqlFieldImp<Language>(SymptomSignV0Composition.class, "/language", "language", Language.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(SymptomSignV0Composition.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<Territory> TERRITORY = new AqlFieldImp<Territory>(SymptomSignV0Composition.class, "/territory", "territory", Territory.class, this);

  private SymptomSignV0CompositionContainment() {
    super("openEHR-EHR-COMPOSITION.encounter.v1");
  }

  public static SymptomSignV0CompositionContainment getInstance() {
    return new SymptomSignV0CompositionContainment();
  }
}
