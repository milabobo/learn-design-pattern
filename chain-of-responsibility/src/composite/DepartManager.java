package composite;

/**
 * Created by tianu on 7/10/17.
 */
public class DepartManager implements ChainEmployee {

    public DepartManager() {
    }

    @Override
    public boolean canMakeRequest(RequestType type) {
        return type != RequestType.PAY_PRICE;
    }

    @Override
    public void makeRequest(Chain chain, RequestType type) {
        if (type != RequestType.HOLD_MEETING) {
            System.out.println("DepartManager tell team manager to " + type.name());
            chain.makeRequest(type);
        } else {
            System.out.println(type.name() + " is finished by depart manager");
        }
    }
}
