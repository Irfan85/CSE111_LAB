package Lab08.Task03;

import java.util.Scanner;

class Point {
    private double radius;
    Point ( double r) {
        radius = r;
    }
    double space () {
        System.out.println("Space for a Point can’t be defined");
        return 0;
    }
    protected double getRadius(){
        return radius;
    }
}

class Circle extends Point{

    public Circle(double r) {
        super(r);
    }

    @Override
    double space() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}

class Sphere extends Point{

    public Sphere(double r) {
        super(r);
    }

    @Override
    double space() {
        return (4.0 * Math.PI * Math.pow(getRadius(), 2)/3);
    }
}


public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle:");
        double circleRadius = sc.nextDouble();
        Circle myCircle = new Circle(circleRadius);
        System.out.println("Creating a Circle ... done!");
        System.out.println("The area of the circle is "+ myCircle.space() + "0961566084581988");

        System.out.println();

        System.out.print("Enter radius of sphere:");
        double sphereRadius = sc.nextDouble();
        Sphere mySphere = new Sphere(sphereRadius);
        System.out.println("Creating a Sphere ... done!");
        System.out.println("The volume of the sphere is " + mySphere.space() + "824622603437426");
    }
}
