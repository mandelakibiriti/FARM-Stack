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
    date = "2023-06-19T20:52:30.853814178+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface MedicationScreeningQuestionnaireAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getScreeningPurposeNullFlavourDefiningCode();

  void setScreeningPurposeNullFlavourDefiningCode(
      NullFlavour screeningPurposeNullFlavourDefiningCode);

  NullFlavour getDescriptionNullFlavourDefiningCode();

  void setDescriptionNullFlavourDefiningCode(NullFlavour descriptionNullFlavourDefiningCode);

  List<Cluster> getAdditionalDetails();

  void setAdditionalDetails(List<Cluster> additionalDetails);

  String getScreeningPurposeValue();

  void setScreeningPurposeValue(String screeningPurposeValue);

  List<MedicationScreeningQuestionnaireAnyMedicationsUsedElement> getAnyMedicationsUsed();

  void setAnyMedicationsUsed(
      List<MedicationScreeningQuestionnaireAnyMedicationsUsedElement> anyMedicationsUsed);

  String getDescriptionValue();

  void setDescriptionValue(String descriptionValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<MedicationScreeningQuestionnaireSpecificMedicationCluster> getSpecificMedication();

  void setSpecificMedication(
      List<MedicationScreeningQuestionnaireSpecificMedicationCluster> specificMedication);
}
