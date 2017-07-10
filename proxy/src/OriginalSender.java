/**
 * Created by tianu on 7/10/17.
 */
public class OriginalSender implements ISender {
    @Override
    public void sendData(Data data) {
        System.out.println("Original send data!");
    }
}
