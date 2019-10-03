package Lab02.CSE110_LAB08;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        int res = 0;
        for(int i = 1; i <= limit; i++){
            if(i % 2 == 0){
                res -= Math.pow(i, 2);
            }else{
                res += Math.pow(i, 2);
            }
        }

        System.out.println(res);
    }
}
