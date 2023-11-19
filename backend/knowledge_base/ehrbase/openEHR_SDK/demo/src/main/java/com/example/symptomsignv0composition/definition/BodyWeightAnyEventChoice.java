package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.768409116+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface BodyWeightAnyEventChoice {
  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  Double getWeightMagnitude();

  void setWeightMagnitude(Double weightMagnitude);

  StateOfDressDefiningCode getStateOfDressDefiningCode();

  void setStateOfDressDefiningCode(StateOfDressDefiningCode stateOfDressDefiningCode);

  String getWeightUnits();

  void setWeightUnits(String weightUnits);

  NullFlavour getWeightNullFlavourDefiningCode();

  void setWeightNullFlavourDefiningCode(NullFlavour weightNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  String getCommentValue();

  void setCommentValue(String commentValue);

  NullFlavour getStateOfDressNullFlavourDefiningCode();

  void setStateOfDressNullFlavourDefiningCode(NullFlavour stateOfDressNullFlavourDefiningCode);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);
}
