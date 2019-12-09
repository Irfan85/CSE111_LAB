package Lab10.Task07;

public class Tester {
    public static void main(String[] args) {
        ResizableCircle rc1 = new ResizableCircle(5);
        System.out.println(rc1.getArea());
        System.out.println(rc1.getPerimeter());
        System.out.println();

        rc1.resize(30);
        System.out.println(rc1.getArea());
        System.out.println(rc1.getPerimeter());
    }
}
