package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.702592432+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisQualifierOccurrenceDvCodedText implements RMEntity, ProblemDiagnosisQualifierOccurrenceChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Occurrence/Occurrence
   * Description: Category of the occurrence for this problem or diagnosis.
   * Comment: This data element can be an additional qualifier to the 'New' value in the 'Episodicity' value set, that is a condition such as asthma can have recurring new episodes that have periods of resolution in between. However it can be important to identify the first ever episode of asthma from all of the other episodes.
   */
  @Path("|defining_code")
  private OccurrenceDefiningCode occurrenceDefiningCode;

  public void setOccurrenceDefiningCode(OccurrenceDefiningCode occurrenceDefiningCode) {
     this.occurrenceDefiningCode = occurrenceDefiningCode;
  }

  public OccurrenceDefiningCode getOccurrenceDefiningCode() {
     return this.occurrenceDefiningCode ;
  }
}
