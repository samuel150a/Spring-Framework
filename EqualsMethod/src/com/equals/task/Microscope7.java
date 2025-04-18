package com.equals.task;

import java.util.Objects;

public class Microscope7 {
    private String Brand;
    private String Type;
    private int Magnification;
    private String Owner;

    public Microscope7(String Brand, String Type, int Magnification, String Owner) {
        this.Brand = Brand;
        this.Type = Type;
        this.Magnification = Magnification;
        this.Owner = Owner;

        System.out.println("Running in the Microscope7 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Microscope7) {
            Microscope7 microscope = (Microscope7) every;
            if (Objects.equals(this.Brand, microscope.Brand) &&
                    Objects.equals(this.Type, microscope.Type) &&
                    Objects.equals(this.Magnification, microscope.Magnification) &&
                    Objects.equals(this.Owner, microscope.Owner)) {
                System.out.println("Microscope7 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Type: " + this.Type + " Magnification: " + this.Magnification + "X Owner: " + this.Owner;
    }
}
