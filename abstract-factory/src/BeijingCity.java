/**
 * Created by milabobo on 8:43 PM.
 * Email mailto:milabobo@126.com
 */
public class BeijingCity implements ICity {
    @Override
    public IPark createPark() {
        return new YiHePark();
    }

    @Override
    public ISchool createSchool() {
        return new ChaoYangSchool();
    }

    @Override
    public IStreet createStreet() {
        return new YaojiayuanStreet();
    }
}
