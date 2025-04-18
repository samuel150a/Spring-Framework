package com.equals.task;

import java.util.Objects;

public class Horlicks12 {
    private String Brand;
    private String Flavor;
    private int Weight;
    private String Owner;

    public Horlicks12(String Brand, String Flavor, int Weight, String Owner) {
        this.Brand = Brand;
        this.Flavor = Flavor;
        this.Weight = Weight;
        this.Owner = Owner;

        System.out.println("Running in the Horlicks12 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Horlicks12) {
            Horlicks12 horlicks = (Horlicks12) every;
            if (Objects.equals(this.Brand, horlicks.Brand) &&
                    Objects.equals(this.Flavor, horlicks.Flavor) &&
                    Objects.equals(this.Weight, horlicks.Weight) &&
                    Objects.equals(this.Owner, horlicks.Owner)) {
                System.out.println("Horlicks12 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Flavor: " + this.Flavor + " Weight: " + this.Weight + "g Owner: " + this.Owner;
    }
}
