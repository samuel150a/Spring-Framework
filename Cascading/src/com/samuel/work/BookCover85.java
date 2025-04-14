package com.samuel.work;

public class BookCover85 extends Cover85 {
    public BookCover85() {
        System.out.println("Running in the BookCover85 constructor");
    }

    @Override
    public void protect() {
        System.out.println("Running public method protect by child class");
    }

    public void design() {
        System.out.println("Running in public method design");
    }
}
