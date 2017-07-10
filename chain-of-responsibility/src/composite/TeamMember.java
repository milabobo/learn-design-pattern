package composite;

/**
 * Created by milabobo on 8:42 PM.
 */
public class TeamMember implements ChainEmployee {

    @Override
    public boolean canMakeRequest(RequestType type) {
        return type == RequestType.FIX_COMPUTER;
    }

    @Override
    public void makeRequest(Chain chain, RequestType type) {
        System.out.println("Fixing computer...");
        System.out.println("Computer fixed");
    }
}
