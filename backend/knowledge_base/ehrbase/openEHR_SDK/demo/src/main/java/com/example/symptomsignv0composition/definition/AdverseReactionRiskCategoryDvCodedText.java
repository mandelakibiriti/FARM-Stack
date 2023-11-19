package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.761906177+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class AdverseReactionRiskCategoryDvCodedText implements RMEntity, AdverseReactionRiskCategoryChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Category/Category
   * Description: Category of the identified 'Substance'.
   * Comment: This data element has been included because it is currently being captured in some clinical systems. This data can be derived from the Substance where coding systems are used, and is effectively redundant in that situation.
   */
  @Path("|defining_code")
  private CategoryDefiningCode2 categoryDefiningCode;

  public void setCategoryDefiningCode(CategoryDefiningCode2 categoryDefiningCode) {
     this.categoryDefiningCode = categoryDefiningCode;
  }

  public CategoryDefiningCode2 getCategoryDefiningCode() {
     return this.categoryDefiningCode ;
  }
}
