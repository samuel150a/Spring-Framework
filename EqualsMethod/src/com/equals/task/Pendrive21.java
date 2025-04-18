package com.equals.task;

import java.util.Objects;

public class Pendrive21 {
    private String Brand;
    private String StorageCapacity;
    private String Type;
    private String Owner;

    public Pendrive21(String Brand, String StorageCapacity, String Type, String Owner) {
        this.Brand = Brand;
        this.StorageCapacity = StorageCapacity;
        this.Type = Type;
        this.Owner = Owner;

        System.out.println("Running in the Pendrive21 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Pendrive21) {
            Pendrive21 pendrive = (Pendrive21) every;
            if (Objects.equals(this.Brand, pendrive.Brand) &&
                    Objects.equals(this.StorageCapacity, pendrive.StorageCapacity) &&
                    Objects.equals(this.Type, pendrive.Type) &&
                    Objects.equals(this.Owner, pendrive.Owner)) {
                System.out.println("Pendrive21 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Storage Capacity: " + this.StorageCapacity + " Type: " + this.Type + " Owner: " + this.Owner;
    }
}
