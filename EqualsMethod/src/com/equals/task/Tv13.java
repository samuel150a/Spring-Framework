package com.equals.task;

import java.util.Objects;

public class Tv13 {
    private String brand;
    private String screenType;
    private int size;
    private String resolution;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    void setSize(int size) {
        this.size = size;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    String getBrand() {
        return brand;
    }

    String getScreenType() {
        return screenType;
    }

    int getSize() {
        return size;
    }

    String getResolution() {
        return resolution;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Tv13) {
            Tv13 tv = (Tv13) any;
            if (Objects.equals(this.brand, tv.brand) &&
                    Objects.equals(this.screenType, tv.screenType) &&
                    Objects.equals(this.size, tv.size) &&
                    Objects.equals(this.resolution, tv.resolution)) {
                System.out.println("tv is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Screen Type: " + this.screenType + ", Size: " + this.size + " inches, Resolution: " + this.resolution;
    }
}
