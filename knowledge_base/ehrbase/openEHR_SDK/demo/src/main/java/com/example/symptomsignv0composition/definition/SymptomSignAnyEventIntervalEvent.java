package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.717246366+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class SymptomSignAnyEventIntervalEvent implements IntervalEventEntity, SymptomSignAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Symptom/Sign name
   * Description: The name of the reported symptom or sign.
   * Comment: Symptom name should be coded with a terminology, where possible.
   */
  @Path("/data[at0192]/items[at0001]/value|value")
  private String symptomSignNameValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Symptom/Sign name/null_flavour
   */
  @Path("/data[at0192]/items[at0001]/null_flavour|defining_code")
  private NullFlavour symptomSignNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Nil significant
   * Description: The identified symptom or sign was reported as not being present to any significant degree.
   * Comment: Record as True if the subject of care has reported the symptom as not significant. For example: if the individual has never experienced the symptom it is appropriate to record 'nil significant'; or if the individual commonly experiences the symptom, in some circumstances it may be considered appropriate to record 'nil significant' if the individual has experienced no deviation from their 'normal' baseline.
   */
  @Path("/data[at0192]/items[at0035]/value|value")
  private Boolean nilSignificantValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Nil significant/null_flavour
   */
  @Path("/data[at0192]/items[at0035]/null_flavour|defining_code")
  private NullFlavour nilSignificantNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Body site
   * Description: Simple body site where the symptom or sign was reported.
   * Comment: Occurrences of this data element are set to 0..* to allow multiple body sites to be separated out in a template if desired. This allows for representation of clinical scenarios where a symptom or sign needs to be recorded in multiple locations or identifying both the originating and distal site in pain radiation, but where all of the other attributes such as impact and duration are identical. If the requirements for recording the body site are determined at run-time by the application or require more complex modelling such as relative locations then use the CLUSTER.anatomical_location or CLUSTER.relative_location within the Detailed anatomical location' SLOT in this archetype. 
   * If the anatomical location is included in the Symptom name via precoordinated codes, this data element becomes redundant. If the anatomical location is recorded using the 'Structured body site' SLOT, then use of this data element is not allowed - record only the simple 'Body site' OR 'Structured body site', but not both.
   */
  @Path("/data[at0192]/items[at0151]")
  private List<SymptomSignBodySiteElement> bodySite;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location
   * Description: A physical site on or within the human body.
   */
  @Path("/data[at0192]/items[openEHR-EHR-CLUSTER.anatomical_location.v1]")
  private AnatomicalLocationCluster2 anatomicalLocation;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Description
   * Description: Narrative description about the reported symptom or sign.
   */
  @Path("/data[at0192]/items[at0002]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Description/null_flavour
   */
  @Path("/data[at0192]/items[at0002]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Episodicity
   * Description: Category of this episode for the identified symptom or sign.
   */
  @Path("/data[at0192]/items[at0175]/value|defining_code")
  private EpisodicityDefiningCode2 episodicityDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Episodicity/null_flavour
   */
  @Path("/data[at0192]/items[at0175]/null_flavour|defining_code")
  private NullFlavour episodicityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Occurrence
   * Description: Type of occurrence for this symptom or sign?
   */
  @Path("/data[at0192]/items[at0186]/value|defining_code")
  private OccurrenceDefiningCode2 occurrenceDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Occurrence/null_flavour
   */
  @Path("/data[at0192]/items[at0186]/null_flavour|defining_code")
  private NullFlavour occurrenceNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Episode onset
   * Description: The onset for this episode of the symptom or sign.
   * Comment: While partial dates are permitted, the exact date and time of onset can be recorded, if appropriate. If this symptom or sign is experienced for the first time or is a re-occurrence, this date is used to represent the onset of this episode. If this symptom or sign is ongoing, this data element may be redundant if it has been recorded previously.
   */
  @Path("/data[at0192]/items[at0152]/value|value")
  private TemporalAccessor episodeOnsetValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Episode onset/null_flavour
   */
  @Path("/data[at0192]/items[at0152]/null_flavour|defining_code")
  private NullFlavour episodeOnsetNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Onset type
   * Description: Description of the onset of the symptom or sign.
   * Comment: The type of the onset can be coded with a terminology, if desired. For example: gradual; or sudden.
   */
  @Path("/data[at0192]/items[at0164]/value|value")
  private String onsetTypeValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Onset type/null_flavour
   */
  @Path("/data[at0192]/items[at0164]/null_flavour|defining_code")
  private NullFlavour onsetTypeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Duration
   * Description: The duration of this episode of the symptom or sign since onset.
   * Comment: If 'Date/time of onset' and 'Date/time of resolution' are used in systems, this data element may be calculated, or alternatively, be considered redundant in this scenario.
   */
  @Path("/data[at0192]/items[at0028]/value|value")
  private TemporalAmount durationValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Duration/null_flavour
   */
  @Path("/data[at0192]/items[at0028]/null_flavour|defining_code")
  private NullFlavour durationNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Severity category/null_flavour
   */
  @Path("/data[at0192]/items[at0021]/null_flavour|defining_code")
  private NullFlavour severityCategoryNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Severity rating
   * Description: Numerical rating scale representing the overall severity of the symptom or sign.
   * Comment: Symptom severity can be rated by the individual by recording a score from 0 (ie symptom not present) to 10.0 (ie symptom is as severe as the individual can imagine). This score can be represented in the user interface as a visual analogue scale. The data element has occurrences set to 0..* to allow for variations such as 'maximal severity' or 'average severity' to be included in a template.
   */
  @Path("/data[at0192]/items[at0026]")
  private List<SymptomSignSeverityRatingElement> severityRating;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Character
   * Description: Word or short phrase describing the nature of the symptom or sign.
   * Comment: For example: pain could be described as 'gnawing', 'burning', or 'like an electric shock'; a headache could be 'throbbing' or 'constant'. Coding with an external terminology is preferred, where possible.
   */
  @Path("/data[at0192]/items[at0189]")
  private List<SymptomSignCharacterElement> character;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Progression
   * Description: Description progression of the symptom or sign at the time of reporting.
   * Comment: Occurrences of this data element are set to 0..* to allow multiple types of progression to be separated out in a template if desired - for example, severity or frequency.
   */
  @Path("/data[at0192]/items[at0180]")
  private List<SymptomSignProgressionElement> progression;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Pattern
   * Description: Narrative description about the pattern of the symptom or sign during this episode.
   * Comment: For example: pain could be described as constant or intermittent.
   */
  @Path("/data[at0192]/items[at0003]/value|value")
  private String patternValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Pattern/null_flavour
   */
  @Path("/data[at0192]/items[at0003]/null_flavour|defining_code")
  private NullFlavour patternNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Modifying factor
   * Description: Detail about how a specific factor effects the identified symptom or sign during this episode.
   */
  @Path("/data[at0192]/items[at0018]")
  private List<SymptomSignModifyingFactorCluster> modifyingFactor;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Precipitating factor
   * Description: Details about specified factors that are associated with the precipitation or resolution of the symptom or sign.
   * Comment: For example: onset of headache occurred one week prior to menstruation; or onset of headache occurred one hour after fall of bicycle.
   */
  @Path("/data[at0192]/items[at0165 and name/value='Precipitating factor']")
  private List<SymptomSignPrecipitatingFactorCluster> precipitatingFactor;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Resolving factor
   * Description: Details about specified factors that are associated with the precipitation or resolution of the symptom or sign.
   * Comment: For example: onset of headache occurred one week prior to menstruation; or onset of headache occurred one hour after fall of bicycle.
   */
  @Path("/data[at0192]/items[at0165 and name/value='Resolving factor']")
  private List<SymptomSignResolvingFactorCluster> resolvingFactor;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Impact
   * Description: Description of the impact of this symptom or sign.
   * Comment: Assessment of impact could consider the severity, duration and frequency of the symptom as well as the type of impact including, but not limited to, functional, social and emotional impact. Occurrences of this data element are set to 0..* to allow multiple types of impact to be separated out in a template if desired. Examples for functional impact from hearing loss may include: 'Difficulty Hearing in Quiet Environment'; 'Difficulty Hearing the TV or Radio'; 'Difficulty Hearing Group Conversation'; and 'Difficulty Hearing on Phone'.
   */
  @Path("/data[at0192]/items[at0155]")
  private List<SymptomSignImpactElement> impact;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Episode description
   * Description: Narrative description about the course of the symptom or sign during this episode.
   * Comment: For example: a text description of the immediate onset of the symptom, activities that worsened or relieved the symptom, whether it is improving or worsening and how it resolved over weeks.
   */
  @Path("/data[at0192]/items[at0037]/value|value")
  private String episodeDescriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Episode description/null_flavour
   */
  @Path("/data[at0192]/items[at0037]/null_flavour|defining_code")
  private NullFlavour episodeDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Condition progress
   * Description: Details about the stage or phase of an identified condition.
   */
  @Path("/data[at0192]/items[openEHR-EHR-CLUSTER.condition_progress.v0]")
  private ConditionProgressCluster conditionProgress;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Resolution date/time
   * Description: The timing of the cessation of this episode of the symptom or sign.
   * Comment: If 'Date/time of onset' and 'Duration' are used in systems, this data element may be calculated, or alternatively, considered redundant. While partial dates are permitted, the exact date and time of resolution can be recorded, if appropriate.
   */
  @Path("/data[at0192]/items[at0161]/value|value")
  private TemporalAccessor resolutionDateTimeValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Resolution date/time/null_flavour
   */
  @Path("/data[at0192]/items[at0161]/null_flavour|defining_code")
  private NullFlavour resolutionDateTimeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Description of previous episodes
   * Description: Narrative description of any or all previous episodes.
   * Comment: For example: frequency/periodicity - per hour, day, week, month, year; and regularity. May include a comparison to this episode.
   */
  @Path("/data[at0192]/items[at0057]/value|value")
  private String descriptionOfPreviousEpisodesValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Description of previous episodes/null_flavour
   */
  @Path("/data[at0192]/items[at0057]/null_flavour|defining_code")
  private NullFlavour descriptionOfPreviousEpisodesNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Number of previous episodes
   * Description: The number of times this symptom or sign has previously occurred.
   */
  @Path("/data[at0192]/items[at0031]/value|magnitude")
  private Long numberOfPreviousEpisodesMagnitude;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Number of previous episodes/null_flavour
   */
  @Path("/data[at0192]/items[at0031]/null_flavour|defining_code")
  private NullFlavour numberOfPreviousEpisodesNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Previous episodes
   * Description: Structured details of the symptom or sign during a previous episode.
   * Comment: In linked clinical systems, it is possible that previous episodes are already recorded within the EHR. Systems can allow the clinician to LINK to relevant previous episodes. However in a system or message without LINKs to existing data or with a new patient, additional instances of the symptom archetype could be included here to represent previous episodes. It is recommended that new instances of the Symptom archetype inserted in this SLOT represent one or many previous episodes to this Symptom instance only.
   */
  @Path("/data[at0192]/items[at0146]")
  private List<Cluster> previousEpisodes;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Comment
   * Description: Additional narrative about the symptom or sign not captured in other fields.
   */
  @Path("/data[at0192]/items[at0163]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Comment/null_flavour
   */
  @Path("/data[at0192]/items[at0163]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Exclusion of a symptom or sign
   * Description: Statement to explicitly record that a symptom or signe was reported as not present.
   */
  @Path("/data[at0192]/items[openEHR-EHR-CLUSTER.exclusion_symptom_sign.v0]")
  private ExclusionOfASymptomOrSignCluster exclusionOfASymptomOrSign;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Severity category
   * Description: Category representing the overall severity of the symptom or sign.
   * Comment: Defining values such as mild, moderate or severe in such a way that is applicable to multiple symptoms or signs plus allows multiple users to interpret and record them consistently is not easy. Some organisations extend the value set further with inclusion of additional values such as 'Trivial' and 'Very severe', and/or 'Mild-Moderate' and 'Moderate-Severe', adds to the definitional difficulty and may also worsen inter-recorder reliability issues. Use of 'Life-threatening' and 'Fatal' is also often considered as part of this value set, although from a pure point of view it may actually reflect an outcome rather than a severity. In view of the above, keeping to a well-defined but smaller list is preferred and so the mild/moderate/severe value set is offered, however the choice of other text allows for other value sets to be included at this data element in a template. Note: more specific grading of severity can be recorded using the 'Specific details' SLOT.
   */
  @Path("/data[at0192]/items[at0021]/value")
  @Choice
  private SymptomSignSeverityCategoryChoice severityCategory;

  public void setSymptomSignNameValue(String symptomSignNameValue) {
     this.symptomSignNameValue = symptomSignNameValue;
  }

  public String getSymptomSignNameValue() {
     return this.symptomSignNameValue ;
  }

  public void setSymptomSignNameNullFlavourDefiningCode(
      NullFlavour symptomSignNameNullFlavourDefiningCode) {
     this.symptomSignNameNullFlavourDefiningCode = symptomSignNameNullFlavourDefiningCode;
  }

  public NullFlavour getSymptomSignNameNullFlavourDefiningCode() {
     return this.symptomSignNameNullFlavourDefiningCode ;
  }

  public void setNilSignificantValue(Boolean nilSignificantValue) {
     this.nilSignificantValue = nilSignificantValue;
  }

  public Boolean isNilSignificantValue() {
     return this.nilSignificantValue ;
  }

  public void setNilSignificantNullFlavourDefiningCode(
      NullFlavour nilSignificantNullFlavourDefiningCode) {
     this.nilSignificantNullFlavourDefiningCode = nilSignificantNullFlavourDefiningCode;
  }

  public NullFlavour getNilSignificantNullFlavourDefiningCode() {
     return this.nilSignificantNullFlavourDefiningCode ;
  }

  public void setBodySite(List<SymptomSignBodySiteElement> bodySite) {
     this.bodySite = bodySite;
  }

  public List<SymptomSignBodySiteElement> getBodySite() {
     return this.bodySite ;
  }

  public void setAnatomicalLocation(AnatomicalLocationCluster2 anatomicalLocation) {
     this.anatomicalLocation = anatomicalLocation;
  }

  public AnatomicalLocationCluster2 getAnatomicalLocation() {
     return this.anatomicalLocation ;
  }

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setEpisodicityDefiningCode(EpisodicityDefiningCode2 episodicityDefiningCode) {
     this.episodicityDefiningCode = episodicityDefiningCode;
  }

  public EpisodicityDefiningCode2 getEpisodicityDefiningCode() {
     return this.episodicityDefiningCode ;
  }

  public void setEpisodicityNullFlavourDefiningCode(
      NullFlavour episodicityNullFlavourDefiningCode) {
     this.episodicityNullFlavourDefiningCode = episodicityNullFlavourDefiningCode;
  }

  public NullFlavour getEpisodicityNullFlavourDefiningCode() {
     return this.episodicityNullFlavourDefiningCode ;
  }

  public void setOccurrenceDefiningCode(OccurrenceDefiningCode2 occurrenceDefiningCode) {
     this.occurrenceDefiningCode = occurrenceDefiningCode;
  }

  public OccurrenceDefiningCode2 getOccurrenceDefiningCode() {
     return this.occurrenceDefiningCode ;
  }

  public void setOccurrenceNullFlavourDefiningCode(NullFlavour occurrenceNullFlavourDefiningCode) {
     this.occurrenceNullFlavourDefiningCode = occurrenceNullFlavourDefiningCode;
  }

  public NullFlavour getOccurrenceNullFlavourDefiningCode() {
     return this.occurrenceNullFlavourDefiningCode ;
  }

  public void setEpisodeOnsetValue(TemporalAccessor episodeOnsetValue) {
     this.episodeOnsetValue = episodeOnsetValue;
  }

  public TemporalAccessor getEpisodeOnsetValue() {
     return this.episodeOnsetValue ;
  }

  public void setEpisodeOnsetNullFlavourDefiningCode(
      NullFlavour episodeOnsetNullFlavourDefiningCode) {
     this.episodeOnsetNullFlavourDefiningCode = episodeOnsetNullFlavourDefiningCode;
  }

  public NullFlavour getEpisodeOnsetNullFlavourDefiningCode() {
     return this.episodeOnsetNullFlavourDefiningCode ;
  }

  public void setOnsetTypeValue(String onsetTypeValue) {
     this.onsetTypeValue = onsetTypeValue;
  }

  public String getOnsetTypeValue() {
     return this.onsetTypeValue ;
  }

  public void setOnsetTypeNullFlavourDefiningCode(NullFlavour onsetTypeNullFlavourDefiningCode) {
     this.onsetTypeNullFlavourDefiningCode = onsetTypeNullFlavourDefiningCode;
  }

  public NullFlavour getOnsetTypeNullFlavourDefiningCode() {
     return this.onsetTypeNullFlavourDefiningCode ;
  }

  public void setDurationValue(TemporalAmount durationValue) {
     this.durationValue = durationValue;
  }

  public TemporalAmount getDurationValue() {
     return this.durationValue ;
  }

  public void setDurationNullFlavourDefiningCode(NullFlavour durationNullFlavourDefiningCode) {
     this.durationNullFlavourDefiningCode = durationNullFlavourDefiningCode;
  }

  public NullFlavour getDurationNullFlavourDefiningCode() {
     return this.durationNullFlavourDefiningCode ;
  }

  public void setSeverityCategoryNullFlavourDefiningCode(
      NullFlavour severityCategoryNullFlavourDefiningCode) {
     this.severityCategoryNullFlavourDefiningCode = severityCategoryNullFlavourDefiningCode;
  }

  public NullFlavour getSeverityCategoryNullFlavourDefiningCode() {
     return this.severityCategoryNullFlavourDefiningCode ;
  }

  public void setSeverityRating(List<SymptomSignSeverityRatingElement> severityRating) {
     this.severityRating = severityRating;
  }

  public List<SymptomSignSeverityRatingElement> getSeverityRating() {
     return this.severityRating ;
  }

  public void setCharacter(List<SymptomSignCharacterElement> character) {
     this.character = character;
  }

  public List<SymptomSignCharacterElement> getCharacter() {
     return this.character ;
  }

  public void setProgression(List<SymptomSignProgressionElement> progression) {
     this.progression = progression;
  }

  public List<SymptomSignProgressionElement> getProgression() {
     return this.progression ;
  }

  public void setPatternValue(String patternValue) {
     this.patternValue = patternValue;
  }

  public String getPatternValue() {
     return this.patternValue ;
  }

  public void setPatternNullFlavourDefiningCode(NullFlavour patternNullFlavourDefiningCode) {
     this.patternNullFlavourDefiningCode = patternNullFlavourDefiningCode;
  }

  public NullFlavour getPatternNullFlavourDefiningCode() {
     return this.patternNullFlavourDefiningCode ;
  }

  public void setModifyingFactor(List<SymptomSignModifyingFactorCluster> modifyingFactor) {
     this.modifyingFactor = modifyingFactor;
  }

  public List<SymptomSignModifyingFactorCluster> getModifyingFactor() {
     return this.modifyingFactor ;
  }

  public void setPrecipitatingFactor(
      List<SymptomSignPrecipitatingFactorCluster> precipitatingFactor) {
     this.precipitatingFactor = precipitatingFactor;
  }

  public List<SymptomSignPrecipitatingFactorCluster> getPrecipitatingFactor() {
     return this.precipitatingFactor ;
  }

  public void setResolvingFactor(List<SymptomSignResolvingFactorCluster> resolvingFactor) {
     this.resolvingFactor = resolvingFactor;
  }

  public List<SymptomSignResolvingFactorCluster> getResolvingFactor() {
     return this.resolvingFactor ;
  }

  public void setImpact(List<SymptomSignImpactElement> impact) {
     this.impact = impact;
  }

  public List<SymptomSignImpactElement> getImpact() {
     return this.impact ;
  }

  public void setEpisodeDescriptionValue(String episodeDescriptionValue) {
     this.episodeDescriptionValue = episodeDescriptionValue;
  }

  public String getEpisodeDescriptionValue() {
     return this.episodeDescriptionValue ;
  }

  public void setEpisodeDescriptionNullFlavourDefiningCode(
      NullFlavour episodeDescriptionNullFlavourDefiningCode) {
     this.episodeDescriptionNullFlavourDefiningCode = episodeDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getEpisodeDescriptionNullFlavourDefiningCode() {
     return this.episodeDescriptionNullFlavourDefiningCode ;
  }

  public void setConditionProgress(ConditionProgressCluster conditionProgress) {
     this.conditionProgress = conditionProgress;
  }

  public ConditionProgressCluster getConditionProgress() {
     return this.conditionProgress ;
  }

  public void setResolutionDateTimeValue(TemporalAccessor resolutionDateTimeValue) {
     this.resolutionDateTimeValue = resolutionDateTimeValue;
  }

  public TemporalAccessor getResolutionDateTimeValue() {
     return this.resolutionDateTimeValue ;
  }

  public void setResolutionDateTimeNullFlavourDefiningCode(
      NullFlavour resolutionDateTimeNullFlavourDefiningCode) {
     this.resolutionDateTimeNullFlavourDefiningCode = resolutionDateTimeNullFlavourDefiningCode;
  }

  public NullFlavour getResolutionDateTimeNullFlavourDefiningCode() {
     return this.resolutionDateTimeNullFlavourDefiningCode ;
  }

  public void setDescriptionOfPreviousEpisodesValue(String descriptionOfPreviousEpisodesValue) {
     this.descriptionOfPreviousEpisodesValue = descriptionOfPreviousEpisodesValue;
  }

  public String getDescriptionOfPreviousEpisodesValue() {
     return this.descriptionOfPreviousEpisodesValue ;
  }

  public void setDescriptionOfPreviousEpisodesNullFlavourDefiningCode(
      NullFlavour descriptionOfPreviousEpisodesNullFlavourDefiningCode) {
     this.descriptionOfPreviousEpisodesNullFlavourDefiningCode = descriptionOfPreviousEpisodesNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionOfPreviousEpisodesNullFlavourDefiningCode() {
     return this.descriptionOfPreviousEpisodesNullFlavourDefiningCode ;
  }

  public void setNumberOfPreviousEpisodesMagnitude(Long numberOfPreviousEpisodesMagnitude) {
     this.numberOfPreviousEpisodesMagnitude = numberOfPreviousEpisodesMagnitude;
  }

  public Long getNumberOfPreviousEpisodesMagnitude() {
     return this.numberOfPreviousEpisodesMagnitude ;
  }

  public void setNumberOfPreviousEpisodesNullFlavourDefiningCode(
      NullFlavour numberOfPreviousEpisodesNullFlavourDefiningCode) {
     this.numberOfPreviousEpisodesNullFlavourDefiningCode = numberOfPreviousEpisodesNullFlavourDefiningCode;
  }

  public NullFlavour getNumberOfPreviousEpisodesNullFlavourDefiningCode() {
     return this.numberOfPreviousEpisodesNullFlavourDefiningCode ;
  }

  public void setPreviousEpisodes(List<Cluster> previousEpisodes) {
     this.previousEpisodes = previousEpisodes;
  }

  public List<Cluster> getPreviousEpisodes() {
     return this.previousEpisodes ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setExclusionOfASymptomOrSign(
      ExclusionOfASymptomOrSignCluster exclusionOfASymptomOrSign) {
     this.exclusionOfASymptomOrSign = exclusionOfASymptomOrSign;
  }

  public ExclusionOfASymptomOrSignCluster getExclusionOfASymptomOrSign() {
     return this.exclusionOfASymptomOrSign ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }

  public void setSeverityCategory(SymptomSignSeverityCategoryChoice severityCategory) {
     this.severityCategory = severityCategory;
  }

  public SymptomSignSeverityCategoryChoice getSeverityCategory() {
     return this.severityCategory ;
  }
}
