package com.samuel.work;

public class SchoolBag2 extends Bag2 {
    public SchoolBag2() {
        System.out.println("Running in the SchoolBag2 constructor");
    }

    @Override
    public void useBag() {
        System.out.println("Running public method useBag by child class");
    }

    public void carryBooks() {
        System.out.println("Running in public method carryBooks");
    }
}
