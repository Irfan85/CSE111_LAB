package Lab04.Task15;

public class BoroIntDemo {
    public static void main(String[] args) {
        BoroInt b1 = new BoroInt("99990");
        BoroInt b2 = new BoroInt("9999");
        BoroInt sum = b1.add(b2);
        BoroInt sub = b1.subtract(b2);
        System.out.println(sum.getVal());
        System.out.println(sub.getVal());
    }
}
