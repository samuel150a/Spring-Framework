package com.samuel.work;

public class MixingPalette41 extends Palette41 {
    public MixingPalette41() {
        System.out.println("Running in the MixingPalette41 constructor");
    }

    @Override
    public void openPalette() {
        System.out.println("Running public method openPalette by child class");
    }

    public void mixColors() {
        System.out.println("Running in public method mixColors");
    }
}
