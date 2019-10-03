package Lab02;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
                
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            int num = sc.nextInt();
            
            boolean found = false;
            
            for(int j = 0; j < i; j++){
                if(num == numbers[j]){
                    System.err.println("No duplicates allowed!");
                    found = true;
                    i--;
                    break;
                }
               
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
