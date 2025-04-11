package com.sam.task;

public class RunnerOwner27 {
    public static void main(String[] args) {
        Owner27 owner = new Owner27();
        owner.ride();

        Owner27 o = new Bike();
        o.ride();

        Bike bike = new Bike();
        bike.service();
        bike.refuel();
    }
}
