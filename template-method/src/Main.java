/**
 * Created by tianu on 7/10/17.
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
