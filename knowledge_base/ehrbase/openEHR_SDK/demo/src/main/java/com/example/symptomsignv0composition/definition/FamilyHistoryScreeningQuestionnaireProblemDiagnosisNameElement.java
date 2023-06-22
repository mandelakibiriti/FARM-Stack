package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.841279037+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class FamilyHistoryScreeningQuestionnaireProblemDiagnosisNameElement implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/Problem/diagnosis name
   * Description: Identification of the significant problem or diagnosis in the identified family member.
   * Comment: Coding of the family member's problem or diagnosis with a terminology is preferred, where possible. 
   */
  @Path("/value|value")
  private String value;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Tree/Specific family health problem/Problem/diagnosis name/null_flavour
   */
  @Path("/null_flavour|defining_code")
  private NullFlavour value2;

  /**
   * Path: clinical encounter.v0/Screening/Family history screening questionnaire/Any event/Specific family health problem/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setValue(String value) {
     this.value = value;
  }

  public String getValue() {
     return this.value ;
  }

  public void setValue2(NullFlavour value2) {
     this.value2 = value2;
  }

  public NullFlavour getValue2() {
     return this.value2 ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
