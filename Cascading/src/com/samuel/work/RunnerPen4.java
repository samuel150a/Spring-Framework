package com.samuel.work;

public class RunnerPen4 {
    public static void main(String[] args) {
        Pen4 pen = new Pen4();
        pen.write(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Pen4 inkPen = new InkPen4();
        inkPen.write(); // RUNTIME POLYMORPHISM

        InkPen4 inkPen4 = new InkPen4();
        inkPen4.write(); // NORMALLY ACCESSING CHILD CLASS METHOD
        inkPen4.refillInk();

        PenStore store = new PenStore();
        store.show(pen);
        store.show(inkPen4);
    }
}
