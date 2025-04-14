package com.samuel.work;

public class RunnerTable72 {
    public static void main(String[] args) {
        Table72 table = new Table72();
        table.use(); // PARENT CLASS METHOD

        Table72 woodenTable = new WoodenTable72();
        woodenTable.use(); // RUNTIME POLYMORPHISM

        WoodenTable72 wt = new WoodenTable72();
        wt.use(); // CHILD CLASS METHOD
        wt.polish();

        FurnitureShop shop = new FurnitureShop();
        shop.show(table);
        shop.show(wt);
    }
}
