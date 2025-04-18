package com.equals.task;

import java.util.Objects;

public class TeaPowder14 {
    private String Brand;
    private String Flavor;
    private int Weight;
    private String Owner;

    public TeaPowder14(String Brand, String Flavor, int Weight, String Owner) {
        this.Brand = Brand;
        this.Flavor = Flavor;
        this.Weight = Weight;
        this.Owner = Owner;

        System.out.println("Running in the TeaPowder14 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof TeaPowder14) {
            TeaPowder14 tea = (TeaPowder14) every;
            if (Objects.equals(this.Brand, tea.Brand) &&
                    Objects.equals(this.Flavor, tea.Flavor) &&
                    Objects.equals(this.Weight, tea.Weight) &&
                    Objects.equals(this.Owner, tea.Owner)) {
                System.out.println("TeaPowder14 is matching");
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
