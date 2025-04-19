package com.equals.task;

import java.util.Objects;

public class GpuCooler26 {
    private String brand;
    private String type;
    private int fanCount;
    private double noiseLevel;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setType(String type) {
        this.type = type;
    }

    void setFanCount(int fanCount) {
        this.fanCount = fanCount;
    }

    void setNoiseLevel(double noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    String getBrand() {
        return brand;
    }

    String getType() {
        return type;
    }

    int getFanCount() {
        return fanCount;
    }

    double getNoiseLevel() {
        return noiseLevel;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof GpuCooler26) {
            GpuCooler26 cooler = (GpuCooler26) any;
            if (Objects.equals(this.brand, cooler.brand) &&
                    Objects.equals(this.type, cooler.type) &&
                    Objects.equals(this.fanCount, cooler.fanCount) &&
                    Objects.equals(this.noiseLevel, cooler.noiseLevel)) {
                System.out.println("gpucooler is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand +
                ", Type: " + this.type +
                ", Fan Count: " + this.fanCount +
                ", Noise Level: " + this.noiseLevel + " dB";
    }
}
