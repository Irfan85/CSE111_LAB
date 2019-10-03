package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = 10;

            int[] numbers = new int[size];
            int[] counts = new int[size];

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
                    counts[numbers[i]]++;
                }

            }

            for(int i = 0; i < counts.length; i++){
                if(counts[i] >= 2 && counts[i] < 5){
                    System.out.println(counts[i]);
                }

            }
    }
}
