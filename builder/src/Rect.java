/**
 * Created by tianu on 7/10/17.
 */
public class Rect {

    private final int width;
    private final int height;
    private final int fillColor;
    private final int strokeColor;
    private final int strokeLength;

    private Rect(int width, int height, int fillColor, int strokeColor, int strokeLength) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeLength = strokeLength;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getFillColor() {
        return fillColor;
    }

    public int getStrokeColor() {
        return strokeColor;
    }

    public int getStrokeLength() {
        return strokeLength;
    }

    @Override
    public String toString() {
        return "Rect{" +
                "width=" + width +
                ", height=" + height +
                ", fillColor=" + fillColor +
                ", strokeColor=" + strokeColor +
                ", strokeLength=" + strokeLength +
                '}';
    }

    static class Builder {
        int width;
        int height;
        int fillColor = 1;
        int strokeColor = 1;
        int strokeLength = 1;

        Builder width(int width) {
            if (width <= 0) {
                throw new IllegalArgumentException("width must be great than 0");
            }
            this.width = width;
            return this;
        }

        Builder height(int height) {
            if (height <= 0) {
                throw new IllegalArgumentException("height must be great than 0");
            }
            this.height = height;
            return this;
        }

        Builder fillColor(int fillColor) {
            if (fillColor <= 0) {
                throw new IllegalArgumentException("fillColor must be great than 0");
            }
            this.fillColor = fillColor;
            return this;
        }

        Builder strokeColor(int strokeColor) {
            if (strokeColor <= 0) {
                throw new IllegalArgumentException("strokeColor must be great than 0");
            }
            this.strokeColor = strokeColor;
            return this;
        }

        Builder strokeLength(int strokeLength) {
            if (strokeLength <= 0) {
                throw new IllegalArgumentException("strokeLength must be great than 0");
            }
            this.strokeLength = strokeLength;
            return this;
        }

        Rect build() {
            return new Rect(width, height, fillColor, strokeColor, strokeLength);
        }
    }
}
