package Lab03.StringRelated.Easy;

import java.util.Scanner;

public class Prb03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){

            if(word.codePointAt(i) != 32){
                if(word.charAt(i) != 'a')
                    System.out.print((char)(word.codePointAt(i) - 1));
                else
                    System.out.print('z');
            }else{
                System.out.print(" ");
            }

        }
    }
}
