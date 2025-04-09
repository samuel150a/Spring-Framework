package com.encapsulation1.internal2;



public class Apartment {
    private String name = "sathya";
    private String location = "Btm";
    private int numberOfFlats = 40;
    private boolean hasLift = true;
    private String ownerName = "gokul";

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfFlats(int numberOfFlats) {
        this.numberOfFlats = numberOfFlats;
    }

    void setHasLift(boolean hasLift) {
        this.hasLift = hasLift;
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

    public int getNumberOfFlats() {
        return this.numberOfFlats;
    }

    public boolean getHasLift() {
        return this.hasLift;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
}
