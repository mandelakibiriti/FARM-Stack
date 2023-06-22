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
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Id;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.annotations.Template;
import org.ehrbase.client.classgenerator.interfaces.CompositionEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Category;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.Setting;
import org.ehrbase.client.classgenerator.shareddefinition.Territory;
import org.ehrbase.client.openehrclient.VersionUid;

@Entity
@Archetype("openEHR-EHR-COMPOSITION.encounter.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.654934614+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@Template("symptom-sign.v0")
public class SymptomSignV0Composition implements CompositionEntity {
  /**
   * Path: clinical encounter.v0/category
   */
  @Path("/category|defining_code")
  private Category categoryDefiningCode;

  /**
   * Path: clinical encounter.v0/context/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   * Comment: e.g. Local hospital departmental infomation or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/context/other_context[at0001]/items[at0002]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/context/start_time
   */
  @Path("/context/start_time|value")
  private TemporalAccessor startTimeValue;

  /**
   * Path: clinical encounter.v0/context/participations
   */
  @Path("/context/participations")
  private List<Participation> participations;

  /**
   * Path: clinical encounter.v0/context/end_time
   */
  @Path("/context/end_time|value")
  private TemporalAccessor endTimeValue;

  /**
   * Path: clinical encounter.v0/context/location
   */
  @Path("/context/location")
  private String location;

  /**
   * Path: clinical encounter.v0/context/health_care_facility
   */
  @Path("/context/health_care_facility")
  private PartyIdentified healthCareFacility;

  /**
   * Path: clinical encounter.v0/context/setting
   */
  @Path("/context/setting|defining_code")
  private Setting settingDefiningCode;

  /**
   * Path: clinical encounter.v0/Problem/Diagnosis
   * Description: Details about a single identified health condition, injury, disability or any other issue which impacts on the physical, mental and/or social well-being of an individual.
   * Comment: Clear delineation between the scope of a problem versus a diagnosis is not easy to achieve in practice. For the purposes of clinical documentation with this archetype, problem and diagnosis are regarded as a continuum, with increasing levels of detail and supportive evidence usually providing weight towards the label of 'diagnosis'.
   */
  @Path("/content[openEHR-EHR-EVALUATION.problem_diagnosis.v1]")
  private ProblemDiagnosisEvaluation problemDiagnosis;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign
   * Description: Reported observation of a physical or mental disturbance in an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sign/Symptoms']/items[openEHR-EHR-OBSERVATION.symptom_sign.v0]")
  private SymptomSignObservation symptomSign;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Exposure
   * Description: Exposure of the subject to a chemical, physical or biological agent within their environment that has caused, or may possibly cause in the future, a negative impact on health.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sign/Symptoms']/items[openEHR-EHR-EVALUATION.exposure.v0]")
  private ExposureEvaluation exposure;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk
   * Description: Risk of harmful or undesirable physiological response which is unique to an individual and associated with exposure to a substance.
   * Comment: Substances include, but are not limited to: a therapeutic substance administered correctly at an appropriate dosage for the individual; food; material derived from plants or animals; or venom from insect stings.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sign/Symptoms']/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[openEHR-EHR-EVALUATION.adverse_reaction_risk.v1]")
  private AdverseReactionRiskEvaluation adverseReactionRisk;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items that are either not currently present, or have not been present in the past.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sign/Symptoms']/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[openEHR-EHR-EVALUATION.exclusion_global.v1]")
  private ExclusionGlobalEvaluation exclusionGlobal;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Absence statement
   * Description: A positive statement that no information is available about adverse reactions.
   * Comment: For example: 'No information available about adverse reactions'.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Sign/Symptoms']/items[openEHR-EHR-SECTION.adverse_reaction_list.v0]/items[at0003]")
  private List<Evaluation> absenceStatement;

  /**
   * Path: clinical encounter.v0/Examination details/Body weight
   * Description: Measurement of the body weight of an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Examination details']/items[openEHR-EHR-OBSERVATION.body_weight.v2]")
  private BodyWeightObservation bodyWeight;

  /**
   * Path: clinical encounter.v0/Examination details/Height/Length
   * Description: Height, or body length, is measured from crown of head to sole of foot.
   * Comment: Height is measured with the individual in a standing position and body length in a recumbent position.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Examination details']/items[openEHR-EHR-OBSERVATION.height.v2]")
  private HeightLengthObservation heightLength;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings
   * Description: Findings observed during the physical examination of a subject of care.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Examination details']/items[openEHR-EHR-OBSERVATION.exam.v1]")
  private PhysicalExaminationFindingsObservation physicalExaminationFindings;

  /**
   * Path: clinical encounter.v0/Vital signs/Blood pressure
   * Description: The local measurement of arterial blood pressure which is a surrogate for arterial pressure in the systemic circulation.
   * Comment: Most commonly, use of the term 'blood pressure' refers to measurement of brachial artery pressure in the upper arm.
   */
  @Path("/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.blood_pressure.v2]")
  private BloodPressureObservation bloodPressure;

  /**
   * Path: clinical encounter.v0/Vital signs/Body temperature
   * Description: A measurement of the body temperature, which is a surrogate for the core body temperature of the individual.
   */
  @Path("/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.body_temperature.v2]")
  private BodyTemperatureObservation bodyTemperature;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat
   * Description: The rate and associated attributes for a pulse or heart beat.
   */
  @Path("/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.pulse.v2]")
  private PulseHeartBeatObservation pulseHeartBeat;

  /**
   * Path: clinical encounter.v0/Vital signs/Respiration
   * Description: The characteristics of spontaneous breathing by an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.respiration.v2]")
  private RespirationObservation respiration;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry
   * Description: Blood oxygen and related measurements, measured by pulse oximetry or pulse CO-oximetry.
   */
  @Path("/content[openEHR-EHR-SECTION.vital_signs.v0]/items[openEHR-EHR-OBSERVATION.pulse_oximetry.v1]")
  private PulseOximetryObservation pulseOximetry;

  /**
   * Path: clinical encounter.v0/Differential diagnoses
   * Description: One or more possible conditions, problems or diagnoses that may be responsible for a clinical presentation, examination findings and/or test results.
   */
  @Path("/content[openEHR-EHR-EVALUATION.differential_diagnoses.v1]")
  private DifferentialDiagnosesEvaluation differentialDiagnoses;

  /**
   * Path: clinical encounter.v0/Patient progress/Progress note
   * Description: Narrative description of health-related events at a specific point-in-time about an individual, specifically from the perspective of a healthcare provider.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Patient progress']/items[openEHR-EHR-OBSERVATION.progress_note.v1]")
  private ProgressNoteObservation progressNote;

  /**
   * Path: clinical encounter.v0/Screening/Social context screening questionnaire
   * Description: Series of questions and associated answers used to screen about the social environment and social situation which may impact the health and well-being of the individual, especially to identify potential issues or risks.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.social_context_screening.v1]")
  private SocialContextScreeningQuestionnaireObservation socialContextScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire
   * Description: An individual- or self-reported questionnaire screening for significant health-related problems found in family members.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.family_history_screening_questionnaire.v0]")
  private FamilyHistoryScreeningQuestionnaireObservation familyHistoryScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire
   * Description: Series of questions and associated answers used to screen for the use of medications.
   * Comment: The answers may be self-reported.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.medication_screening.v1]")
  private MedicationScreeningQuestionnaireObservation medicationScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/Screening/Procedure screening questionnaire
   * Description: Series of questions and associated answers used to screen for procedures that has been carried out in the past.
   * Comment: The answers may be self-reported.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.procedure_screening.v1]")
  private ProcedureScreeningQuestionnaireObservation procedureScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/Screening/Diagnostic investigation screening questionnaire
   * Description: Series of questions and associated answers used to screen whether diagnostic investigations, either imaging examinations or laboratory tests, have been carried out.
   * Comment: The answers may be self-reported.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.investigation_screening.v0]")
  private DiagnosticInvestigationScreeningQuestionnaireObservation diagnosticInvestigationScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/Screening/Exposure screening questionnaire
   * Description: An individual- or self-reported questionnaire screening for potential exposure to a chemical, physical or biological agent which has caused or may cause harm to an individual.
   */
  @Path("/content[openEHR-EHR-SECTION.adhoc.v1 and name/value='Screening']/items[openEHR-EHR-OBSERVATION.exposure_screening.v0]")
  private ExposureScreeningQuestionnaireObservation exposureScreeningQuestionnaire;

  /**
   * Path: clinical encounter.v0/composer
   */
  @Path("/composer")
  private PartyProxy composer;

  /**
   * Path: clinical encounter.v0/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/territory
   */
  @Path("/territory")
  private Territory territory;

  @Id
  private VersionUid versionUid;

  public void setCategoryDefiningCode(Category categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public Category getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setStartTimeValue(TemporalAccessor startTimeValue) {
     this.startTimeValue = startTimeValue;
  }

  public TemporalAccessor getStartTimeValue() {
     return this.startTimeValue ;
  }

  public void setParticipations(List<Participation> participations) {
     this.participations = participations;
  }

  public List<Participation> getParticipations() {
     return this.participations ;
  }

  public void setEndTimeValue(TemporalAccessor endTimeValue) {
     this.endTimeValue = endTimeValue;
  }

  public TemporalAccessor getEndTimeValue() {
     return this.endTimeValue ;
  }

  public void setLocation(String location) {
     this.location = location;
  }

  public String getLocation() {
     return this.location ;
  }

  public void setHealthCareFacility(PartyIdentified healthCareFacility) {
     this.healthCareFacility = healthCareFacility;
  }

  public PartyIdentified getHealthCareFacility() {
     return this.healthCareFacility ;
  }

  public void setSettingDefiningCode(Setting settingDefiningCode) {
     this.settingDefiningCode = settingDefiningCode;
  }

  public Setting getSettingDefiningCode() {
     return this.settingDefiningCode ;
  }

  public void setProblemDiagnosis(ProblemDiagnosisEvaluation problemDiagnosis) {
     this.problemDiagnosis = problemDiagnosis;
  }

  public ProblemDiagnosisEvaluation getProblemDiagnosis() {
     return this.problemDiagnosis ;
  }

  public void setSymptomSign(SymptomSignObservation symptomSign) {
     this.symptomSign = symptomSign;
  }

  public SymptomSignObservation getSymptomSign() {
     return this.symptomSign ;
  }

  public void setExposure(ExposureEvaluation exposure) {
     this.exposure = exposure;
  }

  public ExposureEvaluation getExposure() {
     return this.exposure ;
  }

  public void setAdverseReactionRisk(AdverseReactionRiskEvaluation adverseReactionRisk) {
     this.adverseReactionRisk = adverseReactionRisk;
  }

  public AdverseReactionRiskEvaluation getAdverseReactionRisk() {
     return this.adverseReactionRisk ;
  }

  public void setExclusionGlobal(ExclusionGlobalEvaluation exclusionGlobal) {
     this.exclusionGlobal = exclusionGlobal;
  }

  public ExclusionGlobalEvaluation getExclusionGlobal() {
     return this.exclusionGlobal ;
  }

  public void setAbsenceStatement(List<Evaluation> absenceStatement) {
     this.absenceStatement = absenceStatement;
  }

  public List<Evaluation> getAbsenceStatement() {
     return this.absenceStatement ;
  }

  public void setBodyWeight(BodyWeightObservation bodyWeight) {
     this.bodyWeight = bodyWeight;
  }

  public BodyWeightObservation getBodyWeight() {
     return this.bodyWeight ;
  }

  public void setHeightLength(HeightLengthObservation heightLength) {
     this.heightLength = heightLength;
  }

  public HeightLengthObservation getHeightLength() {
     return this.heightLength ;
  }

  public void setPhysicalExaminationFindings(
      PhysicalExaminationFindingsObservation physicalExaminationFindings) {
     this.physicalExaminationFindings = physicalExaminationFindings;
  }

  public PhysicalExaminationFindingsObservation getPhysicalExaminationFindings() {
     return this.physicalExaminationFindings ;
  }

  public void setBloodPressure(BloodPressureObservation bloodPressure) {
     this.bloodPressure = bloodPressure;
  }

  public BloodPressureObservation getBloodPressure() {
     return this.bloodPressure ;
  }

  public void setBodyTemperature(BodyTemperatureObservation bodyTemperature) {
     this.bodyTemperature = bodyTemperature;
  }

  public BodyTemperatureObservation getBodyTemperature() {
     return this.bodyTemperature ;
  }

  public void setPulseHeartBeat(PulseHeartBeatObservation pulseHeartBeat) {
     this.pulseHeartBeat = pulseHeartBeat;
  }

  public PulseHeartBeatObservation getPulseHeartBeat() {
     return this.pulseHeartBeat ;
  }

  public void setRespiration(RespirationObservation respiration) {
     this.respiration = respiration;
  }

  public RespirationObservation getRespiration() {
     return this.respiration ;
  }

  public void setPulseOximetry(PulseOximetryObservation pulseOximetry) {
     this.pulseOximetry = pulseOximetry;
  }

  public PulseOximetryObservation getPulseOximetry() {
     return this.pulseOximetry ;
  }

  public void setDifferentialDiagnoses(DifferentialDiagnosesEvaluation differentialDiagnoses) {
     this.differentialDiagnoses = differentialDiagnoses;
  }

  public DifferentialDiagnosesEvaluation getDifferentialDiagnoses() {
     return this.differentialDiagnoses ;
  }

  public void setProgressNote(ProgressNoteObservation progressNote) {
     this.progressNote = progressNote;
  }

  public ProgressNoteObservation getProgressNote() {
     return this.progressNote ;
  }

  public void setSocialContextScreeningQuestionnaire(
      SocialContextScreeningQuestionnaireObservation socialContextScreeningQuestionnaire) {
     this.socialContextScreeningQuestionnaire = socialContextScreeningQuestionnaire;
  }

  public SocialContextScreeningQuestionnaireObservation getSocialContextScreeningQuestionnaire() {
     return this.socialContextScreeningQuestionnaire ;
  }

  public void setFamilyHistoryScreeningQuestionnaire(
      FamilyHistoryScreeningQuestionnaireObservation familyHistoryScreeningQuestionnaire) {
     this.familyHistoryScreeningQuestionnaire = familyHistoryScreeningQuestionnaire;
  }

  public FamilyHistoryScreeningQuestionnaireObservation getFamilyHistoryScreeningQuestionnaire() {
     return this.familyHistoryScreeningQuestionnaire ;
  }

  public void setMedicationScreeningQuestionnaire(
      MedicationScreeningQuestionnaireObservation medicationScreeningQuestionnaire) {
     this.medicationScreeningQuestionnaire = medicationScreeningQuestionnaire;
  }

  public MedicationScreeningQuestionnaireObservation getMedicationScreeningQuestionnaire() {
     return this.medicationScreeningQuestionnaire ;
  }

  public void setProcedureScreeningQuestionnaire(
      ProcedureScreeningQuestionnaireObservation procedureScreeningQuestionnaire) {
     this.procedureScreeningQuestionnaire = procedureScreeningQuestionnaire;
  }

  public ProcedureScreeningQuestionnaireObservation getProcedureScreeningQuestionnaire() {
     return this.procedureScreeningQuestionnaire ;
  }

  public void setDiagnosticInvestigationScreeningQuestionnaire(
      DiagnosticInvestigationScreeningQuestionnaireObservation diagnosticInvestigationScreeningQuestionnaire) {
     this.diagnosticInvestigationScreeningQuestionnaire = diagnosticInvestigationScreeningQuestionnaire;
  }

  public DiagnosticInvestigationScreeningQuestionnaireObservation getDiagnosticInvestigationScreeningQuestionnaire(
      ) {
     return this.diagnosticInvestigationScreeningQuestionnaire ;
  }

  public void setExposureScreeningQuestionnaire(
      ExposureScreeningQuestionnaireObservation exposureScreeningQuestionnaire) {
     this.exposureScreeningQuestionnaire = exposureScreeningQuestionnaire;
  }

  public ExposureScreeningQuestionnaireObservation getExposureScreeningQuestionnaire() {
     return this.exposureScreeningQuestionnaire ;
  }

  public void setComposer(PartyProxy composer) {
     this.composer = composer;
  }

  public PartyProxy getComposer() {
     return this.composer ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTerritory(Territory territory) {
     this.territory = territory;
  }

  public Territory getTerritory() {
     return this.territory ;
  }

  public VersionUid getVersionUid() {
     return this.versionUid ;
  }

  public void setVersionUid(VersionUid versionUid) {
     this.versionUid = versionUid;
  }
}
