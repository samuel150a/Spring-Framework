package com.sam.task;

public class RunnerBank99 {
    public static void main(String[] args) {
        Bank99 bank = new Bank99();
        bank.openAccount();

        Bank99 b = new Account();
        b.openAccount();

        Account account = new Account();
        account.deposit();
        account.withdraw();
    }
}
