package normal;

/**
 * Created by milabobo on 8:42 PM.
 */
public class TeamManager implements IEmployee {
    TeamMember member;

    public TeamManager() {
        this.member = new TeamMember();
    }

    @Override
    public void fixComputer() {
        System.out.println("normal.TeamManager tell team member to fix computer");
        member.fixComputer();
        System.out.println("Computer is fixed by team member");
    }
}
