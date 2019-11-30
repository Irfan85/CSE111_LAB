package Lab08.Task10;

public class Car {
    private static int objectCount = 0;

    private int year;
    public Car(int year){
        this.year = year;
        objectCount++;
    }

    public int getYear(){
        return this.year;
    }

    public static int getObjectCount(){
        return objectCount;
    }
}
