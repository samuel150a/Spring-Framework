package com.samuel.work;

public class JeansStore {
    public JeansStore() {
        System.out.println("Running the JeansStore constructor");
    }

    public void show(Jeans87 jeans) {
        if (jeans != null) {
            jeans.wear();
            if (jeans instanceof DenimJeans87) {
                DenimJeans87 ref = (DenimJeans87) jeans;
                ref.style();
            } else {
                System.out.println("Jeans87 is not an instance of DenimJeans87, cannot call cascaded method");
            }
        } else {
            System.out.println("Jeans87 is null");
        }
    }
}
