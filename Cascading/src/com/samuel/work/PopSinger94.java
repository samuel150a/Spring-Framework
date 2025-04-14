package com.samuel.work;

public class PopSinger94 extends Singer94 {
    public PopSinger94() {
        System.out.println("Running in the PopSinger94 constructor");
    }

    @Override
    public void sing() {
        System.out.println("Running public method sing by child class");
    }

    public void perform() {
        System.out.println("Running in public method perform");
    }
}
