package com.samuel.work;

public class AirPodsPro47 extends AirPods47 {
    public AirPodsPro47() {
        System.out.println("Running in the AirPodsPro47 constructor");
    }

    @Override
    public void connect() {
        System.out.println("Running public method connect by child class");
    }

    public void noiseCancel() {
        System.out.println("Running in public method noiseCancel");
    }
}
