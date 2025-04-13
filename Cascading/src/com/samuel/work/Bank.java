package com.samuel.work;

public class Bank {
    public Bank() {
        System.out.println("Running the Bank constructor");
    }

    public void show(Account1 account) {
        if (account != null) {
            account.useAccount();
            if (account instanceof SavingsAccount1) {
                SavingsAccount1 ref = (SavingsAccount1) account;
                ref.calculateInterest();
            } else {
                System.out.println("Account1 is not an instance of SavingsAccount1, cannot call cascaded method");
            }
        } else {
            System.out.println("Account1 is null");
        }
    }
}
