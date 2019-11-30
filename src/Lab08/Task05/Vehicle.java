package Lab08.Task05;

public class Vehicle {
    int x = 0;
    int y = 0;

    public void moveUp(){
        y++;
    }

    public void moveDown(){
        y--;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
