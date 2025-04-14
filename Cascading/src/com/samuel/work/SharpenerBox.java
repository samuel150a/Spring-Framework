package com.samuel.work;

public class SharpenerBox {
    public SharpenerBox() {
        System.out.println("Running the SharpenerBox constructor");
    }

    public void show(Sharpener34 sharpener) {
        if (sharpener != null) {
            sharpener.sharpen();
            if (sharpener instanceof ElectricSharpener34) {
                ElectricSharpener34 ref = (ElectricSharpener34) sharpener;
                ref.autoSharpen();
            } else {
                System.out.println("Sharpener34 is not an instance of ElectricSharpener34, cannot call cascaded method");
            }
        } else {
            System.out.println("Sharpener34 is null");
        }
    }
}
