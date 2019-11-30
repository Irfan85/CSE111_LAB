package Lab08.Task02;

public class BBAStudent extends Student {
    public BBAStudent(){
        super.setName("Default BBA Student");
        super.setDepartment("BBA");
    }
    public BBAStudent(String name){
        super.setName(name);
        super.setDepartment("BBA");
    }
}
