package Lab04.Task14;

public class ComplexDemo {
    public static void main(String[] args) {
        Complex complex0 = new Complex();
        Complex complex1 = new Complex(1,2);
        Complex complex2 = new Complex(2,3);

        System.out.println(complex0);
        System.out.println(complex1);
        System.out.println(complex2);

        System.out.println(complex1.add(complex2));

        System.out.println(complex1.subtract(complex2));

        System.out.println(complex1.multiply(complex2));

        System.out.println(complex1.divide(complex2));
    }
}
