package week5_6;

public class Circle extends Shape {
    double radius;
    final static double pi = 3.1428;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, XY xy, double radius) {
        super(color, filled, xy);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return pi*radius*radius;
    }
    public double getArea (){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Cricle{ "+"radius: "+this.radius
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()
                + "," +   "XY: "+this.getXY().toString() +" }";
    }
}
