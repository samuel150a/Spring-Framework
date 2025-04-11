package com.sam.task;

public class Rain extends Cloud42 {
    public Rain() {
        System.out.println("Running in the Rain constructor");
    }

    @Override
    public void floatInSky() {
        System.out.println("Running in the public method floatInSky after implementation");
    }

    public void fall() {
        System.out.println("Running in the public method fall");
    }

    public void waterPlants() {
        System.out.println("Running in the public method waterPlants");
    }
}
