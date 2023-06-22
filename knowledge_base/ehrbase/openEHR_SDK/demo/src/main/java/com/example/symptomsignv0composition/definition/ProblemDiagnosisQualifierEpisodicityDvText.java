package com.example.symptomsignv0composition.definition;

import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.706286244+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class ProblemDiagnosisQualifierEpisodicityDvText implements RMEntity, ProblemDiagnosisQualifierEpisodicityChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Problem/Diagnosis qualifier/Episodicity/Episodicity
   * Description: Category of this episode for the identified problem/diagnosis.
   * Comment: For example: 'New' will enable clinicians to distinguish a new, acute episode of otitis media that may have arisen soon after a previous diagnosis, to distinguish it from an unresolved or 'Ongoing' diagnosis of chronic otitis media. Treatment of recurring, new and acute, episodes of a condition may differ significantly from the same condition that is not resolving or responding to treatment. In many situations the clinician will not be able to tell, and so indeterminate may be appropriate.
   */
  @Path("|value")
  private String episodicityValue;

  public void setEpisodicityValue(String episodicityValue) {
     this.episodicityValue = episodicityValue;
  }

  public String getEpisodicityValue() {
     return this.episodicityValue ;
  }
}
