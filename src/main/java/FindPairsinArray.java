/**
 * Created by Ramesh Ponnada on 3/31/17.
 */
public class FindPairsinArray {
  private static final int MAX = 100000;
  /*
    Given an array A[] and a number x, check for pair in A[] with sum as x
    Input : array for numbers
            number x
    Output: pairs of numbers with sum x
   */
  public static void main(String[] args) {
//    int[] input = {11, 3, 2, 9, 6, 1, 7, 8};
//    int x = 10;
//    // solution 1
//    FindPairsinArray f = new FindPairsinArray();
//    int[] output = f.findPairsInArray(input, x);
//    f.printArray(input);
//    f.printArray(output);


    int A[] = {1, 4, 45, 6, 10, 8,12, 15,8, 15};
    int n = 16;
    printpairs(A,  n);

  }


  public int[] findPairsInArray(int[] input, int x) {
    int[] output = new int[x];
    for (int i = 0; i < input.length; i++) {
      if (input[i] < x) {
        output[input[i]] = input[i];
      }
    }
    return output;
  }

  public void printArray(int[] p) {
    System.out.print(" **** ");
    for (int i = 0; i < p.length; i++) {
      System.out.print(p[i] + " ");
    }
    System.out.println(" **** ");
  }

  static void printpairs(int arr[],int sum)
  {
    // Declares and initializes the whole array as false
    boolean[] binmap = new boolean[MAX];

    for (int i=0; i<arr.length; ++i)
    {
      int temp = sum-arr[i];

      // checking for condition
      if (temp>=0 && binmap[temp])
      {
        System.out.println("Pair with given sum " +
            sum + " is (" + arr[i] +
            ", "+temp+")");
      }
      binmap[arr[i]] = true;
    }
  }

}
