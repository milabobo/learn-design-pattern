/**
 * Created by milabobo on 8:42 PM.
 */
public class Client {

    CrossRiver river;

    public Client(CrossRiver river) {
        this.river = river;
    }

    public void setRiver(CrossRiver river) {
        this.river = river;
    }

    public void goToOtherSide() {
        river.cross();
    }
}
