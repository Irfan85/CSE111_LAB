package Lab06.Task01;

public class Student {
    public String name;
    public int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name of the Student: " + this.name + "\n" +
                "ID of the Student: " + this.id + "\n";
    }
}
