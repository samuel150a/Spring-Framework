package com.equals.task;

import java.util.Objects;

public class Laptop {
    private String brand;
    private String color;
    private int ram;
    private String owner;



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Laptop) {
            Laptop laptop = (Laptop) every;
            if (Objects.equals(this.color, laptop.color) &&
                    Objects.equals(this.brand, laptop.brand) &&
                    Objects.equals(this.ram, laptop.ram) &&
                    Objects.equals(this.owner, laptop.owner)) {

                System.out.println("Laptop is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + " Color: " + this.color +
                " RAM: " + this.ram + "GB Owner: " + this.owner;
    }
}


