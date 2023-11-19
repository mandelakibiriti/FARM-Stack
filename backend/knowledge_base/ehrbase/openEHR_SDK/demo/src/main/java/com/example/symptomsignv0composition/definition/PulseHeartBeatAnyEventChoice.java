package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.808186329+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface PulseHeartBeatAnyEventChoice {
  NullFlavour getIrregularTypeNullFlavourDefiningCode();

  void setIrregularTypeNullFlavourDefiningCode(NullFlavour irregularTypeNullFlavourDefiningCode);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  List<PulseHeartBeatConfoundingFactorsElement> getConfoundingFactors();

  void setConfoundingFactors(List<PulseHeartBeatConfoundingFactorsElement> confoundingFactors);

  String getClinicalDescriptionValue();

  void setClinicalDescriptionValue(String clinicalDescriptionValue);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  NullFlavour getPresenceNullFlavourDefiningCode();

  void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode);

  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);

  List<PulseHeartBeatClinicalInterpretationElement> getClinicalInterpretation();

  void setClinicalInterpretation(
      List<PulseHeartBeatClinicalInterpretationElement> clinicalInterpretation);

  List<PulseHeartBeatCharacterElement> getCharacter();

  void setCharacter(List<PulseHeartBeatCharacterElement> character);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getCommentValue();

  void setCommentValue(String commentValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getRegularityNullFlavourDefiningCode();

  void setRegularityNullFlavourDefiningCode(NullFlavour regularityNullFlavourDefiningCode);

  PresenceDefiningCode getPresenceDefiningCode();

  void setPresenceDefiningCode(PresenceDefiningCode presenceDefiningCode);

  NullFlavour getClinicalDescriptionNullFlavourDefiningCode();

  void setClinicalDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalDescriptionNullFlavourDefiningCode);

  List<PulseHeartBeatRhythmElement> getRhythm();

  void setRhythm(List<PulseHeartBeatRhythmElement> rhythm);

  RegularityDefiningCode getRegularityDefiningCode();

  void setRegularityDefiningCode(RegularityDefiningCode regularityDefiningCode);

  PositionDefiningCode3 getPositionDefiningCode();

  void setPositionDefiningCode(PositionDefiningCode3 positionDefiningCode);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  IrregularTypeDefiningCode getIrregularTypeDefiningCode();

  void setIrregularTypeDefiningCode(IrregularTypeDefiningCode irregularTypeDefiningCode);

  List<Cluster> getExertion();

  void setExertion(List<Cluster> exertion);
}
