package Lab08.Task17;

import java.util.ArrayList;

public class Robot {
    private static ArrayList<int[]> forbidden = new ArrayList<>();
    private int x;
    private int y;
    private char orientation;
    private Grid grid;
    private boolean isLost = false;

    public Robot(int x, int y, char orientation, Grid grid) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.grid = grid;
    }

    public void executeInstructions(String instructions) {
        char[] commands = instructions.toCharArray();
        for (char command : commands) {
            if (command == 'L' || command == 'R') {
                orient(command);
            } else if (command == 'F') {
                move();
            }
        }

        System.out.printf("%d %d %c", this.x, this.y, this.orientation);
        if (isLost){
            System.out.println(" LOST");
        }else{
            System.out.println();
        }
    }

    private void orient(char turn) {
        if (this.orientation == 'N') {
            if (turn == 'L')
                this.orientation = 'W';
            else if (turn == 'R')
                this.orientation = 'E';
        } else if (this.orientation == 'S') {
            if (turn == 'L')
                this.orientation = 'E';
            else if (turn == 'R')
                this.orientation = 'W';
        } else if (this.orientation == 'E') {
            if (turn == 'L')
                this.orientation = 'N';
            else if (turn == 'R')
                this.orientation = 'S';
        } else if (this.orientation =='W') {
            if (turn == 'L')
                this.orientation = 'S';
            else if (turn == 'R')
                this.orientation = 'N';
        }
    }

    private void move() {
        if (!isLost) {
            int previousX = this.x, previousY = this.y;

            int currentX = this.x, currentY = this.y;
            switch (this.orientation) {
                case 'N':
                    currentY++;
                    break;
                case 'S':
                    currentY--;
                    break;
                case 'E':
                    currentX++;
                    break;
                case 'W':
                    currentX--;
                    break;
            }

            if (currentX > grid.getDimensionX() || currentY > grid.getDimensionY() || currentX < 0 || currentY < 0) {
                int[] dangerZone = {previousX, previousY};
                if(!isRecorded(dangerZone)){
                    isLost = true;
                    forbidden.add(dangerZone);
                }
            }else{
                this.x = currentX;
                this.y = currentY;
            }
        }
    }

    public boolean isRecorded(int[] location){
       for(int[] ar : forbidden){
           if (ar[0] == location[0] && ar[1] == location[1]){
               return true;
           }
       }
       return false;
    }


}
