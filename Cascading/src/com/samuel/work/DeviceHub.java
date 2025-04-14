package com.samuel.work;

public class DeviceHub {
    public DeviceHub() {
        System.out.println("Running the DeviceHub constructor");
    }

    public void show(Keyboard51 keyboard) {
        if (keyboard != null) {
            keyboard.type();
            if (keyboard instanceof MechanicalKeyboard51) {
                MechanicalKeyboard51 ref = (MechanicalKeyboard51) keyboard;
                ref.toggleRGB();
            } else {
                System.out.println("Keyboard51 is not an instance of MechanicalKeyboard51, cannot call cascaded method");
            }
        } else {
            System.out.println("Keyboard51 is null");
        }
    }
}
