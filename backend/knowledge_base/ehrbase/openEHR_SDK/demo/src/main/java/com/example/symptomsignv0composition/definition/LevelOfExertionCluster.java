package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.level_of_exertion.v0")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.820305191+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class LevelOfExertionCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/Exercise intensity/Description
   * Description: Description of the exertion.
   */
  @Path("/items[at0010]/items[at0016]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/Level of exertion/Exercise intensity/Description/null_flavour
   */
  @Path("/items[at0010]/items[at0016]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/Exercise intensity/Intensity
   * Description: Semiquantitative description of the intensity of exercise undertaken.
   */
  @Path("/items[at0010]/items[at0011]/value|defining_code")
  private IntensityDefiningCode intensityDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/Level of exertion/Exercise intensity/Intensity/null_flavour
   */
  @Path("/items[at0010]/items[at0011]/null_flavour|defining_code")
  private NullFlavour intensityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/Exercise intensity/Measured
   * Description: The measured level of exertion.
   */
  @Path("/items[at0010]/items[at0005]/value|magnitude")
  private Double measuredMagnitude;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/Exercise intensity/Measured
   * Description: The measured level of exertion.
   */
  @Path("/items[at0010]/items[at0005]/value|units")
  private String measuredUnits;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/Level of exertion/Exercise intensity/Measured/null_flavour
   */
  @Path("/items[at0010]/items[at0005]/null_flavour|defining_code")
  private NullFlavour measuredNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/Phase
   * Description: The phase or context of exercise.
   */
  @Path("/items[at0009]/value|defining_code")
  private PhaseDefiningCode phaseDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Tree/Level of exertion/Phase/null_flavour
   */
  @Path("/items[at0009]/null_flavour|defining_code")
  private NullFlavour phaseNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Vital signs/Pulse oximetry/Any event/Level of exertion/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

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

  public void setIntensityDefiningCode(IntensityDefiningCode intensityDefiningCode) {
     this.intensityDefiningCode = intensityDefiningCode;
  }

  public IntensityDefiningCode getIntensityDefiningCode() {
     return this.intensityDefiningCode ;
  }

  public void setIntensityNullFlavourDefiningCode(NullFlavour intensityNullFlavourDefiningCode) {
     this.intensityNullFlavourDefiningCode = intensityNullFlavourDefiningCode;
  }

  public NullFlavour getIntensityNullFlavourDefiningCode() {
     return this.intensityNullFlavourDefiningCode ;
  }

  public void setMeasuredMagnitude(Double measuredMagnitude) {
     this.measuredMagnitude = measuredMagnitude;
  }

  public Double getMeasuredMagnitude() {
     return this.measuredMagnitude ;
  }

  public void setMeasuredUnits(String measuredUnits) {
     this.measuredUnits = measuredUnits;
  }

  public String getMeasuredUnits() {
     return this.measuredUnits ;
  }

  public void setMeasuredNullFlavourDefiningCode(NullFlavour measuredNullFlavourDefiningCode) {
     this.measuredNullFlavourDefiningCode = measuredNullFlavourDefiningCode;
  }

  public NullFlavour getMeasuredNullFlavourDefiningCode() {
     return this.measuredNullFlavourDefiningCode ;
  }

  public void setPhaseDefiningCode(PhaseDefiningCode phaseDefiningCode) {
     this.phaseDefiningCode = phaseDefiningCode;
  }

  public PhaseDefiningCode getPhaseDefiningCode() {
     return this.phaseDefiningCode ;
  }

  public void setPhaseNullFlavourDefiningCode(NullFlavour phaseNullFlavourDefiningCode) {
     this.phaseNullFlavourDefiningCode = phaseNullFlavourDefiningCode;
  }

  public NullFlavour getPhaseNullFlavourDefiningCode() {
     return this.phaseNullFlavourDefiningCode ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
