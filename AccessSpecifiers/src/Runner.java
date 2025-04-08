import com.access.specifier.internal.ServiceCounter;
import com.access.specifier.external.CommunityHall;

public class Runner {
    public static void main(String[] args) {
        // For Church
        ServiceCounter serviceCounter = new ServiceCounter();
        serviceCounter.ChurchAccess();

        CommunityHall communityHall = new CommunityHall();
        communityHall.refreshmentsArea();

        System.out.println("**************************** END *********************************");
    }
}
