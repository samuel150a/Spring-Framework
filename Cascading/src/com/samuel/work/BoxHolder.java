package com.samuel.work;

public class BoxHolder {
    public BoxHolder() {
        System.out.println("Running the BoxHolder constructor");
    }

    public void show(ColorBox42 box) {
        if (box != null) {
            box.openBox();
            if (box instanceof WaterColorBox42) {
                WaterColorBox42 ref = (WaterColorBox42) box;
                ref.useBrush();
            } else {
                System.out.println("ColorBox42 is not an instance of WaterColorBox42, cannot call cascaded method");
            }
        } else {
            System.out.println("ColorBox42 is null");
        }
    }
}
