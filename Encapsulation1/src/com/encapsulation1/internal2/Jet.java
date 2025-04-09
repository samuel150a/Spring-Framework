package com.encapsulation1.internal2;



public class Jet {
    private String model = "F-22 Raptor";
    private String countryOfOrigin = "USA";
    private int maxSpeed = 2400; // in km/h
    private boolean isStealth = true;
    private String purpose = "Air Superiority";

    void setModel(String model) {
        this.model = model;
    }

    void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setIsStealth(boolean isStealth) {
        this.isStealth = isStealth;
    }

    void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getModel() {
        return this.model;
    }

    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean getIsStealth() {
        return this.isStealth;
    }

    public String getPurpose() {
        return this.purpose;
    }
}
