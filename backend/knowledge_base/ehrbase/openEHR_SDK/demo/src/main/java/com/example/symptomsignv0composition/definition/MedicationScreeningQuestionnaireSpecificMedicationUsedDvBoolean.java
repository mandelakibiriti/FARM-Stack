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
    date = "2023-06-19T20:52:30.851883723+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_BOOLEAN")
public class MedicationScreeningQuestionnaireSpecificMedicationUsedDvBoolean implements RMEntity, MedicationScreeningQuestionnaireSpecificMedicationUsedChoice {
  /**
   * Path: clinical encounter.v0/Screening/Medication screening questionnaire/Any event/Specific medication/Specific medication used?/Specific medication used?
   * Description: Is there a history of use of a specific medication or group of medications.
   * Comment: In a template, the data element would usually be renamed to the specific question asked. The proposed value set can be adapted for local use by using the DV_TEXT or the DV_BOOLEAN datatypes choice to match each specific use case. 
   * For example an alternative valueset using the DV_TEXT datatype can be: 
   * Currently using [The individual currently uses the specific medication either on a regular basis or as required.]
   * Never used [The individual has never used the specific medication.]
   * Used in the past [The individual has used the specific medication in the past, but isn't currently using it.]
   * Unknown [It is not known whether the individual uses or has used the specific medication.]
   */
  @Path("|value")
  private Boolean specificMedicationUsedValue;

  public void setSpecificMedicationUsedValue(Boolean specificMedicationUsedValue) {
     this.specificMedicationUsedValue = specificMedicationUsedValue;
  }

  public Boolean isSpecificMedicationUsedValue() {
     return this.specificMedicationUsedValue ;
  }
}
