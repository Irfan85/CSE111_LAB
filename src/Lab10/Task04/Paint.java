package Lab10.Task04;

public class Paint {
    private double coverage;

    public Paint(double coverage){
        this.coverage = coverage;
    }

    public double paint(Shape shape){
        System.out.println("Painting a " + shape.getShapeName());
        return (shape.area()*1.0)/coverage;
    }

    public double getCoverage(){
        return this.coverage;
    }
}
