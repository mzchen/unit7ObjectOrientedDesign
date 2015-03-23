import java.awt.Rectangle;

public class Rektangle extends Rectangle
{
    public Rektangle()
    {
        //setSize(20,70);
        //setLocation(0,0);
        super(0, 0, 20, 70);
    }

    public double calcArea()
    {
        double area = ((this.getWidth())*(this.getHeight()));
        return area;
    }
    public double calcPerimeter()
    {
        double perimeter = (this.getWidth()*2) + (this.getHeight()*2);
        return perimeter;
    }
}
