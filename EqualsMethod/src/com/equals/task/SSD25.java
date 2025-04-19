package com.equals.task;

import java.util.Objects;

public class SSD25 {
    private String brand;
    private int capacity;
    private String type;
    private double writeSpeed;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setType(String type) {
        this.type = type;
    }

    void setWriteSpeed(double writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    String getBrand() {
        return brand;
    }

    int getCapacity() {
        return capacity;
    }

    String getType() {
        return type;
    }

    double getWriteSpeed() {
        return writeSpeed;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof SSD25) {
            SSD25 ssd = (SSD25) any;
            if (Objects.equals(this.brand, ssd.brand) &&
                    Objects.equals(this.capacity, ssd.capacity) &&
                    Objects.equals(this.type, ssd.type) &&
                    Objects.equals(this.writeSpeed, ssd.writeSpeed)) {
                System.out.println("ssd is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand +
                ", Capacity: " + this.capacity + "GB" +
                ", Type: " + this.type +
                ", Write Speed: " + this.writeSpeed + "MB/s";
    }
}
