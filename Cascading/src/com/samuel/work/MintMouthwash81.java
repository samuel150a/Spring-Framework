package com.samuel.work;

public class MintMouthwash81 extends Mouthwash81 {
    public MintMouthwash81() {
        System.out.println("Running in the MintMouthwash81 constructor");
    }

    @Override
    public void use() {
        System.out.println("Running public method use by child class");
    }

    public void freshen() {
        System.out.println("Running in public method freshen");
    }
}
