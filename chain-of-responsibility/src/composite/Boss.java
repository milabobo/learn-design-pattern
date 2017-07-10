package composite;

/**
 * Created by tianu on 7/10/17.
 */
public class Boss implements ChainEmployee {

    @Override
    public boolean canMakeRequest(RequestType type) {
        return true;
    }

    @Override
    public void makeRequest(Chain chain, RequestType type) {
        if (type != RequestType.PAY_PRICE) {
            System.out.println("Boss tell depart manager to " + type.name());
            chain.makeRequest(type);
        } else {
            System.out.println(type.name() + " is finished by boss");
        }
    }
}
