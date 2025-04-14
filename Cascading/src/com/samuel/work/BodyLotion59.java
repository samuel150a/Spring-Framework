package com.samuel.work;

public class BodyLotion59 extends Lotion59 {
    public BodyLotion59() {
        System.out.println("Running in the BodyLotion59 constructor");
    }

    @Override
    public void apply() {
        System.out.println("Running public method apply by child class");
    }

    public void moisturizeSkin() {
        System.out.println("Running in public method moisturizeSkin");
    }
}
