package Lab10.Task05;

public class Tester {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println();

        Rectangle r1 = new Rectangle(4, 5);
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println();

        Square s1 = new Square();
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println();

        Square s2 = new Square(5, "Violet", true);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println();
    }
}
