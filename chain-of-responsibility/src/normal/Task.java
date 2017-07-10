package normal;

/**
 * Created by tianu on 7/10/17.
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
