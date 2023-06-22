package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Choice;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.anatomical_location.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.718865696+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AnatomicalLocationCluster2 implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Body site name
   * Description: Identification of a single physical site either on, or within, the human body.
   * Comment: This data element is the only mandated data point in this archetype and should be used as the primary data point to record an anatomical location with a commonly used name. It is strongly recommended that 'Body site name' be recorded as specifically as is anatomically possible. For example: record 'upper eyelid' rather than recording 'eyelid' with 'upper' as a qualifier; 'fifth rib' rather than 'rib' with a numeric qualifier. Use the other data elements for laterality, aspect, region and anatomical line to provide more detail.
   *
   * This data element should be coded with a terminology capable of triggering decision support, where possible - an appropriate termset for use here could comprise individual concepts or a list of precoordinated terms. Free text should be used only if there is no appropriate terminology available.
   *
   * If body site name is already identified in the parent archetype, then this data element may be redundant. Alternatively, a use case has been identified where the value may be duplicated into this element to support semantic querying using this archetype, rather than the data element within the parent.
   */
  @Path("/items[at0001]/value|value")
  private String bodySiteNameValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Anatomical location/Body site name/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour bodySiteNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Specific site
   * Description: Additional detail using a specific region or a point on, or within, the identified body site.
   * Comment: Use to increase precision of identification of the body site, if required. For example, the upper right quadrant or McBurney's point on the abdominal wall or interphalangeal joint of the great toe. If the 'Body site name' data element uses pre-coordinated terms that include the specific site, then this data element is redundant.
   */
  @Path("/items[at0065]/value|value")
  private String specificSiteValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Anatomical location/Specific site/null_flavour
   */
  @Path("/items[at0065]/null_flavour|defining_code")
  private NullFlavour specificSiteNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Laterality
   * Description: The side of the body on which the identified  body site is located.
   * Comment: If the identified body site has no laterality, this data element should not have a value. 
   * If the 'Body site name' data element uses pre-coordinated terms that include laterality, then this data element is redundant.
   */
  @Path("/items[at0002]/value|defining_code")
  private LateralityDefiningCode lateralityDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Anatomical location/Laterality/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour lateralityNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Aspect
   * Description: Qualifying detail about the specific aspect of the identified body site.
   * Comment: Use to increase precision of identification of the body site, if required. Common aspects have been included as a value set, which can be extended over time, plus a free text option. Assumes that the body is being described while in the anatomical position. For example: proximal urethra; plantar aspect of the left thumb. Multiple aspects can also be described, if required, by allowing for 0..2 occurrences. For example: a lesion may be on the left anterior/lateral (ie anterolateral) chest wall. If the 'Body site name' data element uses pre-coordinated terms that include the aspect, then this data element is redundant.
   */
  @Path("/items[at0064]")
  private List<AnatomicalLocationAspectElement> aspect;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Anatomical location/Anatomical Line/null_flavour
   */
  @Path("/items[at0055]/null_flavour|defining_code")
  private NullFlavour anatomicalLineNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Description
   * Description: Narrative description that can be used to further refine and support the 'Body site name'.
   * Comment: For example: adjacent to the vermilion border; a tattoo covers the bottom half of this area.
   */
  @Path("/items[at0023]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Anatomical location/Description/null_flavour
   */
  @Path("/items[at0023]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Alternative structure
   * Description: Additional detail about the anatomical site using alternative approaches to describe the same body site.
   * Comment: For example, relative location or precise locations using coordinates. 
   */
  @Path("/items[at0053]")
  private List<Cluster> alternativeStructure;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Multimedia representation
   * Description: Image or other media used to support identification of the body site.
   */
  @Path("/items[at0054]")
  private List<Cluster> multimediaRepresentation;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Anatomical location/Anatomical Line
   * Description: Additional detail using theoretical lines drawn through anatomical structures used to provide a consistent reference point on the human body.
   * Comment: Common anatomical lines have been included as a value set, which can be extended over time, plus a free text option. The additional use of this data element allows for recording of the typical position of the heart's apex beat at 5th intercostal space, left side, and mid-clavicular line. If the 'Body site name' data element uses pre-coordinated terms that include anatomical line, then this data element is redundant.
   */
  @Path("/items[at0055]/value")
  @Choice
  private AnatomicalLocationAnatomicalLineChoice anatomicalLine;

  public void setBodySiteNameValue(String bodySiteNameValue) {
     this.bodySiteNameValue = bodySiteNameValue;
  }

  public String getBodySiteNameValue() {
     return this.bodySiteNameValue ;
  }

  public void setBodySiteNameNullFlavourDefiningCode(
      NullFlavour bodySiteNameNullFlavourDefiningCode) {
     this.bodySiteNameNullFlavourDefiningCode = bodySiteNameNullFlavourDefiningCode;
  }

  public NullFlavour getBodySiteNameNullFlavourDefiningCode() {
     return this.bodySiteNameNullFlavourDefiningCode ;
  }

  public void setSpecificSiteValue(String specificSiteValue) {
     this.specificSiteValue = specificSiteValue;
  }

  public String getSpecificSiteValue() {
     return this.specificSiteValue ;
  }

  public void setSpecificSiteNullFlavourDefiningCode(
      NullFlavour specificSiteNullFlavourDefiningCode) {
     this.specificSiteNullFlavourDefiningCode = specificSiteNullFlavourDefiningCode;
  }

  public NullFlavour getSpecificSiteNullFlavourDefiningCode() {
     return this.specificSiteNullFlavourDefiningCode ;
  }

  public void setLateralityDefiningCode(LateralityDefiningCode lateralityDefiningCode) {
     this.lateralityDefiningCode = lateralityDefiningCode;
  }

  public LateralityDefiningCode getLateralityDefiningCode() {
     return this.lateralityDefiningCode ;
  }

  public void setLateralityNullFlavourDefiningCode(NullFlavour lateralityNullFlavourDefiningCode) {
     this.lateralityNullFlavourDefiningCode = lateralityNullFlavourDefiningCode;
  }

  public NullFlavour getLateralityNullFlavourDefiningCode() {
     return this.lateralityNullFlavourDefiningCode ;
  }

  public void setAspect(List<AnatomicalLocationAspectElement> aspect) {
     this.aspect = aspect;
  }

  public List<AnatomicalLocationAspectElement> getAspect() {
     return this.aspect ;
  }

  public void setAnatomicalLineNullFlavourDefiningCode(
      NullFlavour anatomicalLineNullFlavourDefiningCode) {
     this.anatomicalLineNullFlavourDefiningCode = anatomicalLineNullFlavourDefiningCode;
  }

  public NullFlavour getAnatomicalLineNullFlavourDefiningCode() {
     return this.anatomicalLineNullFlavourDefiningCode ;
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

  public void setAlternativeStructure(List<Cluster> alternativeStructure) {
     this.alternativeStructure = alternativeStructure;
  }

  public List<Cluster> getAlternativeStructure() {
     return this.alternativeStructure ;
  }

  public void setMultimediaRepresentation(List<Cluster> multimediaRepresentation) {
     this.multimediaRepresentation = multimediaRepresentation;
  }

  public List<Cluster> getMultimediaRepresentation() {
     return this.multimediaRepresentation ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }

  public void setAnatomicalLine(AnatomicalLocationAnatomicalLineChoice anatomicalLine) {
     this.anatomicalLine = anatomicalLine;
  }

  public AnatomicalLocationAnatomicalLineChoice getAnatomicalLine() {
     return this.anatomicalLine ;
  }
}
