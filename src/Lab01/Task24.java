package Lab01;

import java.util.Scanner;

public class Task24{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    for(int i = 1; i <= size; i++){
      for(int s = 1; s <= size - i; s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= 2*i - 1; j++){
        if(i == 1 || i == size  || j == 1 || j == 2*i - 1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      for(int s = 1; s <= size - i; s++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}