package mil.java.audio;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        ChargingCase chargingCase = new ChargingCase(earbud);
        chargingCase.charge();
    }
}