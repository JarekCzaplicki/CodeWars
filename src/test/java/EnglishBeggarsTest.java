import org.junit.Test;

import static org.junit.Assert.*;

public class EnglishBeggarsTest {
//  @Test
//  public void tester() throws Exception {
//    // not my fault, but grouping tests in Java using `describe` is completely messed up
//    // https://www.codewars.com/docs/java-test-reference
//    // if can group, then do group these into basic and random tests
//
//    // Basic tests
//    int[] test = {1, 2, 3, 4, 5};
//    int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
//    assertArrayEquals(a1, EnglishBeggars.beggars(test, 1));
//    assertArrayEquals(a2, EnglishBeggars.beggars(test, 2));
//    assertArrayEquals(a3, EnglishBeggars.beggars(test, 3));
//    assertArrayEquals(a4, EnglishBeggars.beggars(test, 6));
//  }

  @Test
  public void tester1() throws Exception {
    // not my fault, but grouping tests in Java using `describe` is completely messed up
    // https://www.codewars.com/docs/java-test-reference
    // if can group, then do group these into basic and random tests

    // Basic tests
    int[] test = {444, 849, 100, 3, 514, 8, 260, 29, 72, 2, 22, 696, 71, 3, 98, 781, 11, 3, 7, 9, 86, 10};
    int[] a1 = {527, 854, 129, 708, 671, 21, 358, 810};
    assertArrayEquals(a1, EnglishBeggars.beggars(test, 8));

  }
}