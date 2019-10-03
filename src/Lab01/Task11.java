package Lab01;

import java.util.Scanner;

public class Task11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    int last = 0;
    
    for(int i = 1; i <= 2*size -1; i++){
      if(i <= size){
        for(int s = 1; s <= size - i; s++){
          System.out.print(" ");
        }
        for(int j = 1; j <= 2*i - 1; j++){
          if(i == 1 || i ==  2*size -1  || j == 1 || j == 2*i - 1){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
          last = j;
        }
        for(int s = 1; s <= size - i; s++){
          System.out.print(" ");
        }
      }else{
        for(int s = 1; s <= i - size; s++){
          System.out.print(" ");
        }
        for(int j = 1; j <= last - 2; j++){
          if(i == 1 || i ==  2*size -1  || j == 1 || j == last - 2){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
        }
        last -= 2;
        for(int s = 1; s <= i - size; s++){
          System.out.print(" ");
        }
      }
      
      System.out.println();
    }
  }
}