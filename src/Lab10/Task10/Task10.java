package Lab10.Task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String amarFileNameAndLocation = "a.txt";

        try {
            Scanner sc = new Scanner(new File(amarFileNameAndLocation));

            int x = Integer.parseInt(sc.nextLine());
            int y = Integer.parseInt(sc.nextLine());
            int z = Integer.parseInt(sc.nextLine());

            System.out.println(x + y + z);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
