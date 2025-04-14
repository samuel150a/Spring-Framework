package com.samuel.work;

public class RunnerJeans87 {
    public static void main(String[] args) {
        Jeans87 jeans = new Jeans87();
        jeans.wear(); // PARENT CLASS METHOD

        Jeans87 denimJeans = new DenimJeans87();
        denimJeans.wear(); // RUNTIME POLYMORPHISM

        DenimJeans87 dj = new DenimJeans87();
        dj.wear(); // CHILD CLASS METHOD
        dj.style();

        JeansStore store = new JeansStore();
        store.show(jeans);
        store.show(dj);
    }
}
