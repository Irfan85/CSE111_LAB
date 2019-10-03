import java.util.Scanner;

public class Task14{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    
    for(int i = 1; i <= size; i++){
      for(int s = 1; s <= size - i; s++){
        System.out.print(" ");
      }
      int last = 0;
      for(int j = 1; j <= 2*i - 1; j++){
        if(j <= i){
          System.out.print(j);
          last = j;
        }else{
          System.out.print(--last);
        }
        
        
      }
      for(int s = 1; s <= size - i; s++){
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}