package Lab03.StringRelated.Hard;

import java.util.Scanner;

public class Prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] inputArray = input.toCharArray();

        for(int i = inputArray.length - 1; i >= 0; i--){
            System.out.print(inputArray[i]);
        }
        System.out.println();
    }
}
