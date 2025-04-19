package com.equals.task;

import java.util.Objects;

public class Fuse19 {
    private String material;
    private int currentLimit;
    private String voltageRating;
    private String size;

    void setMaterial(String material) {
        this.material = material;
    }

    void setCurrentLimit(int currentLimit) {
        this.currentLimit = currentLimit;
    }

    void setVoltageRating(String voltageRating) {
        this.voltageRating = voltageRating;
    }

    void setSize(String size) {
        this.size = size;
    }

    String getMaterial() {
        return material;
    }

    int getCurrentLimit() {
        return currentLimit;
    }

    String getVoltageRating() {
        return voltageRating;
    }

    String getSize() {
        return size;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Fuse19) {
            Fuse19 fuse = (Fuse19) any;
            if (Objects.equals(this.material, fuse.material) &&
                    Objects.equals(this.currentLimit, fuse.currentLimit) &&
                    Objects.equals(this.voltageRating, fuse.voltageRating) &&
                    Objects.equals(this.size, fuse.size)) {
                System.out.println("fuse is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Current Limit: " + this.currentLimit + "A, Voltage Rating: " + this.voltageRating + ", Size: " + this.size;
    }
}
