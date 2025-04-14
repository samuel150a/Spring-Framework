package com.samuel.work;

public class SmartChip23 extends Chip23 {
    public SmartChip23() {
        System.out.println("Running in the SmartChip23 constructor");
    }

    @Override
    public void process() {
        System.out.println("Running public method process by child class");
    }

    public void encryptData() {
        System.out.println("Running in public method encryptData");
    }
}
