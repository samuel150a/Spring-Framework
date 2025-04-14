package com.samuel.work;

public class RunnerPencil31 {
    public static void main(String[] args) {
        Pencil31 pencil = new Pencil31();
        pencil.write(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Pencil31 colorPencil = new ColorPencil31();
        colorPencil.write(); // RUNTIME POLYMORPHISM

        ColorPencil31 cp31 = new ColorPencil31();
        cp31.write(); // NORMALLY ACCESSING CHILD CLASS METHOD
        cp31.draw();

        StationeryBox box = new StationeryBox();
        box.show(pencil);
        box.show(cp31);
    }
}
