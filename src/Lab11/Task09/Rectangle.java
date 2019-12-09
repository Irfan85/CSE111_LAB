package Lab11.Task09;

public class Rectangle extends Shape{
    private double my_width;
    private double my_height;

    public Rectangle(int x, int y, double height, double width){
        super(x, y);
        my_width = width;
        my_height = height;
    }

    public int getX()  {
        return super.getX();
    }

    public int getY()  {
        return super.getY();
    }

    public double getArea() {
        return my_width * my_height;
    }
}
