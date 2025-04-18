package com.equals.task;

import java.util.Objects;

public class Zip6 {
    private String brand;
    private String color;
    private int size;
    private String type;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSize(int size) {
        this.size = size;
    }

    void setType(String type) {
        this.type = type;
    }

    String getBrand() {
        return brand;
    }

    String getColor() {
        return color;
    }

    int getSize() {
        return size;
    }

    String getType() {
        return type;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Zip6) {
            Zip6 zip = (Zip6) any;
            if (Objects.equals(this.brand, zip.brand) &&
                    Objects.equals(this.color, zip.color) &&
                    Objects.equals(this.size, zip.size) &&
                    Objects.equals(this.type, zip.type)) {
                System.out.println("zip is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Color: " + this.color + ", Size: " + this.size + ", Type: " + this.type;
    }
}
