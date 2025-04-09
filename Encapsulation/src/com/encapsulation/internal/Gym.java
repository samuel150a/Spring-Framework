package com.encapsulation.internal;

public class Gym {
    private String name = "FitZone";
    private String location = "kushal nagar";
    private int numberOfEquipments = 25;
    private boolean hasTrainer = true;
    private String ownerName = "sam";

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfEquipments(int numberOfEquipments) {
        this.numberOfEquipments = numberOfEquipments;
    }

    void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }

    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNumberOfEquipments() {
        return this.numberOfEquipments;
    }

    public boolean getHasTrainer() {
        return this.hasTrainer;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
}
