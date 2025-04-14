package com.samuel.work;

public class RunnerWater97 {
    public static void main(String[] args) {
        Water97 water = new Water97();
        water.drink(); // PARENT CLASS METHOD

        Water97 filteredWater = new FilteredWater97();
        filteredWater.drink(); // RUNTIME POLYMORPHISM

        FilteredWater97 fw = new FilteredWater97();
        fw.drink(); // CHILD CLASS METHOD
        fw.filter();

        WaterStore store = new WaterStore();
        store.show(water);
        store.show(fw);
    }
}
