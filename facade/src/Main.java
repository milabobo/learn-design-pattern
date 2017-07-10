/**
 * Created by milabobo on 10:25 PM.
 * Email mailto:milabobo@126.com
 */
public class Main {
    public static void main(String[] args) {
        Journey journey = new RichJourney();
        journey.chooseOnePlace();
        journey.takeATool();
        journey.goToOnePlace();

        System.out.println();
        Journey journey1 = new PoorJourney();
        journey1.chooseOnePlace();
        journey1.takeATool();
        journey1.goToOnePlace();
    }
}
