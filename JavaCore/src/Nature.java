package mil.java.earth;

public class Nature {
    public Nature(Earth earth) {
        System.out.println("Nature constructor is running.");
        earth.rotate();
    }

    public void grow() {
        System.out.println("Trees and plants are growing in nature.");
    }
}