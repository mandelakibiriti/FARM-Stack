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
    date = "2023-06-19T20:52:30.838769062+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface SocialContextScreeningQuestionnaireAnyEventChoice {
  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<Cluster> getAdditionalDetails();

  void setAdditionalDetails(List<Cluster> additionalDetails);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  List<SocialContextScreeningQuestionnaireSpecificSocialContextCluster> getSpecificSocialContext();

  void setSpecificSocialContext(
      List<SocialContextScreeningQuestionnaireSpecificSocialContextCluster> specificSocialContext);

  String getScreeningPurposeValue();

  void setScreeningPurposeValue(String screeningPurposeValue);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);
}
