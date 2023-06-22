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
    date = "2023-06-19T20:52:30.814759019+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface RespirationAnyEventChoice {
  NullFlavour getRegularityNullFlavourDefiningCode();

  void setRegularityNullFlavourDefiningCode(NullFlavour regularityNullFlavourDefiningCode);

  String getRateUnits();

  void setRateUnits(String rateUnits);

  String getClinicalDescriptionValue();

  void setClinicalDescriptionValue(String clinicalDescriptionValue);

  Cluster getInspiredOxygen();

  void setInspiredOxygen(Cluster inspiredOxygen);

  Cluster getExertion();

  void setExertion(Cluster exertion);

  String getCommentValue();

  void setCommentValue(String commentValue);

  DepthDefiningCode getDepthDefiningCode();

  void setDepthDefiningCode(DepthDefiningCode depthDefiningCode);

  NullFlavour getRateNullFlavourDefiningCode();

  void setRateNullFlavourDefiningCode(NullFlavour rateNullFlavourDefiningCode);

  RegularityDefiningCode2 getRegularityDefiningCode();

  void setRegularityDefiningCode(RegularityDefiningCode2 regularityDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getClinicalDescriptionNullFlavourDefiningCode();

  void setClinicalDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalDescriptionNullFlavourDefiningCode);

  NullFlavour getDepthNullFlavourDefiningCode();

  void setDepthNullFlavourDefiningCode(NullFlavour depthNullFlavourDefiningCode);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  Double getRateMagnitude();

  void setRateMagnitude(Double rateMagnitude);

  NullFlavour getPresenceNullFlavourDefiningCode();

  void setPresenceNullFlavourDefiningCode(NullFlavour presenceNullFlavourDefiningCode);

  PresenceDefiningCode2 getPresenceDefiningCode();

  void setPresenceDefiningCode(PresenceDefiningCode2 presenceDefiningCode);

  List<RespirationClinicalInterpretationElement> getClinicalInterpretation();

  void setClinicalInterpretation(
      List<RespirationClinicalInterpretationElement> clinicalInterpretation);
}
