package com.sam.task;

public class RunnerClouds84 {
    public static void main(String[] args) {
        Clouds84 cloud = new Clouds84();
        cloud.floatInSky();

        Clouds84 c = new Rain1();
        c.floatInSky();

        Rain1 rain = new Rain1();
        rain.startDrizzle();
        rain.pourHeavyRain();
    }
}
