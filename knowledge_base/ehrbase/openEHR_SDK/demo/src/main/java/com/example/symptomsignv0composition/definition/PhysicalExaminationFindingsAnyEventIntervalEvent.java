package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Long;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAmount;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.IntervalEventEntity;
import org.ehrbase.client.classgenerator.shareddefinition.MathFunction;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.776357015+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("INTERVAL_EVENT")
public class PhysicalExaminationFindingsAnyEventIntervalEvent implements IntervalEventEntity, PhysicalExaminationFindingsAnyEventChoice {
  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Description
   * Description: Narrative description of the overall findings observed during a physical examination of a patient.
   * Comment: May be used to record a narrative summary of the complete clinical examination or key aspects of clinical examination findings, which will be supported by structured data. Details of specific structured findings can be included using CLUSTER archetypes in the 'Examination Detail' slot. This data element may be used to capture legacy data that is not available in a structured format.
   */
  @Path("/data[at0003]/items[at0004]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Description/null_flavour
   */
  @Path("/data[at0003]/items[at0004]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Auscultation findings
   * Description: Findings observed during the auscultation of a body system or anatomical structure.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.exam-auscultation.v0]")
  private AuscultationFindingsCluster auscultationFindings;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Inspection findings
   * Description: Findings observed by direct visualisation of an anatomical structure.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.exam-inspection.v0]")
  private InspectionFindingsCluster inspectionFindings;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Palpation findings
   * Description: Findings observed by indirect palpation of an anatomical structure.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.exam-palpation.v0 and name/value='Palpation findings']")
  private PalpationFindingsCluster palpationFindings;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings
   * Description: Findings observed by indirect palpation of an anatomical structure.
   */
  @Path("/data[at0003]/items[openEHR-EHR-CLUSTER.exam-palpation.v0 and name/value='Percussion findings']")
  private PercussionFindingsCluster percussionFindings;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Interpretation
   * Description: Single word, phrase or brief description which represents the clinical meaning and significance of the physical examination findings.
   * Comment: Coding with a terminology is preferred, if possible. For example, 'normal examination' or 'tympanic membrane perforation'.
   */
  @Path("/data[at0003]/items[at0006]")
  private List<PhysicalExaminationFindingsInterpretationElement> interpretation;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Comment
   * Description: Additional narrative about the overall physical examination findings not captured in other fields.
   */
  @Path("/data[at0003]/items[at0011]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Comment/null_flavour
   */
  @Path("/data[at0003]/items[at0011]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Confounding factors
   * Description: Description of any incidental factors that may have contributed to the physical examination findings.
   */
  @Path("/state[at0009]/items[at0008]")
  private List<PhysicalExaminationFindingsConfoundingFactorsElement> confoundingFactors;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Position
   * Description: The body position of the subject during the examination.
   */
  @Path("/state[at0009]/items[at0013]/value|value")
  private String positionValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Position/null_flavour
   */
  @Path("/state[at0009]/items[at0013]/null_flavour|defining_code")
  private NullFlavour positionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/time
   */
  @Path("/time|value")
  private TemporalAccessor timeValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/width
   */
  @Path("/width|value")
  private TemporalAmount widthValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/math_function
   */
  @Path("/math_function|defining_code")
  private MathFunction mathFunctionDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/sample_count
   */
  @Path("/sample_count")
  private Long sampleCount;

  public void setDescriptionValue(String descriptionValue) {
     this.descriptionValue = descriptionValue;
  }

  public String getDescriptionValue() {
     return this.descriptionValue ;
  }

  public void setDescriptionNullFlavourDefiningCode(
      NullFlavour descriptionNullFlavourDefiningCode) {
     this.descriptionNullFlavourDefiningCode = descriptionNullFlavourDefiningCode;
  }

  public NullFlavour getDescriptionNullFlavourDefiningCode() {
     return this.descriptionNullFlavourDefiningCode ;
  }

  public void setAuscultationFindings(AuscultationFindingsCluster auscultationFindings) {
     this.auscultationFindings = auscultationFindings;
  }

  public AuscultationFindingsCluster getAuscultationFindings() {
     return this.auscultationFindings ;
  }

  public void setInspectionFindings(InspectionFindingsCluster inspectionFindings) {
     this.inspectionFindings = inspectionFindings;
  }

  public InspectionFindingsCluster getInspectionFindings() {
     return this.inspectionFindings ;
  }

  public void setPalpationFindings(PalpationFindingsCluster palpationFindings) {
     this.palpationFindings = palpationFindings;
  }

  public PalpationFindingsCluster getPalpationFindings() {
     return this.palpationFindings ;
  }

  public void setPercussionFindings(PercussionFindingsCluster percussionFindings) {
     this.percussionFindings = percussionFindings;
  }

  public PercussionFindingsCluster getPercussionFindings() {
     return this.percussionFindings ;
  }

  public void setInterpretation(
      List<PhysicalExaminationFindingsInterpretationElement> interpretation) {
     this.interpretation = interpretation;
  }

  public List<PhysicalExaminationFindingsInterpretationElement> getInterpretation() {
     return this.interpretation ;
  }

  public void setCommentValue(String commentValue) {
     this.commentValue = commentValue;
  }

  public String getCommentValue() {
     return this.commentValue ;
  }

  public void setCommentNullFlavourDefiningCode(NullFlavour commentNullFlavourDefiningCode) {
     this.commentNullFlavourDefiningCode = commentNullFlavourDefiningCode;
  }

  public NullFlavour getCommentNullFlavourDefiningCode() {
     return this.commentNullFlavourDefiningCode ;
  }

  public void setConfoundingFactors(
      List<PhysicalExaminationFindingsConfoundingFactorsElement> confoundingFactors) {
     this.confoundingFactors = confoundingFactors;
  }

  public List<PhysicalExaminationFindingsConfoundingFactorsElement> getConfoundingFactors() {
     return this.confoundingFactors ;
  }

  public void setPositionValue(String positionValue) {
     this.positionValue = positionValue;
  }

  public String getPositionValue() {
     return this.positionValue ;
  }

  public void setPositionNullFlavourDefiningCode(NullFlavour positionNullFlavourDefiningCode) {
     this.positionNullFlavourDefiningCode = positionNullFlavourDefiningCode;
  }

  public NullFlavour getPositionNullFlavourDefiningCode() {
     return this.positionNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setTimeValue(TemporalAccessor timeValue) {
     this.timeValue = timeValue;
  }

  public TemporalAccessor getTimeValue() {
     return this.timeValue ;
  }

  public void setWidthValue(TemporalAmount widthValue) {
     this.widthValue = widthValue;
  }

  public TemporalAmount getWidthValue() {
     return this.widthValue ;
  }

  public void setMathFunctionDefiningCode(MathFunction mathFunctionDefiningCode) {
     this.mathFunctionDefiningCode = mathFunctionDefiningCode;
  }

  public MathFunction getMathFunctionDefiningCode() {
     return this.mathFunctionDefiningCode ;
  }

  public void setSampleCount(Long sampleCount) {
     this.sampleCount = sampleCount;
  }

  public Long getSampleCount() {
     return this.sampleCount ;
  }
}
