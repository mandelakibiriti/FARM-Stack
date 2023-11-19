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
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.742359196+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface SymptomSignAnyEventChoice {
  List<SymptomSignPrecipitatingFactorCluster> getPrecipitatingFactor();

  void setPrecipitatingFactor(List<SymptomSignPrecipitatingFactorCluster> precipitatingFactor);

  ExclusionOfASymptomOrSignCluster getExclusionOfASymptomOrSign();

  void setExclusionOfASymptomOrSign(ExclusionOfASymptomOrSignCluster exclusionOfASymptomOrSign);

  NullFlavour getSymptomSignNameNullFlavourDefiningCode();

  void setSymptomSignNameNullFlavourDefiningCode(
      NullFlavour symptomSignNameNullFlavourDefiningCode);

  List<SymptomSignProgressionElement> getProgression();

  void setProgression(List<SymptomSignProgressionElement> progression);

  NullFlavour getPatternNullFlavourDefiningCode();

  void setPatternNullFlavourDefiningCode(NullFlavour patternNullFlavourDefiningCode);

  String getDescriptionOfPreviousEpisodesValue();

  void setDescriptionOfPreviousEpisodesValue(String descriptionOfPreviousEpisodesValue);

  TemporalAccessor getEpisodeOnsetValue();

  void setEpisodeOnsetValue(TemporalAccessor episodeOnsetValue);

  String getEpisodeDescriptionValue();

  void setEpisodeDescriptionValue(String episodeDescriptionValue);

  NullFlavour getResolutionDateTimeNullFlavourDefiningCode();

  void setResolutionDateTimeNullFlavourDefiningCode(
      NullFlavour resolutionDateTimeNullFlavourDefiningCode);

  List<SymptomSignResolvingFactorCluster> getResolvingFactor();

  void setResolvingFactor(List<SymptomSignResolvingFactorCluster> resolvingFactor);

  NullFlavour getOnsetTypeNullFlavourDefiningCode();

  void setOnsetTypeNullFlavourDefiningCode(NullFlavour onsetTypeNullFlavourDefiningCode);

  TemporalAccessor getResolutionDateTimeValue();

  void setResolutionDateTimeValue(TemporalAccessor resolutionDateTimeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<SymptomSignBodySiteElement> getBodySite();

  void setBodySite(List<SymptomSignBodySiteElement> bodySite);

  Long getNumberOfPreviousEpisodesMagnitude();

  void setNumberOfPreviousEpisodesMagnitude(Long numberOfPreviousEpisodesMagnitude);

  ConditionProgressCluster getConditionProgress();

  void setConditionProgress(ConditionProgressCluster conditionProgress);

  NullFlavour getEpisodeOnsetNullFlavourDefiningCode();

  void setEpisodeOnsetNullFlavourDefiningCode(NullFlavour episodeOnsetNullFlavourDefiningCode);

  String getDescriptionValue();

  void setDescriptionValue(String descriptionValue);

  AnatomicalLocationCluster2 getAnatomicalLocation();

  void setAnatomicalLocation(AnatomicalLocationCluster2 anatomicalLocation);

  NullFlavour getOccurrenceNullFlavourDefiningCode();

  void setOccurrenceNullFlavourDefiningCode(NullFlavour occurrenceNullFlavourDefiningCode);

  EpisodicityDefiningCode2 getEpisodicityDefiningCode();

  void setEpisodicityDefiningCode(EpisodicityDefiningCode2 episodicityDefiningCode);

  NullFlavour getEpisodicityNullFlavourDefiningCode();

  void setEpisodicityNullFlavourDefiningCode(NullFlavour episodicityNullFlavourDefiningCode);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  List<SymptomSignSeverityRatingElement> getSeverityRating();

  void setSeverityRating(List<SymptomSignSeverityRatingElement> severityRating);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getEpisodeDescriptionNullFlavourDefiningCode();

  void setEpisodeDescriptionNullFlavourDefiningCode(
      NullFlavour episodeDescriptionNullFlavourDefiningCode);

  TemporalAmount getDurationValue();

  void setDurationValue(TemporalAmount durationValue);

  OccurrenceDefiningCode2 getOccurrenceDefiningCode();

  void setOccurrenceDefiningCode(OccurrenceDefiningCode2 occurrenceDefiningCode);

  List<SymptomSignModifyingFactorCluster> getModifyingFactor();

  void setModifyingFactor(List<SymptomSignModifyingFactorCluster> modifyingFactor);

  List<SymptomSignImpactElement> getImpact();

  void setImpact(List<SymptomSignImpactElement> impact);

  List<Cluster> getPreviousEpisodes();

  void setPreviousEpisodes(List<Cluster> previousEpisodes);

  NullFlavour getDescriptionOfPreviousEpisodesNullFlavourDefiningCode();

  void setDescriptionOfPreviousEpisodesNullFlavourDefiningCode(
      NullFlavour descriptionOfPreviousEpisodesNullFlavourDefiningCode);

  String getPatternValue();

  void setPatternValue(String patternValue);

  NullFlavour getDescriptionNullFlavourDefiningCode();

  void setDescriptionNullFlavourDefiningCode(NullFlavour descriptionNullFlavourDefiningCode);

  String getOnsetTypeValue();

  void setOnsetTypeValue(String onsetTypeValue);

  NullFlavour getDurationNullFlavourDefiningCode();

  void setDurationNullFlavourDefiningCode(NullFlavour durationNullFlavourDefiningCode);

  NullFlavour getNilSignificantNullFlavourDefiningCode();

  void setNilSignificantNullFlavourDefiningCode(NullFlavour nilSignificantNullFlavourDefiningCode);

  SymptomSignSeverityCategoryChoice getSeverityCategory();

  void setSeverityCategory(SymptomSignSeverityCategoryChoice severityCategory);

  String getSymptomSignNameValue();

  void setSymptomSignNameValue(String symptomSignNameValue);

  NullFlavour getSeverityCategoryNullFlavourDefiningCode();

  void setSeverityCategoryNullFlavourDefiningCode(
      NullFlavour severityCategoryNullFlavourDefiningCode);

  NullFlavour getNumberOfPreviousEpisodesNullFlavourDefiningCode();

  void setNumberOfPreviousEpisodesNullFlavourDefiningCode(
      NullFlavour numberOfPreviousEpisodesNullFlavourDefiningCode);

  String getCommentValue();

  void setCommentValue(String commentValue);

  Boolean isNilSignificantValue();

  void setNilSignificantValue(Boolean nilSignificantValue);

  List<SymptomSignCharacterElement> getCharacter();

  void setCharacter(List<SymptomSignCharacterElement> character);
}
