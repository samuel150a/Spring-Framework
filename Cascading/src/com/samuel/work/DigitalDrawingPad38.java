package com.samuel.work;

public class DigitalDrawingPad38 extends DrawingPad38 {
    public DigitalDrawingPad38() {
        System.out.println("Running in the DigitalDrawingPad38 constructor");
    }

    @Override
    public void draw() {
        System.out.println("Running public method draw by child class");
    }

    public void saveDrawing() {
        System.out.println("Running in public method saveDrawing");
    }
}
