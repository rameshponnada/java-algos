import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Ramesh Ponnada on 10/9/17.
 */
public class FindPairsinArrayTest {
  FindPairsinArray f = null;


  @Before
  public void setup(){
    f = new FindPairsinArray();
  }

  @Test
  public void printArray() {
    int[] input = {11, 3, 2, 9, 6, 1, 7, 8};
    int x = 10;
    int[] output= f.findPairsInArray(input,x);
    f.printArray(input);
    f.printArray(output);
  }
}