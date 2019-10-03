package Lab02;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
                
        int[] numbers = new int[size];

        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();     
        }
        
        for(int j = 0; j <= numbers.length; j+=2){
            if(j < numbers.length - 1){
                System.out.print(numbers[j] + ", ");
            }else if (j == numbers.length -1){
                System.out.print(numbers[j] + ".\n");
            }else{
                break;
            }
            
        }
        
        for(int k = 1; k <= numbers.length; k+=2){
            if(k < numbers.length - 1){
                System.out.print(numbers[k] + ", ");
            }else if (k == numbers.length -1){
                System.out.print(numbers[k] + ".\n");
            }else{
                break;
            }
        }
        
    }
}
