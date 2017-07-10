/**
 * Created by milabobo on 8:42 PM.
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void onDraw() {
        System.out.println("Draw square with color " + color.getColor());
    }
}
