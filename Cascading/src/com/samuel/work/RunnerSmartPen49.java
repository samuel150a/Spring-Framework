package com.samuel.work;

public class RunnerSmartPen49 {
    public static void main(String[] args) {
        SmartPen49 pen = new SmartPen49();
        pen.write(); // PARENT CLASS METHOD

        SmartPen49 proPen = new SmartPenPro49();
        proPen.write(); // RUNTIME POLYMORPHISM

        SmartPenPro49 spPro = new SmartPenPro49();
        spPro.write(); // CHILD CLASS METHOD
        spPro.syncNotes();

        PenStation station = new PenStation();
        station.show(pen);
        station.show(spPro);
    }
}
