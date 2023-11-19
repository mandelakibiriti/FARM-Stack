package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.datavalues.DvCodedText;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.733471541+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ExclusionOfASymptomOrSignExcludedSymptomDvCodedText implements RMEntity, ExclusionOfASymptomOrSignExcludedSymptomChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Exclusion of a symptom or sign/Excluded Symptom/Excluded Symptom
   * Description: Identification of the specific symptom to which the Exclusion Statement applies.
   * Comment: Coding of the Symptom with a terminology is desirable, where possible.
   */
  @Path("")
  private DvCodedText excludedSymptom;

  public void setExcludedSymptom(DvCodedText excludedSymptom) {
     this.excludedSymptom = excludedSymptom;
  }

  public DvCodedText getExcludedSymptom() {
     return this.excludedSymptom ;
  }
}
