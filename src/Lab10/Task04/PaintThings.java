package Lab10.Task04;

public class PaintThings {
    public static void main(String[] args) {
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        Paint myPaint = new Paint(5);

        double deckPaintAmount = myPaint.paint(deck);
        System.out.println(deckPaintAmount);

        double ballPaintAmount = myPaint.paint(bigBall);
        System.out.println(ballPaintAmount);

        double tankPaintAmount = myPaint.paint(tank);
        System.out.println(tankPaintAmount);
    }
}
