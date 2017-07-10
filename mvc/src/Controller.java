/**
 * Created by milabobo on 8:42 PM.
 */
public class Controller {
    Circle circle;
    Canvas canvas;

    public Controller(Circle circle, Canvas canvas) {
        this.circle = circle;
        this.canvas = canvas;
    }

    public void setRadius(int radius) {
        this.circle.radius = radius;
    }

    public void setColor(int color) {
        this.circle.color = color;
    }

    public void update() {
        canvas.draw(circle);
    }

}
