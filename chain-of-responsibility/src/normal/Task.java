package normal;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Task implements IEmployee {
    Boss boss;

    Task(Boss boss) {
        this.boss = boss;
    }

    @Override
    public void fixComputer() {
        boss.fixComputer();
    }
}
