package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.844769874+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface FamilyHistoryScreeningQuestionnaireAnyEventChoice {
  NullFlavour getAnyPresenceNullFlavourDefiningCode();

  void setAnyPresenceNullFlavourDefiningCode(NullFlavour anyPresenceNullFlavourDefiningCode);

  FamilyHistoryScreeningQuestionnaireAnyPresenceChoice getAnyPresence();

  void setAnyPresence(FamilyHistoryScreeningQuestionnaireAnyPresenceChoice anyPresence);

  String getScreeningPurposeValue();

  void setScreeningPurposeValue(String screeningPurposeValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster> getSpecificFamilyHealthProblem(
      );

  void setSpecificFamilyHealthProblem(
      List<FamilyHistoryScreeningQuestionnaireSpecificFamilyHealthProblemCluster> specificFamilyHealthProblem);
}
