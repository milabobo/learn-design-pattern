package composite;

/**
 * Created by milabobo on 8:42 PM.
 */
public interface ChainEmployee {
    void makeRequest(Chain chain, RequestType type);

    boolean canMakeRequest(RequestType type);

}
