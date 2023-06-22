package com.example.symptomsignv0composition.definition;

import javax.annotation.processing.Generated;
import org.ehrbase.client.annotations.Entity;
import org.ehrbase.client.annotations.OptionFor;
import org.ehrbase.client.annotations.Path;
import org.ehrbase.client.classgenerator.interfaces.RMEntity;

@Entity
@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.803606060+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
@OptionFor("DV_CODED_TEXT")
public class PulseHeartBeatBodySiteDvCodedText implements RMEntity, PulseHeartBeatBodySiteChoice {
  /**
   * Path: clinical encounter.v0/Vital signs/Pulse/Heart beat/Body site/Body site
   * Description: Body site where the pulse or heart beat were observed.
   */
  @Path("|defining_code")
  private BodySiteDefiningCode bodySiteDefiningCode;

  public void setBodySiteDefiningCode(BodySiteDefiningCode bodySiteDefiningCode) {
     this.bodySiteDefiningCode = bodySiteDefiningCode;
  }

  public BodySiteDefiningCode getBodySiteDefiningCode() {
     return this.bodySiteDefiningCode ;
  }
}
