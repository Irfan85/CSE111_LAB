package Lab02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 15;
                
        int[] numbers = new int[size];
        int[] counts = new int[10];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
            
            for(int j = 0; j < counts.length; j++){
                if(numbers[i] == j){
                    counts[j]++;
                    break;
                }
            }
        }
        
        int number = sc.nextInt();
        for(int i = 0; i < counts.length; i++){
            if(number == i){
                System.out.println(counts[i]);
                break;
            }
        }
        
    }
}
