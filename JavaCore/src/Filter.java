package mil.java.body;

public class Filter {
    public Filter(Kidney kidney) {
        System.out.println("Filter process started.");
        kidney.clean();
    }

    public void flush() {
        System.out.println("Filtered waste is being flushed out.");
    }
}