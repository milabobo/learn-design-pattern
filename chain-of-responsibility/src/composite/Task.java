package composite;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Task {
    Chain chain;

    Task(Chain chain) {
        this.chain = chain;
    }

    public void makeRequest(RequestType type) {
        chain.makeRequest(type);
    }
}
