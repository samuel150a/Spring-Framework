package com.equals.task;

import java.util.Objects;

public class FryPan17 {
    private String Brand;
    private String Material;
    private int Diameter;
    private String Owner;

    public FryPan17(String Brand, String Material, int Diameter, String Owner) {
        this.Brand = Brand;
        this.Material = Material;
        this.Diameter = Diameter;
        this.Owner = Owner;

        System.out.println("Running in the FryPan17 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof FryPan17) {
            FryPan17 fryPan = (FryPan17) every;
            if (Objects.equals(this.Brand, fryPan.Brand) &&
                    Objects.equals(this.Material, fryPan.Material) &&
                    Objects.equals(this.Diameter, fryPan.Diameter) &&
                    Objects.equals(this.Owner, fryPan.Owner)) {
                System.out.println("FryPan17 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Material: " + this.Material + " Diameter: " + this.Diameter + "cm Owner: " + this.Owner;
    }
}
