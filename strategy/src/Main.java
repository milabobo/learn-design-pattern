/**
 * Created by tianu on 7/10/17.
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
