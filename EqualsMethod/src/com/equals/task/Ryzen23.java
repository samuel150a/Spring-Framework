package com.equals.task;

import java.util.Objects;

public class Ryzen23 {
    private String model;
    private int cores;
    private int threads;
    private double baseClock;

    void setModel(String model) {
        this.model = model;
    }

    void setCores(int cores) {
        this.cores = cores;
    }

    void setThreads(int threads) {
        this.threads = threads;
    }

    void setBaseClock(double baseClock) {
        this.baseClock = baseClock;
    }

    String getModel() {
        return model;
    }

    int getCores() {
        return cores;
    }

    int getThreads() {
        return threads;
    }

    double getBaseClock() {
        return baseClock;
    }

    @Override
    public boolean equals(Object any) {
        if (any != null && any instanceof Ryzen23) {
            Ryzen23 ryzen = (Ryzen23) any;
            if (Objects.equals(this.model, ryzen.model) &&
                    Objects.equals(this.cores, ryzen.cores) &&
                    Objects.equals(this.threads, ryzen.threads) &&
                    Objects.equals(this.baseClock, ryzen.baseClock)) {
                System.out.println("ryzen is matched");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Model: " + this.model +
                ", Cores: " + this.cores +
                ", Threads: " + this.threads +
                ", Base Clock: " + this.baseClock + "GHz";
    }
}
