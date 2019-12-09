package Lab10.Task14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the file you want to read:");
        String fileName = sc.nextLine();

        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            while (fileScanner.hasNext()){
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
