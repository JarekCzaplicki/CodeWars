import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumeralsEncoderTest {
  private RomanNumeralsEncoder conversion = new RomanNumeralsEncoder();

  @Test
  public void shouldConvertToRoman() {
    assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
    assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
    assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    assertEquals("solution(60) should equal to LX", "LX", conversion.solution(60));
    assertEquals("solution(600) should equal to DC", "DC", conversion.solution(600));
  }

}