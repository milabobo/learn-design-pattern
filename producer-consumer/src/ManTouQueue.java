import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by milabobo on 9:22 PM.
 * Email mailto:milabobo@126.com
 */
public class ManTouQueue implements IQueue {
    LinkedBlockingQueue<ManTou> queue;

    public ManTouQueue() {
        queue = new LinkedBlockingQueue<>();
    }

    @Override
    public ManTou remove() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void offer(ManTou manTou) {
        queue.offer(manTou);
    }
}
