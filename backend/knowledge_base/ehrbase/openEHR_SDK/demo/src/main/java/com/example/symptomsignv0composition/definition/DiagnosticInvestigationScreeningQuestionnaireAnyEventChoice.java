package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.871756635+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface DiagnosticInvestigationScreeningQuestionnaireAnyEventChoice {
  String getDescriptionValue();

  void setDescriptionValue(String descriptionValue);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster> getSpecificInvestigation(
      );

  void setSpecificInvestigation(
      List<DiagnosticInvestigationScreeningQuestionnaireSpecificInvestigationCluster> specificInvestigation);

  String getScreeningPurposeValue();

  void setScreeningPurposeValue(String screeningPurposeValue);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);

  List<DiagnosticInvestigationScreeningQuestionnaireAnyTestsElement> getAnyTests();

  void setAnyTests(List<DiagnosticInvestigationScreeningQuestionnaireAnyTestsElement> anyTests);

  List<Cluster> getAdditionalDetails();

  void setAdditionalDetails(List<Cluster> additionalDetails);

  NullFlavour getDescriptionNullFlavourDefiningCode();

  void setDescriptionNullFlavourDefiningCode(NullFlavour descriptionNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);
}
