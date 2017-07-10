/**
 * Created by milabobo on 8:42 PM.
 */
public class GuestState implements ICustomState {
    @Override
    public void putToShoppingChar(Product product) {
        System.out.println("Please login in!");
    }
}
