package com.equals.task;

import java.util.Objects;

public class Locket11 {
    private String Brand;
    private String Material;
    private String Shape;
    private String Owner;

    public Locket11(String Brand, String Material, String Shape, String Owner) {
        this.Brand = Brand;
        this.Material = Material;
        this.Shape = Shape;
        this.Owner = Owner;

        System.out.println("Running in the Locket11 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Locket11) {
            Locket11 locket = (Locket11) every;
            if (Objects.equals(this.Brand, locket.Brand) &&
                    Objects.equals(this.Material, locket.Material) &&
                    Objects.equals(this.Shape, locket.Shape) &&
                    Objects.equals(this.Owner, locket.Owner)) {
                System.out.println("Locket11 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Material: " + this.Material + " Shape: " + this.Shape + " Owner: " + this.Owner;
    }
}
