package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;

        int[] numbers = new int[size];

        int i = 0;
        int[] fetched = new int[2];
        fetched[0] = -1;
        fetched[1] = -1;
        boolean complete = false;
        int x = 0;

        while(i < numbers.length && !complete){
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

            int cnt = 0;
            for (int k = 0; k <= i; k++){
                if(numbers[k] == numbers[i] && numbers[k] != fetched[0] && numbers[k] != fetched[1]){
                    cnt++;
                }
            }


            if (cnt >= 2 && cnt < 5){
                fetched[x++] = numbers[i];
            }

            if(fetched[0] != -1 && fetched[1] != -1){
                complete = true;
            }

            i++;
        }

        for(int j = 0; j < fetched.length; j++){
            System.out.println(fetched[j]);

        }
    }
}
