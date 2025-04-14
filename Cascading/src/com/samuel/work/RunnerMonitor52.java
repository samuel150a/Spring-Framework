package com.samuel.work;

public class RunnerMonitor52 {
    public static void main(String[] args) {
        Monitor52 monitor = new Monitor52();
        monitor.display(); // PARENT CLASS METHOD

        Monitor52 led = new LedMonitor52();
        led.display(); // RUNTIME POLYMORPHISM

        LedMonitor52 ledMonitor = new LedMonitor52();
        ledMonitor.display(); // CHILD CLASS METHOD
        ledMonitor.adjustBrightness();

        TechDisplay display = new TechDisplay();
        display.show(monitor);
        display.show(ledMonitor);
    }
}
