package mil.java.smoke;

public class CigaretteRunner {
    public static void main(String[] args) {
        Cigarette cigarette = new Cigarette();
        Smoke smoke = new Smoke(cigarette);
        smoke.release();
    }
}