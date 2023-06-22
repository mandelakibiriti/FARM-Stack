package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class AnatomicalLocationCluster2Containment extends Containment {
  public SelectAqlField<AnatomicalLocationCluster2> ANATOMICAL_LOCATION_CLUSTER2 = new AqlFieldImp<AnatomicalLocationCluster2>(AnatomicalLocationCluster2.class, "", "AnatomicalLocationCluster2", AnatomicalLocationCluster2.class, this);

  public SelectAqlField<String> BODY_SITE_NAME_VALUE = new AqlFieldImp<String>(AnatomicalLocationCluster2.class, "/items[at0001]/value|value", "bodySiteNameValue", String.class, this);

  public SelectAqlField<NullFlavour> BODY_SITE_NAME_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnatomicalLocationCluster2.class, "/items[at0001]/null_flavour|defining_code", "bodySiteNameNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> SPECIFIC_SITE_VALUE = new AqlFieldImp<String>(AnatomicalLocationCluster2.class, "/items[at0065]/value|value", "specificSiteValue", String.class, this);

  public SelectAqlField<NullFlavour> SPECIFIC_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnatomicalLocationCluster2.class, "/items[at0065]/null_flavour|defining_code", "specificSiteNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<LateralityDefiningCode> LATERALITY_DEFINING_CODE = new AqlFieldImp<LateralityDefiningCode>(AnatomicalLocationCluster2.class, "/items[at0002]/value|defining_code", "lateralityDefiningCode", LateralityDefiningCode.class, this);

  public SelectAqlField<NullFlavour> LATERALITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnatomicalLocationCluster2.class, "/items[at0002]/null_flavour|defining_code", "lateralityNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<AnatomicalLocationAspectElement> ASPECT = new ListAqlFieldImp<AnatomicalLocationAspectElement>(AnatomicalLocationCluster2.class, "/items[at0064]", "aspect", AnatomicalLocationAspectElement.class, this);

  public SelectAqlField<NullFlavour> ANATOMICAL_LINE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnatomicalLocationCluster2.class, "/items[at0055]/null_flavour|defining_code", "anatomicalLineNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(AnatomicalLocationCluster2.class, "/items[at0023]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(AnatomicalLocationCluster2.class, "/items[at0023]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> ALTERNATIVE_STRUCTURE = new ListAqlFieldImp<Cluster>(AnatomicalLocationCluster2.class, "/items[at0053]", "alternativeStructure", Cluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA_REPRESENTATION = new ListAqlFieldImp<Cluster>(AnatomicalLocationCluster2.class, "/items[at0054]", "multimediaRepresentation", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(AnatomicalLocationCluster2.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  public SelectAqlField<AnatomicalLocationAnatomicalLineChoice> ANATOMICAL_LINE = new AqlFieldImp<AnatomicalLocationAnatomicalLineChoice>(AnatomicalLocationCluster2.class, "/items[at0055]/value", "anatomicalLine", AnatomicalLocationAnatomicalLineChoice.class, this);

  private AnatomicalLocationCluster2Containment() {
    super("openEHR-EHR-CLUSTER.anatomical_location.v1");
  }

  public static AnatomicalLocationCluster2Containment getInstance() {
    return new AnatomicalLocationCluster2Containment();
  }
}
