package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.798312183+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface BodyTemperatureAnyEventChoice {
  List<Cluster> getEnvironmentalConditions();

  void setEnvironmentalConditions(List<Cluster> environmentalConditions);

  Double getTemperatureMagnitude();

  void setTemperatureMagnitude(Double temperatureMagnitude);

  NullFlavour getDayOfMenstrualCycleNullFlavourDefiningCode();

  void setDayOfMenstrualCycleNullFlavourDefiningCode(
      NullFlavour dayOfMenstrualCycleNullFlavourDefiningCode);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getTemperatureNullFlavourDefiningCode();

  void setTemperatureNullFlavourDefiningCode(NullFlavour temperatureNullFlavourDefiningCode);

  String getTemperatureUnits();

  void setTemperatureUnits(String temperatureUnits);

  Long getDayOfMenstrualCycleMagnitude();

  void setDayOfMenstrualCycleMagnitude(Long dayOfMenstrualCycleMagnitude);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  NullFlavour getBodyExposureNullFlavourDefiningCode();

  void setBodyExposureNullFlavourDefiningCode(NullFlavour bodyExposureNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  BodyTemperatureBodyExposureChoice getBodyExposure();

  void setBodyExposure(BodyTemperatureBodyExposureChoice bodyExposure);

  String getCommentValue();

  void setCommentValue(String commentValue);
}
