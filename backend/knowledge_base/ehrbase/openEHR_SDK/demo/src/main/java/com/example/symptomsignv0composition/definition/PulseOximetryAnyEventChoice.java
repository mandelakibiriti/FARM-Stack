package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.quantity.DvProportion;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.823607280+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface PulseOximetryAnyEventChoice {
  List<PulseOximetryConfoundingFactorsElement> getConfoundingFactors();

  void setConfoundingFactors(List<PulseOximetryConfoundingFactorsElement> confoundingFactors);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);

  DvProportion getSpo();

  void setSpo(DvProportion spo);

  List<Cluster> getWaveform();

  void setWaveform(List<Cluster> waveform);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  List<PulseOximetryInterpretationElement> getInterpretation();

  void setInterpretation(List<PulseOximetryInterpretationElement> interpretation);

  List<Cluster> getMultimediaImage();

  void setMultimediaImage(List<Cluster> multimediaImage);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getSpoNullFlavourDefiningCode();

  void setSpoNullFlavourDefiningCode(NullFlavour spoNullFlavourDefiningCode);

  String getCommentValue();

  void setCommentValue(String commentValue);

  LevelOfExertionCluster getLevelOfExertion();

  void setLevelOfExertion(LevelOfExertionCluster levelOfExertion);
}
