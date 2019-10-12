package Lab03.StringRelated.Hard;

import java.util.Scanner;

public class Prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();
        String word = sc.nextLine();
        char[] word_array = word.toCharArray();

        for(int i = 0; i < word.length(); i++){
            if(word_array[i] + num <= 'Z'){
                System.out.print((char)(word_array[i] + num));
            }else{
                System.out.print((char)(word_array[i] - (26 - num)));
            }
        }

        System.out.println();
    }
}
