package normal;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Boss implements IEmployee {

    DepartManager manager;

    public Boss() {
        this.manager = new DepartManager();
    }

    @Override
    public void fixComputer() {
        System.out.println("Boss tell depart manager to fix computer");
        manager.fixComputer();
        System.out.println("Computer is fixed by depart manager");
        System.out.println("Boss fixed computer");
    }
}
