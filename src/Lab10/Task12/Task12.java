package Lab10.Task12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        String amarFileNameAndLocation = "b.txt";

        try {
            Scanner sc = new Scanner(new File(amarFileNameAndLocation));

            int sum = 0;
            while (sc.hasNext()){
               sum += Integer.parseInt(sc.next());
            }

            System.out.println(sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
