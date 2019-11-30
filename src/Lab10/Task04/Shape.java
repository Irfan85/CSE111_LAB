package Lab10.Task04;

public abstract class Shape {
    private String shapeName;

    public Shape(String shapeName){
        this.shapeName = shapeName;
    }

    public abstract double area();

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public String toString() {
        return getShapeName();
    }
}
