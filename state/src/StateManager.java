/**
 * Created by milabobo on 8:42 PM.
 */
public class StateManager implements ICustomState {

    ICustomState currentState;

    public StateManager(ICustomState currentState) {
        this.currentState = currentState;
    }

    void changeState(ICustomState state) {
        this.currentState = state;
    }

    void login() {
        changeState(new LoginState());
    }

    void logout() {
        changeState(new GuestState());
    }

    @Override
    public void putToShoppingChar(Product product) {
        currentState.putToShoppingChar(product);
    }
}
