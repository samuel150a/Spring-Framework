package com.samuel.work;

public class EraserBox {
    public EraserBox() {
        System.out.println("Running the EraserBox constructor");
    }

    public void show(Eraser33 eraser) {
        if (eraser != null) {
            eraser.erase();
            if (eraser instanceof ElectricEraser33) {
                ElectricEraser33 ref = (ElectricEraser33) eraser;
                ref.autoErase();
            } else {
                System.out.println("Eraser33 is not an instance of ElectricEraser33, cannot call cascaded method");
            }
        } else {
            System.out.println("Eraser33 is null");
        }
    }
}
