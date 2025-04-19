package com.equals.task;

import java.util.Objects;

public class Jam34 {
    private String flavor;
    private String brand;
    private int weight;
    private boolean sugarFree;

    void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }

    String getFlavor() {
        return flavor;
    }

    String getBrand() {
        return brand;
    }

    int getWeight() {
        return weight;
    }

    boolean getSugarFree() {
        return sugarFree;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Jam34) {
            Jam34 jam = (Jam34) any;
            if (Objects.equals(this.flavor, jam.flavor) &&
                    Objects.equals(this.brand, jam.brand) &&
                    Objects.equals(this.weight, jam.weight) &&
                    Objects.equals(this.sugarFree, jam.sugarFree)) {
                System.out.println("jam is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor +
                ", Brand: " + this.brand +
                ", Weight: " + this.weight + "g" +
                ", Sugar Free: " + this.sugarFree;
    }
}
