package com.samuel.work;

public class CottonTowel76 extends Towel76 {
    public CottonTowel76() {
        System.out.println("Running in the CottonTowel76 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void absorb() {
        System.out.println("Running in public method absorb");
    }
}
