package com.samuel.work;

public class ArtSketchbook37 extends Sketchbook37 {
    public ArtSketchbook37() {
        System.out.println("Running in the ArtSketchbook37 constructor");
    }

    @Override
    public void sketch() {
        System.out.println("Running public method sketch by child class");
    }

    public void drawArt() {
        System.out.println("Running in public method drawArt");
    }
}
