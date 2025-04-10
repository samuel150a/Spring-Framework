package com.sam.task;

public class RunnerHelmet13 {
    public static void main(String[] args) {
        Helmet13 helmet = new Helmet13();
        helmet.protectHead();

        Helmet13 h = new Life();
        h.protectHead();

        Life life = new Life();
        life.safeRide();
        life.saveLife();
    }
}
