package Lab04.Task08;

public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();

        john.setName("John Rawls");
        john.setId("01");
        john.setAddress("Wakanda");
        john.setCGPA(3.93);
        System.out.println("Name: " + john.getName() + "\n"
               + "ID: " + john.getId() + "\n" + "Address: " + john.getAddress() + "\n" +
                "CGPA: " + john.getCGPA());
        System.out.println();

        mike.setName("Mike Pence");
        mike.setId("02");
        mike.setAddress("Pentagon");
        mike.setCGPA(3.85);
        System.out.println("Name: " + mike.getName() + "\n"
                + "ID: " + mike.getId() + "\n" + "Address: " + mike.getAddress() + "\n" +
                "CGPA: " + mike.getCGPA());
        System.out.println();

        carol.setName("Carol Stefanson");
        carol.setId("03");
        carol.setAddress("Edinburgh");
        carol.setCGPA(3.93);
        System.out.println("Name: " + carol.getName() + "\n"
                + "ID: " + carol.getId() + "\n" + "Address: " + carol.getAddress() + "\n" +
                "CGPA: " + carol.getCGPA());
    }
}
