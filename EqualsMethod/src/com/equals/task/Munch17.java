package com.equals.task;

import java.util.Objects;

public class Munch17 {
    private String flavor;
    private int weight;
    private int price;
    private String wrapperColor;

    void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setWrapperColor(String wrapperColor) {
        this.wrapperColor = wrapperColor;
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

    String getWrapperColor() {
        return wrapperColor;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Munch17) {
            Munch17 munch = (Munch17) any;
            if (Objects.equals(this.flavor, munch.flavor) &&
                    Objects.equals(this.weight, munch.weight) &&
                    Objects.equals(this.price, munch.price) &&
                    Objects.equals(this.wrapperColor, munch.wrapperColor)) {
                System.out.println("munch is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Weight: " + this.weight + "g, Price: ₹" + this.price + ", Wrapper Color: " + this.wrapperColor;
    }
}
