package mil.java.body;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        Filter filter = new Filter(kidney);
        filter.flush();
    }
}