package com.samuel.work;

public class ToothpasteStore {
    public ToothpasteStore() {
        System.out.println("Running the ToothpasteStore constructor");
    }

    public void show(Toothpaste82 toothpaste) {
        if (toothpaste != null) {
            toothpaste.use();
            if (toothpaste instanceof WhiteningToothpaste82) {
                WhiteningToothpaste82 ref = (WhiteningToothpaste82) toothpaste;
                ref.whiten();
            } else {
                System.out.println("Toothpaste82 is not an instance of WhiteningToothpaste82, cannot call cascaded method");
            }
        } else {
            System.out.println("Toothpaste82 is null");
        }
    }
}
