package Lab03.StringRelated.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class Prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String newString = new String(chars);
        System.out.println(newString);
    }
}
