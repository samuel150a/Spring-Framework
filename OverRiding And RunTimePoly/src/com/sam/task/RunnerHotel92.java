package com.sam.task;

public class RunnerHotel92 {
    public static void main(String[] args) {
        Hotel92 hotel = new Hotel92();
        hotel.serve();

        Hotel92 h = new Lunch();
        h.serve();

        Lunch lunch = new Lunch();
        lunch.prepareFood();
        lunch.cleanTable();
    }
}
