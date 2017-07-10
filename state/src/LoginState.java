/**
 * Created by tianu on 7/10/17.
 */
public class LoginState implements ICustomState {
    @Override
    public void putToShoppingChar(Product product) {
        System.out.println("Success put product "
                + product.name());
    }
}
