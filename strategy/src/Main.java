/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        CrossRiver fly = new FlyCross();
        CrossRiver swim = new SwimCross();
        CrossRiver jump = new JumpCross();
        Client client = new Client(jump);
        client.goToOtherSide();
        client.setRiver(swim);
        client.goToOtherSide();
        client.setRiver(fly);
        client.goToOtherSide();
    }
}
