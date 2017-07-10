/**
 * Created by milabobo on 8:42 PM.
 */
public class MultiplyCommand implements Command {
    Target target;
    int a;

    @Override
    public int exec(int a, Target target) {
        this.a = a;
        this.target = target;
        return target.value *= a;
    }

    @Override
    public void redo() {
        target.value *= a;
    }

    @Override
    public void undo() {
        target.value /= a;
    }
}
