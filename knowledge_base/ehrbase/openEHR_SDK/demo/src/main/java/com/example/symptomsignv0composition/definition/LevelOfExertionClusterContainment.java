package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

public class LevelOfExertionClusterContainment extends Containment {
  public SelectAqlField<LevelOfExertionCluster> LEVEL_OF_EXERTION_CLUSTER = new AqlFieldImp<LevelOfExertionCluster>(LevelOfExertionCluster.class, "", "LevelOfExertionCluster", LevelOfExertionCluster.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(LevelOfExertionCluster.class, "/items[at0010]/items[at0016]/value|value", "descriptionValue", String.class, this);

  public SelectAqlField<NullFlavour> DESCRIPTION_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LevelOfExertionCluster.class, "/items[at0010]/items[at0016]/null_flavour|defining_code", "descriptionNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<IntensityDefiningCode> INTENSITY_DEFINING_CODE = new AqlFieldImp<IntensityDefiningCode>(LevelOfExertionCluster.class, "/items[at0010]/items[at0011]/value|defining_code", "intensityDefiningCode", IntensityDefiningCode.class, this);

  public SelectAqlField<NullFlavour> INTENSITY_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LevelOfExertionCluster.class, "/items[at0010]/items[at0011]/null_flavour|defining_code", "intensityNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<Double> MEASURED_MAGNITUDE = new AqlFieldImp<Double>(LevelOfExertionCluster.class, "/items[at0010]/items[at0005]/value|magnitude", "measuredMagnitude", Double.class, this);

  public SelectAqlField<String> MEASURED_UNITS = new AqlFieldImp<String>(LevelOfExertionCluster.class, "/items[at0010]/items[at0005]/value|units", "measuredUnits", String.class, this);

  public SelectAqlField<NullFlavour> MEASURED_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LevelOfExertionCluster.class, "/items[at0010]/items[at0005]/null_flavour|defining_code", "measuredNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<PhaseDefiningCode> PHASE_DEFINING_CODE = new AqlFieldImp<PhaseDefiningCode>(LevelOfExertionCluster.class, "/items[at0009]/value|defining_code", "phaseDefiningCode", PhaseDefiningCode.class, this);

  public SelectAqlField<NullFlavour> PHASE_NULL_FLAVOUR_DEFINING_CODE = new AqlFieldImp<NullFlavour>(LevelOfExertionCluster.class, "/items[at0009]/null_flavour|defining_code", "phaseNullFlavourDefiningCode", NullFlavour.class, this);

  public SelectAqlField<FeederAudit> FEEDER_AUDIT = new AqlFieldImp<FeederAudit>(LevelOfExertionCluster.class, "/feeder_audit", "feederAudit", FeederAudit.class, this);

  private LevelOfExertionClusterContainment() {
    super("openEHR-EHR-CLUSTER.level_of_exertion.v0");
  }

  public static LevelOfExertionClusterContainment getInstance() {
    return new LevelOfExertionClusterContainment();
  }
}
