package com.equals.task;

import java.util.Objects;

public class Nvidia24 {
    private String model;
    private int memory;
    private String series;
    private double clockSpeed;

    void setModel(String model) {
        this.model = model;
    }

    void setMemory(int memory) {
        this.memory = memory;
    }

    void setSeries(String series) {
        this.series = series;
    }

    void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    String getModel() {
        return model;
    }

    int getMemory() {
        return memory;
    }

    String getSeries() {
        return series;
    }

    double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Nvidia24) {
            Nvidia24 nvidia = (Nvidia24) any;
            if (Objects.equals(this.model, nvidia.model) &&
                    Objects.equals(this.memory, nvidia.memory) &&
                    Objects.equals(this.series, nvidia.series) &&
                    Objects.equals(this.clockSpeed, nvidia.clockSpeed)) {
                System.out.println("nvidia is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model: " + this.model +
                ", Memory: " + this.memory + "GB" +
                ", Series: " + this.series +
                ", Clock Speed: " + this.clockSpeed + "GHz";
    }
}
