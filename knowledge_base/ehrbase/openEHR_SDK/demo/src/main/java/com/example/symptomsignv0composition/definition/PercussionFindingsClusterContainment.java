package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.Boolean;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class PercussionFindingsClusterContainment extends Containment {
  public SelectAqlField<PercussionFindingsCluster> PERCUSSION_FINDINGS_CLUSTER = new AqlFieldImp<PercussionFindingsCluster>(PercussionFindingsCluster.class, "", "PercussionFindingsCluster", PercussionFindingsCluster.class, this);

  public SelectAqlField<String> SYSTEM_OR_STRUCTURE_EXAMINED_VALUE = new AqlFieldImp<String>(PercussionFindingsCluster.class, "/items[at0001]/value|value", "systemOrStructureExaminedValue", String.class, this);

  public SelectAqlField<NullFlavour> SYSTEM_OR_STRUCTURE_EXAMINED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PercussionFindingsCluster.class, "/items[at0001]/null_flavour|defining_code", "systemOrStructureExaminedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> BODY_SITE_VALUE = new AqlFieldImp<String>(PercussionFindingsCluster.class, "/items[at0012]/value|value", "bodySiteValue", String.class, this);

  public SelectAqlField<NullFlavour> BODY_SITE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PercussionFindingsCluster.class, "/items[at0012]/null_flavour|defining_code", "bodySiteNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> STRUCTURED_BODY_SITE = new ListAqlFieldImp<Cluster>(PercussionFindingsCluster.class, "/items[at0011]", "structuredBodySite", Cluster.class, this);

  public SelectAqlField<Boolean> NO_ABNORMALITY_DETECTED_VALUE = new AqlFieldImp<Boolean>(PercussionFindingsCluster.class, "/items[at0002]/value|value", "noAbnormalityDetectedValue", Boolean.class, this);

  public SelectAqlField<NullFlavour> NO_ABNORMALITY_DETECTED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PercussionFindingsCluster.class, "/items[at0002]/null_flavour|defining_code", "noAbnormalityDetectedNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<String> CLINICAL_DESCRIPTION_VALUE = new AqlFieldImp<String>(PercussionFindingsCluster.class, "/items[at0003]/value|value", "clinicalDescriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> CLINICAL_DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PercussionFindingsCluster.class, "/items[at0003]/null_flavour|defining_code", "clinicalDescriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXAMINATION_FINDINGS = new ListAqlFieldImp<Cluster>(PercussionFindingsCluster.class, "/items[at0004]", "examinationFindings", Cluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA_REPRESENTATION = new ListAqlFieldImp<Cluster>(PercussionFindingsCluster.class, "/items[at0005]", "multimediaRepresentation", Cluster.class, this);

  public ListSelectAqlField<AuscultationFindingsClinicalInterpretationElement> CLINICAL_INTERPRETATION = new ListAqlFieldImp<AuscultationFindingsClinicalInterpretationElement>(PercussionFindingsCluster.class, "/items[at0006]", "clinicalInterpretation", AuscultationFindingsClinicalInterpretationElement.class, this);

  public SelectAqlField<String> COMMENT_VALUE = new AqlFieldImp<String>(PercussionFindingsCluster.class, "/items[at0007]/value|value", "commentValue", String.class, this);

  public SelectAqlField<NullFlavour> COMMENT_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(PercussionFindingsCluster.class, "/items[at0007]/null_flavour|defining_code", "commentNullFlavourDefiningCode", NullFlavour.class, this);

  public ListSelectAqlField<Cluster> EXAMINATION_NOT_DONE = new ListAqlFieldImp<Cluster>(PercussionFindingsCluster.class, "/items[at0008]", "examinationNotDone", Cluster.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(PercussionFindingsCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private PercussionFindingsClusterContainment() {
    super("openEHR-EHR-CLUSTER.exam-palpation.v0");
  }

  public static PercussionFindingsClusterContainment getInstance() {
    return new PercussionFindingsClusterContainment();
  }
}
