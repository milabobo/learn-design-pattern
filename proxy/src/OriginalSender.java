/**
 * Created by milabobo on 8:42 PM.
 */
public class OriginalSender implements ISender {
    @Override
    public void sendData(Data data) {
        System.out.println("Original send data!");
    }
}
