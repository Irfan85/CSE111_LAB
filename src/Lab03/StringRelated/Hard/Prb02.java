package Lab03.StringRelated.Hard;

import java.util.Scanner;

public class Prb02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teamName = sc.nextLine();
        String coachName = sc.nextLine();

        if((getStringProduct(teamName) % 14) < (getStringProduct(coachName) % 14)){
            System.out.println("I am happy with my coach");
        }else{
            System.out.println("I am sad with my coach");
        }
    }

    private static int getStringProduct(String string){
        int product = 1;
        for(int i = 0; i < string.length(); i++){
            product *= (string.codePointAt(i) - 'A' + 1);
        }

        return product;
    }
}

