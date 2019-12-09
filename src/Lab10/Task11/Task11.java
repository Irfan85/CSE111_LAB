package Lab10.Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String amarFileNameAndLocation = "a.txt";

        try {
            Scanner sc = new Scanner(new File(amarFileNameAndLocation));

            int sum = 0;
            while (sc.hasNextInt()){
               sum += Integer.parseInt(sc.nextLine());
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
