package com.samuel.work;

public class RunnerPizza71 {
    public static void main(String[] args) {
        Pizza71 pizza = new Pizza71();
        pizza.bake(); // PARENT CLASS METHOD

        Pizza71 cheesePizza = new CheesePizza71();
        cheesePizza.bake(); // RUNTIME POLYMORPHISM

        CheesePizza71 cp = new CheesePizza71();
        cp.bake(); // CHILD CLASS METHOD
        cp.addCheese();

        PizzaShop shop = new PizzaShop();
        shop.show(pizza);
        shop.show(cp);
    }
}
