package com.example.symptomsignv0composition.definition;

import java.lang.Boolean;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.700317550+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_BOOLEAN")
public class ProblemDiagnosisQualifierAdmissionDiagnosisDvBoolean implements RMEntity, ProblemDiagnosisQualifierAdmissionDiagnosisChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Admission diagnosis?/Admission diagnosis?
   * Description: Was the problem or diagnosis present at admission?
   * Comment: Record as True or 'Yes' if the problem or diagnosis was present on admission. This data element is a requirement from DRG reporting in some countries.
   */
  @Path("|value")
  private Boolean admissionDiagnosisValue;

  public void setAdmissionDiagnosisValue(Boolean admissionDiagnosisValue) {
     this.admissionDiagnosisValue = admissionDiagnosisValue;
  }

  public Boolean isAdmissionDiagnosisValue() {
     return this.admissionDiagnosisValue ;
  }
}
