package normal;

/**
 * Created by tianu on 7/10/17.
 */
public class DepartManager implements IEmployee {
    TeamManager manager;

    public DepartManager() {
        this.manager = new TeamManager();
    }

    @Override
    public void fixComputer() {
        System.out.println("normal.DepartManager tell team manager to fix computer");
        manager.fixComputer();
        System.out.println("Computer is fixed by team manager");
    }
}
