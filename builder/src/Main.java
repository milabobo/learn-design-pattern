/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(new Rect.Builder()
                .width(1)
                .height(2)
                .fillColor(3)
                .strokeColor(4)
                .strokeLength(5)
                .build()
        );
    }
}
