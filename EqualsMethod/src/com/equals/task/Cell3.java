package com.equals.task;

import java.util.Objects;

public class Cell3 {
    private String Brand;
    private String Model;
    private int Storage;
    private String Owner;

    public Cell3(String Brand, String Model, int Storage, String Owner) {
        this.Brand = Brand;
        this.Model = Model;
        this.Storage = Storage;
        this.Owner = Owner;

        System.out.println("Running in the Cell3 Constructor");
    }

    @Override
    public boolean equals(Object every) {
        if (every != null && every instanceof Cell3) {
            Cell3 cell = (Cell3) every;
            if (Objects.equals(this.Brand, cell.Brand) &&
                    Objects.equals(this.Model, cell.Model) &&
                    Objects.equals(this.Storage, cell.Storage) &&
                    Objects.equals(this.Owner, cell.Owner)) {
                System.out.println("Cell3 is matching");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Brand: " + this.Brand + " Model: " + this.Model + " Storage: " + this.Storage + "GB Owner: " + this.Owner;
    }
}
