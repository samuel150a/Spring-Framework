package com.samuel.work;

public class TechCenter {
    public TechCenter() {
        System.out.println("Running the TechCenter constructor");
    }

    public void show(SmartTV56 tv) {
        if (tv != null) {
            tv.watch();
            if (tv instanceof OLEDTV56) {
                OLEDTV56 ref = (OLEDTV56) tv;
                ref.displayOLED();
            } else {
                System.out.println("SmartTV56 is not an instance of OLEDTV56, cannot call cascaded method");
            }
        } else {
            System.out.println("SmartTV56 is null");
        }
    }
}
