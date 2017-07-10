/**
 * Created by tianu on 7/10/17.
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
