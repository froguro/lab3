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
  public void testReverseInPlace2() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1.0, 2.0, 3.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }

  @Test
  public void testAverageWithoutLowest2() {
    double[] input1 = {};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }

  @Test
  public void testAverageWithoutLowest3() {
    double[] input1 = {1};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }

  @Test
  public void testAverageWithoutLowest4() {
    double[] input1 = {4, 3, 2, 1};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }

  @Test
  public void testAverageWithoutLowest5() {
    double[] input1 = {1, 2, 1, 3, 4};
    assertEquals(3, ArrayExamples.averageWithoutLowest(input1), 1e-15);
  }
}
