package com.sam.task;

public class RunnerPhone80 {
    public static void main(String[] args) {
        Phone80 phone = new Phone80();
        phone.powerOn();

        Phone80 p = new Call1();
        p.powerOn();

        Call1 call = new Call1();
        call.dialNumber();
        call.endCall();
    }
}
