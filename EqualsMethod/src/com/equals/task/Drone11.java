package com.equals.task;

import java.util.Objects;

public class Drone11 {
    private String model;
    private String brand;
    private int flightTime;
    private String cameraQuality;

    void setModel(String model) {
        this.model = model;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    void setCameraQuality(String cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    String getModel() {
        return model;
    }

    String getBrand() {
        return brand;
    }

    int getFlightTime() {
        return flightTime;
    }

    String getCameraQuality() {
        return cameraQuality;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Drone11) {
            Drone11 drone = (Drone11) any;
            if (Objects.equals(this.model, drone.model) &&
                    Objects.equals(this.brand, drone.brand) &&
                    Objects.equals(this.flightTime, drone.flightTime) &&
                    Objects.equals(this.cameraQuality, drone.cameraQuality)) {
                System.out.println("drone is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + ", Brand: " + this.brand + ", Flight Time: " + this.flightTime + " mins, Camera Quality: " + this.cameraQuality;
    }
}
