package Lab03.StringRelated.Hard;

import java.util.Scanner;

public class Prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int sum = 0;
        for(int i = 0; i < input.length(); i++){
            sum += Integer.parseInt(input.charAt(i) + "");
        }

        if(sum % 3 == 0){
            System.out.println(input + " is divisible by 3");
        }else{
            System.out.println(input + " is not divisible by 3");
        }
    }
}
