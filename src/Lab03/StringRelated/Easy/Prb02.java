package Lab03.StringRelated.Easy;

import java.util.Scanner;

public class Prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){

            if(word.codePointAt(i) != 32){
                if(word.charAt(i) != 'z')
                    System.out.print((char)(word.codePointAt(i) + 1));
                else
                    System.out.print('a');
            }else{
                System.out.print(" ");
            }

        }
    }
}
