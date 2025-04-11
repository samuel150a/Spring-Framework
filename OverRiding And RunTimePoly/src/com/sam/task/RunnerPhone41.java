package com.sam.task;

public class RunnerPhone41 {
    public static void main(String[] args) {
        Phone41 phone = new Phone41();
        phone.ring();

        Phone41 p = new Call();
        p.ring();

        Call call = new Call();
        call.connect();
        call.disconnect();
    }
}
