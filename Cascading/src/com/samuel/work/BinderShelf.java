package com.samuel.work;

public class BinderShelf {
    public BinderShelf() {
        System.out.println("Running the BinderShelf constructor");
    }

    public void show(Binder32 binder) {
        if (binder != null) {
            binder.organize();
            if (binder instanceof RingBinder32) {
                RingBinder32 ref = (RingBinder32) binder;
                ref.addPages();
            } else {
                System.out.println("Binder32 is not an instance of RingBinder32, cannot call cascaded method");
            }
        } else {
            System.out.println("Binder32 is null");
        }
    }
}
