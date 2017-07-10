package normal;

/**
 * Created by milabobo on 8:42 PM.
 */
public class TeamMember implements IEmployee {

    public TeamMember() {
    }

    @Override
    public void fixComputer() {
        System.out.println("Fixing computer...");
        System.out.println("Computer fixed");
    }
}
