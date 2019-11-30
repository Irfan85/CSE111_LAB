package Lab06.Task03;

public class Student {
    private String name;
    private String id;
    private String address;
    private double cgpa;

    public Student(){
        this.name = "Ei name e kono student nai";
        this.id = "Student ei nai, abar id :P";
        this.address = "Naam nai .. thikana ashbe koi theke?";
        this.cgpa = -4.0;
    }

    public Student(String name, String id, String address, double cgpa) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.cgpa = cgpa;
    }

    public void standUp(){
        System.out.println(nameDao() + " is now standing up!!");
    }

    public String tellMeYourName(){
        return "Sir, my name is " + nameDao();
    }

    public void call(String student){
        System.out.println(this.nameDao() + ": " + "Hey, " + student + ", Sir is calling you!!");
    }

    public int add2Numbers(int a, int b){
        return a + b;
    }

    public String nameDao() {
        return name;
    }

    public void nameBoshao(String name) {
        this.name = name;
    }

    public String boloToAmiKe() {
        return id;
    }

    public void idBoshao(String id) {
        this.id = id;
    }

    public String addressDao() {
        return address;
    }

    public void addressBoshao(String address) {
        this.address = address;
    }

    public double cgpaDao() {
        return cgpa;
    }

    public void cgpaBoshao(double cgpa) {
        this.cgpa = cgpa;
    }
}
