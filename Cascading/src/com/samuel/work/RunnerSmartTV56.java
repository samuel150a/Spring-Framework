package com.samuel.work;

public class RunnerSmartTV56 {
    public static void main(String[] args) {
        SmartTV56 tv = new SmartTV56();
        tv.watch(); // PARENT CLASS METHOD

        SmartTV56 oled = new OLEDTV56();
        oled.watch(); // RUNTIME POLYMORPHISM

        OLEDTV56 oledTv = new OLEDTV56();
        oledTv.watch(); // CHILD CLASS METHOD
        oledTv.displayOLED();

        TechCenter center = new TechCenter();
        center.show(tv);
        center.show(oledTv);
    }
}
