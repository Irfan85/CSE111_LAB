package Lab01;

import java.util.Scanner;

public class Task1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    for(int i = 1; i <= input; i++){
      System.out.print(i);
    }
  }
}