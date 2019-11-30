package Lab08.Task05;

public class Vehicle2010 extends Vehicle {
    public void moveUpperRight(){
        super.moveUp();
        super.moveRight();
    }

    public void moveLowerRight(){
        super.moveDown();
        super.moveRight();
    }

    public void moveUpperLeft(){
        super.moveUp();
        super.moveLeft();
    }

    public void moveLowerLeft(){
        super.moveDown();
        super.moveLeft();
    }

    public boolean equals(Vehicle2010 vehicle2010){
        return ((this.x == vehicle2010.x) && (this.y == vehicle2010.y));
    }
}
