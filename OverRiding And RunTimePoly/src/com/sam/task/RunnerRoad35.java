package com.sam.task;

public class RunnerRoad35 {
    public static void main(String[] args) {
        Road35 road = new Road35();
        road.connectPlaces();

        Road35 r = new Transportation();
        r.connectPlaces();

        Transportation transport = new Transportation();
        transport.moveVehicles();
        transport.carryPeople();
    }
}
