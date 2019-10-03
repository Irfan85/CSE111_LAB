package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        char option = sc.next().charAt(0);
        switch (option){
            case 'a':
                for (int i = 0; i < numbers.length; i+=2) {
                    for (int j = 2; j < numbers.length; j+=2) {
                        if(numbers[j - 2] < numbers[j]){
                            int temp = numbers[j - 2];
                            numbers[j - 2] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
                break;
            case 'b':
                for (int i = 1; i < numbers.length; i+=2) {
                    for (int j = 3; j < numbers.length; j+=2) {
                        if(numbers[j - 2] < numbers[j]){
                            int temp = numbers[j - 2];
                            numbers[j - 2] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
                break;
            case 'c':
                for (int i = 0; i < numbers.length; i++) {
                    for (int j = 1; j < numbers.length; j++) {
                        if(numbers[j - 1] < numbers[j]){
                            int temp = numbers[j - 1];
                            numbers[j - 1] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
                break;

        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
