package Lab06.Task06;

public class NegativeRemover {
    public static void main(String[] args) {
        int[] myArray = {1, 5, -20, 2, -5, 5, -61, 93};
        System.out.println(removeNegative(myArray));
    }

    private static int removeNegative(int[] ints){
        int negativeCount = 0;
        for (int i : ints){
            if(i < 0)
                negativeCount++;
        }

        int[] nonNegative = new int[ints.length - negativeCount];
        int k = 0;
        for (int i : ints){
            if (i > 0)
                nonNegative[k++] = i;
        }

        ints = nonNegative;

        return ints.length;
    }
}
