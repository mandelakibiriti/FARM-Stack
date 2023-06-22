package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.687452360+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AnatomicalLocationAnatomicalLineDvCodedText implements RMEntity, AnatomicalLocationAnatomicalLineChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Anatomical location/Anatomical Line/Anatomical Line
   * Description: Additional detail using theoretical lines drawn through anatomical structures used to provide a consistent reference point on the human body.
   * Comment: Common anatomical lines have been included as a value set, which can be extended over time, plus a free text option. The additional use of this data element allows for recording of the typical position of the heart's apex beat at 5th intercostal space, left side, and mid-clavicular line. If the 'Body site name' data element uses pre-coordinated terms that include anatomical line, then this data element is redundant.
   */
  @Path("|defining_code")
  private AnatomicalLineDefiningCode anatomicalLineDefiningCode;

  public void setAnatomicalLineDefiningCode(AnatomicalLineDefiningCode anatomicalLineDefiningCode) {
     this.anatomicalLineDefiningCode = anatomicalLineDefiningCode;
  }

  public AnatomicalLineDefiningCode getAnatomicalLineDefiningCode() {
     return this.anatomicalLineDefiningCode ;
  }
}
