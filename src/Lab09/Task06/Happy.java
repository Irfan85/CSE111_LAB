package Lab09.Task06;

import java.util.ArrayList;
import java.util.Scanner;

public class Happy {
    public static ArrayList<Integer> checkedNumbers = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isHappy(input));
    }

    public static boolean isHappy(int number){
        char[] digits = String.valueOf(number).toCharArray();
        int sum = 0;
        for(char digit : digits){
            sum += Math.pow(Integer.parseInt(digit + ""), 2);
        }

        //System.out.println(checkedNumbers);

        if(sum != 1 && !checkedNumbers.contains(sum)){
            //System.out.println(sum);
            checkedNumbers.add(sum);
            return isHappy(sum);
        }else{
            //System.out.println(sum);
            return sum == 1;
        }
    }
}
