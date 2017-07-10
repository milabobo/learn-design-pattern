/**
 * Created by milabobo on 8:23 PM.
 * Email mailto:milabobo@126.com
 */
public class BenzCarFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new BenzCar(new Engine(), new Tire(), new Body());
    }
}
