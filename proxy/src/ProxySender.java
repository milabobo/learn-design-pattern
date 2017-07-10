/**
 * Created by milabobo on 8:42 PM.
 */
public class ProxySender implements ISender {
    private OriginalSender sender;

    @Override
    public void sendData(Data data) {
        // 1. constructor is expensive
        // 2. delay load
        // 3. hidden implements for safety
        // 4. count reference of original sender
        // 5. control access
        if (sender == null) {
            sender = new OriginalSender();
        }
        System.out.println("Using proxy to send data!");
        sender.sendData(data);
    }
}
