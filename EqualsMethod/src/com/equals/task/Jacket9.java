package com.equals.task;

import java.util.Objects;

public class Jacket9 {
    private String Brand;
    private String Color;
    private String Size;
    private String Owner;

    public Jacket9(String Brand, String Color, String Size, String Owner) {
        this.Brand = Brand;
        this.Color = Color;
        this.Size = Size;
        this.Owner = Owner;

        System.out.println("Running in the Jacket9 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Jacket9) {
            Jacket9 jacket = (Jacket9) every;
            if (Objects.equals(this.Brand, jacket.Brand) &&
                    Objects.equals(this.Color, jacket.Color) &&
                    Objects.equals(this.Size, jacket.Size) &&
                    Objects.equals(this.Owner, jacket.Owner)) {
                System.out.println("Jacket9 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Color: " + this.Color + " Size: " + this.Size + " Owner: " + this.Owner;
    }
}
