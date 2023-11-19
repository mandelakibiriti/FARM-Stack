package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.828464661+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class DifferentialDiagnosesStatusDvCodedText implements RMEntity, DifferentialDiagnosesStatusChoice {
  /**
   * Path: clinical encounter.v0/Differential diagnoses/Per differential/Status/Status
   * Description: Likelihood of the differential diagnosis being responsible for the clinical situation.
   * Comment: If using the proposed value set, 'Possible' is considered as the default until each diagnosis is either accepted or excluded. If a diagnosis is regarded as 'Accepted' then it is likely that it will either be manually or automatically added to the health record using the EVALUATION.problem_diagnosis archetype.
   */
  @Path("|defining_code")
  private StatusDefiningCode2 statusDefiningCode;

  public void setStatusDefiningCode(StatusDefiningCode2 statusDefiningCode) {
     this.statusDefiningCode = statusDefiningCode;
  }

  public StatusDefiningCode2 getStatusDefiningCode() {
     return this.statusDefiningCode ;
  }
}
