package Lab11.Task09;

public abstract class Shape {
    private Point upperLeft;

    public Shape(int x, int y){
        this.upperLeft = new Point(x, y);
    }

    public abstract double getArea();

    public int getX(){
        return this.upperLeft.getX();
    }

    public int getY(){
        return this.upperLeft.getY();
    }
}
