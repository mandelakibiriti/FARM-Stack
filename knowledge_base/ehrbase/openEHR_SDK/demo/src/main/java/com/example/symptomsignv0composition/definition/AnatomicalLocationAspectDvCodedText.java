package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.677860445+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AnatomicalLocationAspectDvCodedText implements RMEntity, AnatomicalLocationAspectChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Anatomical location/Aspect/Aspect
   * Description: Qualifying detail about the specific aspect of the identified body site.
   * Comment: Use to increase precision of identification of the body site, if required. Common aspects have been included as a value set, which can be extended over time, plus a free text option. Assumes that the body is being described while in the anatomical position. For example: proximal urethra; plantar aspect of the left thumb. Multiple aspects can also be described, if required, by allowing for 0..2 occurrences. For example: a lesion may be on the left anterior/lateral (ie anterolateral) chest wall. If the 'Body site name' data element uses pre-coordinated terms that include the aspect, then this data element is redundant.
   */
  @Path("|defining_code")
  private AspectDefiningCode aspectDefiningCode;

  public void setAspectDefiningCode(AspectDefiningCode aspectDefiningCode) {
     this.aspectDefiningCode = aspectDefiningCode;
  }

  public AspectDefiningCode getAspectDefiningCode() {
     return this.aspectDefiningCode ;
  }
}
