package com.samuel.work;

public class DisplayStation {
    public DisplayStation() {
        System.out.println("Running the DisplayStation constructor");
    }

    public void show(Screen54 screen) {
        if (screen != null) {
            screen.display();
            if (screen instanceof LCDScreen54) {
                LCDScreen54 ref = (LCDScreen54) screen;
                ref.adjustBrightness();
            } else {
                System.out.println("Screen54 is not an instance of LCDScreen54, cannot call cascaded method");
            }
        } else {
            System.out.println("Screen54 is null");
        }
    }
}
