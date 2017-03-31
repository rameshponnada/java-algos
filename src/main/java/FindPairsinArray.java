/**
 * Created by Ramesh Ponnada on 3/31/17.
 */
public class FindPairsinArray {

    /*
      Given an array A[] and a number x, check for pair in A[] with sum as x
      Input : array for numbers
              number x
      Output: pairs of numbers with sum x
     */
    public static void main(String[] args) {
        int[] input = {11, 3, 2, 9, 6, 1, 7, 8};
        int x = 10;

        // solution 1
        int[] output = new int[x];
        for (int i = 0; i < input.length; i++) {
            if (input[i] < x) {
                output[input[i]] = input[i];
            }
        }
        printArray(input);
        printArray(output);

        for(int i=0;i<output.length;i++){
            System.out.println();
        }
    }


    public static void printArray(int[] p) {
        System.out.print(" **** ");
        for (int i = 0; i < p.length; i++) {
            System.out.print(p[i] + " ");
        }
        System.out.println(" **** ");
    }
}
