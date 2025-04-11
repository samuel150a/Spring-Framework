package com.sam.task;

public class RunnerSoil66 {
    public static void main(String[] args) {
        Soil66 soil = new Soil66();
        soil.provideNutrients();

        Soil66 s = new Plant();
        s.provideNutrients();

        Plant plant = new Plant();
        plant.grow();
        plant.photosynthesize();
    }
}
