package com.equals.task;

import java.util.Objects;

public class PowerSupply33 {
    private String brand;
    private int wattage;
    private String type;
    private boolean modular;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setWattage(int wattage) {
        this.wattage = wattage;
    }

    void setType(String type) {
        this.type = type;
    }

    void setModular(boolean modular) {
        this.modular = modular;
    }

    String getBrand() {
        return brand;
    }

    int getWattage() {
        return wattage;
    }

    String getType() {
        return type;
    }

    boolean getModular() {
        return modular;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof PowerSupply33) {
            PowerSupply33 supply = (PowerSupply33) any;
            if (Objects.equals(this.brand, supply.brand) &&
                    Objects.equals(this.wattage, supply.wattage) &&
                    Objects.equals(this.type, supply.type) &&
                    Objects.equals(this.modular, supply.modular)) {
                System.out.println("powersupply is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand +
                ", Wattage: " + this.wattage + "W" +
                ", Type: " + this.type +
                ", Modular: " + this.modular;
    }
}
