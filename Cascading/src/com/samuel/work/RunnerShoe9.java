package com.samuel.work;

public class RunnerShoe9 {
    public static void main(String[] args) {
        Shoe9 shoe = new Shoe9();
        shoe.wear(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Shoe9 sportsShoe = new SportsShoe9();
        sportsShoe.wear(); // RUNTIME POLYMORPHISM

        SportsShoe9 ss9 = new SportsShoe9();
        ss9.wear(); // NORMALLY ACCESSING CHILD CLASS METHOD
        ss9.runFast();

        ShoeStore store = new ShoeStore();
        store.show(shoe);
        store.show(ss9);
    }
}
