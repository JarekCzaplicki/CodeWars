import org.junit.Test;

import static org.junit.Assert.*;

public class EnglishBeggarsv2Test {

  @Test
  public void tester() throws Exception {
    int[] test = {1, 2, 3, 4, 5};
    int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
    assertArrayEquals(a1, EnglishBeggarsv2.beggars(test, 1));
    assertArrayEquals(a2, EnglishBeggarsv2.beggars(test, 2));
    assertArrayEquals(a3, EnglishBeggarsv2.beggars(test, 3));
    assertArrayEquals(a4, EnglishBeggarsv2.beggars(test, 6));
  }

  @Test
  public void tester1() throws Exception {
    int[] test = {444, 849, 100, 3, 514, 8, 260, 29, 72, 2, 22, 696, 71, 3, 98, 781, 11, 3, 7, 9, 86, 10};
    int[] a1 = {527, 854, 129, 708, 671, 21, 358, 810};
    assertArrayEquals(a1, EnglishBeggarsv2.beggars(test, 8));

  }
}