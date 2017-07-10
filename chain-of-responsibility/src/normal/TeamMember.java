package normal;

/**
 * Created by tianu on 7/10/17.
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
