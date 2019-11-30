package Lab10.Task09;

public class Student implements StInterface {
    private String name;
    private String ID;
    private String address_Field;

    public Student(String name, String ID, String address_Field) {
        this.name = name;
        this.ID = ID;
        this.address_Field = address_Field;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setID(String id) {
        this.ID = id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                        "ID: " + getID() + "\n" +
                        "Address: " + this.address_Field;
    }
}
