package week5_6;

public class Rectangle extends Shape{
    double width;
    double length;
    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, XY xy, double width, double length) {
        super(color, filled, xy);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea (){
        return width*length;
    }
    public double getPerimeter (){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectange{ "+"width: "+this.width
                + ", "+   "length: "+this.length
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()
                + "," +   "XY: "+this.getXY().toString() +" }";
    }
}
