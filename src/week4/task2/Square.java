package week4.task2;

class Square extends Rectangle
{
    protected double size;
    public Square(double size)
    {
        this.size=size;
        this.width=size;
        this.length=size;
    }
    public double getSize()
    {
        return length;
    }
    public void setSize(double size)
    {
        this.length=size;
        this.width=size;
    }
    public void setWidth(double size)
    {
        this.width=size;
        this.length=size;
    }
    public void setLength(double size)
    {
        this.width=size;
        this.length=size;
    }
    @Override
    public String toString()
    {
        return "Square getSize" + getSize();
    }
}
