package com.equals.task;

import java.util.Objects;

public class Diode18 {
    private String type;
    private int voltage;
    private double currentRating;
    private String packageType;

    void setType(String type) {
        this.type = type;
    }

    void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    void setCurrentRating(double currentRating) {
        this.currentRating = currentRating;
    }

    void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    String getType() {
        return type;
    }

    int getVoltage() {
        return voltage;
    }

    double getCurrentRating() {
        return currentRating;
    }

    String getPackageType() {
        return packageType;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Diode18) {
            Diode18 diode = (Diode18) any;
            if (Objects.equals(this.type, diode.type) &&
                    Objects.equals(this.voltage, diode.voltage) &&
                    Objects.equals(this.currentRating, diode.currentRating) &&
                    Objects.equals(this.packageType, diode.packageType)) {
                System.out.println("diode is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Voltage: " + this.voltage + "V, Current Rating: " + this.currentRating + "A, Package Type: " + this.packageType;
    }
}
