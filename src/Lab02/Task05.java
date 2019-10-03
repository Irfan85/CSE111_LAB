package Lab02;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 10;
        boolean flag = false;
                
        int[] numbers = new int[size];
        
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        
        int number = sc.nextInt();
        for(int i = 0; i < numbers.length; i++){
            if(number == numbers[i]){
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
