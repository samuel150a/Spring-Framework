package com.equals.task;

import java.util.Objects;

public class Processor21 {
    private String brand;
    private String model;
    private int cores;
    private double frequency;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setCores(int cores) {
        this.cores = cores;
    }

    void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getCores() {
        return cores;
    }

    double getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Processor21) {
            Processor21 processor = (Processor21) any;
            if (Objects.equals(this.brand, processor.brand) &&
                    Objects.equals(this.model, processor.model) &&
                    Objects.equals(this.cores, processor.cores) &&
                    Objects.equals(this.frequency, processor.frequency)) {
                System.out.println("processor is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand +
                ", Model: " + this.model +
                ", Cores: " + this.cores +
                ", Frequency: " + this.frequency + "GHz";
    }
}
