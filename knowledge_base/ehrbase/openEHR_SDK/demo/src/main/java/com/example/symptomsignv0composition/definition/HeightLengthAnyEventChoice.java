package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.771639292+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface HeightLengthAnyEventChoice {
  String getCommentValue();

  void setCommentValue(String commentValue);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getHeightLengthNullFlavourDefiningCode();

  void setHeightLengthNullFlavourDefiningCode(NullFlavour heightLengthNullFlavourDefiningCode);

  String getHeightLengthUnits();

  void setHeightLengthUnits(String heightLengthUnits);

  Double getHeightLengthMagnitude();

  void setHeightLengthMagnitude(Double heightLengthMagnitude);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  PositionDefiningCode getPositionDefiningCode();

  void setPositionDefiningCode(PositionDefiningCode positionDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
