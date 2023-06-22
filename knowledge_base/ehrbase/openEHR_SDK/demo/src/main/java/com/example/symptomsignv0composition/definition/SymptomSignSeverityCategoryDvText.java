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
    date = "2023-06-19T20:52:30.734990858+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_TEXT")
public class SymptomSignSeverityCategoryDvText implements RMEntity, SymptomSignSeverityCategoryChoice {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Symptom/Sign/Any event/Severity category/Severity category
   * Description: Category representing the overall severity of the symptom or sign.
   * Comment: Defining values such as mild, moderate or severe in such a way that is applicable to multiple symptoms or signs plus allows multiple users to interpret and record them consistently is not easy. Some organisations extend the value set further with inclusion of additional values such as 'Trivial' and 'Very severe', and/or 'Mild-Moderate' and 'Moderate-Severe', adds to the definitional difficulty and may also worsen inter-recorder reliability issues. Use of 'Life-threatening' and 'Fatal' is also often considered as part of this value set, although from a pure point of view it may actually reflect an outcome rather than a severity. In view of the above, keeping to a well-defined but smaller list is preferred and so the mild/moderate/severe value set is offered, however the choice of other text allows for other value sets to be included at this data element in a template. Note: more specific grading of severity can be recorded using the 'Specific details' SLOT.
   */
  @Path("|value")
  private String severityCategoryValue;

  public void setSeverityCategoryValue(String severityCategoryValue) {
     this.severityCategoryValue = severityCategoryValue;
  }

  public String getSeverityCategoryValue() {
     return this.severityCategoryValue ;
  }
}
