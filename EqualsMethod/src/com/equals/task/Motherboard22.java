package com.equals.task;

import java.util.Objects;

public class Motherboard22 {
    private String Brand;
    private String Chipset;
    private String FormFactor;
    private String Owner;

    public Motherboard22(String Brand, String Chipset, String FormFactor, String Owner) {
        this.Brand = Brand;
        this.Chipset = Chipset;
        this.FormFactor = FormFactor;
        this.Owner = Owner;

        System.out.println("Running in the Motherboard22 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Motherboard22) {
            Motherboard22 motherboard = (Motherboard22) every;
            if (Objects.equals(this.Brand, motherboard.Brand) &&
                    Objects.equals(this.Chipset, motherboard.Chipset) &&
                    Objects.equals(this.FormFactor, motherboard.FormFactor) &&
                    Objects.equals(this.Owner, motherboard.Owner)) {
                System.out.println("Motherboard22 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Chipset: " + this.Chipset + " Form Factor: " + this.FormFactor + " Owner: " + this.Owner;
    }
}
