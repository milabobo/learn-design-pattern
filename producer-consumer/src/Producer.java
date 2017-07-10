import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by milabobo on 9:25 PM.
 * Email mailto:milabobo@126.com
 */
public class Producer {
    IQueue mIQueue;
    static AtomicInteger sIndex = new AtomicInteger(1);
    public Producer(IQueue IQueue) {
        mIQueue = IQueue;
    }

    void create() {
        ManTou manTou = new ManTou(sIndex.getAndIncrement());
        mIQueue.offer(manTou);
        System.out.println("Create " + manTou);
    }
}
