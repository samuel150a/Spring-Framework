package com.equals.task;

import java.util.Objects;

public class Lays16 {
    private String flavor;
    private int weight;
    private int price;
    private String packType;

    void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setPackType(String packType) {
        this.packType = packType;
    }

    String getFlavor() {
        return flavor;
    }

    int getWeight() {
        return weight;
    }

    int getPrice() {
        return price;
    }

    String getPackType() {
        return packType;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Lays16) {
            Lays16 lays = (Lays16) any;
            if (Objects.equals(this.flavor, lays.flavor) &&
                    Objects.equals(this.weight, lays.weight) &&
                    Objects.equals(this.price, lays.price) &&
                    Objects.equals(this.packType, lays.packType)) {
                System.out.println("lays is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Weight: " + this.weight + "g, Price: ₹" + this.price + ", Pack Type: " + this.packType;
    }
}
