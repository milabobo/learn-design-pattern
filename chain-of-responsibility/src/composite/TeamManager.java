package composite;

import normal.IEmployee;

/**
 * Created by milabobo on 8:42 PM.
 */
public class TeamManager implements ChainEmployee {

    @Override
    public boolean canMakeRequest(RequestType type) {
        return type == RequestType.MANAGE_CHART || type == RequestType.FIX_COMPUTER;
    }

    @Override
    public void makeRequest(Chain chain, RequestType type) {
        if (type != RequestType.MANAGE_CHART) {
            System.out.println("TeamManager tell team member to " + type.name());
            chain.makeRequest(type);
        } else {
            System.out.println(type.name() + " is finished by team manager");
        }
    }
}
