package com.samuel.work;

public class LuxuryPerfume60 extends Perfume60 {
    public LuxuryPerfume60() {
        System.out.println("Running in the LuxuryPerfume60 constructor");
    }

    @Override
    public void spray() {
        System.out.println("Running public method spray by child class");
    }

    public void longLasting() {
        System.out.println("Running in public method longLasting");
    }
}
