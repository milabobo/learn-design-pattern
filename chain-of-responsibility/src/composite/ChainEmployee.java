package composite;

/**
 * Created by tianu on 7/10/17.
 */
public interface ChainEmployee {
    void makeRequest(Chain chain, RequestType type);

    boolean canMakeRequest(RequestType type);

}
