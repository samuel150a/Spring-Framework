package com.samuel.work;

public class ShoeStore {
    public ShoeStore() {
        System.out.println("Running the ShoeStore constructor");
    }

    public void show(Shoe9 shoe) {
        if (shoe != null) {
            shoe.wear();
            if (shoe instanceof SportsShoe9) {
                SportsShoe9 ref = (SportsShoe9) shoe;
                ref.runFast();
            } else {
                System.out.println("Shoe9 is not an instance of SportsShoe9, cannot call cascaded method");
            }
        } else {
            System.out.println("Shoe9 is null");
        }
    }
}
