package com.sam.task;

public class RunnerCloud42 {
    public static void main(String[] args) {
        Cloud42 cloud = new Cloud42();
        cloud.floatInSky();

        Cloud42 c = new Rain();
        c.floatInSky();

        Rain rain = new Rain();
        rain.fall();
        rain.waterPlants();
    }
}
