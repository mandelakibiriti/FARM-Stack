package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.827609943+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class DifferentialDiagnosesPerDifferentialCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Diagnosis name
   * Description: Identification of the differential diagnosis, by name.
   * Comment: Coding with a terminology is preferred, where possible.
   */
  @Path("/items[at0004]/value|value")
  private String diagnosisNameValue;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Per differential/Diagnosis name/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour diagnosisNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Per differential/Status/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour statusNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Rationale
   * Description: Narrative description about the rationale for the diagnosis being accepted or excluded.
   */
  @Path("/items[at0009]/value|value")
  private String rationaleValue;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Per differential/Rationale/null_flavour
   */
  @Path("/items[at0009]/null_flavour|defining_code")
  private NullFlavour rationaleNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Clinical evidence
   * Description: Structured details about clinical evidence supporting or excluding the differential diagnosis.
   */
  @Path("/items[at0010]")
  private List<Cluster> clinicalEvidence;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Order
   * Description: Tag assigned to supporting ordering within a list of differential diagnoses.
   * Comment: For example: to prioritise the order of investigation of differential diagnoses.
   */
  @Path("/items[at0011]/value|magnitude")
  private Long orderMagnitude;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Per differential/Order/null_flavour
   */
  @Path("/items[at0011]/null_flavour|defining_code")
  private NullFlavour orderNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Comment
   * Description: Additional narrative about the differential diagnosis, not captured in other fields.
   */
  @Path("/items[at0012]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Tree/Per differential/Comment/null_flavour
   */
  @Path("/items[at0012]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Status
   * Description: Likelihood of the differential diagnosis being responsible for the clinical situation.
   * Comment: If using the proposed value set, 'Possible' is considered as the default until each diagnosis is either accepted or excluded. If a diagnosis is regarded as 'Accepted' then it is likely that it will either be manually or automatically added to the health record using the EVALUATION.problem_diagnosis archetype.
   */
  @Path("/items[at0005]/value")
  @Choice
  private DifferentialDiagnosesStatusChoice status;

  public void setDiagnosisNameValue(String diagnosisNameValue) {
     this.diagnosisNameValue = diagnosisNameValue;
  }

  public String getDiagnosisNameValue() {
     return this.diagnosisNameValue ;
  }

  public void setDiagnosisNameNullFlavourDefiningCode(
      NullFlavour diagnosisNameNullFlavourDefiningCode) {
     this.diagnosisNameNullFlavourDefiningCode = diagnosisNameNullFlavourDefiningCode;
  }

  public NullFlavour getDiagnosisNameNullFlavourDefiningCode() {
     return this.diagnosisNameNullFlavourDefiningCode ;
  }

  public void setStatusNullFlavourDefiningCode(NullFlavour statusNullFlavourDefiningCode) {
     this.statusNullFlavourDefiningCode = statusNullFlavourDefiningCode;
  }

  public NullFlavour getStatusNullFlavourDefiningCode() {
     return this.statusNullFlavourDefiningCode ;
  }

  public void setRationaleValue(String rationaleValue) {
     this.rationaleValue = rationaleValue;
  }

  public String getRationaleValue() {
     return this.rationaleValue ;
  }

  public void setRationaleNullFlavourDefiningCode(NullFlavour rationaleNullFlavourDefiningCode) {
     this.rationaleNullFlavourDefiningCode = rationaleNullFlavourDefiningCode;
  }

  public NullFlavour getRationaleNullFlavourDefiningCode() {
     return this.rationaleNullFlavourDefiningCode ;
  }

  public void setClinicalEvidence(List<Cluster> clinicalEvidence) {
     this.clinicalEvidence = clinicalEvidence;
  }

  public List<Cluster> getClinicalEvidence() {
     return this.clinicalEvidence ;
  }

  public void setOrderMagnitude(Long orderMagnitude) {
     this.orderMagnitude = orderMagnitude;
  }

  public Long getOrderMagnitude() {
     return this.orderMagnitude ;
  }

  public void setOrderNullFlavourDefiningCode(NullFlavour orderNullFlavourDefiningCode) {
     this.orderNullFlavourDefiningCode = orderNullFlavourDefiningCode;
  }

  public NullFlavour getOrderNullFlavourDefiningCode() {
     return this.orderNullFlavourDefiningCode ;
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

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setStatus(DifferentialDiagnosesStatusChoice status) {
     this.status = status;
  }

  public DifferentialDiagnosesStatusChoice getStatus() {
     return this.status ;
  }
}
