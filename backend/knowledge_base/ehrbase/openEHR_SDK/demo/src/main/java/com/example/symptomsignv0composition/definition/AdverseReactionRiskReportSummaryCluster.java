package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import java.util.List;
import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.LocatableEntity;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.761088446+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public class AdverseReactionRiskReportSummaryCluster implements LocatableEntity {
  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Report summary/Date of report
   * Description: Date that the report was sent to the regulatory authority.
   */
  @Path("/items[at0125]/value|value")
  private TemporalAccessor dateOfReportValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Report summary/Date of report/null_flavour
   */
  @Path("/items[at0125]/null_flavour|defining_code")
  private NullFlavour dateOfReportNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Report summary/Report comment
   * Description: Narrative about the adverse reaction report or reporting process.
   * Comment: For example, the reason for non-reporting.
   */
  @Path("/items[at0048]/value|value")
  private String reportCommentValue;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Tree/Report summary/Report comment/null_flavour
   */
  @Path("/items[at0048]/null_flavour|defining_code")
  private NullFlavour reportCommentNullFlavourDefiningCode;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Report summary/Adverse reaction report
   * Description: Link to an adverse reaction Report sent to a regulatory body.
   */
  @Path("/items[at0045]")
  private List<AdverseReactionRiskAdverseReactionReportElement> adverseReactionReport;

  /**
   * Path: clinical encounter.v0/Sign/Symptoms/Adverse reaction list/Adverse reaction risk/Report summary/feeder_audit
   */
  @Path("/feeder_audit")
  private FeederAudit feederAudit;

  public void setDateOfReportValue(TemporalAccessor dateOfReportValue) {
     this.dateOfReportValue = dateOfReportValue;
  }

  public TemporalAccessor getDateOfReportValue() {
     return this.dateOfReportValue ;
  }

  public void setDateOfReportNullFlavourDefiningCode(
      NullFlavour dateOfReportNullFlavourDefiningCode) {
     this.dateOfReportNullFlavourDefiningCode = dateOfReportNullFlavourDefiningCode;
  }

  public NullFlavour getDateOfReportNullFlavourDefiningCode() {
     return this.dateOfReportNullFlavourDefiningCode ;
  }

  public void setReportCommentValue(String reportCommentValue) {
     this.reportCommentValue = reportCommentValue;
  }

  public String getReportCommentValue() {
     return this.reportCommentValue ;
  }

  public void setReportCommentNullFlavourDefiningCode(
      NullFlavour reportCommentNullFlavourDefiningCode) {
     this.reportCommentNullFlavourDefiningCode = reportCommentNullFlavourDefiningCode;
  }

  public NullFlavour getReportCommentNullFlavourDefiningCode() {
     return this.reportCommentNullFlavourDefiningCode ;
  }

  public void setAdverseReactionReport(
      List<AdverseReactionRiskAdverseReactionReportElement> adverseReactionReport) {
     this.adverseReactionReport = adverseReactionReport;
  }

  public List<AdverseReactionRiskAdverseReactionReportElement> getAdverseReactionReport() {
     return this.adverseReactionReport ;
  }

  public void setFeederAudit(FeederAudit feederAudit) {
     this.feederAudit = feederAudit;
  }

  public FeederAudit getFeederAudit() {
     return this.feederAudit ;
  }
}
