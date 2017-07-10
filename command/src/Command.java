/**
 * Created by tianu on 7/10/17.
 */
public interface Command {
    int exec(int a, Target target);
    void redo();
    void undo();
}
