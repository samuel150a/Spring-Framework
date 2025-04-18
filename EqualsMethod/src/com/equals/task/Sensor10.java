package com.equals.task;

import java.util.Objects;

public class Sensor10 {
    private String name;
    private String category;
    private int range;
    private String unit;

    void setName(String name) {
        this.name = name;
    }

    void setCategory(String category) {
        this.category = category;
    }

    void setRange(int range) {
        this.range = range;
    }

    void setUnit(String unit) {
        this.unit = unit;
    }

    String getName() {
        return name;
    }

    String getCategory() {
        return category;
    }

    int getRange() {
        return range;
    }

    String getUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Sensor10) {
            Sensor10 sensor = (Sensor10) any;
            if (Objects.equals(this.name, sensor.name) &&
                    Objects.equals(this.category, sensor.category) &&
                    Objects.equals(this.range, sensor.range) &&
                    Objects.equals(this.unit, sensor.unit)) {
                System.out.println("sensor is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Category: " + this.category + ", Range: " + this.range + ", Unit: " + this.unit;
    }
}
