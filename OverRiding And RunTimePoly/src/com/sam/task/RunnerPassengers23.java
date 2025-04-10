package com.sam.task;

public class RunnerPassengers23 {
    public static void main(String[] args) {
        Passengers23 passenger = new Passengers23();
        passenger.travel();

        Passengers23 p = new Seats();
        p.travel();

        Seats seats = new Seats();
        seats.book();
        seats.adjust();
    }
}
