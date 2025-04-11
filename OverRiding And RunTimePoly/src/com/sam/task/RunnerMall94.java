package com.sam.task;

public class RunnerMall94 {
    public static void main(String[] args) {
        Mall94 mall = new Mall94();
        mall.enter();

        Mall94 m = new Groceries();
        m.enter();

        Groceries groceries = new Groceries();
        groceries.pickItems();
        groceries.checkout();
    }
}
