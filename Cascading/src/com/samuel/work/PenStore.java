package com.samuel.work;

public class PenStore {
    public PenStore() {
        System.out.println("Running the PenStore constructor");
    }

    public void show(Pen4 pen) {
        if (pen != null) {
            pen.write();
            if (pen instanceof InkPen4) {
                InkPen4 ref = (InkPen4) pen;
                ref.refillInk();
            } else {
                System.out.println("Pen4 is not an instance of InkPen4, cannot call cascaded method");
            }
        } else {
            System.out.println("Pen4 is null");
        }
    }
}
