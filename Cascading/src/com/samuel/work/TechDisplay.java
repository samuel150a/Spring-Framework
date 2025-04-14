package com.samuel.work;

public class TechDisplay {
    public TechDisplay() {
        System.out.println("Running the TechDisplay constructor");
    }

    public void show(Monitor52 monitor) {
        if (monitor != null) {
            monitor.display();
            if (monitor instanceof LedMonitor52) {
                LedMonitor52 ref = (LedMonitor52) monitor;
                ref.adjustBrightness();
            } else {
                System.out.println("Monitor52 is not an instance of LedMonitor52, cannot call cascaded method");
            }
        } else {
            System.out.println("Monitor52 is null");
        }
    }
}
