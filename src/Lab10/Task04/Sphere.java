package Lab10.Task04;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
