package com.encapsulation.internal;


public class PostOffice {
    private String name = "Challakere Head Office";
    private String location = "Challakere";
    private int numberOfEmployees = 20;
    private boolean hasATM = false;
    private String postMaster = "Mr. Kumar";

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setHasATM(boolean hasATM) {
        this.hasATM = hasATM;
    }

    void setPostMaster(String postMaster) {
        this.postMaster = postMaster;
    }

    public String getName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public boolean getHasATM() {
        return this.hasATM;
    }

    public String getPostMaster() {
        return this.postMaster;
    }
}
