package week5_6;

public class Square extends Rectangle {
    private double side;
    public Square(){
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, XY xy, double side) {
        super(color, filled, xy, side, side);
    }
    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public void setWidth() {

        super.setWidth(side);
    }
    public void setLength()
    {
        super.setLength(side);
    }
    @Override
    public String toString() {
        return "Square{ "+"side: "+this.side
                + ", "+   "Area: "+this.getArea()
                + ", "+   "Perimeter: "+this.getPerimeter()
                + "," +   "XY: "+this.getXY().toString() +" }";
    }
}
