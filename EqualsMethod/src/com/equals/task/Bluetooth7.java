package com.equals.task;

import java.util.Objects;

public class Bluetooth7 {
    private String brand;
    private String color;
    private int version;
    private String type;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setVersion(int version) {
        this.version = version;
    }

    void setType(String type) {
        this.type = type;
    }

    String getBrand() {
        return brand;
    }

    String getColor() {
        return color;
    }

    int getVersion() {
        return version;
    }

    String getType() {
        return type;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Bluetooth7) {
            Bluetooth7 bluetooth = (Bluetooth7) any;
            if (Objects.equals(this.brand, bluetooth.brand) &&
                    Objects.equals(this.color, bluetooth.color) &&
                    Objects.equals(this.version, bluetooth.version) &&
                    Objects.equals(this.type, bluetooth.type)) {
                System.out.println("bluetooth is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Color: " + this.color + ", Version: " + this.version + ", Type: " + this.type;
    }
}
