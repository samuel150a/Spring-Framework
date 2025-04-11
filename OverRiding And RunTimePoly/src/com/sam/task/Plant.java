package com.sam.task;

public class Plant extends Soil66 {
    public Plant() {
        System.out.println("Running in the Plant constructor");
    }

    @Override
    public void provideNutrients() {
        System.out.println("Running in the overridden method provideNutrients from Plant");
    }

    public void grow() {
        System.out.println("Running in the public method grow");
    }

    public void photosynthesize() {
        System.out.println("Running in the public method photosynthesize");
    }
}
