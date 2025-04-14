package com.samuel.work;

public class RunnerAirPods47 {
    public static void main(String[] args) {
        AirPods47 pod = new AirPods47();
        pod.connect(); // PARENT CLASS METHOD

        AirPods47 pro = new AirPodsPro47();
        pro.connect(); // RUNTIME POLYMORPHISM

        AirPodsPro47 apPro = new AirPodsPro47();
        apPro.connect(); // CHILD CLASS METHOD
        apPro.noiseCancel();

        GadgetBox box = new GadgetBox();
        box.show(pod);
        box.show(apPro);
    }
}
