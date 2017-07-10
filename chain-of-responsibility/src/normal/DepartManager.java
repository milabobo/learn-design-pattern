package normal;

/**
 * Created by milabobo on 8:42 PM.
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
