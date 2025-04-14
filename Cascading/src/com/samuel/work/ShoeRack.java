package com.samuel.work;

public class ShoeRack {
    public ShoeRack() {
        System.out.println("Running the ShoeRack constructor");
    }

    public void show(Slipper44 slipper) {
        if (slipper != null) {
            slipper.wear();
            if (slipper instanceof RubberSlipper44) {
                RubberSlipper44 ref = (RubberSlipper44) slipper;
                ref.wash();
            } else {
                System.out.println("Slipper44 is not an instance of RubberSlipper44, cannot call cascaded method");
            }
        } else {
            System.out.println("Slipper44 is null");
        }
    }
}
