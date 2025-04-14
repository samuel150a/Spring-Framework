package com.samuel.work;

public class DeviceShelf {
    public DeviceShelf() {
        System.out.println("Running the DeviceShelf constructor");
    }

    public void show(Mouse50 mouse) {
        if (mouse != null) {
            mouse.click();
            if (mouse instanceof GamingMouse50) {
                GamingMouse50 ref = (GamingMouse50) mouse;
                ref.rgbGlow();
            } else {
                System.out.println("Mouse50 is not an instance of GamingMouse50, cannot call cascaded method");
            }
        } else {
            System.out.println("Mouse50 is null");
        }
    }
}
