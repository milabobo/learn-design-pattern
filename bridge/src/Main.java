/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Shape rect = new Rect(new GreenColor());
        Shape square = new Square(new RedColor());
        Shape circle = new Circle(new WhiteColor());

        circle.setColor(new RedColor());
        rect.onDraw();
        square.onDraw();
        circle.onDraw();
    }
}
