package Lab01;

import java.util.Scanner;

public class Task18{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    for(int i = 1; i <= size; i++){
      for(int s = 1; s <= size - i; s++){
        System.out.print(" ");
      }
      for(int j = 1; j <= i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}