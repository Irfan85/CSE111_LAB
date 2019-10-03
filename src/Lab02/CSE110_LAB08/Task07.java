package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 11;

        int[] numbers = new int[size];

        for(int i = 0; i < numbers.length; i++){
            int num = sc.nextInt();

            boolean found = false;
            int count = 0;
            for(int j = 0; j < i; j++){
                if(num == numbers[j]){
                    count++;
                }
            }

            if(count >= 4){
                System.err.println("Maximum limit reached!");
                found = true;
                i--;
            }



            if(!found){
                numbers[i] = num;
            }

        }

        for(int i = 0; i < numbers.length; i++){

            System.out.println(numbers[i]);


        }
    }
}
