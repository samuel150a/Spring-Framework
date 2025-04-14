package com.samuel.work;

public class WaterStore {
    public WaterStore() {
        System.out.println("Running the WaterStore constructor");
    }

    public void show(Water97 water) {
        if (water != null) {
            water.drink();
            if (water instanceof FilteredWater97) {
                FilteredWater97 ref = (FilteredWater97) water;
                ref.filter();
            } else {
                System.out.println("Water97 is not an instance of FilteredWater97, cannot call cascaded method");
            }
        } else {
            System.out.println("Water97 is null");
        }
    }
}
