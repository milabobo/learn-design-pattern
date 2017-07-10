package normal;

/**
 * Created by tianu on 7/10/17.
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
