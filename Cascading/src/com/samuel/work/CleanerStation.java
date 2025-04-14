package com.samuel.work;

public class CleanerStation {
    public CleanerStation() {
        System.out.println("Running the CleanerStation constructor");
    }

    public void show(BrushCleaner43 cleaner) {
        if (cleaner != null) {
            cleaner.cleanBrush();
            if (cleaner instanceof SoapCleaner43) {
                SoapCleaner43 ref = (SoapCleaner43) cleaner;
                ref.rinseBrush();
            } else {
                System.out.println("BrushCleaner43 is not an instance of SoapCleaner43, cannot call cascaded method");
            }
        } else {
            System.out.println("BrushCleaner43 is null");
        }
    }
}
