/**
 * Created by milabobo on 8:44 PM.
 * Email mailto:milabobo@126.com
 */
public class WuHanCity implements ICity {
    @Override
    public IPark createPark() {
        return new DongPark();
    }

    @Override
    public ISchool createSchool() {
        return new WuhanSchool();
    }

    @Override
    public IStreet createStreet() {
        return new MayingStreet();
    }
}
