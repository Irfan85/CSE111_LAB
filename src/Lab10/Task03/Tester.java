package Lab10.Task03;

public class Tester {
    public static void main(String[] args) {
        Author a1 = new Author("Neil deGrasse Tyson", "neiltyson@hpl.com", 'm');
        Book b1 = new Book("Astrophysics for people in a hurry", a1, 9.99, 50);
        System.out.println(b1);
    }
}
