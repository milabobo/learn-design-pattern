/**
 * Created by tianu on 7/10/17.
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
