/**
 * Created by milabobo on 8:24 PM.
 * Email mailto:milabobo@126.com
 */
public class BenzCar implements ICar {
    Engine mEngine;
    Tire mTire;
    Body mBody;

    public BenzCar(Engine engine, Tire tire, Body body) {
        mEngine = engine;
        mTire = tire;
        mBody = body;
    }
}
