/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        Journey journey = new Journey();
        journey.gotoBeijing(new BikeMethod());
        System.out.println();
        journey.gotoBeijing(new CarMethod());
        System.out.println();
        journey.gotoBeijing(new FlyMethod());
    }
}
