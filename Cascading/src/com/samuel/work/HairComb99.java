package com.samuel.work;

public class HairComb99 extends Comb99 {
    public HairComb99() {
        System.out.println("Running in the HairComb99 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void styleHair() {
        System.out.println("Running in public method styleHair");
    }
}
