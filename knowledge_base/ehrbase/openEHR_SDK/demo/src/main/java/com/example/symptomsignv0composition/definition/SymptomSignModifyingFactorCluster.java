package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.725406016+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class SymptomSignModifyingFactorCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Modifying factor/Factor
   * Description: Name of the modifying factor.
   * Comment: Examples of modifying factor: lying on multiple pillows, eating or administration of a specific medication.
   */
  @Path("/items[at0019]/value|value")
  private String factorValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Modifying factor/Factor/null_flavour
   */
  @Path("/items[at0019]/null_flavour|defining_code")
  private NullFlavour factorNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Modifying factor/Effect
   * Description: Perceived effect of the modifying factor on the symptom or sign.
   */
  @Path("/items[at0017]/value|defining_code")
  private EffectDefiningCode effectDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Modifying factor/Effect/null_flavour
   */
  @Path("/items[at0017]/null_flavour|defining_code")
  private NullFlavour effectNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Modifying factor/Description
   * Description: Narrative description of the effect of the modifying factor on the symptom or sign.
   */
  @Path("/items[at0056]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Modifying factor/Description/null_flavour
   */
  @Path("/items[at0056]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Modifying factor/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setFactorValue(String factorValue) {
     this.factorValue = factorValue;
  }

  public String getFactorValue() {
     return this.factorValue ;
  }

  public void setFactorNullFlavourDefiningCode(NullFlavour factorNullFlavourDefiningCode) {
     this.factorNullFlavourDefiningCode = factorNullFlavourDefiningCode;
  }

  public NullFlavour getFactorNullFlavourDefiningCode() {
     return this.factorNullFlavourDefiningCode ;
  }

  public void setEffectDefiningCode(EffectDefiningCode effectDefiningCode) {
     this.effectDefiningCode = effectDefiningCode;
  }

  public EffectDefiningCode getEffectDefiningCode() {
     return this.effectDefiningCode ;
  }

  public void setEffectNullFlavourDefiningCode(NullFlavour effectNullFlavourDefiningCode) {
     this.effectNullFlavourDefiningCode = effectNullFlavourDefiningCode;
  }

  public NullFlavour getEffectNullFlavourDefiningCode() {
     return this.effectNullFlavourDefiningCode ;
  }

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

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
