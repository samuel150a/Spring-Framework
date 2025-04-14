package com.samuel.work;

public class RunnerBinder32 {
    public static void main(String[] args) {
        Binder32 binder = new Binder32();
        binder.organize(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Binder32 ringBinder = new RingBinder32();
        ringBinder.organize(); // RUNTIME POLYMORPHISM

        RingBinder32 rb32 = new RingBinder32();
        rb32.organize(); // NORMALLY ACCESSING CHILD CLASS METHOD
        rb32.addPages();

        BinderShelf shelf = new BinderShelf();
        shelf.show(binder);
        shelf.show(rb32);
    }
}

