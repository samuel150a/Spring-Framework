package com.samuel.work;

public class FurnitureShop {
    public FurnitureShop() {
        System.out.println("Running the FurnitureShop constructor");
    }

    public void show(Table72 table) {
        if (table != null) {
            table.use();
            if (table instanceof WoodenTable72) {
                WoodenTable72 ref = (WoodenTable72) table;
                ref.polish();
            } else {
                System.out.println("Table72 is not an instance of WoodenTable72, cannot call cascaded method");
            }
        } else {
            System.out.println("Table72 is null");
        }
    }
}
