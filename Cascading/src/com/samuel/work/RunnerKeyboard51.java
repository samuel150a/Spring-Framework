package com.samuel.work;

public class RunnerKeyboard51 {
    public static void main(String[] args) {
        Keyboard51 keyboard = new Keyboard51();
        keyboard.type(); // PARENT CLASS METHOD

        Keyboard51 mech = new MechanicalKeyboard51();
        mech.type(); // RUNTIME POLYMORPHISM

        MechanicalKeyboard51 mechKey = new MechanicalKeyboard51();
        mechKey.type(); // CHILD CLASS METHOD
        mechKey.toggleRGB();

        DeviceHub hub = new DeviceHub();
        hub.show(keyboard);
        hub.show(mechKey);
    }
}
