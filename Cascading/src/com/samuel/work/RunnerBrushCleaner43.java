package com.samuel.work;

public class RunnerBrushCleaner43 {
    public static void main(String[] args) {
        BrushCleaner43 cleaner = new BrushCleaner43();
        cleaner.cleanBrush(); // NORMALLY ACCESSING PARENT CLASS METHOD

        BrushCleaner43 soapCleaner = new SoapCleaner43();
        soapCleaner.cleanBrush(); // RUNTIME POLYMORPHISM

        SoapCleaner43 sc43 = new SoapCleaner43();
        sc43.cleanBrush(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sc43.rinseBrush();

        CleanerStation station = new CleanerStation();
        station.show(cleaner);
        station.show(sc43);
    }
}
