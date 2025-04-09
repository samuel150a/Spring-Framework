package com.encapsulation1.external2;


import com.encapsulation1.internal2.Jet;

public class JetManager {
    public void manageDisp() {
        Jet jet = new Jet();
        System.out.println("Modelis" + jet.getModel());
        System.out.println("CountryOfOriginis" + jet.getCountryOfOrigin());
        System.out.println("MaxSpeedis" + jet.getMaxSpeed() + "km/h");
        System.out.println("IsStealthis" + jet.getIsStealth());
        System.out.println("Purposeis" + jet.getPurpose());
    }
}
