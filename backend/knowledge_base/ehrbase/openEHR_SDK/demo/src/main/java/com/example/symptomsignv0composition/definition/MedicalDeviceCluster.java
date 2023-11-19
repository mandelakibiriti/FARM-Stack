package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Archetype;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Archetype("openEHR-EHR-CLUSTER.device.v1")
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.773893926+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class MedicalDeviceCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Device name
   * Description: Identification of the medical device, preferably by a common name, a formal fully descriptive name or, if required, by class or category of device.
   * Comment: This data element will capture the term, phrase or category used in clinical practice. For example: <brand name><machine> (XYZ Audiometer); <size> <brand name> <intravenous catheter> (14G Jelco IV catheter); or <brand name/type> <implant>. Coding with a terminology is desirable, where possible, although this may be local and depending on local supplies available.
   */
  @Path("/items[at0001]/value|value")
  private String deviceNameValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Device name/null_flavour
   */
  @Path("/items[at0001]/null_flavour|defining_code")
  private NullFlavour deviceNameNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Type
   * Description: The category or kind of device.
   * Comment: Not applicable if a category is already recorded in 'Device name'.
   *  Example: if the 'Device' is named as a 'urinary catheter'; the 'Type' may be recorded as 'indwelling' or 'condom'.Coding with a terminology is desirable, where possible. This may include use of GTIN or EAN numbers.
   */
  @Path("/items[at0003]/value|value")
  private String typeValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Type/null_flavour
   */
  @Path("/items[at0003]/null_flavour|defining_code")
  private NullFlavour typeNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Description
   * Description: Narrative description of the medical device.
   */
  @Path("/items[at0002]/value|value")
  private String descriptionValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Description/null_flavour
   */
  @Path("/items[at0002]/null_flavour|defining_code")
  private NullFlavour descriptionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Properties
   * Description: Further details about specific properties about the medical device.
   */
  @Path("/items[at0009]")
  private List<Cluster> properties;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Unique device identifier (UDI)
   * Description: A numeric or alphanumeric string that is associated with this device within a given system.
   * Comment: Often fixed to the device as a barcode.
   */
  @Path("/items[at0021]/value")
  private DvIdentifier uniqueDeviceIdentifierUdi;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Unique device identifier (UDI)/null_flavour
   */
  @Path("/items[at0021]/null_flavour|defining_code")
  private NullFlavour uniqueDeviceIdentifierUdiNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Manufacturer
   * Description: Name of manufacturer.
   */
  @Path("/items[at0004]/value|value")
  private String manufacturerValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Manufacturer/null_flavour
   */
  @Path("/items[at0004]/null_flavour|defining_code")
  private NullFlavour manufacturerNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Date of manufacture
   * Description: Date the device was manufactured.
   */
  @Path("/items[at0005]/value|value")
  private TemporalAccessor dateOfManufactureValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Date of manufacture/null_flavour
   */
  @Path("/items[at0005]/null_flavour|defining_code")
  private NullFlavour dateOfManufactureNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Serial number
   * Description: Number assigned by the manufacturer which can be found on the device, and should be specific to each device., its label, or accompanying packaging.
   */
  @Path("/items[at0020]/value|value")
  private String serialNumberValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Serial number/null_flavour
   */
  @Path("/items[at0020]/null_flavour|defining_code")
  private NullFlavour serialNumberNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Catalogue number
   * Description: The exact number assigned by the manufacturer, as it appears in the manufacturer's catalogue, device labeling, or accompanying packaging.
   */
  @Path("/items[at0022]/value|value")
  private String catalogueNumberValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Catalogue number/null_flavour
   */
  @Path("/items[at0022]/null_flavour|defining_code")
  private NullFlavour catalogueNumberNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Model number
   * Description: The exact model number assigned by the manufacturer and found on the device label or accompanying packaging.
   */
  @Path("/items[at0023]/value|value")
  private String modelNumberValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Model number/null_flavour
   */
  @Path("/items[at0023]/null_flavour|defining_code")
  private NullFlavour modelNumberNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Batch/Lot number
   * Description: The number assigned by the manufacturer which identifies a group of items manufactured at the same time, usually found on the label or packaging material.
   */
  @Path("/items[at0006]/value|value")
  private String batchLotNumberValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Batch/Lot number/null_flavour
   */
  @Path("/items[at0006]/null_flavour|defining_code")
  private NullFlavour batchLotNumberNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Software version
   * Description: Identification of the version of software being used in the medical device.
   * Comment: When the medical device is an actual software application, record the version of the software using this data element. When the medical device has multiple software applications embedded within it, record each software component in a separate CLUSTER archetype within the Components SLOT - either as a nested instance of another CLUSTER.device archetype or using a CLUSTER archetype designed specifically for recording software details (but not yet available at time of this archetype development).
   */
  @Path("/items[at0025]/value|value")
  private String softwareVersionValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Software version/null_flavour
   */
  @Path("/items[at0025]/null_flavour|defining_code")
  private NullFlavour softwareVersionNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Date of expiry
   * Description: Date after which the device/product is no longer fit for use, usually found on the device itself or printed on the accompanying packaging.
   * Comment: This date usually applies only to single use or disposable devices.
   */
  @Path("/items[at0007]/value|value")
  private TemporalAccessor dateOfExpiryValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Date of expiry/null_flavour
   */
  @Path("/items[at0007]/null_flavour|defining_code")
  private NullFlavour dateOfExpiryNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Other identifier
   * Description: Unspecified identifier, which can be further specified in a template or at run time.
   * Comment: Coding of the name of the identifier with a coding system is desirable, if available.
   */
  @Path("/items[at0024]")
  private List<MedicalDeviceOtherIdentifierElement> otherIdentifier;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Asset management
   * Description: Further details about management and maintenance of the device.
   * Comment: For example: Owner, Contact details, Location, Network address, Date due for replacement, Calibration details etc.
   */
  @Path("/items[at0019]")
  private List<Cluster> assetManagement;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Components
   * Description: Additional structured informations about identified components of the device.
   */
  @Path("/items[at0018]")
  private List<Cluster> components;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Extension
   * Description: Additional information required to capture local context or to align with other reference models/formalisms.
   */
  @Path("/items[at0026]")
  private List<Cluster> extension;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Multimedia
   * Description: Digital representation of the device.
   * Comment: For example: a technical diagram of a device, or a digital image.
   */
  @Path("/items[at0027]")
  private List<Cluster> multimedia;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/Comment
   * Description: Additional narrative about the device not captured in other fields.
   */
  @Path("/items[at0008]/value|value")
  private String commentValue;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Tree/Medical device/Comment/null_flavour
   */
  @Path("/items[at0008]/null_flavour|defining_code")
  private NullFlavour commentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Examination details/Physical examination findings/Medical device/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDeviceNameValue(String deviceNameValue) {
     this.deviceNameValue = deviceNameValue;
  }

  public String getDeviceNameValue() {
     return this.deviceNameValue ;
  }

  public void setDeviceNameNullFlavourDefiningCode(NullFlavour deviceNameNullFlavourDefiningCode) {
     this.deviceNameNullFlavourDefiningCode = deviceNameNullFlavourDefiningCode;
  }

  public NullFlavour getDeviceNameNullFlavourDefiningCode() {
     return this.deviceNameNullFlavourDefiningCode ;
  }

  public void setTypeValue(String typeValue) {
     this.typeValue = typeValue;
  }

  public String getTypeValue() {
     return this.typeValue ;
  }

  public void setTypeNullFlavourDefiningCode(NullFlavour typeNullFlavourDefiningCode) {
     this.typeNullFlavourDefiningCode = typeNullFlavourDefiningCode;
  }

  public NullFlavour getTypeNullFlavourDefiningCode() {
     return this.typeNullFlavourDefiningCode ;
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

  public void setProperties(List<Cluster> properties) {
     this.properties = properties;
  }

  public List<Cluster> getProperties() {
     return this.properties ;
  }

  public void setUniqueDeviceIdentifierUdi(DvIdentifier uniqueDeviceIdentifierUdi) {
     this.uniqueDeviceIdentifierUdi = uniqueDeviceIdentifierUdi;
  }

  public DvIdentifier getUniqueDeviceIdentifierUdi() {
     return this.uniqueDeviceIdentifierUdi ;
  }

  public void setUniqueDeviceIdentifierUdiNullFlavourDefiningCode(
      NullFlavour uniqueDeviceIdentifierUdiNullFlavourDefiningCode) {
     this.uniqueDeviceIdentifierUdiNullFlavourDefiningCode = uniqueDeviceIdentifierUdiNullFlavourDefiningCode;
  }

  public NullFlavour getUniqueDeviceIdentifierUdiNullFlavourDefiningCode() {
     return this.uniqueDeviceIdentifierUdiNullFlavourDefiningCode ;
  }

  public void setManufacturerValue(String manufacturerValue) {
     this.manufacturerValue = manufacturerValue;
  }

  public String getManufacturerValue() {
     return this.manufacturerValue ;
  }

  public void setManufacturerNullFlavourDefiningCode(
      NullFlavour manufacturerNullFlavourDefiningCode) {
     this.manufacturerNullFlavourDefiningCode = manufacturerNullFlavourDefiningCode;
  }

  public NullFlavour getManufacturerNullFlavourDefiningCode() {
     return this.manufacturerNullFlavourDefiningCode ;
  }

  public void setDateOfManufactureValue(TemporalAccessor dateOfManufactureValue) {
     this.dateOfManufactureValue = dateOfManufactureValue;
  }

  public TemporalAccessor getDateOfManufactureValue() {
     return this.dateOfManufactureValue ;
  }

  public void setDateOfManufactureNullFlavourDefiningCode(
      NullFlavour dateOfManufactureNullFlavourDefiningCode) {
     this.dateOfManufactureNullFlavourDefiningCode = dateOfManufactureNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfManufactureNullFlavourDefiningCode() {
     return this.dateOfManufactureNullFlavourDefiningCode ;
  }

  public void setSerialNumberValue(String serialNumberValue) {
     this.serialNumberValue = serialNumberValue;
  }

  public String getSerialNumberValue() {
     return this.serialNumberValue ;
  }

  public void setSerialNumberNullFlavourDefiningCode(
      NullFlavour serialNumberNullFlavourDefiningCode) {
     this.serialNumberNullFlavourDefiningCode = serialNumberNullFlavourDefiningCode;
  }

  public NullFlavour getSerialNumberNullFlavourDefiningCode() {
     return this.serialNumberNullFlavourDefiningCode ;
  }

  public void setCatalogueNumberValue(String catalogueNumberValue) {
     this.catalogueNumberValue = catalogueNumberValue;
  }

  public String getCatalogueNumberValue() {
     return this.catalogueNumberValue ;
  }

  public void setCatalogueNumberNullFlavourDefiningCode(
      NullFlavour catalogueNumberNullFlavourDefiningCode) {
     this.catalogueNumberNullFlavourDefiningCode = catalogueNumberNullFlavourDefiningCode;
  }

  public NullFlavour getCatalogueNumberNullFlavourDefiningCode() {
     return this.catalogueNumberNullFlavourDefiningCode ;
  }

  public void setModelNumberValue(String modelNumberValue) {
     this.modelNumberValue = modelNumberValue;
  }

  public String getModelNumberValue() {
     return this.modelNumberValue ;
  }

  public void setModelNumberNullFlavourDefiningCode(
      NullFlavour modelNumberNullFlavourDefiningCode) {
     this.modelNumberNullFlavourDefiningCode = modelNumberNullFlavourDefiningCode;
  }

  public NullFlavour getModelNumberNullFlavourDefiningCode() {
     return this.modelNumberNullFlavourDefiningCode ;
  }

  public void setBatchLotNumberValue(String batchLotNumberValue) {
     this.batchLotNumberValue = batchLotNumberValue;
  }

  public String getBatchLotNumberValue() {
     return this.batchLotNumberValue ;
  }

  public void setBatchLotNumberNullFlavourDefiningCode(
      NullFlavour batchLotNumberNullFlavourDefiningCode) {
     this.batchLotNumberNullFlavourDefiningCode = batchLotNumberNullFlavourDefiningCode;
  }

  public NullFlavour getBatchLotNumberNullFlavourDefiningCode() {
     return this.batchLotNumberNullFlavourDefiningCode ;
  }

  public void setSoftwareVersionValue(String softwareVersionValue) {
     this.softwareVersionValue = softwareVersionValue;
  }

  public String getSoftwareVersionValue() {
     return this.softwareVersionValue ;
  }

  public void setSoftwareVersionNullFlavourDefiningCode(
      NullFlavour softwareVersionNullFlavourDefiningCode) {
     this.softwareVersionNullFlavourDefiningCode = softwareVersionNullFlavourDefiningCode;
  }

  public NullFlavour getSoftwareVersionNullFlavourDefiningCode() {
     return this.softwareVersionNullFlavourDefiningCode ;
  }

  public void setDateOfExpiryValue(TemporalAccessor dateOfExpiryValue) {
     this.dateOfExpiryValue = dateOfExpiryValue;
  }

  public TemporalAccessor getDateOfExpiryValue() {
     return this.dateOfExpiryValue ;
  }

  public void setDateOfExpiryNullFlavourDefiningCode(
      NullFlavour dateOfExpiryNullFlavourDefiningCode) {
     this.dateOfExpiryNullFlavourDefiningCode = dateOfExpiryNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfExpiryNullFlavourDefiningCode() {
     return this.dateOfExpiryNullFlavourDefiningCode ;
  }

  public void setOtherIdentifier(List<MedicalDeviceOtherIdentifierElement> otherIdentifier) {
     this.otherIdentifier = otherIdentifier;
  }

  public List<MedicalDeviceOtherIdentifierElement> getOtherIdentifier() {
     return this.otherIdentifier ;
  }

  public void setAssetManagement(List<Cluster> assetManagement) {
     this.assetManagement = assetManagement;
  }

  public List<Cluster> getAssetManagement() {
     return this.assetManagement ;
  }

  public void setComponents(List<Cluster> components) {
     this.components = components;
  }

  public List<Cluster> getComponents() {
     return this.components ;
  }

  public void setExtension(List<Cluster> extension) {
     this.extension = extension;
  }

  public List<Cluster> getExtension() {
     return this.extension ;
  }

  public void setMultimedia(List<Cluster> multimedia) {
     this.multimedia = multimedia;
  }

  public List<Cluster> getMultimedia() {
     return this.multimedia ;
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
}
