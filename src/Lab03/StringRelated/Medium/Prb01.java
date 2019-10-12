package Lab03.StringRelated.Medium;

import java.util.Scanner;

public class Prb01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            for (int j = 0; j <= i; j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
