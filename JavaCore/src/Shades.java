package mil.java.color;

public class Shades {
    public Shades(BlackAndWhite bw) {
        System.out.println("Shades constructor is running.");
        bw.displayContrast();
    }

    public void grayscale() {
        System.out.println("Converting image to grayscale shades.");
    }
}