/**
 * Created by milabobo on 8:25 PM.
 * Email mailto:milabobo@126.com
 */
public class Main {
    public static void main(String[] args) {
        IFactory factory = new BenzCarFactory();
        factory.createCar();
    }
}
