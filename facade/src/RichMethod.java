/**
 * Created by milabobo on 10:18 PM.
 * Email mailto:milabobo@126.com
 */
public class RichMethod extends NormalMethod {
    @Override
    void bookTicket() {
        System.out.println("Book a flight ticket");
    }

    @Override
    void travelToStation() {
        System.out.println("Take a taxi to airport");
    }

    @Override
    void useTool() {
        System.out.println("Travel by flight");
    }

    @Override
    void headToPlace() {
        System.out.println("Take a taxi to destination");
    }
}
