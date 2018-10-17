package week5_6;

public class Shape{
    String color;
    boolean filled;
    XY xy;
    public Shape(){
    };

    public Shape(String color, boolean filled, XY xy) {
        this.color = color;
        this.filled = filled;
        this.xy = xy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public XY getXY() {
        return xy;
    }

    public void setXY(XY xy) {
        this.xy = xy;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + ", xy=" + xy + '}';
    }
}

