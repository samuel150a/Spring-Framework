package com.samuel.work;

public class HoverPark {
    public HoverPark() {
        System.out.println("Running the HoverPark constructor");
    }

    public void show(Hoverboard20 hover) {
        if (hover != null) {
            hover.ride();
            if (hover instanceof AdvancedHoverboard20) {
                AdvancedHoverboard20 ref = (AdvancedHoverboard20) hover;
                ref.performTrick();
            } else {
                System.out.println("Hoverboard20 is not an instance of AdvancedHoverboard20, cannot call cascaded method");
            }
        } else {
            System.out.println("Hoverboard20 is null");
        }
    }
}
