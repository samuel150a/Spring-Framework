package com.samuel.work;

public class ShampooStore {
    public ShampooStore() {
        System.out.println("Running the ShampooStore constructor");
    }

    public void show(Shampoo77 shampoo) {
        if (shampoo != null) {
            shampoo.use();
            if (shampoo instanceof HerbalShampoo77) {
                HerbalShampoo77 ref = (HerbalShampoo77) shampoo;
                ref.nourish();
            } else {
                System.out.println("Shampoo77 is not an instance of HerbalShampoo77, cannot call cascaded method");
            }
        } else {
            System.out.println("Shampoo77 is null");
        }
    }
}
