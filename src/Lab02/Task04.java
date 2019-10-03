package Lab02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
                
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        for(int i = numbers.length - 1; i >= 0; i--){
            if(numbers[i] % 2 == 0){
                System.out.println(numbers[i]);
            }
        }
    }
}
