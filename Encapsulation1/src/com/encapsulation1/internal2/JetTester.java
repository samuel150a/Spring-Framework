package com.encapsulation1.internal2;


public class JetTester {
    public void jetDisp() {
        Jet jet = new Jet();
        System.out.println("Modelis" + jet.getModel());
        System.out.println("CountryOfOriginis" + jet.getCountryOfOrigin());
        System.out.println("MaxSpeedis" + jet.getMaxSpeed() + "km/h");
        System.out.println("IsStealthis" + jet.getIsStealth());
        System.out.println("Purposeis" + jet.getPurpose());

        jet.setModel("Rafale");
        jet.setCountryOfOrigin("France");
        jet.setMaxSpeed(2222);
        jet.setIsStealth(false);
        jet.setPurpose("Multirole Combat");

        System.out.println("UpdatedModelis" + jet.getModel());
        System.out.println("UpdatedCountryOfOriginis" + jet.getCountryOfOrigin());
        System.out.println("UpdatedMaxSpeedis" + jet.getMaxSpeed() + "km/h");
        System.out.println("UpdatedIsStealthis" + jet.getIsStealth());
        System.out.println("UpdatedPurposeis" + jet.getPurpose());
    }
}
