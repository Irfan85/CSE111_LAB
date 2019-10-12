package Lab03.StringRelated.Medium;

import java.util.Scanner;

public class Prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] database = new int[256];
        boolean ok = false;

        while (!ok) {
            String word = sc.nextLine();
            for (int i = 0; i < word.length(); i++) {
                database[word.codePointAt(i)]++;
            }

            String output = "";
            for (int i = 0; i < database.length; i++) {
                if (database[i] > 1) {
                    output += "\'" + (char)i + "\'" + " has been counted " + database[i] + " times, \n";
                }
            }

            if(output.equals("")){
                ok = true;
            }

            if(ok){
                System.out.println("You entered " + word);
            }else{
                System.out.println(output + "in the word \"" +word + "\"");
            }

        }
    }
}
