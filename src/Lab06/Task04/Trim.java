package Lab06.Task04;

public class Trim{
    public static char [] trim(char [] input){
        //Your code here
        int extraSpaceCount = 0;
        int[][] extraSpacePos = new int[input.length][2];
        for (int i = 1; i < input.length; i++){
            if(input[i-1] == ' ' && input[i] == ' '){
                extraSpacePos[i-1][0] = -1;
                extraSpaceCount++;
            }else{
                extraSpacePos[i-1][0] = i-1;
                extraSpacePos[i-1][1] = input[i-1];
            }
        }
        extraSpacePos[input.length-1][0] = input.length-1;
        extraSpacePos[input.length-1][1] = input[input.length-1];

        char[] trimmed = new char[input.length - extraSpaceCount];
        int k = 0;
        for (int i = 0; i < extraSpacePos.length; i++){
            if (extraSpacePos[i][0] != -1){
                trimmed[k++] = (char)extraSpacePos[i][1];
            }
        }

        return trimmed;
    }
    public static void main(String [] args){
        char [] input = {'T','h','i','s',' ',' ',' ',' ',' ','i','s',' ',' ',' ',' ','a',' ',' ',' ',' ','t','e','s','t','.'};
        for (int i = 0; i< input.length; i++){
            System.out.print(input[i]);
        }
        System.out.println("");
        char []  output = trim(input);
        for (int i = 0; i< output.length; i++){
            System.out.print(output[i]);
        }
        System.out.println("");
    }
}
