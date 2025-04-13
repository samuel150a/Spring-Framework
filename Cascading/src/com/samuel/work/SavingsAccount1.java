package com.samuel.work;

public class SavingsAccount1 extends Account1 {
    public SavingsAccount1() {
        System.out.println("Running in the SavingsAccount1 constructor");
    }

    @Override
    public void useAccount() {
        System.out.println("Running public method useAccount by child class");
    }

    public void calculateInterest() {
        System.out.println("Running in public method calculateInterest");
    }
}
