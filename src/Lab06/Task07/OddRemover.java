package Lab06.Task07;

public class OddRemover {
    public static void main(String[] args) {
        int[] numbers = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};

        int[] oddLess = removeOdds(numbers);
        for (int i : oddLess){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static int[] removeOdds(int[] ints){
        int oddCount = 0;
        for (int i : ints){
            if((i % 2) != 0)
                oddCount++;
        }

        int[] nonOdd = new int[ints.length - oddCount];
        int k = 0;
        for (int i : ints){
            if ((i % 2) == 0)
                nonOdd[k++] = i;
        }

        return nonOdd;
    }
}
