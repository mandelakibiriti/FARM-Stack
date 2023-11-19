package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.exclusion_symptom_sign.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.732803788+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class ExclusionOfASymptomOrSignCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Exclusion of a symptom or sign/Exclusion Statement
   * Description: A statement about the exclusion of known symptoms in the health record.
   * Comment: For example: "No significant symptoms".
   */
  @Path("/items[at0001]/value|value")
  private String exclusionStatementValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Exclusion of a symptom or sign/Exclusion Statement/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour exclusionStatementNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Exclusion of a symptom or sign/Excluded Symptom/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour excludedSymptomNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Exclusion of a symptom or sign/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Exclusion of a symptom or sign/Excluded Symptom
   * Description: Identification of the specific symptom to which the Exclusion Statement applies.
   * Comment: Coding of the Symptom with a terminology is desirable, where possible.
   */
  @Path("/items[at0002]/value")
  @Choice
  private ExclusionOfASymptomOrSignExcludedSymptomChoice excludedSymptom;

  public void setExclusionStatementValue(String exclusionStatementValue) {
     this.exclusionStatementValue = exclusionStatementValue;
  }

  public String getExclusionStatementValue() {
     return this.exclusionStatementValue ;
  }

  public void setExclusionStatementNullFlavourDefiningCode(
      NullFlavour exclusionStatementNullFlavourDefiningCode) {
     this.exclusionStatementNullFlavourDefiningCode = exclusionStatementNullFlavourDefiningCode;
  }

  public NullFlavour getExclusionStatementNullFlavourDefiningCode() {
     return this.exclusionStatementNullFlavourDefiningCode ;
  }

  public void setExcludedSymptomNullFlavourDefiningCode(
      NullFlavour excludedSymptomNullFlavourDefiningCode) {
     this.excludedSymptomNullFlavourDefiningCode = excludedSymptomNullFlavourDefiningCode;
  }

  public NullFlavour getExcludedSymptomNullFlavourDefiningCode() {
     return this.excludedSymptomNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setExcludedSymptom(ExclusionOfASymptomOrSignExcludedSymptomChoice excludedSymptom) {
     this.excludedSymptom = excludedSymptom;
  }

  public ExclusionOfASymptomOrSignExcludedSymptomChoice getExcludedSymptom() {
     return this.excludedSymptom ;
  }
}
