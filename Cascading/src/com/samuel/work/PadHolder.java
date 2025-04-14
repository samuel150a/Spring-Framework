package com.samuel.work;

public class PadHolder {
    public PadHolder() {
        System.out.println("Running the PadHolder constructor");
    }

    public void show(DrawingPad38 pad) {
        if (pad != null) {
            pad.draw();
            if (pad instanceof DigitalDrawingPad38) {
                DigitalDrawingPad38 ref = (DigitalDrawingPad38) pad;
                ref.saveDrawing();
            } else {
                System.out.println("DrawingPad38 is not an instance of DigitalDrawingPad38, cannot call cascaded method");
            }
        } else {
            System.out.println("DrawingPad38 is null");
        }
    }
}
