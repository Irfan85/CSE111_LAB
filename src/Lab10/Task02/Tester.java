package Lab10.Task02;

public class Tester {
    public static void main(String[] args) {
        Employee e1 = new Employee("Akkas", 1231323.32, 2008, "VCS&DSHGAB");
        Employee e2 = new Employee("Akkas", 1231323.32, 2008, "VCS%DSHGAB");
        System.out.println(e1.equals(e2));
    }
}
