package Lab10.Task15;

import java.io.File;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to delete:");
        String fileName = sc.nextLine();

        File file = new File(fileName);
        if(file.delete()){
            System.out.println(fileName + " deleted successfully.");
        }else{
            System.out.println(fileName + " could not be deleted.");
        }
    }
}
