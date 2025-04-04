
package mil.java.color;

public class ColorRunner {
    public static void main(String[] args) {
        BlackAndWhite bw = new BlackAndWhite();
        Shades shades = new Shades(bw);
        shades.grayscale();
    }
}