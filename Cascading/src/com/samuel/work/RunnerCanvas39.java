package com.samuel.work;

public class RunnerCanvas39 {
    public static void main(String[] args) {
        Canvas39 canvas = new Canvas39();
        canvas.paint(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Canvas39 oilCanvas = new OilCanvas39();
        oilCanvas.paint(); // RUNTIME POLYMORPHISM

        OilCanvas39 oc39 = new OilCanvas39();
        oc39.paint(); // NORMALLY ACCESSING CHILD CLASS METHOD
        oc39.blendColors();

        CanvasFrame frame = new CanvasFrame();
        frame.show(canvas);
        frame.show(oc39);
    }
}
