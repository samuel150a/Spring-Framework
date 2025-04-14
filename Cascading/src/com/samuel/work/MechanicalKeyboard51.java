package com.samuel.work;

public class MechanicalKeyboard51 extends Keyboard51 {
    public MechanicalKeyboard51() {
        System.out.println("Running in the MechanicalKeyboard51 constructor");
    }

    @Override
    public void type() {
        System.out.println("Running public method type by child class");
    }

    public void toggleRGB() {
        System.out.println("Running in public method toggleRGB");
    }
}
