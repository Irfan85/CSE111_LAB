package Lab03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i) + ":" +  word.codePointAt(i));
        }
    }
}
