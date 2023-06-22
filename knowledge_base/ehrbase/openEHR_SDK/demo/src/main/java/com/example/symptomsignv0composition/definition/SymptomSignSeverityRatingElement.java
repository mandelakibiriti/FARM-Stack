package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.Double;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.723409599+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class SymptomSignSeverityRatingElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Severity rating
   * Description: Numerical rating scale representing the overall severity of the symptom or sign.
   * Comment: Symptom severity can be rated by the individual by recording a score from 0 (ie symptom not present) to 10.0 (ie symptom is as severe as the individual can imagine). This score can be represented in the user interface as a visual analogue scale. The data element has occurrences set to 0..* to allow for variations such as 'maximal severity' or 'average severity' to be included in a template.
   */
  @Path("/value|magnitude")
  private Double value;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Severity rating
   * Description: Numerical rating scale representing the overall severity of the symptom or sign.
   * Comment: Symptom severity can be rated by the individual by recording a score from 0 (ie symptom not present) to 10.0 (ie symptom is as severe as the individual can imagine). This score can be represented in the user interface as a visual analogue scale. The data element has occurrences set to 0..* to allow for variations such as 'maximal severity' or 'average severity' to be included in a template.
   */
  @Path("/value|units")
  private String value2;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Tree/Severity rating/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value3;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(Double value) {
     this.value = value;
  }

  public Double getValue() {
     return this.value ;
  }

  public void setValue2(String value2) {
     this.value2 = value2;
  }

  public String getValue2() {
     return this.value2 ;
  }

  public void setValue3(NullFlavour value3) {
     this.value3 = value3;
  }

  public NullFlavour getValue3() {
     return this.value3 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
