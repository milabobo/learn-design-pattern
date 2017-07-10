/**
 * Created by milabobo on 8:42 PM.
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
