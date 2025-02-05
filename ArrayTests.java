import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {0,1,2,3};
    int[] expect = {3,2,1,0};
    assertArrayEquals(expect, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = {0,1,2,3};
    int[] expect = {3,2,1,0};

    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expect, input1);
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] test = {5,7,5};
    double result = ArrayExamples.averageWithoutLowest(test);

    assertEquals(6, result, 0.001);

  } 
}
