package com.samuel.work;

public class RunnerDrawingPad38 {
    public static void main(String[] args) {
        DrawingPad38 pad = new DrawingPad38();
        pad.draw(); // NORMALLY ACCESSING PARENT CLASS METHOD

        DrawingPad38 digitalPad = new DigitalDrawingPad38();
        digitalPad.draw(); // RUNTIME POLYMORPHISM

        DigitalDrawingPad38 dp38 = new DigitalDrawingPad38();
        dp38.draw(); // NORMALLY ACCESSING CHILD CLASS METHOD
        dp38.saveDrawing();

        PadHolder holder = new PadHolder();
        holder.show(pad);
        holder.show(dp38);
    }
}
