package Lab08.Task17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        Scanner sc;
        try {
            sc = new Scanner(new File("input.txt"));
            Grid grid = new Grid(sc.nextInt(), sc.nextInt());
            while (sc.hasNext()){
                Robot robot = new Robot(sc.nextInt(), sc.nextInt(), sc.next().charAt(0), grid);
                sc.nextLine();
                robot.executeInstructions(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
