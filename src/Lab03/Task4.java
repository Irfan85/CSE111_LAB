package Lab03;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] database = new int[256];
        String name = sc.nextLine();
        for(int i = 0; i < name.length(); i++){
            database[name.codePointAt(i)] += 1;
        }

        for(int i2 = 65; i2 <= 90; i2++){
            System.out.println((char)i2 + " which is " + i2 + "was found " + database[i2] + "times");
        }
    }
}
