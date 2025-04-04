package mil.java.smoke;

public class Smoke {
    public Smoke(Cigarette cigarette) {
        System.out.println("Smoke constructor is running.");
        cigarette.burn();
    }

    public void release() {
        System.out.println("Smoke is released into the air.");
    }
}