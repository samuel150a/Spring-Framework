package com.samuel.work;

public class FanShop {
    public FanShop() {
        System.out.println("Running the FanShop constructor");
    }

    public void show(Fan7 fan) {
        if (fan != null) {
            fan.rotate();
            if (fan instanceof CeilingFan7) {
                CeilingFan7 ref = (CeilingFan7) fan;
                ref.controlSpeed();
            } else {
                System.out.println("Fan7 is not an instance of CeilingFan7, cannot call cascaded method");
            }
        } else {
            System.out.println("Fan7 is null");
        }
    }
}
