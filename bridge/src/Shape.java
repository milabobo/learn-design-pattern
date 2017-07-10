/**
 * Created by tianu on 7/10/17.
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
