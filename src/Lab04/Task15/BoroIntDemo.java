package Lab04.Task15;

public class BoroIntDemo {
    public static void main(String[] args) {
        BoroInt b1 = new BoroInt("22");
        BoroInt b2 = new BoroInt("7");
        BoroInt mul = b1.divide(b2);
        //BoroInt sub = b1.subtract(b2);
        System.out.println(mul.getVal());
        //System.out.println(sub.getVal());
    }
}
