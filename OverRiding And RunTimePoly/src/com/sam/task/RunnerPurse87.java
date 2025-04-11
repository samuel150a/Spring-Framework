package com.sam.task;

public class RunnerPurse87 {
    public static void main(String[] args) {
        Purse87 purse = new Purse87();
        purse.open();

        Purse87 p = new Money();
        p.open();

        Money money = new Money();
        money.addCash();
        money.countCash();
    }
}
