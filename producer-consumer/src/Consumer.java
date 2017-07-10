
/**
 * Created by milabobo on 9:30 PM.
 * Email mailto:milabobo@126.com
 */
public class Consumer {
    IQueue mIQueue;
    public Consumer(IQueue IQueue) {
        mIQueue = IQueue;
    }
    void eat() {
        System.out.println("Eat " + mIQueue.remove());
    }
}
