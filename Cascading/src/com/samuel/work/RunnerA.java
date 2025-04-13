package com.samuel.work;

public class RunnerA {
    public static void main(String[] args) {
        Account1 account = new Account1();
        account.useAccount(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Account1 savings = new SavingsAccount1();
        savings.useAccount(); // RUN TIME POLYMORPHISM

        SavingsAccount1 savingsAccount = new SavingsAccount1();
        savingsAccount.useAccount(); // NORMALLY ACCESSING CHILD CLASS METHOD
        savingsAccount.calculateInterest();

        Bank bank = new Bank();
        bank.show(account);
        bank.show(savingsAccount);
    }
}
