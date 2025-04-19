package com.equals.task;

import java.util.Objects;

public class Tire20 {
    private String brand;
    private String size;
    private String type;
    private int price;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setSize(String size) {
        this.size = size;
    }

    void setType(String type) {
        this.type = type;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getBrand() {
        return brand;
    }

    String getSize() {
        return size;
    }

    String getType() {
        return type;
    }

    int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Tire20) {
            Tire20 tire = (Tire20) any;
            if (Objects.equals(this.brand, tire.brand) &&
                    Objects.equals(this.size, tire.size) &&
                    Objects.equals(this.type, tire.type) &&
                    Objects.equals(this.price, tire.price)) {
                System.out.println("tire is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand +
                ", Size: " + this.size +
                ", Type: " + this.type +
                ", Price: ₹" + this.price;
    }
}
