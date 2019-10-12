package Lab03.StringRelated.Medium;

import java.util.Scanner;

public class Prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int str1_val = get_ASCII_sum(str1);
        int str2_val = get_ASCII_sum(str2);

        System.out.println(str1.concat(" ").concat(str2));
        System.out.println(str1_val + str2_val);
    }

    private static int get_ASCII_sum(String string){
        int sum = 0;
        for (int i = 0; i < string.length(); i++){
            sum += string.codePointAt(i);
        }

        return sum;
    }
}
