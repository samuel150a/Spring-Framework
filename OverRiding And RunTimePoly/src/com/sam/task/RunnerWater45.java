package com.sam.task;

public class RunnerWater45 {
    public static void main(String[] args) {
        Water45 water = new Water45();
        water.flow();

        Water45 w = new Drink();
        w.flow();

        Drink drink = new Drink();
        drink.quenchThirst();
        drink.refresh();
    }
}
