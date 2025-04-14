package com.samuel.work;

public class RunnerHoverboard20 {
    public static void main(String[] args) {
        Hoverboard20 hover = new Hoverboard20();
        hover.ride(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Hoverboard20 advHover = new AdvancedHoverboard20();
        advHover.ride(); // RUNTIME POLYMORPHISM

        AdvancedHoverboard20 ah20 = new AdvancedHoverboard20();
        ah20.ride(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ah20.performTrick();

        HoverPark park = new HoverPark();
        park.show(hover);
        park.show(ah20);
    }
}
