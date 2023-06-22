package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.879090681+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface ExposureScreeningQuestionnaireAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getNameOfAgentNullFlavourDefiningCode();

  void setNameOfAgentNullFlavourDefiningCode(NullFlavour nameOfAgentNullFlavourDefiningCode);

  List<ExposureScreeningQuestionnaireSpecificExposureCluster> getSpecificExposure();

  void setSpecificExposure(
      List<ExposureScreeningQuestionnaireSpecificExposureCluster> specificExposure);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);

  NullFlavour getAnyExposureNullFlavourDefiningCode();

  void setAnyExposureNullFlavourDefiningCode(NullFlavour anyExposureNullFlavourDefiningCode);

  String getNameOfAgentValue();

  void setNameOfAgentValue(String nameOfAgentValue);

  ExposureScreeningQuestionnaireAnyExposureChoice getAnyExposure();

  void setAnyExposure(ExposureScreeningQuestionnaireAnyExposureChoice anyExposure);

  String getScreeningPurposeValue();

  void setScreeningPurposeValue(String screeningPurposeValue);
}
