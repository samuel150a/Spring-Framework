package com.samuel.work;

public class PenStation {
    public PenStation() {
        System.out.println("Running the PenStation constructor");
    }

    public void show(SmartPen49 pen) {
        if (pen != null) {
            pen.write();
            if (pen instanceof SmartPenPro49) {
                SmartPenPro49 ref = (SmartPenPro49) pen;
                ref.syncNotes();
            } else {
                System.out.println("SmartPen49 is not an instance of SmartPenPro49, cannot call cascaded method");
            }
        } else {
            System.out.println("SmartPen49 is null");
        }
    }
}
