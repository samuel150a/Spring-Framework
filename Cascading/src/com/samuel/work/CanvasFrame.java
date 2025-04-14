package com.samuel.work;

public class CanvasFrame {
    public CanvasFrame() {
        System.out.println("Running the CanvasFrame constructor");
    }

    public void show(Canvas39 canvas) {
        if (canvas != null) {
            canvas.paint();
            if (canvas instanceof OilCanvas39) {
                OilCanvas39 ref = (OilCanvas39) canvas;
                ref.blendColors();
            } else {
                System.out.println("Canvas39 is not an instance of OilCanvas39, cannot call cascaded method");
            }
        } else {
            System.out.println("Canvas39 is null");
        }
    }
}
