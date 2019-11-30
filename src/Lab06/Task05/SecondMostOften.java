package Lab06.Task05;

import java.util.Scanner;

public class SecondMostOften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        int[][] counts = new int[chars.length][2];
        int i = 0;
        for (int c = 0; c < chars.length; c++) {
            int count = 0;
            for (char ch : chars) {
                if (chars[c] == ch) {
                    count++;
                }
            }
            counts[i][0] = c;
            counts[i][1] = count;
            i++;
        }

        boolean sortHappened = true;
        for (int j = 0; j < counts.length; j++) {
            if (sortHappened) {
                sortHappened = false;
                for (int k = 1; k < counts.length; k++) {
                    if (counts[k - 1][1] > counts[k][1]) {
                        int[] tmp = counts[k - 1];
                        counts[k - 1] = counts[k];
                        counts[k] = tmp;
                        sortHappened = true;
                    }
                }
            }
        }

        int secondMaxIndex = 0;
        for (int z = counts.length - 2; z >= 0; z--) {
            if (counts[z][1] < counts[counts.length - 1][1]) {
                secondMaxIndex = counts[z][0];
                break;
            }
        }

        System.out.println(chars[secondMaxIndex]);
    }
}
