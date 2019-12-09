package Lab11.Task09;

public class Circle extends Shape{
    private double my_radius;

    public Circle(int x, int y,  double diameter) {
        super(x, y);
        my_radius = diameter / 2;
    }

    public int getX() {
        return super.getX();
    }

    public int getY() {
        return super.getY();
    }

    public double getArea(){
        return Math.PI*Math.pow(my_radius,2);
    }
}
