/**
 * Created by milabobo on 8:42 PM.
 */
public class LoginState implements ICustomState {
    @Override
    public void putToShoppingChar(Product product) {
        System.out.println("Success put product "
                + product.name());
    }
}
