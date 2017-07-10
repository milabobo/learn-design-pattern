/**
 * Created by milabobo on 8:42 PM.
 */
public interface Command {
    int exec(int a, Target target);
    void redo();
    void undo();
}
