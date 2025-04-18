package com.equals.task;

import java.util.Objects;

public class Mouse8 {
    private String Brand;
    private String Type;
    private int DPI;
    private String Owner;

    public Mouse8(String Brand, String Type, int DPI, String Owner) {
        this.Brand = Brand;
        this.Type = Type;
        this.DPI = DPI;
        this.Owner = Owner;

        System.out.println("Running in the Mouse8 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Mouse8) {
            Mouse8 mouse = (Mouse8) every;
            if (Objects.equals(this.Brand, mouse.Brand) &&
                    Objects.equals(this.Type, mouse.Type) &&
                    Objects.equals(this.DPI, mouse.DPI) &&
                    Objects.equals(this.Owner, mouse.Owner)) {
                System.out.println("Mouse8 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Type: " + this.Type + " DPI: " + this.DPI + " Owner: " + this.Owner;
    }
}
