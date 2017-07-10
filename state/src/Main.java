/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        StateManager manager = new StateManager(new GuestState());

        manager.putToShoppingChar(Product.APPLE);
        manager.login();
        manager.putToShoppingChar(Product.APPLE);
        manager.putToShoppingChar(Product.PEAR);
        manager.putToShoppingChar(Product.BANANA);

        manager.logout();
        manager.putToShoppingChar(Product.BANANA);
    }
}
