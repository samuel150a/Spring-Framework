package mil.java.audio;

public class ChargingCase {
    public ChargingCase(Earbud earbud) {
        System.out.println("ChargingCase constructor is running.");
        earbud.playMusic();
    }

    public void charge() {
        System.out.println("Charging case is charging the earbuds.");
    }
}