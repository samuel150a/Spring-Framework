package com.samuel.work;

public class RunnerCococola69 {
    public static void main(String[] args) {
        Cococola69 drink = new Cococola69();
        drink.serve(); // PARENT CLASS METHOD

        Cococola69 coldDrink = new ColdCococola69();
        coldDrink.serve(); // RUNTIME POLYMORPHISM

        ColdCococola69 cold = new ColdCococola69();
        cold.serve(); // CHILD CLASS METHOD
        cold.addIce();

        DrinkShop shop = new DrinkShop();
        shop.show(drink);
        shop.show(cold);
    }
}
