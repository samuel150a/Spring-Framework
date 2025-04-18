package com.equals.task;

import java.util.Objects;

public class Furniture5 {
    private String material;
    private String color;
    private int price;
    private String type;

    void setMaterial(String material) {
        this.material = material;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setType(String type) {
        this.type = type;
    }

    String getMaterial() {
        return material;
    }

    String getColor() {
        return color;
    }

    int getPrice() {
        return price;
    }

    String getType() {
        return type;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Furniture5) {
            Furniture5 furniture = (Furniture5) any;
            if (Objects.equals(this.material, furniture.material) &&
                    Objects.equals(this.color, furniture.color) &&
                    Objects.equals(this.price, furniture.price) &&
                    Objects.equals(this.type, furniture.type)) {
                System.out.println("furniture is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Material: " + this.material + ", Color: " + this.color + ", Price: " + this.price + ", Type: " + this.type;
    }
}
