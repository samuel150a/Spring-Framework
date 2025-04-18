package com.equals.task;

import java.util.Objects;

public class WheyProtein13 {
    private String Brand;
    private String Flavor;
    private int Weight;
    private String Owner;

    public WheyProtein13(String Brand, String Flavor, int Weight, String Owner) {
        this.Brand = Brand;
        this.Flavor = Flavor;
        this.Weight = Weight;
        this.Owner = Owner;

        System.out.println("Running in the WheyProtein13 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof WheyProtein13) {
            WheyProtein13 protein = (WheyProtein13) every;
            if (Objects.equals(this.Brand, protein.Brand) &&
                    Objects.equals(this.Flavor, protein.Flavor) &&
                    Objects.equals(this.Weight, protein.Weight) &&
                    Objects.equals(this.Owner, protein.Owner)) {
                System.out.println("WheyProtein13 is matching");
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
