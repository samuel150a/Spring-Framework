package com.samuel.work;

public class AdvancedHoverboard20 extends Hoverboard20 {
    public AdvancedHoverboard20() {
        System.out.println("Running in the AdvancedHoverboard20 constructor");
    }

    @Override
    public void ride() {
        System.out.println("Running public method ride by child class");
    }

    public void performTrick() {
        System.out.println("Running in public method performTrick");
    }
}
