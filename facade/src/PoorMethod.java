/**
 * Created by milabobo on 10:19 PM.
 * Email mailto:milabobo@126.com
 */
public class PoorMethod extends NormalMethod {
    @Override
    void bookTicket() {
        System.out.println("Book a train ticket");
    }

    @Override
    void travelToStation() {
        System.out.println("Take a bus to train station");
    }

    @Override
    void useTool() {
        System.out.println("Travel by train");
    }

    @Override
    void headToPlace() {
        System.out.println("Take a bus to destination");
    }
}
