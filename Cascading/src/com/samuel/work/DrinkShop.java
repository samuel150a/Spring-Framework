package com.samuel.work;

public class DrinkShop {
    public DrinkShop() {
        System.out.println("Running the DrinkShop constructor");
    }

    public void show(Cococola69 drink) {
        if (drink != null) {
            drink.serve();
            if (drink instanceof ColdCococola69) {
                ColdCococola69 ref = (ColdCococola69) drink;
                ref.addIce();
            } else {
                System.out.println("Cococola69 is not an instance of ColdCococola69, cannot call cascaded method");
            }
        } else {
            System.out.println("Cococola69 is null");
        }
    }
}
