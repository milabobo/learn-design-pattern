/**
 * Created by tianu on 7/10/17.
 */
public class GuestState implements ICustomState {
    @Override
    public void putToShoppingChar(Product product) {
        System.out.println("Please login in!");
    }
}
