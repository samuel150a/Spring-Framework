package com.encapsulation1.internal2;



public class Badge {
    private String badgeName = "Honor Badge";
    private String issuedBy = "School Principal";
    private String color = "Gold";
    private int yearIssued = 2024;
    private boolean isMetal = true;

    void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setYearIssued(int yearIssued) {
        this.yearIssued = yearIssued;
    }

    void setIsMetal(boolean isMetal) {
        this.isMetal = isMetal;
    }

    public String getBadgeName() {
        return this.badgeName;
    }

    public String getIssuedBy() {
        return this.issuedBy;
    }

    public String getColor() {
        return this.color;
    }

    public int getYearIssued() {
        return this.yearIssued;
    }

    public boolean getIsMetal() {
        return this.isMetal;
    }
}
