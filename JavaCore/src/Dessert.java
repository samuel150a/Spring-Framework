package mil.java.sweet;

public class Dessert {
    public Dessert(Sweet sweet) {
        System.out.println("Dessert constructor is running.");
        sweet.taste();
    }

    public void serve() {
        System.out.println("Serving dessert with a smile!");
    }
}


