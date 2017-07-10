/**
 * Created by milabobo on 8:42 PM.
 */
public abstract class Shape {
    public Shape(Color color) {
        this.color = color;
    }

    abstract void onDraw();

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }
}
