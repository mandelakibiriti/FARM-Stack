package com.example.symptomsignv0composition.definition;

import com.nedap.archie.rm.archetyped.FeederAudit;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import javax.annotation.processing.Generated;
import org.ehrbase.client.classgenerator.shareddefinition.NullFlavour;

@Generated(
    value = "org.ehrbase.client.classgenerator.ClassGenerator",
    date = "2023-06-19T20:52:30.833828447+03:00",
    comments = "https://github.com/ehrbase/openEHR_SDK Version: 2.0.0-SNAPSHOT"
)
public interface ProgressNoteAnyEventChoice {
  TemporalAccessor getTimeValue();

  void setTimeValue(TemporalAccessor timeValue);

  NullFlavour getProgressNoteNullFlavourDefiningCode();

  void setProgressNoteNullFlavourDefiningCode(NullFlavour progressNoteNullFlavourDefiningCode);

  FeederAudit getFeederAudit();

  void setFeederAudit(FeederAudit feederAudit);

  String getProgressNoteValue();

  void setProgressNoteValue(String progressNoteValue);
}
