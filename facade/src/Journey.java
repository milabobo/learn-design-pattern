/**
 * Created by milabobo on 10:17 PM.
 * Email mailto:milabobo@126.com
 */
public abstract class Journey {

    protected NormalMethod mNormalMethod;

    void chooseOnePlace() {
        mNormalMethod.loginWebsite();
        mNormalMethod.bookTicket();
    }

    void takeATool() {
        mNormalMethod.travelToStation();
        mNormalMethod.useTool();
    }

    void goToOnePlace() {
        mNormalMethod.landed();
        mNormalMethod.headToPlace();
    }
}
