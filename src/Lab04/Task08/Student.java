package Lab04.Task08;

public class Student {
    private String name, id, address;
    private double CGPA;

    public Student(){
        //this.name = name;
    }

    public Student(String name, String id){
        this.name = name;
        this.id = id;
    }

    public Student(String name, String id, String address, double CGPA) {
        setName(name);
        setId(id);
        this.address = address;
        this.CGPA = CGPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        this.id = i;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double c) {
        this.CGPA = c;
    }
}
