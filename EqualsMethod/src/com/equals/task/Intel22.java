package com.equals.task;

import java.util.Objects;

public class Intel22 {
    private String generation;
    private String series;
    private int cores;
    private double speed;

    void setGeneration(String generation) {
        this.generation = generation;
    }

    void setSeries(String series) {
        this.series = series;
    }

    void setCores(int cores) {
        this.cores = cores;
    }

    void setSpeed(double speed) {
        this.speed = speed;
    }

    String getGeneration() {
        return generation;
    }

    String getSeries() {
        return series;
    }

    int getCores() {
        return cores;
    }

    double getSpeed() {
        return speed;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Intel22) {
            Intel22 intel = (Intel22) any;
            if (Objects.equals(this.generation, intel.generation) &&
                    Objects.equals(this.series, intel.series) &&
                    Objects.equals(this.cores, intel.cores) &&
                    Objects.equals(this.speed, intel.speed)) {
                System.out.println("intel is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Generation: " + this.generation +
                ", Series: " + this.series +
                ", Cores: " + this.cores +
                ", Speed: " + this.speed + "GHz";
    }
}
