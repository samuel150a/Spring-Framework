package com.samuel.work;

public class CoverStore {
    public CoverStore() {
        System.out.println("Running the CoverStore constructor");
    }

    public void show(Cover85 cover) {
        if (cover != null) {
            cover.protect();
            if (cover instanceof BookCover85) {
                BookCover85 ref = (BookCover85) cover;
                ref.design();
            } else {
                System.out.println("Cover85 is not an instance of BookCover85, cannot call cascaded method");
            }
        } else {
            System.out.println("Cover85 is null");
        }
    }
}
