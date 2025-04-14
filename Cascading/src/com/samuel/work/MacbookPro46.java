package com.samuel.work;

public class MacbookPro46 extends Macbook46 {
    public MacbookPro46() {
        System.out.println("Running in the MacbookPro46 constructor");
    }

    @Override
    public void bootUp() {
        System.out.println("Running public method bootUp by child class");
    }

    public void renderVideo() {
        System.out.println("Running in public method renderVideo");
    }
}
