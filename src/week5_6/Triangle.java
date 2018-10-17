package week5_6;

public class Triangle extends Shape {
    XY xy1, xy2, xy3;
    public Triangle(){
    }

    public Triangle(XY xy1, XY xy2, XY xy3) {
        this.xy1 = xy1;
        this.xy2 = xy2;
        this.xy3 = xy3;
    }

    public Triangle(String color, boolean filled, XY xy, XY xy1, XY xy2, XY xy3) {
        super(color, filled, xy);
        this.xy1 = xy1;
        this.xy2 = xy2;
        this.xy3 = xy3;
    }

    public XY getXy1() {
        return xy1;
    }

    public void setXy1(XY xy1) {
        this.xy1 = xy1;
    }

    public XY getXy2() {
        return xy2;
    }

    public void setXy2(XY xy2) {
        this.xy2 = xy2;
    }

    public XY getXy3() {
        return xy3;
    }

    public void setXy3(XY xy3) {
        this.xy3 = xy3;
    }
    @Override
    public String toString() {
        return "Triagle{" + "(x1,y1) = " + xy1.toString() + " (x2,y2) = " + xy2.toString() + " (x3,y3) = " + xy3.toString()  + '}';
    }
}
