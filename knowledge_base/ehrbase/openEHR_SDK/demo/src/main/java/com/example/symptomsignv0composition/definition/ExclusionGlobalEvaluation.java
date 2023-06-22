package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.generic.PartyProxy;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.EntryEntity;
import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-EVALUATION.exclusion_global.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.764170509+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExclusionGlobalEvaluation implements EntryEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Global exclusion of problems/diagnoses
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of problems/diagnoses']/value|value")
  private String globalExclusionOfProblemsDiagnosesValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Global exclusion of problems/diagnoses/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of problems/diagnoses']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Global exclusion of family history
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of family history']/value|value")
  private String globalExclusionOfFamilyHistoryValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Global exclusion of family history/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of family history']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfFamilyHistoryNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Global exclusion of medication use
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of medication use']/value|value")
  private String globalExclusionOfMedicationUseValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Global exclusion of medication use/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of medication use']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfMedicationUseNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Global exclusion of procedures
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of procedures']/value|value")
  private String globalExclusionOfProceduresValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Global exclusion of procedures/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of procedures']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfProceduresNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Global exclusion of adverse reactions
   * Description: An overall statement of exclusion about all Problems/diagnoses, Family history, Medications, Procedures, Adverse reactions or other clinical items.
   * Comment: For example: 'No previous diagnoses', 'No known family history', 'No known history of adverse reactions', 'Never taken any medications' or 'No known operations or significant procedures'.
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of adverse reactions']/value|value")
  private String globalExclusionOfAdverseReactionsValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Global exclusion of adverse reactions/null_flavour
   */
  @Path("/data[at0001]/items[at0002 and name/value='Global exclusion of adverse reactions']/null_flavour|defining_code")
  private NullFlavour globalExclusionOfAdverseReactionsNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Comment
   * Description: Additional comment not covered in other fields.
   */
  @Path("/data[at0001]/items[at0011]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Tree/Comment/null_flavour
   */
  @Path("/data[at0001]/items[at0011]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/Extension
   * Description: Additional information required to capture local content or to align with other reference models/formalisms.
   * Comment: For example: Local information requirements or additional metadata to align with FHIR or CIMI equivalents.
   */
  @Path("/protocol[at0008]/items[at0010]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/subject
   */
  @Path("/subject")
  private PartyProxy subject;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/language
   */
  @Path("/language")
  private Language language;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Exclusion - global/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setGlobalExclusionOfProblemsDiagnosesValue(
      String globalExclusionOfProblemsDiagnosesValue) {
     this.globalExclusionOfProblemsDiagnosesValue = globalExclusionOfProblemsDiagnosesValue;
  }

  public String getGlobalExclusionOfProblemsDiagnosesValue() {
     return this.globalExclusionOfProblemsDiagnosesValue ;
  }

  public void setGlobalExclusionOfProblemsDiagnosesNullFlavourDefiningCode(
      NullFlavour globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode) {
     this.globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode = globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfProblemsDiagnosesNullFlavourDefiningCode() {
     return this.globalExclusionOfProblemsDiagnosesNullFlavourDefiningCode ;
  }

  public void setGlobalExclusionOfFamilyHistoryValue(String globalExclusionOfFamilyHistoryValue) {
     this.globalExclusionOfFamilyHistoryValue = globalExclusionOfFamilyHistoryValue;
  }

  public String getGlobalExclusionOfFamilyHistoryValue() {
     return this.globalExclusionOfFamilyHistoryValue ;
  }

  public void setGlobalExclusionOfFamilyHistoryNullFlavourDefiningCode(
      NullFlavour globalExclusionOfFamilyHistoryNullFlavourDefiningCode) {
     this.globalExclusionOfFamilyHistoryNullFlavourDefiningCode = globalExclusionOfFamilyHistoryNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfFamilyHistoryNullFlavourDefiningCode() {
     return this.globalExclusionOfFamilyHistoryNullFlavourDefiningCode ;
  }

  public void setGlobalExclusionOfMedicationUseValue(String globalExclusionOfMedicationUseValue) {
     this.globalExclusionOfMedicationUseValue = globalExclusionOfMedicationUseValue;
  }

  public String getGlobalExclusionOfMedicationUseValue() {
     return this.globalExclusionOfMedicationUseValue ;
  }

  public void setGlobalExclusionOfMedicationUseNullFlavourDefiningCode(
      NullFlavour globalExclusionOfMedicationUseNullFlavourDefiningCode) {
     this.globalExclusionOfMedicationUseNullFlavourDefiningCode = globalExclusionOfMedicationUseNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfMedicationUseNullFlavourDefiningCode() {
     return this.globalExclusionOfMedicationUseNullFlavourDefiningCode ;
  }

  public void setGlobalExclusionOfProceduresValue(String globalExclusionOfProceduresValue) {
     this.globalExclusionOfProceduresValue = globalExclusionOfProceduresValue;
  }

  public String getGlobalExclusionOfProceduresValue() {
     return this.globalExclusionOfProceduresValue ;
  }

  public void setGlobalExclusionOfProceduresNullFlavourDefiningCode(
      NullFlavour globalExclusionOfProceduresNullFlavourDefiningCode) {
     this.globalExclusionOfProceduresNullFlavourDefiningCode = globalExclusionOfProceduresNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfProceduresNullFlavourDefiningCode() {
     return this.globalExclusionOfProceduresNullFlavourDefiningCode ;
  }

  public void setGlobalExclusionOfAdverseReactionsValue(
      String globalExclusionOfAdverseReactionsValue) {
     this.globalExclusionOfAdverseReactionsValue = globalExclusionOfAdverseReactionsValue;
  }

  public String getGlobalExclusionOfAdverseReactionsValue() {
     return this.globalExclusionOfAdverseReactionsValue ;
  }

  public void setGlobalExclusionOfAdverseReactionsNullFlavourDefiningCode(
      NullFlavour globalExclusionOfAdverseReactionsNullFlavourDefiningCode) {
     this.globalExclusionOfAdverseReactionsNullFlavourDefiningCode = globalExclusionOfAdverseReactionsNullFlavourDefiningCode;
  }

  public NullFlavour getGlobalExclusionOfAdverseReactionsNullFlavourDefiningCode() {
     return this.globalExclusionOfAdverseReactionsNullFlavourDefiningCode ;
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

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setSubject(PartyProxy subject) {
     this.subject = subject;
  }

  public PartyProxy getSubject() {
     return this.subject ;
  }

  public void setLanguage(Language language) {
     this.language = language;
  }

  public Language getLanguage() {
     return this.language ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
