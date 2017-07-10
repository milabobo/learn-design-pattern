/**
 * Created by milabobo on 9:31 PM.
 * Email mailto:milabobo@126.com
 */
public class Main {
    public static void main(String[] args) {
        IQueue queue = new ManTouQueue();
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);

        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);

        startConsumer(c1, 1500);
        startConsumer(c2, 2500);

        startProducer(p1, 2500);
        startProducer(p2, 3000);
        startProducer(p3, 3000);
    }

    static void startConsumer(Consumer c, int timeMs) {
        new Thread(() -> {
            while (true) {
                c.eat();
                try {
                    Thread.sleep(timeMs);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    static void startProducer(Producer p, int timeMs) {
        new Thread(() -> {
            while (true) {
                p.create();
                try {
                    Thread.sleep(timeMs);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
