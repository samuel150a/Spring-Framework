package com.samuel.work;

public class PizzaShop {
    public PizzaShop() {
        System.out.println("Running the PizzaShop constructor");
    }

    public void show(Pizza71 pizza) {
        if (pizza != null) {
            pizza.bake();
            if (pizza instanceof CheesePizza71) {
                CheesePizza71 ref = (CheesePizza71) pizza;
                ref.addCheese();
            } else {
                System.out.println("Pizza71 is not an instance of CheesePizza71, cannot call cascaded method");
            }
        } else {
            System.out.println("Pizza71 is null");
        }
    }
}
