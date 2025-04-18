package com.equals.task;

import java.util.Objects;

public class WashingMachine16 {
    private String Brand;
    private String Type;
    private int Capacity;
    private String Owner;

    public WashingMachine16(String Brand, String Type, int Capacity, String Owner) {
        this.Brand = Brand;
        this.Type = Type;
        this.Capacity = Capacity;
        this.Owner = Owner;

        System.out.println("Running in the WashingMachine16 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof WashingMachine16) {
            WashingMachine16 machine = (WashingMachine16) every;
            if (Objects.equals(this.Brand, machine.Brand) &&
                    Objects.equals(this.Type, machine.Type) &&
                    Objects.equals(this.Capacity, machine.Capacity) &&
                    Objects.equals(this.Owner, machine.Owner)) {
                System.out.println("WashingMachine16 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Type: " + this.Type + " Capacity: " + this.Capacity + "kg Owner: " + this.Owner;
    }
}
