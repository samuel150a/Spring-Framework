package mil.java.rain;

public class Rain {
    public Rain(Umbrella umbrella) {
        System.out.println("Rain constructor is running.");
        umbrella.open();
    }

    public void drop() {
        System.out.println("Rain is dropping from the sky.");
    }
}