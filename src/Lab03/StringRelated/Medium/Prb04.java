package Lab03.StringRelated.Medium;

import java.util.Scanner;

public class Prb04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String word = sc.nextLine();
        char[] wordCharArray = word.toCharArray();

        int count = 1;
        for (int i = 1; i < word.length(); i++) {
            char reference = word.charAt(i);

            boolean isRepeating = false;
            for (int j = 0; j < i; j++){
                if(wordCharArray[j] == reference){
                    wordCharArray[i] = '|';
                    isRepeating = true;
                }
            }

            if(!isRepeating){
                count++;
            }
        }

        char[] trimmedArray = new char[count];
        int index = 0;
        for (int i = 0; i < wordCharArray.length; i++){
            if (wordCharArray[i] != '|'){
                trimmedArray[index++] = wordCharArray[i];
            }
        }

        System.out.println(new String(trimmedArray));
    }
}
