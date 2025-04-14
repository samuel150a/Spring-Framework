package com.samuel.work;

public class RunnerEraser33 {
    public static void main(String[] args) {
        Eraser33 eraser = new Eraser33();
        eraser.erase(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Eraser33 electricEraser = new ElectricEraser33();
        electricEraser.erase(); // RUNTIME POLYMORPHISM

        ElectricEraser33 ee33 = new ElectricEraser33();
        ee33.erase(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ee33.autoErase();

        EraserBox box = new EraserBox();
        box.show(eraser);
        box.show(ee33);
    }
}
