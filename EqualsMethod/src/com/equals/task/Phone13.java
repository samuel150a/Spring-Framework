package com.equals.task;

import java.util.Objects;

public class Phone13 {
    private String brand;
    private String model;
    private int ram;
    private String os;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    void setOs(String os) {
        this.os = os;
    }

    String getBrand() {
        return brand;
    }

    String getModel() {
        return model;
    }

    int getRam() {
        return ram;
    }

    String getOs() {
        return os;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Phone13) {
            Phone13 phone = (Phone13) any;
            if (Objects.equals(this.brand, phone.brand) &&
                    Objects.equals(this.model, phone.model) &&
                    Objects.equals(this.ram, phone.ram) &&
                    Objects.equals(this.os, phone.os)) {
                System.out.println("phone is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Model: " + this.model + ", RAM: " + this.ram + "GB, OS: " + this.os;
    }
}
