/**
 * Created by milabobo on 8:42 PM.
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
