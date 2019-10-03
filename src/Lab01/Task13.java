package Lab01;
import java.util.Scanner;

public class Task13{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    int last = 0;
    for(int i = 1; i <= 2*input - 1; i++){
      if(i <= input){
        System.out.print(i);
        last = i;
      }else{
        System.out.print(--last);
      }
      
    }
  }
}