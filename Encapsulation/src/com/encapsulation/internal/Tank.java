package com.encapsulation.internal;

public class Tank {
    private String model = "T-90 Bhishma";
    private String country = "India";
    private int crewSize = 3;
    private boolean isArmored = true;
    private String purpose = "Combat";

    void setModel(String model) {
        this.model = model;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    void setIsArmored(boolean isArmored) {
        this.isArmored = isArmored;
    }

    void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getModel() {
        return this.model;
    }

    public String getCountry() {
        return this.country;
    }

    public int getCrewSize() {
        return this.crewSize;
    }

    public boolean getIsArmored() {
        return this.isArmored;
    }

    public String getPurpose() {
        return this.purpose;
    }
}