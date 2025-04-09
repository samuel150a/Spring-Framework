package com.encapsulation1.internal2;


public class Occupation {
    private String title = "Software Engineer";
    private String field = "IT";
    private int averageSalary = 60000;
    private boolean isRemote = true;
    private String requiredDegree = "B.Tech";

    void setTitle(String title) {
        this.title = title;
    }

    void setField(String field) {
        this.field = field;
    }

    void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    void setIsRemote(boolean isRemote) {
        this.isRemote = isRemote;
    }

    void setRequiredDegree(String requiredDegree) {
        this.requiredDegree = requiredDegree;
    }

    public String getTitle() {
        return this.title;
    }

    public String getField() {
        return this.field;
    }

    public int getAverageSalary() {
        return this.averageSalary;
    }

    public boolean getIsRemote() {
        return this.isRemote;
    }

    public String getRequiredDegree() {
        return this.requiredDegree;
    }
}
