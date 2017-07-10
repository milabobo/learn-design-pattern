/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 100);
        Canvas canvas = new Canvas();
        Controller controller = new Controller(circle, canvas);

        controller.update();
        controller.setColor(65);
        controller.setRadius(98);
        controller.update();
    }
}
