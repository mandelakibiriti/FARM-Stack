package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.783115116+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface PhysicalExaminationFindingsAnyEventChoice {
  PercussionFindingsCluster getPercussionFindings();

  void setPercussionFindings(PercussionFindingsCluster percussionFindings);

  NullFlavour getDescriptionNullFlavourDefiningCode();

  void setDescriptionNullFlavourDefiningCode(NullFlavour descriptionNullFlavourDefiningCode);

  InspectionFindingsCluster getInspectionFindings();

  void setInspectionFindings(InspectionFindingsCluster inspectionFindings);

  List<PhysicalExaminationFindingsInterpretationElement> getInterpretation();

  void setInterpretation(List<PhysicalExaminationFindingsInterpretationElement> interpretation);

  String getDescriptionValue();

  void setDescriptionValue(String descriptionValue);

  NullFlavour getCommentNullFlavourDefiningCode();

  void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode);

  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  PalpationFindingsCluster getPalpationFindings();

  void setPalpationFindings(PalpationFindingsCluster palpationFindings);

  AuscultationFindingsCluster getAuscultationFindings();

  void setAuscultationFindings(AuscultationFindingsCluster auscultationFindings);

  NullFlavour getPositionNullFlavourDefiningCode();

  void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode);

  String getPositionValue();

  void setPositionValue(String positionValue);

  String getCommentValue();

  void setCommentValue(String commentValue);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  List<PhysicalExaminationFindingsConfoundingFactorsElement> getConfoundingFactors();

  void setConfoundingFactors(
      List<PhysicalExaminationFindingsConfoundingFactorsElement> confoundingFactors);
}
