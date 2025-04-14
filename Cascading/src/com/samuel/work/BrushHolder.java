package com.samuel.work;

public class BrushHolder {
    public BrushHolder() {
        System.out.println("Running the BrushHolder constructor");
    }

    public void show(PaintBrush40 brush) {
        if (brush != null) {
            brush.paint();
            if (brush instanceof FineTipBrush40) {
                FineTipBrush40 ref = (FineTipBrush40) brush;
                ref.addDetails();
            } else {
                System.out.println("PaintBrush40 is not an instance of FineTipBrush40, cannot call cascaded method");
            }
        } else {
            System.out.println("PaintBrush40 is null");
        }
    }
}
