package week4.task2;

class Circle extends Shape
{
    final double Pi=3.14159;
    protected double radius;
    public Circle(){}
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double getArea()
    {
        return 2*Pi*radius;
    }
    public double getPerimeteter()
    {
        return Pi*radius*radius;
    }
    @Override
    public String toString()
    {
        return "Circle getRadius" + getRadius() +" , getPerimeter" +getPerimeteter()+ " getArea"+ getArea();
    }
}
