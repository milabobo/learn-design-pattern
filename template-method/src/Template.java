/**
 * Created by tianu on 7/10/17.
 */
public abstract class Template {

    void start() {
        System.out.println("Start from wuhan");
    }

    abstract void findTool();

    abstract void useTool();

    abstract void landed();

    void end() {
        System.out.println("Get to beijing");
    }

}
