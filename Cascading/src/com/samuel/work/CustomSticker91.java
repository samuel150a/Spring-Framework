package com.samuel.work;

public class CustomSticker91 extends Sticker91 {
    public CustomSticker91() {
        System.out.println("Running in the CustomSticker91 constructor");
    }

    @Override
    public void peel() {
        System.out.println("Running public method peel by child class");
    }

    public void design() {
        System.out.println("Running in public method design");
    }
}
