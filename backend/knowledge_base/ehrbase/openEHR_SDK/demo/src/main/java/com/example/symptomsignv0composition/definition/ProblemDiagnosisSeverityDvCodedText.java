package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.713308233+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class ProblemDiagnosisSeverityDvCodedText implements RMEntity, ProblemDiagnosisSeverityChoice {
  /**
   * Path: clinical encounter.v0/Problem/Diagnosis/Severity/Severity
   * Description: An assessment of the overall severity of the problem or diagnosis.
   * Comment: If severity is included in the Problem/diagnosis name via precoordinated codes, this data element becomes redundant. Note: more specific grading of severity can be recorded using the Specific details SLOT.
   */
  @Path("|defining_code")
  private SeverityDefiningCode severityDefiningCode;

  public void setSeverityDefiningCode(SeverityDefiningCode severityDefiningCode) {
     this.severityDefiningCode = severityDefiningCode;
  }

  public SeverityDefiningCode getSeverityDefiningCode() {
     return this.severityDefiningCode ;
  }
}
