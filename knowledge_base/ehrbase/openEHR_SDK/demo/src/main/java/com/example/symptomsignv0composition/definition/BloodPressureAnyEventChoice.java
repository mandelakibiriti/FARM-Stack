package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.791960252+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface BloodPressureAnyEventChoice {
  String getDiastolicUnits();

  void setDiastolicUnits(String diastolicUnits);

  Double getSystolicMagnitude();

  void setSystolicMagnitude(Double systolicMagnitude);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  NullFlavour getSystolicNullFlavourDefiningCode();

  void setSystolicNullFlavourDefiningCode(NullFlavour systolicNullFlavourDefiningCode);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);

  Double getPulsePressureMagnitude();

  void setPulsePressureMagnitude(Double pulsePressureMagnitude);

  Double getMeanArterialPressureMagnitude();

  void setMeanArterialPressureMagnitude(Double meanArterialPressureMagnitude);

  NullFlavour getSleepStatusNullFlavourDefiningCode();

  void setSleepStatusNullFlavourDefiningCode(NullFlavour sleepStatusNullFlavourDefiningCode);

  NullFlavour getClinicalInterpretationNullFlavourDefiningCode();

  void setClinicalInterpretationNullFlavourDefiningCode(
      NullFlavour clinicalInterpretationNullFlavourDefiningCode);

  String getCommentValue();

  void setCommentValue(String commentValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getClinicalInterpretationValue();

  void setClinicalInterpretationValue(String clinicalInterpretationValue);

  PositionDefiningCode2 getPositionDefiningCode();

  void setPositionDefiningCode(PositionDefiningCode2 positionDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getMeanArterialPressureNullFlavourDefiningCode();

  void setMeanArterialPressureNullFlavourDefiningCode(
      NullFlavour meanArterialPressureNullFlavourDefiningCode);

  NullFlavour getDiastolicNullFlavourDefiningCode();

  void setDiastolicNullFlavourDefiningCode(NullFlavour diastolicNullFlavourDefiningCode);

  SleepStatusDefiningCode getSleepStatusDefiningCode();

  void setSleepStatusDefiningCode(SleepStatusDefiningCode sleepStatusDefiningCode);

  NullFlavour getPulsePressureNullFlavourDefiningCode();

  void setPulsePressureNullFlavourDefiningCode(NullFlavour pulsePressureNullFlavourDefiningCode);

  String getSystolicUnits();

  void setSystolicUnits(String systolicUnits);

  Double getDiastolicMagnitude();

  void setDiastolicMagnitude(Double diastolicMagnitude);

  String getMeanArterialPressureUnits();

  void setMeanArterialPressureUnits(String meanArterialPressureUnits);

  String getPulsePressureUnits();

  void setPulsePressureUnits(String pulsePressureUnits);
}
