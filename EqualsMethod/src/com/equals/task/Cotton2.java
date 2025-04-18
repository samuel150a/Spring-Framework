package com.equals.task;

import java.util.Objects;

public class Cotton2 {
    private String Type;
    private String Color;
    private double Weight;
    private String Supplier;

    public Cotton2(String Type, String Color, double Weight, String Supplier) {
        this.Type = Type;
        this.Color = Color;
        this.Weight = Weight;
        this.Supplier = Supplier;

        System.out.println("Running in the Cotton2 Constructor");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cotton2) {
            Cotton2 cotton = (Cotton2) obj;
            if (Objects.equals(this.Type, cotton.Type) &&
                    Objects.equals(this.Color, cotton.Color) &&
                    Objects.equals(this.Weight, cotton.Weight) &&
                    Objects.equals(this.Supplier, cotton.Supplier)) {
                System.out.println("Cotton2 object is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Type: " + this.Type + "  Color: " + this.Color + "  Weight: " + this.Weight + "kg  Supplier: " + this.Supplier;
    }
}
