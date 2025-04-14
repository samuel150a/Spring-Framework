package com.samuel.work;

public class GadgetBox {
    public GadgetBox() {
        System.out.println("Running the GadgetBox constructor");
    }

    public void show(AirPods47 pod) {
        if (pod != null) {
            pod.connect();
            if (pod instanceof AirPodsPro47) {
                AirPodsPro47 ref = (AirPodsPro47) pod;
                ref.noiseCancel();
            } else {
                System.out.println("AirPods47 is not an instance of AirPodsPro47, cannot call cascaded method");
            }
        } else {
            System.out.println("AirPods47 is null");
        }
    }
}
