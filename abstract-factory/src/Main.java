/**
 * Created by milabobo on 8:45 PM.
 * Email mailto:milabobo@126.com
 */
public class Main {
    public static void main(String[] args) {
        ICity beijing = new BeijingCity();
        ICity wuhan = new WuHanCity();
        System.out.println(beijing.createPark());
        System.out.println(beijing.createSchool());
        System.out.println(beijing.createStreet());
        System.out.println();
        System.out.println(wuhan.createPark());
        System.out.println(wuhan.createSchool());
        System.out.println(wuhan.createStreet());
    }
}
