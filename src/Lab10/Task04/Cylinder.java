package Lab10.Task04;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2) * height;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
