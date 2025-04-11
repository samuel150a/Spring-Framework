package com.sam.task;

public class Call1 extends Phone80 {
    public Call1() {
        System.out.println("Running in the Call constructor");
    }

    @Override
    public void powerOn() {
        System.out.println("Running in the overridden method powerOn from Call");
    }

    public void dialNumber() {
        System.out.println("Running in the public method dialNumber");
    }

    public void endCall() {
        System.out.println("Running in the public method endCall");
    }
}
