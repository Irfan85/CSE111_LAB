package Lab01;

import java.util.Scanner;

public class Task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int column = sc.nextInt();

    for(int i = 1; i <= row; i++){
      for(int j = 1; j <= column; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}