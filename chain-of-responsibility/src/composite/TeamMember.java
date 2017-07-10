package composite;

/**
 * Created by tianu on 7/10/17.
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
