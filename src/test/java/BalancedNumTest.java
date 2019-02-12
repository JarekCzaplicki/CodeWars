import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedNumTest {
  @Test
  public void Check_Balanced_Number()
  {
    assertEquals("Balanced", BalancedNum.balancedNum(7));
    assertEquals("Balanced", BalancedNum.balancedNum(959));
    assertEquals("Balanced", BalancedNum.balancedNum(13));
    assertEquals("Not Balanced", BalancedNum.balancedNum(432));
    assertEquals("Balanced", BalancedNum.balancedNum(424));
  }
  @Test
  public void Check_Larger_Number()
  {
    assertEquals("Not Balanced", BalancedNum.balancedNum(1024));
    assertEquals("Not Balanced", BalancedNum.balancedNum(66545));
    assertEquals("Not Balanced", BalancedNum.balancedNum(295591));
    assertEquals("Not Balanced", BalancedNum.balancedNum(1230987));
    assertEquals("Balanced", BalancedNum.balancedNum(56239814));
  }

}