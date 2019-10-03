package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            
            System.out.print("You have entered ");
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.print(numbers[j]);
                }else if (j < numbers.length - 1) {
                    System.out.print(", " + numbers[j]);
                } else if (j == numbers.length - 1) {
                    System.out.print(", " + numbers[j] + ".\n");
                }
            }
        }

    }
}
