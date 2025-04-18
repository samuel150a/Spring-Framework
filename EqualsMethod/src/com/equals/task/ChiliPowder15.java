package com.equals.task;

import java.util.Objects;

public class ChiliPowder15 {
    private String Brand;
    private String Type;
    private int Weight;
    private String Owner;

    public ChiliPowder15(String Brand, String Type, int Weight, String Owner) {
        this.Brand = Brand;
        this.Type = Type;
        this.Weight = Weight;
        this.Owner = Owner;

        System.out.println("Running in the ChiliPowder15 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof ChiliPowder15) {
            ChiliPowder15 chili = (ChiliPowder15) every;
            if (Objects.equals(this.Brand, chili.Brand) &&
                    Objects.equals(this.Type, chili.Type) &&
                    Objects.equals(this.Weight, chili.Weight) &&
                    Objects.equals(this.Owner, chili.Owner)) {
                System.out.println("ChiliPowder15 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Type: " + this.Type + " Weight: " + this.Weight + "g Owner: " + this.Owner;
    }
}
