
package mil.java.weather;

public class Report {
    public Report(Weather weather) {
        System.out.println("Report constructor is running.");
        weather.forecast();
    }

    public void temperature() {
        System.out.println("Temperature: 30°C");
    }
}