package composite;

/**
 * Created by tianu on 7/10/17.
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
