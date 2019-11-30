package Lab10.Task09;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students");
        int size = sc.nextInt();
        Student[] students = new Student[size];

        sc.nextLine();
        for(int i = 0; i < students.length; i++){
            System.out.println("Enter name for Student" + i + ":");
            String name = sc.nextLine();
            System.out.println("Enter id for Student" + i + ":");
            String id = sc.nextLine();
            System.out.println("Enter address for Student" + i + ":");
            String address = sc.nextLine();
            students[i] = new Student(name, id, address);
        }

        sortArray(students);

        for(Student student : students){
            System.out.println(student);
        }
    }

    public static void sortArray(Student[] students){
        for(int i = 0; i < students.length; i++){
            for (int j = 1; j < students.length; j++){
                if(students[j-1].getName().compareToIgnoreCase(students[j].getName()) > 0){
                    Student tempStudent = students[j-1];
                    students[j-1] = students[j];
                    students[j] = tempStudent;
                }
            }
        }
    }
}
