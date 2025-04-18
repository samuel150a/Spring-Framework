package com.equals.task;

import java.util.Objects;

public class GraphicsCard23 {
    private String Brand;
    private String Model;
    private int MemorySize;
    private String Owner;

    public GraphicsCard23(String Brand, String Model, int MemorySize, String Owner) {
        this.Brand = Brand;
        this.Model = Model;
        this.MemorySize = MemorySize;
        this.Owner = Owner;

        System.out.println("Running in the GraphicsCard23 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof GraphicsCard23) {
            GraphicsCard23 card = (GraphicsCard23) every;
            if (Objects.equals(this.Brand, card.Brand) &&
                    Objects.equals(this.Model, card.Model) &&
                    Objects.equals(this.MemorySize, card.MemorySize) &&
                    Objects.equals(this.Owner, card.Owner)) {
                System.out.println("GraphicsCard23 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Model: " + this.Model +
                " Memory Size: " + this.MemorySize + "GB Owner: " + this.Owner;
    }
}
