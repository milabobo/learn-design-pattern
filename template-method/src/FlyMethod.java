/**
 * Created by tianu on 7/10/17.
 */
public class FlyMethod extends Template {
    @Override
    void findTool() {
        System.out.println("Find a flight");
    }

    @Override
    void useTool() {
        System.out.println("Fly in the air");
    }

    @Override
    void landed() {
        System.out.println("Landed in beijing airport");
    }
}
