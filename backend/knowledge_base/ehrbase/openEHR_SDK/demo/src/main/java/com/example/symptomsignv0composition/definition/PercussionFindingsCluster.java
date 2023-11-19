package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.exam-palpation.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.779918362+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class PercussionFindingsCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/System or structure examined
   * Description: Identification of the examined body system or anatomical structure.
   * Comment: Coding of the system or structure examined with a terminology is preferred, where possible.
   */
  @Path("/items[at0001]/value|value")
  private String systemOrStructureExaminedValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Percussion findings/System or structure examined/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour systemOrStructureExaminedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Body site
   * Description: Identification of the area of the body under examination.
   * Comment: If the body site has been fully identified in the 'System or structure examined' data element, this data element becomes redundant.
   */
  @Path("/items[at0012]/value|value")
  private String bodySiteValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Percussion findings/Body site/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour bodySiteNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Structured body site
   * Description: A structured description of the area of the body under examination.
   * Comment: If the body site has been fully identified in the 'System or structure examined' or the 'Body site' data element, this SLOT becomes redundant.
   */
  @Path("/items[at0011]")
  private List<Cluster> structuredBodySite;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/No abnormality detected
   * Description: Statement that no abnormality was detected (NAD) on physical examination.
   * Comment: Record as True if no abnormality was detected on examination. Specific statements about the examination can be included in the 'Clinical Interpretation' data element. If 'No abnormality detected' is selected, then recording of other examination data elements becomes redundant, with the exception of only the 'Clinical interpretation' data element, which may be useful if a normal statement is desired for recording, for example 'Normal examination'.
   */
  @Path("/items[at0002]/value|value")
  private Boolean noAbnormalityDetectedValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Percussion findings/No abnormality detected/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour noAbnormalityDetectedNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Clinical description
   * Description: Narrative description of the overall findings observed during the physical examination.
   */
  @Path("/items[at0003]/value|value")
  private String clinicalDescriptionValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Percussion findings/Clinical description/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour clinicalDescriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Examination findings
   * Description: Structured details about the physical examination findings.
   */
  @Path("/items[at0004]")
  private List<Cluster> examinationFindings;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Multimedia representation
   * Description: Digital image, video or diagram representing the physical examination findings.
   */
  @Path("/items[at0005]")
  private List<Cluster> multimediaRepresentation;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Clinical interpretation
   * Description: Single word, phrase or brief description that represents the clinical meaning and significance of the physical examination findings.
   * Comment: Coding of the 'Clinical interpretation' with a terminology is preferred, where possible.
   */
  @Path("/items[at0006]")
  private List<AuscultationFindingsClinicalInterpretationElement> clinicalInterpretation;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Comment
   * Description: Additional narrative about the physical examination findings, not captured in other fields.
   */
  @Path("/items[at0007]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Tree/Percussion findings/Comment/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/Examination not done
   * Description: Details to explicitly record that this examination was not performed.
   */
  @Path("/items[at0008]")
  private List<Cluster> examinationNotDone;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Any event/Percussion findings/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setSystemOrStructureExaminedValue(String systemOrStructureExaminedValue) {
     this.systemOrStructureExaminedValue = systemOrStructureExaminedValue;
  }

  public String getSystemOrStructureExaminedValue() {
     return this.systemOrStructureExaminedValue ;
  }

  public void setSystemOrStructureExaminedNullFlavourDefiningCode(
      NullFlavour systemOrStructureExaminedNullFlavourDefiningCode) {
     this.systemOrStructureExaminedNullFlavourDefiningCode = systemOrStructureExaminedNullFlavourDefiningCode;
  }

  public NullFlavour getSystemOrStructureExaminedNullFlavourDefiningCode() {
     return this.systemOrStructureExaminedNullFlavourDefiningCode ;
  }

  public void setBodySiteValue(String bodySiteValue) {
     this.bodySiteValue = bodySiteValue;
  }

  public String getBodySiteValue() {
     return this.bodySiteValue ;
  }

  public void setBodySiteNullFlavourDefiningCode(NullFlavour bodySiteNullFlavourDefiningCode) {
     this.bodySiteNullFlavourDefiningCode = bodySiteNullFlavourDefiningCode;
  }

  public NullFlavour getBodySiteNullFlavourDefiningCode() {
     return this.bodySiteNullFlavourDefiningCode ;
  }

  public void setStructuredBodySite(List<Cluster> structuredBodySite) {
     this.structuredBodySite = structuredBodySite;
  }

  public List<Cluster> getStructuredBodySite() {
     return this.structuredBodySite ;
  }

  public void setNoAbnormalityDetectedValue(Boolean noAbnormalityDetectedValue) {
     this.noAbnormalityDetectedValue = noAbnormalityDetectedValue;
  }

  public Boolean isNoAbnormalityDetectedValue() {
     return this.noAbnormalityDetectedValue ;
  }

  public void setNoAbnormalityDetectedNullFlavourDefiningCode(
      NullFlavour noAbnormalityDetectedNullFlavourDefiningCode) {
     this.noAbnormalityDetectedNullFlavourDefiningCode = noAbnormalityDetectedNullFlavourDefiningCode;
  }

  public NullFlavour getNoAbnormalityDetectedNullFlavourDefiningCode() {
     return this.noAbnormalityDetectedNullFlavourDefiningCode ;
  }

  public void setClinicalDescriptionValue(String clinicalDescriptionValue) {
     this.clinicalDescriptionValue = clinicalDescriptionValue;
  }

  public String getClinicalDescriptionValue() {
     return this.clinicalDescriptionValue ;
  }

  public void setClinicalDescriptionNullFlavourDefiningCode(
      NullFlavour clinicalDescriptionNullFlavourDefiningCode) {
     this.clinicalDescriptionNullFlavourDefiningCode = clinicalDescriptionNullFlavourDefiningCode;
  }

  public NullFlavour getClinicalDescriptionNullFlavourDefiningCode() {
     return this.clinicalDescriptionNullFlavourDefiningCode ;
  }

  public void setExaminationFindings(List<Cluster> examinationFindings) {
     this.examinationFindings = examinationFindings;
  }

  public List<Cluster> getExaminationFindings() {
     return this.examinationFindings ;
  }

  public void setMultimediaRepresentation(List<Cluster> multimediaRepresentation) {
     this.multimediaRepresentation = multimediaRepresentation;
  }

  public List<Cluster> getMultimediaRepresentation() {
     return this.multimediaRepresentation ;
  }

  public void setClinicalInterpretation(
      List<AuscultationFindingsClinicalInterpretationElement> clinicalInterpretation) {
     this.clinicalInterpretation = clinicalInterpretation;
  }

  public List<AuscultationFindingsClinicalInterpretationElement> getClinicalInterpretation() {
     return this.clinicalInterpretation ;
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

  public void setExaminationNotDone(List<Cluster> examinationNotDone) {
     this.examinationNotDone = examinationNotDone;
  }

  public List<Cluster> getExaminationNotDone() {
     return this.examinationNotDone ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
