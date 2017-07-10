/**
 * Created by tianu on 7/10/17.
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
