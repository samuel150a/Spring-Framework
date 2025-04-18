package com.equals.task;

import java.util.Objects;

public class Blender18 {
    private String BrandName;
    private String BladeMaterial;
    private int Power;
    private String OwnerName;

    public Blender18(String BrandName, String BladeMaterial, int Power, String OwnerName) {
        this.BrandName = BrandName;
        this.BladeMaterial = BladeMaterial;
        this.Power = Power;
        this.OwnerName = OwnerName;

        System.out.println("Running in the Blender18 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Blender18) {
            Blender18 blender = (Blender18) every;
            if (Objects.equals(this.BrandName, blender.BrandName) &&
                    Objects.equals(this.BladeMaterial, blender.BladeMaterial) &&
                    Objects.equals(this.Power, blender.Power) &&
                    Objects.equals(this.OwnerName, blender.OwnerName)) {
                System.out.println("Blender18 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand Name: " + this.BrandName + " Blade Material: " + this.BladeMaterial +
                " Power: " + this.Power + "W Owner: " + this.OwnerName;
    }
}
