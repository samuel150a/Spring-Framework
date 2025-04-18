package com.equals.task;

import java.util.Objects;

public class Battery9 {
    private String brand;
    private String type;
    private int capacity;
    private String voltage;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setType(String type) {
        this.type = type;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    String getBrand() {
        return brand;
    }

    String getType() {
        return type;
    }

    int getCapacity() {
        return capacity;
    }

    String getVoltage() {
        return voltage;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Battery9) {
            Battery9 battery = (Battery9) any;
            if (Objects.equals(this.brand, battery.brand) &&
                    Objects.equals(this.type, battery.type) &&
                    Objects.equals(this.capacity, battery.capacity) &&
                    Objects.equals(this.voltage, battery.voltage)) {
                System.out.println("battery is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Capacity: " + this.capacity + "mAh, Voltage: " + this.voltage;
    }
}
