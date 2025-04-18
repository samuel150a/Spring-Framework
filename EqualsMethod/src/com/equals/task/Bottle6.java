package com.equals.task;

import java.util.Objects;

public class Bottle6 {
    private String Brand;
    private String Color;
    private int Capacity;
    private String Owner;

    public Bottle6(String Brand, String Color, int Capacity, String Owner) {
        this.Brand = Brand;
        this.Color = Color;
        this.Capacity = Capacity;
        this.Owner = Owner;

        System.out.println("Running in the Bottle6 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Bottle6) {
            Bottle6 bottle = (Bottle6) every;
            if (Objects.equals(this.Brand, bottle.Brand) &&
                    Objects.equals(this.Color, bottle.Color) &&
                    Objects.equals(this.Capacity, bottle.Capacity) &&
                    Objects.equals(this.Owner, bottle.Owner)) {
                System.out.println("Bottle6 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Color: " + this.Color + " Capacity: " + this.Capacity + "ml Owner: " + this.Owner;
    }
}
