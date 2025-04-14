package com.samuel.work;

public class HerbalShampoo77 extends Shampoo77 {
    public HerbalShampoo77() {
        System.out.println("Running in the HerbalShampoo77 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void nourish() {
        System.out.println("Running in public method nourish");
    }
}
