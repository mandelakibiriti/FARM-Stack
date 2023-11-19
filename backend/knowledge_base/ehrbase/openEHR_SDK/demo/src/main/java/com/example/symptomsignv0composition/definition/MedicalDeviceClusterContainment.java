package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import com.nedap.archie.rm.datavalues.DvIdentifier;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class MedicalDeviceClusterContainment extends Containment {
  public SelectAqlField<MedicalDeviceCluster> MEDICAL_DEVICE_CLUSTER = new AqlFieldImp<MedicalDeviceCluster>(MedicalDeviceCluster.class, "", "MedicalDeviceCluster", MedicalDeviceCluster.class, this);

  public SelectAqlField<String> DEVICE_NAME_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0001]/value|value", "deviceNameValue", String.class, this);

  public SelectAqlField<NullFlavour> DEVICE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0001]/null_flavour|defining_code", "deviceNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> TYPE_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0003]/value|value", "typeValue", String.class, this);

  public SelectAqlField<NullFlavour> TYPE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0003]/null_flavour|defining_code", "typeNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0002]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0002]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> PROPERTIES = new ListAqlFieldImp<Cluster>(MedicalDeviceCluster.class, "/items[at0009]", "properties", Cluster.class, this);

  public SelectAqlField<DvIdentifier> UNIQUE_DEVICE_IDENTIFIER_UDI = new AqlFieldImp<DvIdentifier>(MedicalDeviceCluster.class, "/items[at0021]/value", "uniqueDeviceIdentifierUdi", DvIdentifier.class, this);

  public SelectAqlField<NullFlavour> UNIQUE_DEVICE_IDENTIFIER_UDI_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0021]/null_flavour|defining_code", "uniqueDeviceIdentifierUdiNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> MANUFACTURER_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0004]/value|value", "manufacturerValue", String.class, this);

  public SelectAqlField<NullFlavour> MANUFACTURER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0004]/null_flavour|defining_code", "manufacturerNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> DATE_OF_MANUFACTURE_VALUE = new AqlFieldImp<TemporalAccessor>(MedicalDeviceCluster.class, "/items[at0005]/value|value", "dateOfManufactureValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_OF_MANUFACTURE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0005]/null_flavour|defining_code", "dateOfManufactureNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SERIAL_NUMBER_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0020]/value|value", "serialNumberValue", String.class, this);

  public SelectAqlField<NullFlavour> SERIAL_NUMBER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0020]/null_flavour|defining_code", "serialNumberNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> CATALOGUE_NUMBER_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0022]/value|value", "catalogueNumberValue", String.class, this);

  public SelectAqlField<NullFlavour> CATALOGUE_NUMBER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0022]/null_flavour|defining_code", "catalogueNumberNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> MODEL_NUMBER_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0023]/value|value", "modelNumberValue", String.class, this);

  public SelectAqlField<NullFlavour> MODEL_NUMBER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0023]/null_flavour|defining_code", "modelNumberNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> BATCH_LOT_NUMBER_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0006]/value|value", "batchLotNumberValue", String.class, this);

  public SelectAqlField<NullFlavour> BATCH_LOT_NUMBER_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0006]/null_flavour|defining_code", "batchLotNumberNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SOFTWARE_VERSION_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0025]/value|value", "softwareVersionValue", String.class, this);

  public SelectAqlField<NullFlavour> SOFTWARE_VERSION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0025]/null_flavour|defining_code", "softwareVersionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<TemporalAccessor> DATE_OF_EXPIRY_VALUE = new AqlFieldImp<TemporalAccessor>(MedicalDeviceCluster.class, "/items[at0007]/value|value", "dateOfExpiryValue", TemporalAccessor.class, this);

  public SelectAqlField<NullFlavour> DATE_OF_EXPIRY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0007]/null_flavour|defining_code", "dateOfExpiryNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<MedicalDeviceOtherIdentifierElement> OTHER_IDENTIFIER = new ListAqlFieldImp<MedicalDeviceOtherIdentifierElement>(MedicalDeviceCluster.class, "/items[at0024]", "otherIdentifier", MedicalDeviceOtherIdentifierElement.class, this);

  public ListSelectAqlField<Cluster> ASSET_MANAGEMENT = new ListAqlFieldImp<Cluster>(MedicalDeviceCluster.class, "/items[at0019]", "assetManagement", Cluster.class, this);

  public ListSelectAqlField<Cluster> COMPONENTS = new ListAqlFieldImp<Cluster>(MedicalDeviceCluster.class, "/items[at0018]", "components", Cluster.class, this);

  public ListSelectAqlField<Cluster> EXTENSION = new ListAqlFieldImp<Cluster>(MedicalDeviceCluster.class, "/items[at0026]", "extension", Cluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA = new ListAqlFieldImp<Cluster>(MedicalDeviceCluster.class, "/items[at0027]", "multimedia", Cluster.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(MedicalDeviceCluster.class, "/items[at0008]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(MedicalDeviceCluster.class, "/items[at0008]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(MedicalDeviceCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private MedicalDeviceClusterContainment() {
    super("openEHR-EHR-CLUSTER.device.v1");
  }

  public static MedicalDeviceClusterContainment getInstance() {
    return new MedicalDeviceClusterContainment();
  }
}
