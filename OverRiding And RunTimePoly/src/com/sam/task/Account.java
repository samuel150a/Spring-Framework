package com.sam.task;

public class Account extends Bank99 {
    public Account() {
        System.out.println("Running in the Account constructor");
    }

    @Override
    public void openAccount() {
        System.out.println("Running in the overridden method openAccount from Account");
    }

    public void deposit() {
        System.out.println("Running in the public method deposit");
    }

    public void withdraw() {
        System.out.println("Running in the public method withdraw");
    }
}
