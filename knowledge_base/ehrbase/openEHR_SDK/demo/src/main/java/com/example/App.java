package com.example;

import org.ehrbase.client.classgenerator.shareddefinition.Language;
import org.ehrbase.client.flattener.Unflattener;
import org.ehrbase.serialisation.jsonencoding.CanonicalJson;
import org.ehrbase.webtemplate.templateprovider.TemplateProvider;

import com.example.symptomsignv0composition.SymptomSignV0Composition;
import com.example.symptomsignv0composition.definition.BloodPressure24HourAverageIntervalEvent;
import com.example.symptomsignv0composition.definition.BloodPressureObservation;
import com.nedap.archie.rm.RMObject;

public class App 
{
    public static void main( String[] args )
    {   
        SymptomSignV0Composition composition = new SymptomSignV0Composition();
        composition.setLanguage(Language.EN);

        BloodPressureObservation bloodpressure = new BloodPressureObservation();
        BloodPressure24HourAverageIntervalEvent event = new BloodPressure24HourAverageIntervalEvent();
        event.setSystolicMagnitude(120.0);
        event.setSystolicUnits("mmHg");
        event.setDiastolicMagnitude(67.0);
        event.setDiastolicUnits("mmHg");
        event.setClinicalInterpretationValue("normal");
        bloodpressure.setN24HourAverage(event);
        composition.setBloodPressure(bloodpressure);

        TemplateProvider provider = new PresentationTemplateProvider();
        Unflattener unflat = new Unflattener(provider);
        RMObject rmObject = unflat.unflatten(composition);
        CanonicalJson json = new CanonicalJson();
        System.out.println(json.marshal(rmObject));
    }
}
