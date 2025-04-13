package com.samuel.work;

public class RunnerFan7 {
    public static void main(String[] args) {
        Fan7 fan = new Fan7();
        fan.rotate(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Fan7 ceilingFan = new CeilingFan7();
        ceilingFan.rotate(); // RUNTIME POLYMORPHISM

        CeilingFan7 cf7 = new CeilingFan7();
        cf7.rotate(); // NORMALLY ACCESSING CHILD CLASS METHOD
        cf7.controlSpeed();

        FanShop shop = new FanShop();
        shop.show(fan);
        shop.show(cf7);
    }
}
