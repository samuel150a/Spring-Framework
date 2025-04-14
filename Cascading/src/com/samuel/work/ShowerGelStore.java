package com.samuel.work;

public class ShowerGelStore {
    public ShowerGelStore() {
        System.out.println("Running the ShowerGelStore constructor");
    }

    public void show(ShowerGel79 showerGel) {
        if (showerGel != null) {
            showerGel.use();
            if (showerGel instanceof AloeShowerGel79) {
                AloeShowerGel79 ref = (AloeShowerGel79) showerGel;
                ref.hydrate();
            } else {
                System.out.println("ShowerGel79 is not an instance of AloeShowerGel79, cannot call cascaded method");
            }
        } else {
            System.out.println("ShowerGel79 is null");
        }
    }
}
